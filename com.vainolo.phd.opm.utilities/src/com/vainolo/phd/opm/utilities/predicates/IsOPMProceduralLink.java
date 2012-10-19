/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/
package com.vainolo.phd.opm.utilities.predicates;

import com.google.common.base.Predicate;
import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMProceduralLink;

/**
 * Predicate that returns true for OPM procedural links.
 * 
 * @author Arieh 'Vainolo' Bibliowicz
 * @created 9 Jul 2012
 * 
 */
public enum IsOPMProceduralLink implements Predicate<OPMLink> {
  INSTANCE;

  @Override
  public boolean apply(final OPMLink link) {
    if(link instanceof OPMProceduralLink)
      return true;
    return false;
  }

}
