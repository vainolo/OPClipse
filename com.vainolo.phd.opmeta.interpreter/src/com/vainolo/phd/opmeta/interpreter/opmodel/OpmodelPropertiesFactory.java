package com.vainolo.phd.opmeta.interpreter.opmodel;

import com.vainolo.phd.opmeta.interpreter.properties.*;
import com.vainolo.phd.opmeta.interpreter.propertyDescriptor;

public class OpmodelPropertiesFactory {
		
	public OpmodelPropertiesFactory(){
		super();
	}
	
	public OpmodelPropertyInstanceImpl CreateProperties(propertyDescriptor property){
		if (property.getPropertyType().equals("String")){
			return CreateStringPropertyInstance(property);
		} else if (property.getPropertyType().equals("Boolean")){
			return CreateBooleanropertyInstance(property);
		} else if (property.getPropertyType().equals("int")){
			return CreateIntPropertyInstance(property);
		} else if (property.getPropertyType().equals("float")){
			return CreateFloatPropertyInstance(property);
		}
		return null;
	}
	
	public OpmodelPropertyInstanceImpl CreateStringPropertyInstance(propertyDescriptor property){
		return new OpmodelPropertyInstanceImpl(property);
	}

	public OpmodelPropertyInstanceImpl CreateBooleanropertyInstance(propertyDescriptor property){
		return new OpmodelBooleanPropertyInstanceImpl(property);
	}
	
	public OpmodelPropertyInstanceImpl CreateIntPropertyInstance(propertyDescriptor property){
		return new OpmodelIntPropertyInstanceImpl(property);
	}
	
	public OpmodelPropertyInstanceImpl CreateFloatPropertyInstance(propertyDescriptor property){
		return new OpmodelFloatPropertyInstanceImpl(property);
	}
}
