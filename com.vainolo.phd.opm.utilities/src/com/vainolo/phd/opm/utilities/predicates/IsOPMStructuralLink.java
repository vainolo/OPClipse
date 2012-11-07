/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/
package com.vainolo.phd.opm.utilities.predicates;

import com.google.common.base.Predicate;
import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.utilities.OPMDecorated;

/**
 * Predicate that returns true for incoming OPM structural links.
 * 
 * @author Arieh 'Vainolo' Bibliowicz
 * @author Eyal 
 * 
 * @note problems with decorations
 */
public enum IsOPMStructuralLink implements Predicate<OPMLink> {
  INSTANCE;

  @Override
  public boolean apply(final OPMLink origLink) {
	  OPMLink link = origLink;
	  if (origLink instanceof OPMDecorated<?>) link =(OPMLink) ((OPMDecorated<?>)origLink).getDecorated();
    if(OPMPackage.eINSTANCE.getOPMStructuralLink().isInstance(link))
      return true;
    return false;
  }
}
