package com.vainolo.phd.opmeta.gef.editor.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;

import com.vainolo.phd.opmeta.gef.editor.figure.OPModelNodeFigure;
import com.vainolo.phd.opmeta.interpreter.validation.OpmodelValidator;
import com.vainolo.phd.opmodel.model.ContainerInstance;
import com.vainolo.phd.opmodel.model.NodeInstance;

public class OPModelThingEditPart extends OPModelNodeEditPart{

	public OPModelThingEditPart(OpmodelValidator opmodelValidator){
		super (opmodelValidator);
	}
	
	@Override
	protected List<NodeInstance> getModelChildren() {
		ContainerInstance container = (ContainerInstance) getModel();
	    List<NodeInstance> nodes = new ArrayList<NodeInstance>();
	    for(NodeInstance item:container.getNodes()){
	    	nodes.add(item);
	    }
	    return nodes;
	}
	
	@Override
	public IFigure getContentPane() {
	    return  ((OPModelNodeFigure)getFigure()).getContentPane();
	  }
}
