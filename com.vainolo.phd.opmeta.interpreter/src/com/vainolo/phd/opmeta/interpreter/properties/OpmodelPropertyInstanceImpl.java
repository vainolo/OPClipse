package com.vainolo.phd.opmeta.interpreter.properties;

import com.vainolo.phd.opmeta.interpreter.propertyDescriptor;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelPropertyInstance;

public class OpmodelPropertyInstanceImpl implements OpmodelPropertyInstance{
	
	int MAX_LEN=1000;
	
	propertyDescriptor descriptor;
	String value;
	
	public OpmodelPropertyInstanceImpl(propertyDescriptor desc)  {
		this.descriptor=desc;
		this.value="";
	}
	
	public String getPropertyName(){
		return descriptor.getPropertyName();
	}
	
	public String getPropertyType(){
		return descriptor.getPropertyType();
	}
	
	
	
	public String getValue(){
		return this.value;
	}
	
	public boolean setValue(String val){

		if (val.length()<=MAX_LEN){
			this.value=val;
			return true;
		} else {
			return false;
		}
	}
}
