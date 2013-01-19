package com.vainolo.phd.opmeta.interpreter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.utilities.analysis.OPDAnalysis;
import com.vainolo.phd.opmeta.interpreter.validation.ValidationInterpreter;
import com.vainolo.phd.opmeta.model.OPMetaModelDiagram;
import com.vainolo.phd.opmodel.model.OPmetaDefinition;
import com.vainolo.phd.opmodel.model.OPmodelHolder;
import com.vainolo.phd.opmodel.model.PropertyDescriptor;
import com.vainolo.phd.opmodel.model.TypeDescriptor;
import com.vainolo.phd.opmodel.model.opmodelFactory;
import com.vainolo.phd.opmodel.model.propertyType;

public class OpmetaInterpreter {
	
	private static Map<String,TypeDescriptor> emptyExistingTypes =Collections.emptyMap();
	//private List<PropertyDescriptor> allPropertyDescriptors = new LinkedList<>();
	private HashMap<PropertyDescriptor,TypeDescriptor> propertyToSpecifingTypeMap = new HashMap<>();
	
	public static OPmodelHolder CreateOPmodelHolder(OPMetaModelDiagram diagram){
		OPmetaDefinition interpretation = opmodelFactory.eINSTANCE.createOPmetaDefinition();
		
		List<OPMNode> elementsDiagramNodes = diagram.getElementsDiagram().getNodes();
		List<OPMNode> linksDiagramNodes = diagram.getLinksDiagram().getNodes();
	 	
		OpmetaInterpreter creator = new OpmetaInterpreter();
		HashMap<String,TypeDescriptor> nodes = creator.CreateGraph(elementsDiagramNodes, "node",emptyExistingTypes);
		HashMap<String,TypeDescriptor> containers = creator.CreateGraph(elementsDiagramNodes, "container",nodes);
		HashMap<String,TypeDescriptor> links = creator.CreateGraph(linksDiagramNodes, "link", emptyExistingTypes);
	 	
		interpretation.getNodes().addAll(nodes.values());
		interpretation.getTypes().addAll(nodes.values());
		interpretation.getContainers().addAll(containers.values());
		for (TypeDescriptor contianer:containers.values()){
			if (!interpretation.getTypes().contains(contianer))
				interpretation.getTypes().add(contianer);
		}
		interpretation.getLinks().addAll(links.values());
		interpretation.getTypes().addAll(links.values());
		
		interpretation.getProperties().addAll(creator.propertyToSpecifingTypeMap.keySet());
		
		// TODO : here should be some work of the validations
		
		// this wasn't tested all the way
		// interpretation.getLinkValidationRules().addAll(ValidationInterpreter.calculateLinkValidationRules(diagram.getLinkValidations(),interpretation));
		
		
		
		OPmodelHolder holder = opmodelFactory.eINSTANCE.createOPmodelHolder();
		holder.setMetaDefinition(interpretation);
		holder.setNextId(creator.getNextId());
		return holder;
	}

	private OpmetaInterpreter(){}
	
	public HashMap<String,TypeDescriptor> CreateGraph(List<OPMNode> origNodes, String rootName, Map<String,TypeDescriptor> existingTypes){
		Collection<OPMNode> rootNodes = OPDAnalysis.findNamedNodes(origNodes,rootName);
		if (rootNodes.size() == 0) 
			throw new RuntimeException("Root '" + rootName + "' is Missing.");
		if (rootNodes.size() > 1) 
			throw new RuntimeException("Root '" + rootName + "' has more than one occurence.");
		LinkedList<preProcessWrapper> preprocessedNodes = new LinkedList<>();
		for (OPMNode rootNode:rootNodes){
			preprocessedNodes.add(new preProcessWrapper(rootNode,null));
		}
		HashMap<String,TypeDescriptor> created = new HashMap<String,TypeDescriptor>();
		
		// using something like BFS
		while (!preprocessedNodes.isEmpty()){
			preProcessWrapper current = preprocessedNodes.removeFirst(); 
			String currKey = current.node.getName();
		
			// handle if was created before (like in diamonds)
			if (created.containsKey(currKey)){
				TypeDescriptor existingChild = created.get(currKey);
				setParent(existingChild, current.parent);
				recursiveSetProperties(existingChild,current.parent.getProperties(), created);
				continue;
			}
			
			// create new type
			TypeDescriptor descriptor=getDescriptor(current);
			created.put(currKey, descriptor);
			Collection<OPMLink> links;
			
			// adding this nodes properties
			links = OPDAnalysis.findOutgoingLinks(current.node,OPMPackage.eINSTANCE.getOPMAggregationLink());
			for (OPMLink link:links){
				PropertyDescriptor propertyDescriptor = CreatePropertyDescriptor(link.getTarget().getName(),descriptor);
				if(!TryAddPropertyToType(descriptor,propertyDescriptor))
					throw new RuntimeException("Failed to translate property '" + propertyDescriptor.getName() +"' to type: '" +
							descriptor.getName() + "'");	
			}
			
			// copying properties from a single parent (duplicates check inside addProperty)
			TypeDescriptor parent=current.parent;
			if (parent!=null){
				for (PropertyDescriptor property : parent.getProperties())
					TryAddPropertyToType(descriptor,property);
			}

			// create children
			links = OPDAnalysis.findOutgoingLinks(current.node,OPMPackage.eINSTANCE.getOPMGeneralizationLink());
			for (OPMLink link:links){
				OPMNode next = link.getTarget();
				if (next == null || preprocessedNodes.contains(next)) continue;
				String childKey = next.getName();
				if (!existingTypes.containsKey(childKey)) 
					preprocessedNodes.add(new preProcessWrapper(next,descriptor));
				else{
					TypeDescriptor existingChild = existingTypes.get(childKey);
					setParent(existingChild, descriptor);
					recursiveSetProperties(existingChild,descriptor.getProperties(), created);
				}
			}
		}
		return created;
	}

	private PropertyDescriptor CreatePropertyDescriptor(String property, TypeDescriptor firstOwner) {
		PropertyDescriptor propDesc = opmodelFactory.eINSTANCE.createPropertyDescriptor();
		propDesc.setId(getNextId());
		
		int split=property.indexOf(":");
		propDesc.setName(property.substring(0, split));
		propertyType type = propertyType.get(property.substring(split+1));
		if (type == null) throw new RuntimeException("property type '"+ property.substring(split+1) +"'unrecognized");
		propDesc.setType(type);
		
		propertyToSpecifingTypeMap.put(propDesc,firstOwner);
		return propDesc;
	}

	private boolean TryAddPropertyToType(TypeDescriptor descriptor,	PropertyDescriptor property) {
		for (PropertyDescriptor propertyInList : descriptor.getProperties()){
			if(propertyInList.getName().equals(property.getName()))
				if (propertyInList.getType().equals(property.getType())){
					// if defined property has same name and same type - they are similar, not an error
					return false;
				}else if (propertyToSpecifingTypeMap.get(propertyInList) == descriptor){ 
					// in case a property with the same name was defined on the current descriptor than the defined property overrides propertyInList
					return false;
				}else{
					// case of two inherited properties with the same name but different types
					throw new RuntimeException("Type '" + descriptor.getName() + "' inherits 2 properties named '" + property.getName() + "' of different types");
				}
		}
		return descriptor.getProperties().add(property);
	}

	private void recursiveSetProperties(TypeDescriptor existing,
			Iterable<PropertyDescriptor> properties, Map<String,TypeDescriptor> created) {
		if (!created.containsKey(existing.getName())) created.put(existing.getName(), existing);
		
		ArrayList<PropertyDescriptor> acceptedProps = new ArrayList<>();
		for (PropertyDescriptor property:properties)
			if(TryAddPropertyToType(existing, property)){
				acceptedProps.add(property);
			}
		if (acceptedProps.isEmpty()) return;
		
		for (TypeDescriptor child:existing.getChildren())
			recursiveSetProperties(child,acceptedProps,created);
	}

	private TypeDescriptor getDescriptor(preProcessWrapper currWrapper) {
		TypeDescriptor 	descriptor= opmodelFactory.eINSTANCE.createTypeDescriptor();
		descriptor.setId(getNextId());
		descriptor.setName(currWrapper.node.getName());
		setParent(descriptor, currWrapper.parent);
		return descriptor;
	}
	
	private void setParent(TypeDescriptor descriptor, TypeDescriptor parent) {
		if (parent == null) return;
		if (parent.getChildren().contains(descriptor)) return;
		descriptor.getParents().add(parent);
		parent.getChildren().add(descriptor);		
	}
	
	private class preProcessWrapper {
		public preProcessWrapper (final OPMNode node, final TypeDescriptor parent){
			this.node = node;
			this.parent = parent;
		}
		final OPMNode node;
		final TypeDescriptor parent;
	}

	long nextId = 0;
	public long getNextId(){
		nextId ++;
		return nextId;
	}


	
}
