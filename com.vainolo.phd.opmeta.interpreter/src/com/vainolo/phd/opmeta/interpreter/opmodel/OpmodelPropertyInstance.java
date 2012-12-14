package com.vainolo.phd.opmeta.interpreter.opmodel;

public interface OpmodelPropertyInstance {
	
	public String getPropertyName();

	public String getPropertyType();
	
	public String getValue();
	
	public boolean setValue(String val);
	
}
