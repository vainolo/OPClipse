package com.vainolo.phd.opmeta.gef.parts;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;

public class OPModelContainerEditPart extends AbstractGraphicalEditPart {

	@Override
	protected IFigure createFigure() {
		FreeformLayer layer = new FreeformLayer();
	    layer.setLayoutManager(new FreeformLayout());
	    layer.setBorder(new LineBorder(1));
	    return layer;
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy("Snap Feedback", new SnapFeedbackPolicy());
	}

}
