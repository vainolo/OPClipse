package com.vainolo.phd.opmeta.interpreter.opmodel.impl;

import com.vainolo.phd.opmeta.interpreter.TypeDescriptor;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelInstance;

public class OpmodelInstanceImpl implements OpmodelInstance {

	public void setId(long id){
		// TODO : something with this
	}
	
	public OpmodelInstanceImpl(TypeDescriptor descriptor) {
		super();
		this.descriptor = descriptor;
	}

	private TypeDescriptor descriptor;
	
	protected TypeDescriptor getTypeDescriptor(){
		return descriptor;
	}
	
	
}
