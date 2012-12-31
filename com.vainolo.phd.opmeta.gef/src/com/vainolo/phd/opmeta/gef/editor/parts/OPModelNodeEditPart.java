package com.vainolo.phd.opmeta.gef.editor.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.CompoundSnapToHelper;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.SnapToGeometry;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import com.vainolo.phd.opmeta.gef.editor.figure.OPModelNodeRectangleFigure;
import com.vainolo.phd.opmeta.gef.editor.policy.OpNodeEditPolicy;
import com.vainolo.phd.opmeta.gef.editor.policy.OpXYLayoutEditPolicy;
import com.vainolo.phd.opmeta.gef.editor.policy.OPModelNodeComponentEditPolicy;
import com.vainolo.phd.opmodel.model.LinkInstance;
import com.vainolo.phd.opmodel.model.NodeInstance;
import com.vainolo.phd.opmodel.model.PropertyInstance;

public class OPModelNodeEditPart extends AbstractGraphicalEditPart
	implements NodeEditPart {

	private OpmodelNodeInstanceAdapter adapter;
	
	public OPModelNodeEditPart(){
		adapter = new OpmodelNodeInstanceAdapter();
	}
	
	@Override
	public ConnectionAnchor getSourceConnectionAnchor(
			ConnectionEditPart connection) {
		return ((OPModelNodeRectangleFigure)getFigure()).getSourceConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(
			ConnectionEditPart connection) {
		return ((OPModelNodeRectangleFigure)getFigure()).getTargetConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		return ((OPModelNodeRectangleFigure)getFigure()).getSourceConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		return ((OPModelNodeRectangleFigure)getFigure()).getTargetConnectionAnchor();
	}

	@Override
	protected List<LinkInstance> getModelSourceConnections() {
		NodeInstance model = (NodeInstance) getModel();
		return new ArrayList<LinkInstance>(model.getOutgoingLinks());
	} 
	
	@Override
	protected List<LinkInstance> getModelTargetConnections() {
		NodeInstance model = (NodeInstance) getModel();
		return new ArrayList<LinkInstance>(model.getIncomingLinks());
	}
	
	@Override
	protected IFigure createFigure() {
		return new OPModelNodeRectangleFigure();
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new OpXYLayoutEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,new OpNodeEditPolicy());
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new OPModelNodeComponentEditPolicy());
	}

	@Override protected void refreshVisuals() {
		OPModelNodeRectangleFigure figure = (OPModelNodeRectangleFigure)getFigure();
	    NodeInstance model = (NodeInstance)getModel();
	    final GraphicalEditPart parent = (GraphicalEditPart) getParent();
	    
	    figure.setText(model.getName());
	    figure.repaint();
	    parent.setLayoutConstraint(this, figure, model.getConstraints());
	  }
	
	@Override
	public void activate() {
		if (!isActive()) {
			((NodeInstance) getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}

	@Override
	public void deactivate() {
		if (isActive()) {
			((NodeInstance) getModel()).eAdapters().remove(adapter);
		}
		super.deactivate();
	}

	/**
	 * Currently the class only adapts to create a {@link SnapToHelper} when the
	 * editor is in snapping mode (either to grid or to shapes).
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class key) {

		if (key == SnapToHelper.class) {
			List<SnapToHelper> helpers = new ArrayList<SnapToHelper>();
			if (Boolean.TRUE.equals(getViewer().getProperty(SnapToGeometry.PROPERTY_SNAP_ENABLED))) {
				helpers.add(new SnapToGeometry(this));
			}
			if (Boolean.TRUE.equals(getViewer().getProperty(SnapToGrid.PROPERTY_GRID_ENABLED))) {
				helpers.add(new SnapToGrid(this));
			}
			if (helpers.size() == 0) {
				return null;
			} else {
				return new CompoundSnapToHelper(helpers.toArray(new SnapToHelper[0]));
			}
			
		} else if (key == IPropertySource.class) {
				return new IPropertySheetPageInstanceImpl();
		}

		return super.getAdapter(key);
	}
	
	public class IPropertySheetPageInstanceImpl implements IPropertySource {
				
		public IPropertyDescriptor[] getPropertyDescriptors() {
			int i=1;
			IPropertyDescriptor [] ret= new IPropertyDescriptor[((NodeInstance) getModel()).getProperties().size()+1];
			ret[0]=new TextPropertyDescriptor("name","name");
			for (PropertyInstance property:((NodeInstance) getModel()).getProperties()){
				ret[i]=new TextPropertyDescriptor(property.getName(), property.getName() +" : " + property.getType());
				i++;
			}
			return ret;			
		}

		public Object getPropertyValue(Object id) {
			if (id=="name") return "echinda";
			return ((NodeInstance) getModel()).getProperty((String)id).getValue();
		}

		public void setPropertyValue(Object id, Object value) {
			if (id=="name") return;
			((NodeInstance) getModel()).getProperty((String)id).setValue((String)value);
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
			return (NodeInstance) getModel();
		}

		@Override
		public void setTarget(Notifier newTarget) {
			// Do nothing.
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return NodeInstance.class.equals(type);
		}
	}
}
