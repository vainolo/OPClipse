package com.vainolo.phd.opmeta.interpreter;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import com.vainolo.phd.opmeta.interpreter.propertyDescriptor;

public class TypeDescriptor {

	private int hashcode;
	
	private List<propertyDescriptor> propertyList;
	
	public TypeDescriptor(String name){
		//parents = new LinkedList<>();
		children = new LinkedList<>();
		this.propertyList = new LinkedList<>();
		this.name = name;
		hashcode = name.hashCode();
	}
	
	boolean addProperty (propertyDescriptor property){
		// TODO: check property list by name
		for (propertyDescriptor propertyinlist : propertyList){
			if(propertyinlist.getPropertyName().equals(property.getPropertyName()))
					return false;
		}
			propertyList.add(property);
			
		
			return true;
	}
	
	public Iterable<propertyDescriptor> getProperties(){
		return propertyList;
	}
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	TypeDescriptor parent;
	
	public TypeDescriptor getParent(){ return  parent;}
	
	/*
	 * Returns an unmodifiableCollection copy of parent Type Descriptors
	 */
	//public Collection<TypeDescriptor> getParents(){ return Collections.unmodifiableCollection(parents);}
	
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
		if (!(other.name == name) || !(other.children.equals(children))) return false;
		if (parent == null) return (other.parent ==null);
		return parent.equals(other.parent);
//		return (other.name.equals(name) && 
//				(other.children.equals(children)) && 
//				(other.parents.equals(parents)));
	}

	@Override
	public int hashCode() {
		return hashcode;
	}
}
