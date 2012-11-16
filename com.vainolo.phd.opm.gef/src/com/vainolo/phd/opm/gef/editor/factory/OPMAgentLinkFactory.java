/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/

package com.vainolo.phd.opm.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.vainolo.phd.opm.model.OPMAgentLink;
import com.vainolo.phd.opm.model.OPMFactory;

/**
 * Factory used by palette tools to create {@link OPMAgentLink}.
 * 
 * @author Arieh 'Vainolo' Bibliowicz
 * 
 */
public class OPMAgentLinkFactory implements CreationFactory {

  @Override
  public Object getNewObject() {
	  OPMAgentLink link = OPMFactory.eINSTANCE.createOPMAgentLink();
    link.setId(OPMIdManager.getNextId());
    return link;
  }

  @Override
  public Object getObjectType() {
    return OPMAgentLink.class;
  }

}
