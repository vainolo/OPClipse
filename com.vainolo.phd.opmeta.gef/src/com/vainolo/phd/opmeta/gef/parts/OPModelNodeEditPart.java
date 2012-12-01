package com.vainolo.phd.opmeta.gef.parts;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.vainolo.phd.opmeta.gef.figure.OPModelNodeOnlyFigure;

public class OPModelNodeEditPart extends AbstractGraphicalEditPart
	implements NodeEditPart {

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(
			ConnectionEditPart connection) {
		return ((OPModelNodeOnlyFigure)getFigure()).getSourceConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(
			ConnectionEditPart connection) {
		return ((OPModelNodeOnlyFigure)getFigure()).getTargetConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		return ((OPModelNodeOnlyFigure)getFigure()).getSourceConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		return ((OPModelNodeOnlyFigure)getFigure()).getTargetConnectionAnchor();
	}

	@Override
	protected IFigure createFigure() {
		return new OPModelNodeOnlyFigure();
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
		
	}

}
