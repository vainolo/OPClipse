/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/
package com.vainolo.phd.opm.interpreter.predicates;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClass;

import com.google.common.base.Predicate;
import com.vainolo.phd.opm.interpreter.utils.Parameter;
import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.model.OPMProceduralLink;

/**
 * Predicate that returns true for wait inducing incoming parameters
 * 
 * @author Arieh 'Vainolo' Bibliowicz
 * @created 10 Jul 2012
 * 
 * @author Eyal
 */
public enum IsOPMWaitParameter implements Predicate<Parameter> {
  INSTANCE;

  private ArrayList<EClass> TrueTypes;
  
  IsOPMWaitParameter(){
	  TrueTypes = new ArrayList<>();
	  TrueTypes.add(OPMPackage.eINSTANCE.getOPMConsumptionLink());
	  TrueTypes.add(OPMPackage.eINSTANCE.getOPMInstrumentLink());
	  TrueTypes.add(OPMPackage.eINSTANCE.getOPMEffectLink());
  }
  
  @Override
  public boolean apply(final Parameter input) {
	  return MultiTypeSelectionHelper.apply(TrueTypes, input.getLink());
    }
}
