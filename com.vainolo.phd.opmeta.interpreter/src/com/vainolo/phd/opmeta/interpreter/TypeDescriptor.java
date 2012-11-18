package com.vainolo.phd.opmeta.interpreter;

import java.util.LinkedList;
import java.util.List;

public class TypeDescriptor <TDesc extends TypeDescriptor<TDesc>> {

	private int hashcode;
	
	public TypeDescriptor(String name){
		parents = new LinkedList<>();
		this.name = name;
		hashcode = name.hashCode();
	}
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	private boolean isLeaf;

	public boolean isLeaf() {
		return isLeaf;
	}

	void setLeaf(boolean isLeaf) {
		this.isLeaf = isLeaf;
	}

	private List<TDesc> parents;
	
	public Iterable<TDesc> getParents(){ return parents;}
	
	boolean addParent(TDesc parent){
		if (parent == null) return false;
		return parents.add(parent);
	}
	
	@Override
	public boolean equals(Object arg0) {
		if (super.equals(arg0)) return true;
		if ((arg0 == null) || (!(arg0 instanceof TypeDescriptor))) return false; 
		TypeDescriptor<?> other = (TypeDescriptor<?>)arg0;
		return (other.name.equals(name) && (other.isLeaf == isLeaf) && 
				(other.parents.equals(parents)));
	}

	@Override
	public int hashCode() {
		return hashcode;
	}
}
