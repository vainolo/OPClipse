/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/

package com.vainolo.phd.opm.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.vainolo.phd.opm.model.OPMFactory;
import com.vainolo.phd.opm.model.OPMObject;
import com.vainolo.phd.opm.model.OPMPackage;

public class OPMObjectFactory implements CreationFactory {

	OPMIdManager opmIdManager;
	
	public OPMObjectFactory(OPMIdManager opmIdManager){
		this.opmIdManager = opmIdManager;
	}

  @Override
  public Object getNewObject() {
    OPMObject object = OPMFactory.eINSTANCE.createOPMObject();
    object.setId(opmIdManager.getNextId());
    return object;
  }

  @Override
  public Object getObjectType() {
    return OPMPackage.eINSTANCE.getOPMObject();
  }

}
