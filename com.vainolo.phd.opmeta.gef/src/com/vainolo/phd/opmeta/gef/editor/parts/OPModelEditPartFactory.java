package com.vainolo.phd.opmeta.gef.editor.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import com.vainolo.phd.opmodel.model.ContainerInstance;
import com.vainolo.phd.opmodel.model.LinkInstance;
import com.vainolo.phd.opmodel.model.NodeInstance;
import com.vainolo.phd.opmodel.model.ThingInstance;

public class OPModelEditPartFactory implements EditPartFactory{

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart part=null;
		if (model instanceof ThingInstance){
			part = new OPModelThingEditPart();
		} else if (model instanceof NodeInstance){
			part = new OPModelNodeEditPart();
		} else if (model instanceof ContainerInstance){
			part = new OPModelContainerEditPart();
		} else if (model instanceof LinkInstance){
			part = new OPModelLinkEditPart();
		}
		
		if (part!=null) part.setModel(model);
		
		return part;
	}

}
