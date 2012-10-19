package com.vainolo.phd.opm.utilities.decoratorationLayer;

import com.vainolo.phd.opm.model.OPMProceduralActivationKind;
import com.vainolo.phd.opm.model.OPMProceduralLink;

public class OPMProceduralLinkDecorator extends OPMLinkDecorator<OPMProceduralLink> implements OPMProceduralLink {
	
	OPMProceduralLinkDecorator(OPMProceduralLink decorated) {
		super(decorated);
	}

	@Override
	public OPMProceduralActivationKind getActivationKind() {
		return decorated.getActivationKind();
	}

}
