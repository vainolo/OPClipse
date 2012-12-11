package com.vainolo.phd.opmeta.interpreter.opmodel;

public interface OpmodelLinkInstance extends OpmodelInstance {

	public void setSource(OpmodelNodeInstance source);
	
	public OpmodelNodeInstance getSource();
	
	public void setTarget(OpmodelNodeInstance target);
	
	public OpmodelNodeInstance getTarget();
	
	public OpmodelContainerInstance getContainer();
	
}
