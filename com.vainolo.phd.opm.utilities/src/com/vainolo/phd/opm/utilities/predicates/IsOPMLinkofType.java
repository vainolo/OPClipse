/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/
package com.vainolo.phd.opm.utilities.predicates;

import org.eclipse.emf.ecore.EClass;

import com.google.common.base.Predicate;
import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMProceduralLink;
import com.vainolo.phd.opm.utilities.decoratorationLayer.OPMLinkDecorator;
import com.vainolo.phd.opm.utilities.decoratorationLayer.OPMProceduralLinkDecorator;

public class IsOPMLinkofType implements Predicate<OPMLink> {

	private EClass type;
	
	public IsOPMLinkofType(EClass type){
		this.type=type;
	}
	
	@Override
	public boolean apply(OPMLink origLink) {
		OPMLink link = origLink;
		  if (origLink instanceof OPMLinkDecorator) link = ((OPMLinkDecorator)origLink).getDecorated();
		return type.isInstance(link);
	}

}
