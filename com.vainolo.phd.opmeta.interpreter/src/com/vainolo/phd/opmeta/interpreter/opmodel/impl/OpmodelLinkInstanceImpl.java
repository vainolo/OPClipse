package com.vainolo.phd.opmeta.interpreter.opmodel.impl;

import com.vainolo.phd.opmeta.interpreter.TypeDescriptor;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelContainerInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelLinkInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelNodeInstance;
import com.vainolo.phd.opmeta.model.LinkInstanceBase;

public class OpmodelLinkInstanceImpl extends OpmodelInstanceImpl implements
		OpmodelLinkInstance {

	protected LinkInstanceBase linkInstanceBase;
	
	public OpmodelLinkInstanceImpl(TypeDescriptor descriptor, LinkInstanceBase instanceBase) {
		super(descriptor, instanceBase);
		linkInstanceBase = instanceBase;
	}

	OpmodelNodeInstance source;
	
	@Override
	public void setSource(OpmodelNodeInstance source) {
		if (this.source != null){
			this.source.getOutgoingLinks().remove(this);
		}
		this.source = source;
		if (this.source != null){
			this.source.getOutgoingLinks().add(this);
			if (source instanceof OpmodelNodeInstanceImpl)
				linkInstanceBase.setSource(((OpmodelNodeInstanceImpl)source).nodeInstanceBase);
		}else{
			linkInstanceBase.setSource(null);
		}
		
	}

	@Override
	public OpmodelNodeInstance getSource() {
		return source;
	}

	OpmodelNodeInstance target;
	
	@Override
	public void setTarget(OpmodelNodeInstance target) {
		if (this.target != null){
			this.target.getIncomingLinks().remove(this);
		}
		this.target = target;
		if (this.target != null){
			this.target.getIncomingLinks().add(this);
			if (target instanceof OpmodelNodeInstanceImpl)
				linkInstanceBase.setTarget(((OpmodelNodeInstanceImpl)target).nodeInstanceBase);
		}else{
			linkInstanceBase.setTarget(null);
		}
	}

	@Override
	public OpmodelNodeInstance getTarget() {
		return target;
	}

	private OpmodelContainerInstance contianer;
	
	public OpmodelContainerInstance getContainer(){
		return contianer;
	}
	
	void setContainer(OpmodelContainerInstance contianer){
		this.contianer = contianer;
	}
}
