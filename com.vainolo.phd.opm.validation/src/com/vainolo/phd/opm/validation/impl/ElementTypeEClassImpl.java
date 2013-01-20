package com.vainolo.phd.opm.validation.impl;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;

import com.vainolo.phd.opm.validation.ElementType;

public class ElementTypeEClassImpl implements ElementType{

	private EClass type;
	
	public ElementTypeEClassImpl(EClass type){
		if (type == null) throw new NullPointerException();
		this.type 		= type;
	}
	
	@Override
	public Object GetType() {
		return type;
	}
	
	@Override
	public String getTypeName() {
		return "";
	}

	@Override
	public List<ElementType> GetParentsOfType() {
		List<EClass> superTypes = type.getESuperTypes();
		List<ElementType> parents = new LinkedList<>();
		for (EClass superT:superTypes){
			parents.add(new ElementTypeEClassImpl(superT));
		}
		return parents;
	}

	@Override
	public List<ElementType> GetSonsOfType() {
		return Collections.emptyList();
	}

	@Override
	public boolean equals(Object obj) {
		if ((obj == null ) || (!(obj instanceof ElementTypeEClassImpl))) return false;
		return type.equals(((ElementTypeEClassImpl)obj).type);
	}
	
	@Override
	public int hashCode() {
		return type.hashCode();
	}
}
