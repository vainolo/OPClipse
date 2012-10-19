/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/
package com.vainolo.phd.opm.utilities.predicates;

import com.google.common.base.Predicate;
import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.utilities.decoratorationLayer.OPMStructuralLinkAggregator;

/**
 * Predicate that returns true for incoming OPM structural links.
 * 
 * @author Arieh 'Vainolo' Bibliowicz
 * @author Eyal 
 * 
 */
public enum IsOPMStructuralLink implements Predicate<OPMLink> {
  INSTANCE;

  @Override
  public boolean apply(final OPMLink link) {
    if(OPMPackage.eINSTANCE.getOPMStructuralLink().isInstance(link))
      return true;
    if(link.getSource() instanceof OPMStructuralLinkAggregator ||
            link.getTarget() instanceof OPMStructuralLinkAggregator )
    	return true;
    return false;
  }
}
