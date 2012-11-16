package com.vainolo.phd.opm.gef.decorationLayer;

import com.vainolo.phd.opm.model.OPMProcess;
import com.vainolo.phd.opm.model.OPMProcessKind;

public class OPMProcessDecorator extends OPMThingDecorator<OPMProcess> implements
		OPMProcess{

	
	OPMProcessDecorator(OPMProcess decorated, DecorationsBank decorationsBank) {
		super(decorated, decorationsBank);
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
