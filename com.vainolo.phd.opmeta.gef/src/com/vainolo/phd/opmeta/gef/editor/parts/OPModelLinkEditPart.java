package com.vainolo.phd.opmeta.gef.editor.parts;


import org.eclipse.draw2d.BendpointConnectionRouter;
//import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import com.vainolo.phd.opmeta.gef.editor.policy.OPModelLinkConnectionEditPolicy;
import com.vainolo.phd.opmodel.model.LinkInstance;
import com.vainolo.phd.opmodel.model.PropertyInstance;

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
	  
		@SuppressWarnings("rawtypes")
		@Override  
		public Object getAdapter(Class key) {

		if (key == IPropertySource.class) {
					return new IPropertySheetPageInstanceImpl();
			}

		return super.getAdapter(key);
		
		}
	  
	  
		public class IPropertySheetPageInstanceImpl implements IPropertySource {
			
			public IPropertyDescriptor[] getPropertyDescriptors() {
				int i=0;
				IPropertyDescriptor [] ret= new IPropertyDescriptor[((LinkInstance) getModel()).getProperties().size()];
				for (PropertyInstance property:((LinkInstance) getModel()).getProperties()){
					ret[i]=new TextPropertyDescriptor(property.getName(), property.getName() +" : " + property.getType());
					i++;
				}
				return ret;			
			}

			public Object getPropertyValue(Object id) {
				return ((LinkInstance) getModel()).getProperty((String)id).getValue();
			}

			public void setPropertyValue(Object id, Object value) {
				((LinkInstance) getModel()).getProperty((String)id).setValue((String)value);
			}

			public boolean isPropertySet(Object id) {
				return false;
			}
			
			public void resetPropertyValue(Object id) {
			}

			@Override
			public Object getEditableValue() {
				// TODO Auto-generated method stub
				return null;
			}	
		}
	  
	  
}
