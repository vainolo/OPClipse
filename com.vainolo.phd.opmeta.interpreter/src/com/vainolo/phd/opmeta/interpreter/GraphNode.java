package com.vainolo.phd.opmeta.interpreter;

import java.util.LinkedList;

import com.vainolo.phd.opm.model.OPMNode;

class GraphNode {

	public GraphNode(OPMNode origNode){
		parents = new LinkedList<>();
		children = new LinkedList<>();
		
		this.origNode= origNode; 
	}
	
	LinkedList<GraphNode> parents;
	LinkedList<GraphNode> children;
	OPMNode origNode;
	
	public boolean IsRoot(){
		return parents.isEmpty();
	}
	
	public boolean IsLeaf(){
		return children.isEmpty();
	}
	
	public String getName(){
		return origNode.getName().toLowerCase();
	}
}
