/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/

package com.vainolo.phd.opm.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.vainolo.phd.opm.model.OPMFactory;
import com.vainolo.phd.opm.model.OPMGeneralizationLink;
import com.vainolo.phd.opm.model.OPMPackage;

/**
 * Factory used by palette tools to create {@link OPMGeneralizationLink}.
 * 
 * @author vainolo
 * 
 */
public class OPMGeneralizationLinkFactory implements CreationFactory {

	OPMIdManager opmIdManager;
	
	public OPMGeneralizationLinkFactory(OPMIdManager opmIdManager){
		this.opmIdManager = opmIdManager;
	}

  @Override
  public Object getNewObject() {
    OPMGeneralizationLink aggregator = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
    aggregator.setId(opmIdManager.getNextId());
    return aggregator;
  }

  @Override
  public Object getObjectType() {
    return OPMPackage.eINSTANCE.getOPMGeneralizationLink();
  }

}
