package com.vainolo.phd.opm.utilities.decoratorationLayer;

import com.vainolo.phd.opm.model.OPMProcess;
import com.vainolo.phd.opm.model.OPMProcessKind;

public class OPMProcessDecorator extends OPMThingDecorator<OPMProcess> implements
		OPMProcess{

	
	OPMProcessDecorator(OPMProcess decorated) {
		super(decorated);
	}

	@Override
	public OPMProcessKind getKind() {
		return decorated.getKind();
	}

	@Override
	public void setKind(OPMProcessKind value) {
		decorated.setKind(value);
	}
}
