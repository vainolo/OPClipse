package com.vainolo.phd.opmeta.gef.editor.parts;

import java.util.ArrayList;
import java.util.List;

import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelContainerInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelNodeInstance;

public class OPModelThingEditPart extends OPModelNodeEditPart{

	@Override
	protected List<OpmodelNodeInstance> getModelChildren() {
		OpmodelContainerInstance container = (OpmodelContainerInstance) getModel();
	    List<OpmodelNodeInstance> nodes = new ArrayList<OpmodelNodeInstance>();
	    for(OpmodelNodeInstance item:container.getNodes()){
	    	nodes.add(item);
	    }
	    return nodes;
	}
}
