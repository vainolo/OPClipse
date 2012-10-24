/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/

package com.vainolo.phd.opm.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.vainolo.phd.opm.model.OPMEffectLink;
import com.vainolo.phd.opm.model.OPMFactory;

/**
 * Factory used by palette tools to create {@link OPMEffectLink}.
 */
public class OPMEffectLinkFactory implements CreationFactory {

  @Override
  public Object getNewObject() {
    OPMEffectLink link = OPMFactory.eINSTANCE.createOPMEffectLink();
    link.setId(OPMIdManager.getNextId());
    return link;
  }

  @Override
  public Object getObjectType() {
    return OPMEffectLink.class;
  }

}
