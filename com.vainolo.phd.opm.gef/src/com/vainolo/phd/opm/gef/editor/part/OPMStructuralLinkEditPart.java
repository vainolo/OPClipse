package com.vainolo.phd.opm.gef.editor.part;

import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;

import com.vainolo.phd.opm.gef.editor.figure.OPMFigureConstants;
import com.vainolo.phd.opm.gef.editor.figure.OPMStructuralLinkFigure;
import com.vainolo.phd.opm.gef.editor.figure.StructuralLinkKind;
import com.vainolo.phd.opm.gef.editor.policy.OPMLinkBendpointEditPolicy;
import com.vainolo.phd.opm.gef.editor.policy.OPMLinkConnectionEditPolicy;
import com.vainolo.phd.opm.gef.utils.OPMStructuralLinkToStructuralLinkKindConverter;
import com.vainolo.phd.opm.model.OPMStructuralLink;

public class OPMStructuralLinkEditPart extends OPMLinkEditPart {

	private OPMStructuralLinkFigure figure;
	private OPMStructuralLinkAggregatorEditPart aggregatorEditPart;
	private OPMLinkEditPart sourceToAggregatorEditPart, aggregatorToTargetEditPart;
	
	public OPMStructuralLinkEditPart(){
		// does nothing yet...
	}
	
	@Override
	protected IFigure createFigure() {
		OPMStructuralLink model = (OPMStructuralLink) getModel();
		StructuralLinkKind linkKind = OPMStructuralLinkToStructuralLinkKindConverter.INSTANCE
				.Convert(model);
		figure = new OPMStructuralLinkFigure(linkKind);
		figure.setConnectionRouter(new BendpointConnectionRouter());
		figure.setLineWidth(OPMFigureConstants.connectionLineWidth);
		
		return figure;
	}

	@Override
	protected void refreshVisuals() {
		// Connection connection = getConnectionFigure();
		// List<Point> modelConstraint = ((OPMLink) getModel()).getBendpoints();
		// List<AbsoluteBendpoint> figureConstraint = new
		// ArrayList<AbsoluteBendpoint>();
		// for(Point p : modelConstraint) {
		// figureConstraint.add(new AbsoluteBendpoint(p));
		// }
		// connection.setRoutingConstraint(figureConstraint);
		OPMStructuralLink model = (OPMStructuralLink) getModel();
		figure.setAggregatorLocation(model.getAggregatorPosition().x, model.getAggregatorPosition().y);
		((GraphicalEditPart) getParent()).setLayoutConstraint(this, figure,
				figure.getBounds());
		getFigure().repaint();

	}
	
	/**
	   * Installs three edit policies:
	   * <ol>
	   * <li>For the {@link EditPolicy#CONNECTION_ENDPOINTS_ROLE} a {@link ConnectionEndpoinEditPolicy}.</li>
	   * <li>For the {@link EditPolicy#CONNECTION_ROLE} a {@link OPMLinkConnectionEditPolicy}.</li>
	   * <li>For the {@link EditPolicy#CONNECTION_BENDPOINTS_ROLE} a {@link OPMLinkBendpointEditPolicy} (for links that use
	   * a {@link BendpointConnectionRouter}).</li>
	   * </ol>
	   */
	  @Override
	  protected void createEditPolicies() {
		super.createEditPolicies();
	    installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE, new ConnectionEndpointEditPolicy());
	    installEditPolicy(EditPolicy.CONNECTION_ROLE, new OPMLinkConnectionEditPolicy());
	    installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE, new OPMLinkBendpointEditPolicy());

	  }
}
