/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/

package com.vainolo.phd.opm.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.vainolo.phd.opm.model.OPMAggregationLink;
import com.vainolo.phd.opm.model.OPMFactory;
/**
 * Factory used by palette tools to create {@link OPMAggregationLink}.
 * 
 * @author vainolo
 * 
 */
public class OPMAggregationLinkFactory implements CreationFactory {

	OPMIdManager opmIdManager;
	
	public OPMAggregationLinkFactory(OPMIdManager opmIdManager){
		this.opmIdManager = opmIdManager;
	}

  @Override
  public Object getNewObject() {
    OPMAggregationLink aggregator = OPMFactory.eINSTANCE.createOPMAggregationLink();
    aggregator.setId(opmIdManager.getNextId());
    return aggregator;
  }

  @Override
  public Object getObjectType() {
    return OPMAggregationLink.class;
  }

}
