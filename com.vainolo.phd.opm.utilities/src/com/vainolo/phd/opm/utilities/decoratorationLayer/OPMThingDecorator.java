package com.vainolo.phd.opm.utilities.decoratorationLayer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.NotifyingInternalEListImpl;

import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMThing;

public class OPMThingDecorator<T extends OPMThing> extends OPMNodeDecorator<T> implements OPMThing{
	
	protected OPMThingDecorator(T decorated){
		super(decorated);
	}

	NotifyingInternalEListImpl<OPMNode> nodes;
	
	@Override
	public EList<OPMNode> getNodes() {
		if (nodes == null){
			EList<OPMNode> origNodes =  decorated.getNodes();
			nodes = new NotifyingInternalEListImpl<OPMNode>();
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
