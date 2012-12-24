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

class OpmetaInterpretationCreator {

	public HashMap<String,TypeDescriptor> CreateGraph(List<OPMNode> origNodes, String rootName){
		Map<String,TypeDescriptor> existingTypes =Collections.emptyMap(); 
		return CreateGraph(origNodes,rootName, existingTypes);
	}
	
	public HashMap<String,TypeDescriptor> CreateGraph(List<OPMNode> origNodes, String rootName, Map<String,TypeDescriptor> existingTypes){
		Collection<OPMNode> rootNodes = OPDAnalysis.findNamedNodes(origNodes,rootName);
		if (rootNodes.size() != 1) 
			throw new RuntimeException("Incorrect number of root nodes in diagram");
		LinkedList<preProcessWrapper> preprocessedNodes = new LinkedList<>();
		for (OPMNode rootNode:rootNodes){
			preprocessedNodes.add(new preProcessWrapper(rootNode,null));
		}
		HashMap<String,TypeDescriptor> created = new HashMap<String,TypeDescriptor>();
		
		// using something like BFS
		while (!preprocessedNodes.isEmpty()){
			preProcessWrapper current = preprocessedNodes.removeFirst(); 
			String currKey = current.node.getName();
			
			if (created.containsKey(currKey))
				throw new RuntimeException("Diamond inheritence is not supported");
		
			// create new type
			TypeDescriptor descriptor=getDescriptor(current);
			created.put(currKey, descriptor);
			
			Collection<OPMLink> links;
			
			// copying properties from a single parent (duplicates check inside addProperty)
			TypeDescriptor parent=current.parent;
			
			// multiple parents: for (TypeDescriptor parent : blabla multiple parents thingy){ 
			if (parent!=null){
				for (propertyDescriptor property : parent.getProperties())
					if(!descriptor.addProperty(property))
						System.err.print("duplicate property: " + property.getPropertyName());	
			}
			
			
			// adding this nodes properties
			links = OPDAnalysis.findOutgoingLinks(current.node,OPMPackage.eINSTANCE.getOPMAggregationLink());
			for (OPMLink link:links){
				propertyDescriptor propertyDescriptor =  new propertyDescriptor(link.getTarget().getName());
				if(!descriptor.addProperty(propertyDescriptor))
					System.err.print("duplicate property" + propertyDescriptor.getPropertyName());	
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

	private void recursiveSetProperties(TypeDescriptor existing,
			Iterable<propertyDescriptor> properties, Map<String,TypeDescriptor> created) {
		if (!created.containsKey(existing.getName())) created.put(existing.getName(), existing);
		
		ArrayList<propertyDescriptor> acceptedProps = new ArrayList<>();
		for (propertyDescriptor property:properties)
			if(!existing.addProperty(property)){
				System.err.print("duplicate property: " + property.getPropertyName());
			}else{
				acceptedProps.add(property);
			}
		if (acceptedProps.isEmpty()) return;
		
		for (TypeDescriptor child:existing.getChildren())
			recursiveSetProperties(child,acceptedProps,created);
	}

	private TypeDescriptor getDescriptor(preProcessWrapper currWrapper) {
		TypeDescriptor 	descriptor= new TypeDescriptor(currWrapper.node.getName());
		setParent(descriptor, currWrapper.parent);
		return descriptor;
	}
	
	private void setParent(TypeDescriptor descriptor, TypeDescriptor parent) {
		if (parent == null) return;
		if (parent.children.contains(descriptor)) return;
		descriptor.parents.add(parent);
		parent.children.add(descriptor);		
	}
	
	private class preProcessWrapper {
		public preProcessWrapper (final OPMNode node, final TypeDescriptor parent){
			this.node = node;
			this.parent = parent;
		}
		final OPMNode node;
		final TypeDescriptor parent;
	}
}
