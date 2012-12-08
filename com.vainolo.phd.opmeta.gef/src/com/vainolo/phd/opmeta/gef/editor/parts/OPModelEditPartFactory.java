package com.vainolo.phd.opmeta.gef.editor.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelContainerInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelLinkInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelNodeInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelThingInstance;

public class OPModelEditPartFactory implements EditPartFactory{

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart part=null;
		if (model instanceof OpmodelThingInstance){
			
		} else if (model instanceof OpmodelNodeInstance){
			part = new OPModelNodeEditPart();
		} else if (model instanceof OpmodelContainerInstance){
			part = new OPModelContainerEditPart();
		} else if (model instanceof OpmodelLinkInstance){
			part = new OPModelLinkEditPart();
		}
		
		if (part!=null) part.setModel(model);
		
		return part;
	}

}
