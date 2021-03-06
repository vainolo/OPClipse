/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/

package com.vainolo.phd.opm.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.vainolo.phd.opm.model.OPMFactory;
import com.vainolo.phd.opm.model.OPMInvocationLink;
import com.vainolo.phd.opm.model.OPMPackage;

/**
 * Factory used by palette tools to create {@link OPMInvocationLink}.
 */
public class OPMInvocationLinkFactory implements CreationFactory {

	OPMIdManager opmIdManager;
	
	public OPMInvocationLinkFactory(OPMIdManager opmIdManager){
		this.opmIdManager = opmIdManager;
	}

  @Override
  public Object getNewObject() {
    OPMInvocationLink link = OPMFactory.eINSTANCE.createOPMInvocationLink();
    link.setId(opmIdManager.getNextId());
    return link;
  }

  @Override
  public Object getObjectType() {
    return OPMPackage.eINSTANCE.getOPMInvocationLink();
  }

}
