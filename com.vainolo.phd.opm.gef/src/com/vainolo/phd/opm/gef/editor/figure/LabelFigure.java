/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/
package com.vainolo.phd.opm.gef.editor.figure;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LabelAnchor;

public class LabelFigure extends Label implements OPMNamedElementFigure, OPMNodeFigure {
	
	@Override
	public Label getNameLabel() {
		return this;
	}

	private ConnectionAnchor connectionAnchor;

	public ConnectionAnchor getConnectionAnchor() {
	    if(connectionAnchor == null) {
	      connectionAnchor = new LabelAnchor(this);
	    }
	    return connectionAnchor;
	  }
	
	@Override
	public ConnectionAnchor getSourceConnectionAnchor() {
		return getConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor() {
		return getConnectionAnchor();
	}
}
