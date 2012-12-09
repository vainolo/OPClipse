package com.vainolo.phd.opmeta.interpreter.opmodel.impl;


import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.geometry.Rectangle;

import com.vainolo.phd.opmeta.interpreter.TypeDescriptor;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelLinkInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelNodeInstance;
import com.vainolo.phd.opmeta.model.NodeInstanceBase;

public class OpmodelNodeInstanceImpl extends OpmodelInstanceImpl implements
		OpmodelNodeInstance {

	protected NodeInstanceBase nodeInstanceBase;
	private LinkedList<OpmodelLinkInstance> incomingLinks;
	private LinkedList<OpmodelLinkInstance> outgoingLinks;
	
	
	public OpmodelNodeInstanceImpl(TypeDescriptor descriptor, NodeInstanceBase instanceBase) {
		super(descriptor, instanceBase);
		nodeInstanceBase = instanceBase;
		incomingLinks = new LinkedList<>();
		outgoingLinks = new LinkedList<>();
	}
	
	@Override
	public void setConstraints(Rectangle constraints) {
		nodeInstanceBase.setConstraints(constraints);
	}

	@Override
	public Rectangle getConstraints() { 
		return nodeInstanceBase.getConstraints();
	}

	public List<OpmodelLinkInstance> getIncomingLinks(){
		return incomingLinks;
	}
	
	public List<OpmodelLinkInstance> getOutgoingLinks(){
		return outgoingLinks;
	}
	
}
