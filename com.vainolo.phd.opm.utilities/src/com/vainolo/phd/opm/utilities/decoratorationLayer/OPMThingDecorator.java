package com.vainolo.phd.opm.utilities.decoratorationLayer;

import org.eclipse.emf.common.util.EList;

import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMThing;

public class OPMThingDecorator extends OPMNodeDecorator implements OPMThing{

	private OPMThing decorated;
	
	public OPMThingDecorator(OPMThing decorated){
		super(decorated);
		this.decorated = decorated;
	}

	@Override
	public EList<OPMNode> getNodes() {
		// TODO Auto-generated method stub
		return null;
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
