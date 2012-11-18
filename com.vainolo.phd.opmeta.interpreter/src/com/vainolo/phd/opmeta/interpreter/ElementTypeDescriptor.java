package com.vainolo.phd.opmeta.interpreter;

public class ElementTypeDescriptor extends TypeDescriptor<ElementTypeDescriptor> {

	public ElementTypeDescriptor(String name) {
		super(name);
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
	
	@Override
	public boolean equals(Object arg0) {
		if (!(arg0 instanceof ElementTypeDescriptor)) return false;
		if (!super.equals(arg0)) return false;
		ElementTypeDescriptor other = (ElementTypeDescriptor)arg0;
		return ((other.isContainer == isContainer) && (other.isNode == isNode));
	}

	
	
	
}
