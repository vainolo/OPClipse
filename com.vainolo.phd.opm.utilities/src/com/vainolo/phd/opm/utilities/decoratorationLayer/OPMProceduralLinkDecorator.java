package com.vainolo.phd.opm.utilities.decoratorationLayer;

import com.vainolo.phd.opm.model.OPMProceduralActivationKind;
import com.vainolo.phd.opm.model.OPMProceduralLink;

public class OPMProceduralLinkDecorator extends OPMLinkDecorator implements OPMProceduralLink, OPMDecorated<OPMProceduralLink> {

	private OPMProceduralLink decorated;
	
	public OPMProceduralLinkDecorator(OPMProceduralLink decorated) {
		super(decorated);
		this.decorated = decorated;
	}

	@Override
	public OPMProceduralLink getDecorated() {
		return decorated;
	}

	@Override
	public OPMProceduralActivationKind getActivationKind() {
		return decorated.getActivationKind();
	}

}
