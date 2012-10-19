package com.vainolo.phd.opm.utilities.decoratorationLayer;

import com.vainolo.phd.opm.model.OPMObject;

public class OPMObjectDecorator extends OPMThingDecorator<OPMObject> implements OPMObject{

	OPMObjectDecorator(OPMObject decorated) {
		super(decorated);
	}
}
