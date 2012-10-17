package com.vainolo.phd.opm.gef.editor.part;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import com.vainolo.phd.opm.gef.editor.figure.OPMCompoundLinkFigure;
import com.vainolo.phd.opm.gef.editor.figure.OPMNodeFigure;
import com.vainolo.phd.opm.gef.editor.policy.OPMLinkBendpointEditPolicy;
import com.vainolo.phd.opm.model.OPMStructuralLink;

public class OPMStructuralLinkEditPart extends OPMLinkEditPart {

	private OPMCompoundLinkFigure figure;
	private OPMStructuralLinkAggregatorEditPart aggregatorEditPart;
	private LinkEditPart sourceToAggregatorEditPart, aggregatorToTargetEditPart;
	
	public OPMStructuralLinkEditPart(OPMStructuralLinkAggregatorEditPart aggregatorEditPart,LinkEditPart sourceToAggregatorEditPart,LinkEditPart aggregatorToTargetEditPart){
		super();
		this.aggregatorEditPart = aggregatorEditPart;
		this.sourceToAggregatorEditPart = sourceToAggregatorEditPart;
		this.aggregatorToTargetEditPart = aggregatorToTargetEditPart;
	}
	
	public OPMStructuralLinkEditPart(){
		super();
	}
	
	@Override
	protected IFigure createFigure() {
		if (aggregatorEditPart == null){
			OPMStructuralLink model = (OPMStructuralLink) getModel();
			aggregatorEditPart = new OPMStructuralLinkAggregatorEditPart(model);
			aggregatorEditPart.setParent(getParent());
		}
		if (null == sourceToAggregatorEditPart){
			sourceToAggregatorEditPart = new LinkEditPart();
			sourceToAggregatorEditPart.setParent(getParent());
			sourceToAggregatorEditPart.setTarget(aggregatorEditPart);
		}
		if (null == aggregatorToTargetEditPart){
			aggregatorToTargetEditPart = new LinkEditPart();
			aggregatorToTargetEditPart.setParent(getParent());
			aggregatorToTargetEditPart.setSource(aggregatorEditPart);
		}
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
		OPMStructuralLink model = (OPMStructuralLink) getModel();
		List<Point> modelConstraint = model.getBendpoints();
		
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
	
	  @Override
	  protected void createEditPolicies() {
		//super.createEditPolicies();
	    //removeEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE);

		removeEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
		  
	    sourceToAggregatorEditPart.installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE, new ConnectionEndpointEditPolicy());
	    aggregatorToTargetEditPart.installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE, new ConnectionEndpointEditPolicy());
	    
	    aggregatorEditPart.installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new NonResizableEditPolicy());
	  }
	   
	  @Override
	  public void installEditPolicy(Object key, EditPolicy editPolicy){
		  if (key.equals(EditPolicy.PRIMARY_DRAG_ROLE)) return;
		  super.installEditPolicy(key, editPolicy);
	  }
	  
	  @Override
	  public void setSource(EditPart editPart){
		  super.setSource(editPart);
		  sourceToAggregatorEditPart.setSource(editPart);
	  }
	  
	  @Override
	  public void setTarget(EditPart editPart){
		  super.setTarget(editPart);
		  aggregatorToTargetEditPart.setTarget(editPart);
	  }
	  
	  public OPMStructuralLinkAggregatorEditPart getAggregatorEditPart() {
			return aggregatorEditPart;
		}

		public LinkEditPart getSourceToAggregatorEditPart() {
			return sourceToAggregatorEditPart;
		}

		public LinkEditPart getAggregatorToTargetEditPart() {
			return aggregatorToTargetEditPart;
		}

		@Override
		public void addNotify(){
			super.addNotify();
			aggregatorEditPart.createEditPolicies();
			sourceToAggregatorEditPart.createEditPolicies();
			aggregatorToTargetEditPart.createEditPolicies();
			refresh();
		}
		
		@Override
		public void refresh(){
			super.refresh();
			aggregatorEditPart.refresh();
			sourceToAggregatorEditPart.refresh();
			aggregatorToTargetEditPart.refresh();
		}
		
		@Override
		public void activate(){
			super.activate();
			aggregatorEditPart.activate();
			sourceToAggregatorEditPart.activate();
			aggregatorToTargetEditPart.activate();
		}
		@Override
		public void deactivate(){
			super.deactivate();
			aggregatorEditPart.deactivate();
			sourceToAggregatorEditPart.deactivate();
			aggregatorToTargetEditPart.deactivate();
		}
		
		
}
