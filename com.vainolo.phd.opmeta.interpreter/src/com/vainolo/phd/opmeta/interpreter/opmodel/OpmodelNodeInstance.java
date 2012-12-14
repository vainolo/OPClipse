package com.vainolo.phd.opmeta.interpreter.opmodel;

import java.util.Collection;

import org.eclipse.draw2d.geometry.Rectangle;

public interface OpmodelNodeInstance extends OpmodelInstance {

	public void setConstraints(Rectangle constraints);
	
	public Rectangle getConstraints();
	
	public Collection<OpmodelLinkInstance> getIncomingLinks();
	
	public Collection<OpmodelLinkInstance> getOutgoingLinks();
	
	public String getName();
}
