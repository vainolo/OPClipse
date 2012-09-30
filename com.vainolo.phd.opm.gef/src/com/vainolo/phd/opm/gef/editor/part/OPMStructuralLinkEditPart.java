package com.vainolo.phd.opm.gef.editor.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.GraphicalEditPart;

import com.vainolo.phd.opm.gef.editor.figure.OPMFigureConstants;
import com.vainolo.phd.opm.gef.editor.figure.OPMStructuralLinkFigure;
import com.vainolo.phd.opm.gef.editor.figure.StructuralLinkKind;
import com.vainolo.phd.opm.gef.utils.OPMStructuralLinkToStructuralLinkKindConverter;
import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMStructuralLink;

public class OPMStructuralLinkEditPart extends OPMLinkEditPart{

	  @Override
	  protected IFigure createFigure() {
		  OPMStructuralLink model = (OPMStructuralLink) getModel();
		  StructuralLinkKind linkKind = OPMStructuralLinkToStructuralLinkKindConverter.INSTANCE.Convert(model);
		  OPMStructuralLinkFigure figure = new  OPMStructuralLinkFigure(linkKind);
	    figure.setConnectionRouter(new BendpointConnectionRouter());
	    figure.setLineWidth(OPMFigureConstants.connectionLineWidth);
	    figure.setAggregatorLocation(model.getAggregatorPosition().x, model.getAggregatorPosition().y);
	    return figure;
	  }

	  @Override
	  protected void refreshVisuals() {
//	    Connection connection = getConnectionFigure();
//	    List<Point> modelConstraint = ((OPMLink) getModel()).getBendpoints();
//	    List<AbsoluteBendpoint> figureConstraint = new ArrayList<AbsoluteBendpoint>();
//	    for(Point p : modelConstraint) {
//	      figureConstraint.add(new AbsoluteBendpoint(p));
//	    }
//	    connection.setRoutingConstraint(figureConstraint);
		((GraphicalEditPart) getParent()).setLayoutConstraint(this, figure,figure.getBounds());
	    getFigure().repaint();
	    
	  }
}
