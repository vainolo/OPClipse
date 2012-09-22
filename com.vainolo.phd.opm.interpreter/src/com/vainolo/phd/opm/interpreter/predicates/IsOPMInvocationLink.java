/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/
package com.vainolo.phd.opm.interpreter.predicates;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClass;

import com.google.common.base.Predicate;
import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.model.OPMProceduralLink;

/**
 * Predicate that returns true for invocation links.
 * 
 * @author Arieh 'Vainolo' Bibliowicz
 * @created 9 Jul 2012
 * 
 */
public enum IsOPMInvocationLink implements Predicate<OPMProceduralLink> {
  INSTANCE;

  private ArrayList<EClass> TrueTypes;
  
  IsOPMInvocationLink(){
	  TrueTypes = new ArrayList<>();
	  TrueTypes.add(OPMPackage.eINSTANCE.getOPMInvocationLink());
  }
  
  @Override
  public boolean apply(final OPMProceduralLink link) {
	  return MultiTypeSelectionHelper.apply(TrueTypes, link);
    }
}
