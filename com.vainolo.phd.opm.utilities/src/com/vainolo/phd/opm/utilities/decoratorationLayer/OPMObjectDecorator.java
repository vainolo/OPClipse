package com.vainolo.phd.opm.utilities.decoratorationLayer;

import com.vainolo.phd.opm.model.OPMObject;

public class OPMObjectDecorator extends OPMThingDecorator implements OPMObject, OPMDecorated<OPMObject>{

	private OPMObject decorated;
	
	public OPMObjectDecorator(OPMObject decorated) {
		super(decorated);
		this.decorated = decorated;
	}

	@Override
	public OPMObject getDecorated() {
		return decorated;
	}

}
