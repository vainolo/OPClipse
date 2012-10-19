package com.vainolo.phd.opm.utilities.decoratorationLayer;

import java.util.ArrayList;
import java.util.List;

import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMThing;

public class OPMThingDecorator<T extends OPMThing> extends OPMNodeDecorator<T> implements OPMThing{
	
	protected OPMThingDecorator(T decorated){
		super(decorated);
	}

	ArrayList<OPMNode> nodes;
	
	@Override
	public List<OPMNode> getNodes() {
		if (nodes == null){
			List<OPMNode> origNodes =  decorated.getNodes();
			nodes = new ArrayList<>();
			for (OPMNode orig:origNodes){
				nodes.add((OPMNode)DecorationsBank.INSTANCE.GetOrCreateDecorator(orig));
			}
		}
		return nodes;
	}

	@Override
	public String getDescription() {
		return decorated.getDescription();
	}

	@Override
	public void setDescription(String value) {
		decorated.setDescription(value);
	}
}
