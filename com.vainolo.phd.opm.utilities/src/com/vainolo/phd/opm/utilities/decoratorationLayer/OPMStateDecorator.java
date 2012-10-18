package com.vainolo.phd.opm.utilities.decoratorationLayer;

import com.vainolo.phd.opm.model.OPMState;

public class OPMStateDecorator extends OPMNodeDecorator implements OPMState,
		OPMDecorated<OPMState> {

	private OPMState decorated;
	
	public OPMStateDecorator(OPMState decorated) {
		super(decorated);
		this.decorated = decorated;
	}

	@Override
	public OPMState getDecorated() {
		return decorated;
	}

}
