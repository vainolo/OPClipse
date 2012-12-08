package com.vainolo.phd.opmeta.interpreter.opmodel.impl;

import java.util.LinkedList;
import java.util.List;

import com.vainolo.phd.opmeta.interpreter.TypeDescriptor;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelContainerInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelLinkInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelNodeInstance;
import com.vainolo.phd.opmeta.model.ContainerInstanceBase;

public class OpmodelContainerInstanceImpl extends OpmodelInstanceImpl implements
		OpmodelContainerInstance {

	private ContainerInstanceBase containerInstanceBase;
	
	public OpmodelContainerInstanceImpl(TypeDescriptor descriptor, ContainerInstanceBase instanceBase) {
		super(descriptor);
		containerInstanceBase = instanceBase;
		nodes = new LinkedList<>();
		links = new LinkedList<>();
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
