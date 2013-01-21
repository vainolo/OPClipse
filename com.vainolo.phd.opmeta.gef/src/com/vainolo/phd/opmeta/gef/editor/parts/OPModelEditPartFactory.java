package com.vainolo.phd.opmeta.gef.editor.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import com.vainolo.phd.opmeta.interpreter.validation.OpmodelValidator;
import com.vainolo.phd.opmodel.model.ContainerInstance;
import com.vainolo.phd.opmodel.model.LinkInstance;
import com.vainolo.phd.opmodel.model.NodeInstance;
import com.vainolo.phd.opmodel.model.ThingInstance;

public class OPModelEditPartFactory implements EditPartFactory{

	private final OpmodelValidator opmodelValidator;
	
	public OPModelEditPartFactory(OpmodelValidator opmodelValidator){
		super();
		this.opmodelValidator = opmodelValidator;
	}
	
	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart part=null;
		if (model instanceof ThingInstance){
			part = new OPModelThingEditPart(opmodelValidator);
		} else if (model instanceof NodeInstance){
			part = new OPModelNodeEditPart(opmodelValidator);
		} else if (model instanceof ContainerInstance){
			part = new OPModelContainerEditPart(opmodelValidator);
		} else if (model instanceof LinkInstance){
			part = new OPModelLinkEditPart();
		}
		
		if (part!=null) part.setModel(model);
		
		return part;
	}

}
