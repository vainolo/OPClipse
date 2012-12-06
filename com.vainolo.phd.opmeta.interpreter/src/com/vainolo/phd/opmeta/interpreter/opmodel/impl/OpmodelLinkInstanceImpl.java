package com.vainolo.phd.opmeta.interpreter.opmodel.impl;

import com.vainolo.phd.opmeta.interpreter.TypeDescriptor;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelLinkInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelNodeInstance;

public class OpmodelLinkInstanceImpl extends OpmodelInstanceImpl implements
		OpmodelLinkInstance {

	public OpmodelLinkInstanceImpl(TypeDescriptor descriptor) {
		super(descriptor);
	}

	OpmodelNodeInstance source;
	
	@Override
	public void setSource(OpmodelNodeInstance source) {
		this.source = source;
	}

	@Override
	public OpmodelNodeInstance getSource() {
		return source;
	}

	OpmodelNodeInstance target;
	
	@Override
	public void setTarget(OpmodelNodeInstance target) {
		this.target =  target;
	}

	@Override
	public OpmodelNodeInstance getTarget() {
		return target;
	}

}
