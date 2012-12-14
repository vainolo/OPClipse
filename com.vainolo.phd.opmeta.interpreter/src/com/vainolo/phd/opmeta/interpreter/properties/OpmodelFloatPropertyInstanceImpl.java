package com.vainolo.phd.opmeta.interpreter.properties;

import com.vainolo.phd.opmeta.interpreter.propertyDescriptor;

public class OpmodelFloatPropertyInstanceImpl extends OpmodelPropertyInstanceImpl {
	
	int MAX_LEN=1000;
	
	public OpmodelFloatPropertyInstanceImpl(propertyDescriptor desc){
		super(desc);
	}
	
	public boolean setValue(String val){
		if (val.length()<=MAX_LEN){
			try {
				Integer.parseInt(val);
			} catch (NumberFormatException e) {
				return false;
			}
			this.value=val;
			return true;
		} else {
			return false;
		}
	}
}
