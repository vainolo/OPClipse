package com.vainolo.phd.opmeta.interpreter.properties;

import com.vainolo.phd.opmeta.interpreter.propertyDescriptor;

public class OpmodelIntPropertyInstanceImpl extends OpmodelPropertyInstanceImpl {
	
	public OpmodelIntPropertyInstanceImpl(propertyDescriptor desc){
		super(desc);
	}
	
	public boolean setValue(String val){
		if (val.equals("0") || val.equals("1") || val.equals("true") || val.equals("false")) {	
			return true;
		} else {
			return false;
		}
	}
}
