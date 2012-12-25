package com.vainolo.phd.opmeta.interpreter.properties;

import com.vainolo.phd.opmeta.interpreter.propertyDescriptor;

public class OpmodelBooleanPropertyInstanceImpl extends OpmodelPropertyInstanceImpl {
	
	int MAX_LEN=1000;
	
	public OpmodelBooleanPropertyInstanceImpl(propertyDescriptor desc){
		super(desc);
	}
	
	public boolean setValue(String val){
		if (val.equals("0") || val.equals("1") || val.equals("true") || val.equals("false")) {
			this.value=val;
			return true;
		} else {
			return false;
		}
	}
}
