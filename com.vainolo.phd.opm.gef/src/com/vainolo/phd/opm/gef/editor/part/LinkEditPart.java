package com.vainolo.phd.opm.gef.editor.part;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;

import com.vainolo.phd.opm.gef.editor.figure.OPMFigureConstants;
import com.vainolo.phd.opm.gef.editor.policy.OPMLinkBendpointEditPolicy;
import com.vainolo.phd.opm.gef.editor.policy.OPMLinkConnectionEditPolicy;

public class LinkEditPart extends AbstractConnectionEditPart {

	private Collection<Point> bendpoints;
	/**
	   * Create and initialize a new {@link LinkEditPart}.
	   */
	  public LinkEditPart() {
	    super();
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
	    installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE, new ConnectionEndpointEditPolicy());
	    installEditPolicy(EditPolicy.CONNECTION_ROLE, new OPMLinkConnectionEditPolicy());
	    installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE, new OPMLinkBendpointEditPolicy());

	  }

	  /**
	   * Create a {@link PolylineConnection} with a {@link BendpointConnectionRouter}
	   */
	  @Override
	  protected IFigure createFigure() {
	    PolylineConnection conn = new PolylineConnection();
	    conn.setConnectionRouter(new BendpointConnectionRouter());
	    conn.setLineWidth(OPMFigureConstants.connectionLineWidth);
	    return conn;
	  }

	  @Override
	  protected void refreshVisuals() {
	    Connection connection = getConnectionFigure();
	    Collection<Point> modelConstraint = getBendpoints(); 
	    if (modelConstraint.isEmpty()) return;
	    List<AbsoluteBendpoint> figureConstraint = new ArrayList<AbsoluteBendpoint>();
	    for(Point p : modelConstraint) {
	      figureConstraint.add(new AbsoluteBendpoint(p));
	    }
	    connection.setRoutingConstraint(figureConstraint);

	  }

	  public Collection<Point> getBendpoints(){
		  if (null ==bendpoints) return Collections.emptyList();
		  return bendpoints;
	  }
	  
	  public void setBendpoints(Collection<Point> bendpoints){
		  this.bendpoints = bendpoints;
	  }
	  
}
