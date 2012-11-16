package com.vainolo.phd.opmeta.interpreter;

public class TypeDescriptor {

	private String name;
	
	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	private boolean isNode;
	
	public boolean isNode() {
		return isNode;
	}
	
	void setIsNode(boolean isNode) {
		this.isNode = isNode;
	}
	
	private boolean isContainer;
	
	public boolean isContainer() {
		return isContainer;
	}
	
	void setIsContainer(boolean isContainer) {
		this.isContainer = isContainer;
	}
	
	private boolean isLeaf;

	public boolean isLeaf() {
		return isLeaf;
	}

	void setLeaf(boolean isLeaf) {
		this.isLeaf = isLeaf;
	}
}
