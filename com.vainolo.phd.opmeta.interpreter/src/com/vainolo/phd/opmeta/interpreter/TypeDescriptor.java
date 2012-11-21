package com.vainolo.phd.opmeta.interpreter;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TypeDescriptor {

	private int hashcode;
	
	public TypeDescriptor(String name){
		parents = new LinkedList<>();
		children = new LinkedList<>();
		this.name = name;
		hashcode = name.hashCode();
	}
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	List<TypeDescriptor> parents;
	
	/*
	 * Returns an unmodifiableCollection copy of parent Type Descriptors
	 */
	public Collection<TypeDescriptor> getParents(){ return Collections.unmodifiableCollection(parents);}
	
	List<TypeDescriptor> children;
	
	/*
	 * Returns an unmodifiableCollection copy of children Type Descriptors
	 */
	public Collection<TypeDescriptor> getChildren(){ return Collections.unmodifiableCollection(children);}
	
	public boolean isAbstract(){
		return (!children.isEmpty());
	}
	
	@Override
	public boolean equals(Object arg0) {
		if (super.equals(arg0)) return true;
		if ((arg0 == null) || (!(arg0 instanceof TypeDescriptor))) return false; 
		TypeDescriptor other = (TypeDescriptor)arg0;
		return (other.name.equals(name) && 
				(other.children.equals(children)) && 
				(other.parents.equals(parents)));
	}

	@Override
	public int hashCode() {
		return hashcode;
	}
}
