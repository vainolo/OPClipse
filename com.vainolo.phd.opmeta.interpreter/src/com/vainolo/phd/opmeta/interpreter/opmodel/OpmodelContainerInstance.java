package com.vainolo.phd.opmeta.interpreter.opmodel;

public interface OpmodelContainerInstance extends OpmodelInstance{

	Iterable<OpmodelNodeInstance> getNodes();
	
	void addNode(OpmodelNodeInstance node);
	
	void removeNode(OpmodelNodeInstance node);
	
	boolean containsNode(OpmodelNodeInstance node); 
	
	Iterable<OpmodelLinkInstance> getLinks();
	
	void addLink(OpmodelLinkInstance link);
	
	void removeLink(OpmodelLinkInstance link);
	
	boolean containsLink(OpmodelLinkInstance link);
}
