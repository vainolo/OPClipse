/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/

package com.vainolo.phd.opm.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.vainolo.phd.opm.model.OPMConsumptionLink;
import com.vainolo.phd.opm.model.OPMFactory;
import com.vainolo.phd.opm.model.OPMPackage;

/**
 * Factory used by palette tools to create {@link OPMConsumptionLink}.
 */

public class OPMConsumptionLinkFactory implements CreationFactory {

	OPMIdManager opmIdManager;
	
	public OPMConsumptionLinkFactory(OPMIdManager opmIdManager){
		this.opmIdManager = opmIdManager;
	}

  @Override
  public Object getNewObject() {
    OPMConsumptionLink link = OPMFactory.eINSTANCE.createOPMConsumptionLink();
    link.setId(opmIdManager.getNextId());
    return link;
  }

  @Override
  public Object getObjectType() {
    return OPMPackage.eINSTANCE.getOPMConsumptionLink();
  }

}
