/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/

package com.vainolo.phd.opm.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.vainolo.phd.opm.model.OPMExhibitionLink;
import com.vainolo.phd.opm.model.OPMFactory;

/**
 * Factory used by palette tools to create {@link OPMStructuralLinkAggregator} of
 * {@link OPMStructuralLinkAggregatorKind#EXHIBITION} kind.
 * 
 * @author vainolo
 * 
 */
public class OPMExhibitionLinkFactory implements CreationFactory {

	OPMIdManager opmIdManager;
	
	public OPMExhibitionLinkFactory(OPMIdManager opmIdManager){
		this.opmIdManager = opmIdManager;
	}

  @Override
  public Object getNewObject() {
    OPMExhibitionLink aggregator = OPMFactory.eINSTANCE.createOPMExhibitionLink();
    aggregator.setId(opmIdManager.getNextId());
    return aggregator;
  }

  @Override
  public Object getObjectType() {
    return OPMExhibitionLink.class;
  }

}
