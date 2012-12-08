package com.vainolo.phd.opmeta.interpreter.opmodel.impl;


import org.eclipse.draw2d.geometry.Rectangle;

import com.vainolo.phd.opmeta.interpreter.TypeDescriptor;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelNodeInstance;
import com.vainolo.phd.opmeta.model.NodeInstanceBase;

public class OpmodelNodeInstanceImpl extends OpmodelInstanceImpl implements
		OpmodelNodeInstance {

	protected NodeInstanceBase nodeInstanceBase;
	
	public OpmodelNodeInstanceImpl(TypeDescriptor descriptor, NodeInstanceBase instanceBase) {
		super(descriptor);
		nodeInstanceBase = instanceBase;
	}
	
	@Override
	public void setConstraints(Rectangle constraints) {
		nodeInstanceBase.setConstraints(constraints);
	}

	@Override
	public Rectangle getConstraints() { 
		return nodeInstanceBase.getConstraints();
	}

}
