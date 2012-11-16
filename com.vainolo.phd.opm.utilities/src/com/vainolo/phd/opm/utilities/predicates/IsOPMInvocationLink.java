/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/
package com.vainolo.phd.opm.utilities.predicates;

import com.google.common.base.Predicate;
import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.model.OPMProceduralLink;
import com.vainolo.phd.opm.utilities.OPMDecorated;

/**
 * Predicate that returns true for invocation links.
 * 
 * @author Arieh 'Vainolo' Bibliowicz
 * @created 9 Jul 2012
 * 
 */
public enum IsOPMInvocationLink implements Predicate<OPMProceduralLink> {
  INSTANCE;

  
  @Override
  public boolean apply(final OPMProceduralLink link) {
	  OPMProceduralLink proceduralLink = link;
	  if (link instanceof OPMDecorated<?>) proceduralLink = (OPMProceduralLink)((OPMDecorated<?>)link).getDecorated();
    if(OPMPackage.eINSTANCE.getOPMInvocationLink().isInstance(proceduralLink))
      return true;
    return false;
  }
}
