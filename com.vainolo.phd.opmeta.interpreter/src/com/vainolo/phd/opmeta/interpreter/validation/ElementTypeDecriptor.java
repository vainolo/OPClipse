package com.vainolo.phd.opmeta.interpreter.validation;

import java.util.LinkedList;
import java.util.List;

import com.vainolo.phd.opm.validation.ElementType;
import com.vainolo.phd.opmodel.model.TypeDescriptor;

public class ElementTypeDecriptor implements ElementType{

	private final TypeDescriptor descriptor;
	private List<ElementType> parents;
	private List<ElementType> children;
	
	public ElementTypeDecriptor(final TypeDescriptor descriptor){
		this.descriptor = descriptor;
	}
	
	TypeDescriptor getDescriptor(){
		return descriptor;
	}
	
	@Override
	public Object GetType() {
		return descriptor;
	}

	@Override
	public List<ElementType> GetParentsOfType() {
		if (parents == null){
			parents = new LinkedList<>();
			for(TypeDescriptor parent:descriptor.getParents()){
				parents.add(new ElementTypeDecriptor(parent));
			}
		}
		return parents;
	}

	@Override
	public List<ElementType> GetSonsOfType() {
		if (children == null){
			children = new LinkedList<>();
			for(TypeDescriptor child:descriptor.getChildren()){
				children.add(new ElementTypeDecriptor(child));
			}
		}
		return children;
	}

	@Override public boolean equals(Object obj) {
		if (obj==null || !(obj instanceof ElementTypeDecriptor)) return false; 
		ElementTypeDecriptor other = (ElementTypeDecriptor)obj;
		return other.descriptor.equals(descriptor);
	}
	
	@Override
	public int hashCode() {
		return descriptor.hashCode();
	}

	@Override
	public String getTypeName() {
		return descriptor.getName();
	}
}
