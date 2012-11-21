package com.vainolo.phd.opmeta.interpreter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.utilities.analysis.OPDAnalysis;

class OpmetaInterpretationCreator {
	
//	private HashMap<String,TypeDescriptor> existingTypes = new HashMap<>();

	public HashMap<String,TypeDescriptor> CreateGraph(List<OPMNode> origNodes, String rootName){
		Collection<OPMNode> rootNodes = OPDAnalysis.findNamedNodes(origNodes,rootName);
		if (rootNodes.size() != 1) throw new RuntimeException("Incorrect number of root nodes in diagram");
		LinkedList<OPMNode> preprocessedNodes = new LinkedList<OPMNode>();
		for (OPMNode rootNode:rootNodes){
			preprocessedNodes.add(rootNode);
		}
		HashMap<String,TypeDescriptor> created = new HashMap<String,TypeDescriptor>();
		
		// using something like BFS
		while (!preprocessedNodes.isEmpty()){
			OPMNode currentNode = preprocessedNodes.removeFirst();
			Collection<OPMLink> links = OPDAnalysis.findOutgoingLinks(currentNode,OPMPackage.eINSTANCE.getOPMGeneralizationLink());
			for (OPMLink link:links){
				OPMNode next = link.getTarget();
				if (next == null || preprocessedNodes.contains(next)) continue;
				preprocessedNodes.add(next);
			}
			
			String currKey = currentNode.getName();
			TypeDescriptor descriptor=getDescriptor(currKey);
			getParents(descriptor, currentNode,created);
			created.put(currKey, descriptor);
		}
		return created;
	}

	private TypeDescriptor getDescriptor(String currKey) {
//		if (existingTypes.containsKey(currKey)){
//			return existingTypes.get(currKey);
//		}
		TypeDescriptor 	descriptor= new TypeDescriptor(currKey);
		//existingTypes.put(currKey, descriptor);
		return descriptor;
	}

	private void getParents(TypeDescriptor current, OPMNode currentNode, HashMap<String, TypeDescriptor> created) {
		Collection<OPMLink> incomingLinks = OPDAnalysis.findIncomingLinks(currentNode,OPMPackage.eINSTANCE.getOPMGeneralizationLink());
		for (OPMLink incomingLink: incomingLinks){
			OPMNode parentNode = incomingLink.getSource();
			if (parentNode == null) continue;
			if (!created.containsKey(parentNode.getName())) continue; 
			TypeDescriptor parent = created.get(parentNode.getName());
		    setParent(current,parent);
		}
	}
	
	private void setParent(TypeDescriptor descriptor, TypeDescriptor parent) {
		if (parent.children.contains(descriptor)) return;
		//descriptor.parents.add(parent);
		descriptor.parent = parent;
		parent.children.add(descriptor);		
	}

//	void clearCache() {
//		existingTypes.clear();
//		
//	}
}
