/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/
package com.vainolo.phd.opm.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.vainolo.phd.opm.model.OPMConsumptionLink;
import com.vainolo.phd.opm.model.OPMFactory;
import com.vainolo.phd.opm.model.OPMProceduralActivationKind;

/**
 * Factory used by palette tools to create {@link OPMConsumptionEventLink}.
 * kind.
 */
public class OPMConsumptionEventLinkFactory implements CreationFactory {

  @Override
  public Object getNewObject() {
    OPMConsumptionLink link = OPMFactory.eINSTANCE.createOPMConsumptionLink();
    link.setActivationKind(OPMProceduralActivationKind.EVENT);
    link.setId(OPMIdManager.getNextId());
    return link;
  }

  @Override
  public Object getObjectType() {
    return OPMConsumptionLink.class;
  }

}
