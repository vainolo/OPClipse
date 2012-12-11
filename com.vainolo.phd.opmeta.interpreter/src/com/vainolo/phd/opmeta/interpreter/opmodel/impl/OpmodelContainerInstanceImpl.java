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
		super(descriptor, instanceBase);
		containerInstanceBase = instanceBase;
		nodes = new LinkedList<>();
		
		links = new LinkedList<>();
		
	}

	private List<OpmodelNodeInstance> nodes;
	
	@Override
	public Iterable<OpmodelNodeInstance> getNodes() {
		return nodes;
	}

	public void addNode(OpmodelNodeInstance node){
		nodes.add(node);
		if (node instanceof OpmodelNodeInstanceImpl){
			containerInstanceBase.getNodes().add(((OpmodelNodeInstanceImpl)node).nodeInstanceBase);
		}
	}
	
	public void removeNode(OpmodelNodeInstance node){
		nodes.remove(node);
		if (node instanceof OpmodelNodeInstanceImpl){
			containerInstanceBase.getNodes().remove(((OpmodelNodeInstanceImpl)node).nodeInstanceBase);
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
			containerInstanceBase.getLinks().add(((OpmodelLinkInstanceImpl)link).linkInstanceBase);
			((OpmodelLinkInstanceImpl)link).setContainer(this);
		}
	}
	
	public void removeLink(OpmodelLinkInstance link){
		links.remove(link);
		if (link instanceof OpmodelLinkInstanceImpl){
			containerInstanceBase.getLinks().remove(((OpmodelLinkInstanceImpl)link).linkInstanceBase);
			((OpmodelLinkInstanceImpl)link).setContainer(null);
		}
	}

	@Override
	public boolean containsNode(OpmodelNodeInstance node) {
		return nodes.contains(node);
	}

	@Override
	public boolean containsLink(OpmodelLinkInstance link) {
		return links.contains(link);
	}
	
	
}
