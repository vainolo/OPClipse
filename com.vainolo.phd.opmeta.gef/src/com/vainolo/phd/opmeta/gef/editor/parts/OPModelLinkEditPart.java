package com.vainolo.phd.opmeta.gef.editor.parts;


import org.eclipse.draw2d.BendpointConnectionRouter;
//import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;
import org.eclipse.ui.views.properties.IPropertySource;

import com.vainolo.phd.opmeta.gef.editor.policy.OPModelLinkConnectionEditPolicy;
import com.vainolo.phd.opmodel.model.InstanceBase;

import com.vainolo.phd.opm.gef.utils.OPMFigureConstants;

public class OPModelLinkEditPart extends AbstractConnectionEditPart {

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE, new ConnectionEndpointEditPolicy());
	    installEditPolicy(EditPolicy.CONNECTION_ROLE, new OPModelLinkConnectionEditPolicy());
	    //installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE, new OPMLinkBendpointEditPolicy());

	}

	/**
	   * Create a {@link PolylineConnection} with a {@link BendpointConnectionRouter}
	   */
	  @Override
	  protected PolylineConnection createFigure() {
	    PolylineConnection conn = new PolylineConnection();
	    conn.setConnectionRouter(new BendpointConnectionRouter());
	    conn.setLineWidth(OPMFigureConstants.connectionLineWidth);
	    return conn;
	  }
	
	  @Override
	  protected void refreshVisuals() {
//	    Connection connection = getConnectionFigure();
//	    List<Point> modelConstraint = ((OpmodelLinkInstance) getModel()).getBendpoints();
//	    if (modelConstraint != null){
//		    List<AbsoluteBendpoint> figureConstraint = new ArrayList<AbsoluteBendpoint>();
//		    for(Point p : modelConstraint) {
//		      figureConstraint.add(new AbsoluteBendpoint(p));
//		    }
//		    connection.setRoutingConstraint(figureConstraint);
//	    }

	  }
	  
	  
	private OpmodelPropertySheetSourceImpl propertySource;
	  
		@SuppressWarnings("rawtypes")
		@Override  
		public Object getAdapter(Class key) {

		if (key == IPropertySource.class) {
			if (propertySource == null){
				propertySource = new OpmodelPropertySheetSourceImpl((InstanceBase)getModel());
			}
			return propertySource;
		}

		return super.getAdapter(key);
		
	}
}
