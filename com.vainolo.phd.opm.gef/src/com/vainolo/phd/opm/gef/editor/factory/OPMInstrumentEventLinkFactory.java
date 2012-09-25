/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/

package com.vainolo.phd.opm.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.vainolo.phd.opm.model.OPMFactory;
import com.vainolo.phd.opm.model.OPMInstrumentLink;
import com.vainolo.phd.opm.model.OPMProceduralActivationKind;

/**
 * Factory used by palette tools to create {@link OPMInstrumentEventLink}.
 */
public class OPMInstrumentEventLinkFactory implements CreationFactory {

  @Override
  public Object getNewObject() {
    OPMInstrumentLink link = OPMFactory.eINSTANCE.createOPMInstrumentLink();
    link.setActivationKind(OPMProceduralActivationKind.EVENT);
    link.setId(OPMIdManager.getNextId());
    return link;
  }

  @Override
  public Object getObjectType() {
    return OPMInstrumentLink.class;
  }

}
