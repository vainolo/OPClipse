/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/
package com.vainolo.phd.opm.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.vainolo.phd.opm.model.OPMFactory;
import com.vainolo.phd.opm.model.OPMLink;

/**
 * 
 * @author Arieh 'Vainolo' Bibliowicz
 * 
 */
public enum OPMLinkFactory implements CreationFactory {
  INSTANCE;

  @Override
  public OPMLink getNewObject() {
    OPMLink link = OPMFactory.eINSTANCE.createOPMLink();
    link.setId(OPMIdManager.getNextId());
    return link;
  }

  @Override
  public Object getObjectType() {
    return OPMLink.class;
  }

}
