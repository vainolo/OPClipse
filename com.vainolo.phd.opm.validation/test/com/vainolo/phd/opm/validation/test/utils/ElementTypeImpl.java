package com.vainolo.phd.opm.validation.test.utils;

import java.util.ArrayList;
import java.util.List;

import com.vainolo.phd.opm.validation.ElementType;

public class ElementTypeImpl implements ElementType {

	private String type;
	private List<ElementType> Parents;
	private List<ElementType> Sons;
	public ElementTypeImpl(String type) {
		this.type = type;
		Parents = new ArrayList<ElementType>();
		Sons = new ArrayList<ElementType>();
	}
	public void AddParent(ElementTypeImpl parent) {
		this.Parents.add(parent);
	}
	public void AddSon(ElementTypeImpl son) {
		this.Sons.add(son);
	}
	@Override
	public Object GetType() {
		return this.type;
	}

	@Override
	public List<ElementType> GetParentsOfType() {
		return Parents;
	}

	@Override
	public List<ElementType> GetSonsOfType() {
		return Sons;
	}
	@Override
	public boolean equals(Object obj) {
		if ((obj == null ) || (!(obj instanceof ElementTypeImpl))) return false;
		return type.equals(((ElementTypeImpl)obj).type);
	}
	
	@Override
	public int hashCode() {
		return type.hashCode();
	}
	@Override
	public String getTypeName() {
		return type;
	}
}