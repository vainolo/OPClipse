package com.vainolo.phd.opm.utilities.decoratorationLayer;

import com.vainolo.phd.opm.model.OPMState;

public class OPMStateDecorator extends OPMNodeDecorator<OPMState> implements OPMState{

	OPMStateDecorator(OPMState decorated, DecorationsBank decorationsBank) {
		super(decorated, decorationsBank);
	}
}
