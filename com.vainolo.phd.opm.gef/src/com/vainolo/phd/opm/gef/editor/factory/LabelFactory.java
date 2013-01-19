/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/
package com.vainolo.phd.opm.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.vainolo.phd.opm.model.OPMFactory;
import com.vainolo.phd.opm.model.Label;
import com.vainolo.phd.opm.model.OPMPackage;

public class LabelFactory implements CreationFactory {

	OPMIdManager opmIdManager;
	
	public LabelFactory(OPMIdManager opmIdManager){
		this.opmIdManager = opmIdManager;
	}
	
  @Override
  public Object getNewObject() {
    Label label = OPMFactory.eINSTANCE.createLabel();
    label.setId(opmIdManager.getNextId());
    return label;
  }

  @Override
  public Object getObjectType() {
	return OPMPackage.eINSTANCE.getLabel();
  }

}
