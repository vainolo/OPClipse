/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/
package com.vainolo.phd.opm.utilities.predicates;

import com.google.common.base.Predicate;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.utilities.OPMDecorated;

/**
 * Predicate that returns true for OPM Object nodes.
 * 
 * @author Arieh 'Vainolo' Bibliowicz
 * @created 9 Jul 2012
 * 
 */
public enum IsOPMObjectNode implements Predicate<OPMNode> {
  INSTANCE;

  @Override
  public boolean apply(final OPMNode node) {
	  OPMNode origNode = node;
	  if (node instanceof OPMDecorated<?>) origNode = (OPMNode)((OPMDecorated<?>)node).getDecorated();
    if(OPMPackage.eINSTANCE.getOPMObject().isInstance(origNode))
      return true;
    return false;
  }
}
