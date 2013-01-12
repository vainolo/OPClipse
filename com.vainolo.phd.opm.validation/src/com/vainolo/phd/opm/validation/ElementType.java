package com.vainolo.phd.opm.validation;

import java.util.List;

public interface ElementType {
	public Object GetType();
	public List<ElementType> GetParentsOfType();
	public List<ElementType> GetSonsOfType();
	
}