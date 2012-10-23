/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/

package com.vainolo.phd.opm.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.vainolo.phd.opm.utilities.decoratorationLayer.OPMFactory;
import com.vainolo.phd.opm.utilities.decoratorationLayer.OPMStructuralLinkAggregator;

/**
 * Factory used by palette tools to create {@link OPMStructuralLinkAggregator} of
 * {@link OPMStructuralLinkAggregatorKind#AGGREGATION} kind.
 * 
 * @author vainolo
 * 
 */
public class OPMAggregationStructuralLinkAggregatorFactory implements CreationFactory {

  @Override
  public Object getNewObject() {
    OPMStructuralLinkAggregator aggregator = OPMFactory.Instance().createOPMAggregationLinkAggregator();
    aggregator.setId(OPMIdManager.getNextId());
    return aggregator;
  }

  @Override
  public Object getObjectType() {
    return OPMStructuralLinkAggregator.class;
  }

}
