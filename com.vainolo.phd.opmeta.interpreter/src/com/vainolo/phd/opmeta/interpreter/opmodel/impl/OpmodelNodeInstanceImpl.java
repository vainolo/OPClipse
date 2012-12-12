package com.vainolo.phd.opmeta.interpreter.opmodel.impl;

import java.util.Collection;

import org.eclipse.draw2d.geometry.Rectangle;

import com.vainolo.phd.opmeta.interpreter.TypeDescriptor;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelLinkInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelNodeInstance;
import com.vainolo.phd.opmeta.model.NodeInstanceBase;
import com.vainolo.phd.opmeta.model.util.NotifiableLinkedCollection;

public class OpmodelNodeInstanceImpl extends OpmodelInstanceImpl implements
		OpmodelNodeInstance {

	protected NodeInstanceBase nodeInstanceBase;
	private NotifiableLinkedCollection<OpmodelLinkInstance> incomingLinks;
	private NotifiableLinkedCollection<OpmodelLinkInstance> outgoingLinks;	
	
	public OpmodelNodeInstanceImpl(TypeDescriptor descriptor, NodeInstanceBase instanceBase) {
		super(descriptor, instanceBase);
		nodeInstanceBase = instanceBase;
		incomingLinks = new NotifiableLinkedCollection<>();
		incomingLinks.eAdapters().add(new InstanceBaseAdapter());
		outgoingLinks = new NotifiableLinkedCollection<>();
		outgoingLinks.eAdapters().add(new InstanceBaseAdapter());
	}
	
	@Override
	public void setConstraints(Rectangle constraints) {
		nodeInstanceBase.setConstraints(constraints);
	}

	@Override
	public Rectangle getConstraints() { 
		return nodeInstanceBase.getConstraints();
	}

	public Collection<OpmodelLinkInstance> getIncomingLinks(){
		return incomingLinks;
	}
	
	public Collection<OpmodelLinkInstance> getOutgoingLinks(){
		return outgoingLinks;
	}

	public String getName() {return nodeInstanceBase.getName();}
}
