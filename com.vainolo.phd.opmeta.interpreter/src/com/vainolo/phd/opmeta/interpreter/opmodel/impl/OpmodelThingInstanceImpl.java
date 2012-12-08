package com.vainolo.phd.opmeta.interpreter.opmodel.impl;

import java.util.List;

import com.vainolo.phd.opmeta.interpreter.TypeDescriptor;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelLinkInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelNodeInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelThingInstance;
import com.vainolo.phd.opmeta.model.ThingInstanceBase;

public class OpmodelThingInstanceImpl extends OpmodelNodeInstanceImpl implements
		OpmodelThingInstance {

	protected ThingInstanceBase instanceBase;
	
	public OpmodelThingInstanceImpl(TypeDescriptor descriptor, ThingInstanceBase instanceBase) {
		super(descriptor,instanceBase);
		this.instanceBase = instanceBase;
	}

	private List<OpmodelNodeInstance> nodes;
	
	@Override
	public List<OpmodelNodeInstance> getNodes() {
		return nodes;
	}

	private List<OpmodelLinkInstance> links;
	
	@Override
	public List<OpmodelLinkInstance> getLinks() {
		return links;
	}
}
