package com.vainolo.phd.opmeta.interpreter.opmodel.impl;

import java.util.LinkedList;
import java.util.List;

import com.vainolo.phd.opmeta.interpreter.TypeDescriptor;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelLinkInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelNodeInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelThingInstance;
import com.vainolo.phd.opmeta.model.ThingInstanceBase;

public class OpmodelThingInstanceImpl extends OpmodelNodeInstanceImpl implements
		OpmodelThingInstance {

	protected ThingInstanceBase thingInstanceBase;
	
	public OpmodelThingInstanceImpl(TypeDescriptor descriptor, ThingInstanceBase instanceBase) {
		super(descriptor,instanceBase);
		this.thingInstanceBase = instanceBase;
	}

private List<OpmodelNodeInstance> nodes;
	
	@Override
	public Iterable<OpmodelNodeInstance> getNodes() {
		return nodes;
	}

	public void addNode(OpmodelNodeInstance node){
		nodes.add(node);
		if (node instanceof OpmodelNodeInstanceImpl){
			thingInstanceBase.getNodes().add(((OpmodelNodeInstanceImpl)node).nodeInstanceBase);
		}
	}
	
	public void removeNode(OpmodelNodeInstance node){
		nodes.remove(node);
		if (node instanceof OpmodelNodeInstanceImpl){
			thingInstanceBase.getNodes().remove(((OpmodelNodeInstanceImpl)node).nodeInstanceBase);
		}
	}
	
	private LinkedList<OpmodelLinkInstance> links;
	
	@Override
	public Iterable<OpmodelLinkInstance> getLinks() {
		return links;
	}

	public void addLink(OpmodelLinkInstance link){
		links.add(link);
		if (link instanceof OpmodelLinkInstanceImpl){
			thingInstanceBase.getLinks().add(((OpmodelLinkInstanceImpl)link).linkInstanceBase);
		}
	}
	
	public void removeLink(OpmodelLinkInstance link){
		links.remove(link);
		if (link instanceof OpmodelLinkInstanceImpl){
			thingInstanceBase.getLinks().remove(((OpmodelLinkInstanceImpl)link).linkInstanceBase);
		}
	}
}
