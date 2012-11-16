package com.vainolo.phd.opm.gef.decorationLayer;

import com.vainolo.phd.opm.model.OPMObject;

public class OPMObjectDecorator extends OPMThingDecorator<OPMObject> implements OPMObject{

	OPMObjectDecorator(OPMObject decorated, DecorationsBank decorationsBank) {
		super(decorated, decorationsBank);
	}
}
