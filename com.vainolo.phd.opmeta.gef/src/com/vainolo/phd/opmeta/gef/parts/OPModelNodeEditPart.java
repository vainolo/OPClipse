package com.vainolo.phd.opmeta.gef.parts;

import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.vainolo.phd.opmeta.gef.figure.OPModelNodeOnlyFigure;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelLinkInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelNodeInstance;

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
	protected List<OpmodelLinkInstance> getModelSourceConnections() {
		OpmodelNodeInstance model = (OpmodelNodeInstance) getModel();
		return model.getOutgoingLinks();
	} 
	
	@Override
	protected List<OpmodelLinkInstance> getModelTargetConnections() {
		OpmodelNodeInstance model = (OpmodelNodeInstance) getModel();
		return model.getIncomingLinks();
	}
	
	@Override
	protected IFigure createFigure() {
		return new OPModelNodeOnlyFigure();
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
		
	}

	@Override protected void refreshVisuals() {
		OPModelNodeOnlyFigure figure = (OPModelNodeOnlyFigure)getFigure();
	    OpmodelNodeInstance model = (OpmodelNodeInstance)getModel();
	    final GraphicalEditPart parent = (GraphicalEditPart) getParent();
	     
	    parent.setLayoutConstraint(this, figure, model.getConstraints());
	    
	  }
}
