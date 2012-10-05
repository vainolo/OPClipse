package com.vainolo.phd.opm.gef.editor.part;

import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;

import com.vainolo.phd.opm.gef.editor.figure.OPMCompoundLinkFigure;
import com.vainolo.phd.opm.gef.editor.figure.OPMNodeFigure;
import com.vainolo.phd.opm.gef.editor.policy.OPMLinkBendpointEditPolicy;
import com.vainolo.phd.opm.gef.editor.policy.OPMLinkConnectionEditPolicy;
import com.vainolo.phd.opm.model.OPMStructuralLink;

public class OPMStructuralLinkEditPart extends OPMLinkEditPart {

	private OPMCompoundLinkFigure figure;
	private OPMStructuralLinkAggregatorEditPart aggregatorEditPart;
	private OPMLinkEditPart sourceToAggregatorEditPart, aggregatorToTargetEditPart;
	
	public OPMStructuralLinkEditPart(OPMStructuralLinkAggregatorEditPart aggregatorEditPart,OPMLinkEditPart sourceToAggregatorEditPart,OPMLinkEditPart aggregatorToTargetEditPart){
		super();
		this.aggregatorEditPart = aggregatorEditPart;
		this.sourceToAggregatorEditPart = sourceToAggregatorEditPart;
		this.aggregatorToTargetEditPart = aggregatorToTargetEditPart;
	}
	
	public OPMStructuralLinkEditPart(){
		super();
		// does nothing yet...
	}
	
	@Override
	protected IFigure createFigure() {
		if (aggregatorEditPart == null){
			OPMStructuralLink model = (OPMStructuralLink) getModel();
			aggregatorEditPart = new OPMStructuralLinkAggregatorEditPart(model);
			aggregatorEditPart.setParent(getParent());
		}
		if (null == sourceToAggregatorEditPart) sourceToAggregatorEditPart = new OPMLinkEditPart();
		if (null == aggregatorToTargetEditPart) aggregatorToTargetEditPart = new OPMLinkEditPart();
		IFigure sourceConnectionFigure =  sourceToAggregatorEditPart.getFigure();
		if (!(sourceConnectionFigure instanceof PolylineConnection)) sourceConnectionFigure = null;
		IFigure targetConnectionFigure =  aggregatorToTargetEditPart.getFigure();
		if (!(targetConnectionFigure instanceof PolylineConnection)) targetConnectionFigure = null;
		figure = new OPMCompoundLinkFigure((OPMNodeFigure)aggregatorEditPart.getFigure(),(PolylineConnection)sourceConnectionFigure, 
				(PolylineConnection)targetConnectionFigure);
		
//		OPMStructuralLink model = (OPMStructuralLink) getModel();
//		StructuralLinkKind linkKind = OPMStructuralLinkToStructuralLinkKindConverter.INSTANCE
//				.Convert(model);
//		figure = new OPMStructuralLinkFigure(linkKind);
//		figure.setConnectionRouter(new BendpointConnectionRouter());
//		figure.setLineWidth(OPMFigureConstants.connectionLineWidth);
		
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
		//OPMStructuralLink model = (OPMStructuralLink) getModel();
		//figure.setAggregatorLocation(model.getAggregatorPosition().x, model.getAggregatorPosition().y);
		aggregatorEditPart.refresh();
		((GraphicalEditPart) getParent()).setLayoutConstraint(this, figure, figure.getBounds());
		
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
	  
	  public OPMStructuralLinkAggregatorEditPart getAggregatorEditPart() {
			return aggregatorEditPart;
		}

		public OPMLinkEditPart getSourceToAggregatorEditPart() {
			return sourceToAggregatorEditPart;
		}

		public OPMLinkEditPart getAggregatorToTargetEditPart() {
			return aggregatorToTargetEditPart;
		}

}
