/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/
package com.vainolo.phd.opm.interpreter.predicates;

import java.util.ArrayList;
import com.google.common.base.Predicate;
import org.eclipse.emf.ecore.EClass;

import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.model.OPMProceduralLink;

/**
 * Predicate that returns true for incoming conditional links.
 * 
 * @author Arieh 'Vainolo' Bibliowicz
 * @created 9 Jul 2012
 * 
 */
public enum IsOPMConditionalLink implements Predicate<OPMProceduralLink> {
  INSTANCE;

  private ArrayList<EClass> TrueTypes;
  
  IsOPMConditionalLink(){
	  TrueTypes = new ArrayList<>();
	  TrueTypes.add(OPMPackage.eINSTANCE.getOPMConsumptionConditionLink());
	  TrueTypes.add(OPMPackage.eINSTANCE.getOPMEffectConditionLink());
	  TrueTypes.add(OPMPackage.eINSTANCE.getOPMInstrumentConditionLink());
  }
  
  @Override
  public boolean apply(final OPMProceduralLink link) {
	  return MultiTypeSelectionHelper.apply(TrueTypes, link);
    }
}
