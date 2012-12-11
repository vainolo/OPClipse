package com.vainolo.phd.opmeta.interpreter;

public class propertyDescriptor {
	
	String propertyName;
	String propertyType;

	public propertyDescriptor(String property) {
		
		int split=property.indexOf(":");
		
		this.propertyName=property.substring(0, split);
		this.propertyType=property.substring(split+1);
	}
	
	public String getPropertyName() {
		return propertyName;
	}

	
	public String getPropertyType() {
		return propertyType;
	}
}
