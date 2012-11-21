package com.vainolo.phd.opmeta.interpreter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.utilities.analysis.OPDAnalysis;

public class Graph {

	public static Graph CreateGraph(List<OPMNode> origNodes, List<String> mainNodeNames){
		LinkedList<OPMNode> preprocessedNodes = new LinkedList<OPMNode>();
		for (String nodeName:mainNodeNames){
			Collection<OPMNode> foundNodes = OPDAnalysis.findNamedNodes(origNodes,nodeName);
			preprocessedNodes.addAll(foundNodes);
		}
		HashSet<OPMNode> markedNodes = new HashSet<OPMNode>();
		HashMap<String,GraphNode> graphNodes = new HashMap<String,GraphNode>();
		
		while (!preprocessedNodes.isEmpty()){
			OPMNode current = preprocessedNodes.removeFirst();
			markedNodes.add(current);
			String currKey = current.getName().toLowerCase();
			
			GraphNode graphCurr;
			if (graphNodes.containsKey(currKey)) graphCurr = graphNodes.get(currKey);
			else{
				graphCurr = new GraphNode(current);
				graphNodes.put(currKey,graphCurr);
			}
			
			getInOutgoingNodes(preprocessedNodes, markedNodes, graphNodes, current, graphCurr);
		}
			
		return new Graph(graphNodes.values());
	}

	private static void getInOutgoingNodes(LinkedList<OPMNode> preprocessedNodes, HashSet<OPMNode> markedNodes,
			HashMap<String, GraphNode> graphNodes, OPMNode current,	GraphNode graphCurr) {
		Collection<OPMLink> links = OPDAnalysis.findOutgoingLinks(current,OPMPackage.eINSTANCE.getOPMGeneralizationLink());
		for (OPMLink link:links){
			OPMNode next = link.getTarget();
			if (next == null || preprocessedNodes.contains(next)) continue;
			if (!markedNodes.contains(next)) preprocessedNodes.add(next);
			else {
				GraphNode linkedNode = graphNodes.get(next.getName().toLowerCase());
				linkedNode.parents.add(graphCurr);
				graphCurr.children.add(linkedNode);
			}
		}
		
		links = OPDAnalysis.findIncomingLinks(current,OPMPackage.eINSTANCE.getOPMGeneralizationLink());
		for (OPMLink link:links){
			OPMNode next = link.getSource();
			if (next == null || preprocessedNodes.contains(next)) continue;
			if (!markedNodes.contains(next)) preprocessedNodes.add(next);
			else {
				GraphNode linkedNode = graphNodes.get(next.getName().toLowerCase());
				linkedNode.children.add(graphCurr);
				graphCurr.parents.add(linkedNode);
			}
		}
	}
	
	private Graph(final Collection<GraphNode> nodes){
		this.nodes= new ArrayList<>(nodes);
		roots = new ArrayList<>();
		leafs = new ArrayList<>();
		for (GraphNode node:nodes){
			if (node.IsRoot()) roots.add(node);
			if (node.IsLeaf()) leafs.add(node);
		}
	}
	
	List<GraphNode> nodes;
	List<GraphNode> roots;
	List<GraphNode> leafs;
}
