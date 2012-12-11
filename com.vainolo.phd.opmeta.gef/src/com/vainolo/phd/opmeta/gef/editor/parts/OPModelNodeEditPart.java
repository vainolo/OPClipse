package com.vainolo.phd.opmeta.gef.editor.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.vainolo.phd.opmeta.gef.editor.figure.OPModelNodeOnlyFigure;
import com.vainolo.phd.opmeta.gef.editor.policy.OpNodeEditPolicy;
import com.vainolo.phd.opmeta.gef.editor.policy.OpXYLayoutEditPolicy;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelLinkInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelNodeInstance;

public class OPModelNodeEditPart extends AbstractGraphicalEditPart
	implements NodeEditPart {

	private OpmodelNodeInstanceAdapter adapter;
	
	public OPModelNodeEditPart(){
		adapter = new OpmodelNodeInstanceAdapter();
	}
	
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
		return new ArrayList<OpmodelLinkInstance>(model.getOutgoingLinks());
	} 
	
	@Override
	protected List<OpmodelLinkInstance> getModelTargetConnections() {
		OpmodelNodeInstance model = (OpmodelNodeInstance) getModel();
		return new ArrayList<OpmodelLinkInstance>(model.getIncomingLinks());
	}
	
	@Override
	protected IFigure createFigure() {
		return new OPModelNodeOnlyFigure();
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new OpXYLayoutEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,new OpNodeEditPolicy());
	}

	@Override protected void refreshVisuals() {
		OPModelNodeOnlyFigure figure = (OPModelNodeOnlyFigure)getFigure();
	    OpmodelNodeInstance model = (OpmodelNodeInstance)getModel();
	    final GraphicalEditPart parent = (GraphicalEditPart) getParent();
	     
	    parent.setLayoutConstraint(this, figure, model.getConstraints());
	    
	  }
	
	@Override
	public void activate() {
		if (!isActive()) {
			((OpmodelInstance) getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}

	@Override
	public void deactivate() {
		if (isActive()) {
			((OpmodelInstance) getModel()).eAdapters().remove(adapter);
		}
		super.deactivate();
	}

	/**
	 * Receives notifications of changes in the model and refreshed the view
	 * accordingly.
	 * 
	 * @author vainolo
	 * 
	 */
	public class OpmodelNodeInstanceAdapter implements Adapter {

		/**
		 * For all changes in the model, refresh visuals, source and target.
		 */
		@Override
		public void notifyChanged(Notification notification) {
			refresh();
		}

		@Override
		public Notifier getTarget() {
			return (OpmodelNodeInstance) getModel();
		}

		@Override
		public void setTarget(Notifier newTarget) {
			// Do nothing.
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return OpmodelNodeInstance.class.equals(type);
		}
	}
}
