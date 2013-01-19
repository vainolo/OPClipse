/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/

package com.vainolo.phd.opm.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.vainolo.phd.opm.model.OPMFactory;
import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.model.OPMResultLink;

/**
 * Factory used by palette tools to create {@link OPMResultLink}.
 */
public class OPMResultLinkFactory implements CreationFactory {

	OPMIdManager opmIdManager;
	
	public OPMResultLinkFactory(OPMIdManager opmIdManager){
		this.opmIdManager = opmIdManager;
	}

  @Override
  public Object getNewObject() {
    OPMResultLink link = OPMFactory.eINSTANCE.createOPMResultLink();
    link.setId(opmIdManager.getNextId());
    return link;
  }

  @Override
  public Object getObjectType() {
    return OPMPackage.eINSTANCE.getOPMResultLink();
  }

}
