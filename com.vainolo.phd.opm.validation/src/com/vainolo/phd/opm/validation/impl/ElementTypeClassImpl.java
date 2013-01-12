package com.vainolo.phd.opm.validation.impl;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.vainolo.phd.opm.validation.ElementType;

public class ElementTypeClassImpl implements ElementType {

	private Class<?> type;
	
	public ElementTypeClassImpl(Class<?> type){
		if (type == null) throw new NullPointerException();
		this.type = type;
	}
	
	@Override
	public Object GetType() {
		return type;
	}

	@Override
	public List<ElementType> GetParentsOfType() {
		Class<?>[] parentTypes = type.getDeclaredClasses();
		List<ElementType> parents = new LinkedList<ElementType>();
		for (Class<?> parentType:parentTypes){
			parents.add(new ElementTypeClassImpl(parentType));
		}
		return parents;
	}

	@Override
	public List<ElementType> GetSonsOfType() {
		return Collections.emptyList();
	}

	@Override
	public boolean equals(Object obj) {
		if ((obj == null ) || (!(obj instanceof ElementTypeClassImpl))) return false;
		return type.equals(((ElementTypeClassImpl)obj).type);
	}
	
	@Override
	public int hashCode() {
		return type.hashCode();
	}
}
