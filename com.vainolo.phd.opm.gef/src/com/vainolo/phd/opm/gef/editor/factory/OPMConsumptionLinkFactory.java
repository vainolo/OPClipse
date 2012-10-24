/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/

package com.vainolo.phd.opm.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.vainolo.phd.opm.model.OPMConsumptionLink;
import com.vainolo.phd.opm.model.OPMFactory;

/**
 * Factory used by palette tools to create {@link OPMConsumptionLink}.
 */

public class OPMConsumptionLinkFactory implements CreationFactory {

  @Override
  public Object getNewObject() {
    OPMConsumptionLink link = OPMFactory.eINSTANCE.createOPMConsumptionLink();
    link.setId(OPMIdManager.getNextId());
    return link;
  }

  @Override
  public Object getObjectType() {
    return OPMConsumptionLink.class;
  }

}
