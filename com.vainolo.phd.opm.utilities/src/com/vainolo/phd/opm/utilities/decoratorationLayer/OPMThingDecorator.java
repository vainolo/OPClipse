package com.vainolo.phd.opm.utilities.decoratorationLayer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMThing;

public class OPMThingDecorator<T extends OPMThing> extends OPMNodeDecorator<T> implements OPMThing{
	
	protected OPMThingDecorator(T decorated, DecorationsBank decorationsBank){
		super(decorated, decorationsBank);
	}

	HashSet<OPMNode> nodes;
	
	@Override
	public List<OPMNode> getNodes() {
		if (nodes == null){
			List<OPMNode> origNodes =  decorated.getNodes();
			nodes = new HashSet<>();
			for (OPMNode orig:origNodes){
				nodes.add((OPMNode)decorationsBank.GetOrCreateDecorator(orig));
			}
		}
		return new ArrayList<>(nodes);
	}

	@Override
	protected void NotifingChange(Notification notification){
		nodes = null;
		super.NotifingChange(notification);
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
