package com.vainolo.phd.opmeta.interpreter.opmodel.impl;

import java.awt.Rectangle;

import com.vainolo.phd.opmeta.interpreter.TypeDescriptor;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelNodeInstance;

public class OpmodelNodeInstanceImpl extends OpmodelInstanceImpl implements
		OpmodelNodeInstance {

	public OpmodelNodeInstanceImpl(TypeDescriptor descriptor) {
		super(descriptor);
	}

	Rectangle constraints;
	
	@Override
	public void setConstraints(Rectangle constraints) {
		this.constraints = constraints;
	}

	@Override
	public Rectangle getConstraints() { 
		return constraints;
	}

}
