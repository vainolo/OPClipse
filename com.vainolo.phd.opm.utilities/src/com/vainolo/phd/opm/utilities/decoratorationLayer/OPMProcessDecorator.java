package com.vainolo.phd.opm.utilities.decoratorationLayer;

import com.vainolo.phd.opm.model.OPMProcess;
import com.vainolo.phd.opm.model.OPMProcessKind;

public class OPMProcessDecorator extends OPMThingDecorator implements
		OPMProcess , OPMDecorated<OPMProcess>{

	private OPMProcess decorated;
	
	public OPMProcessDecorator(OPMProcess decorated) {
		super(decorated);
		this.decorated = decorated;
	}

	@Override
	public OPMProcessKind getKind() {
		return decorated.getKind();
	}

	@Override
	public void setKind(OPMProcessKind value) {
		decorated.setKind(value);
	}

	@Override
	public OPMProcess getDecorated() {
		return decorated;
	}

}
