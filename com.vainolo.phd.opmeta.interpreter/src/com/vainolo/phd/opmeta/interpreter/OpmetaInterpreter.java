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
import com.vainolo.phd.opmeta.model.OPMetaModelDiagram;
import com.vainolo.phd.opmodel.model.OPmetaDefinition;
import com.vainolo.phd.opmodel.model.OPmodelHolder;
import com.vainolo.phd.opmodel.model.PropertyDescriptor;
import com.vainolo.phd.opmodel.model.TypeDescriptor;
import com.vainolo.phd.opmodel.model.opmodelFactory;
import com.vainolo.phd.opmodel.model.propertyType;

public class OpmetaInterpreter {
	
	private static Map<String,TypeDescriptor> emptyExistingTypes =Collections.emptyMap();
	private List<PropertyDescriptor> allPropertyDescriptors = new LinkedList<>(); 
	
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
		
		interpretation.getProperties().addAll(creator.allPropertyDescriptors);
		// TODO : here should be some work of the validations
		
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
			
			// copying properties from a single parent (duplicates check inside addProperty)
			TypeDescriptor parent=current.parent;
			if (parent!=null){
				for (PropertyDescriptor property : parent.getProperties())
					if(!TryAddPropertyToType(descriptor,property))
						System.err.print("duplicate property: " + property.getName());	
			}
			
			
			// adding this nodes properties
			links = OPDAnalysis.findOutgoingLinks(current.node,OPMPackage.eINSTANCE.getOPMAggregationLink());
			for (OPMLink link:links){
				PropertyDescriptor propertyDescriptor = CreatePropertyDescriptor(link.getTarget().getName());
				if(!TryAddPropertyToType(descriptor,propertyDescriptor))
					System.err.print("duplicate property" + propertyDescriptor.getName());	
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

	private PropertyDescriptor CreatePropertyDescriptor(String property) {
		PropertyDescriptor propDesc = opmodelFactory.eINSTANCE.createPropertyDescriptor();
		propDesc.setId(getNextId());
		
		int split=property.indexOf(":");
		propDesc.setName(property.substring(0, split));
		propertyType type = propertyType.get(property.substring(split+1));
		if (type == null) throw new RuntimeException("property type unrecognized");
		propDesc.setType(type);
		
		allPropertyDescriptors.add(propDesc);
		return propDesc;
	}

	private boolean TryAddPropertyToType(TypeDescriptor descriptor,	PropertyDescriptor property) {
		for (PropertyDescriptor propertyinlist : descriptor.getProperties()){
			if(propertyinlist.getName().equals(property.getName()))
					return false;
		}
		return descriptor.getProperties().add(property);
	}

	private void recursiveSetProperties(TypeDescriptor existing,
			Iterable<PropertyDescriptor> properties, Map<String,TypeDescriptor> created) {
		if (!created.containsKey(existing.getName())) created.put(existing.getName(), existing);
		
		ArrayList<PropertyDescriptor> acceptedProps = new ArrayList<>();
		for (PropertyDescriptor property:properties)
			if(!TryAddPropertyToType(existing, property)){
				System.err.print("duplicate property: " + property.getName());
			}else{
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
