package com.vainolo.phd.opmeta.interpreter.opmodel;

import java.util.List;

import org.eclipse.draw2d.geometry.Rectangle;

public interface OpmodelNodeInstance extends OpmodelInstance {

	public void setConstraints(Rectangle constraints);
	
	public Rectangle getConstraints();
	
	public List<OpmodelLinkInstance> getIncomingLinks();
	
	public List<OpmodelLinkInstance> getOutgoingLinks();
}
