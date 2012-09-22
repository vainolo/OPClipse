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
 * Predicate that returns true for links that provide incoming data.
 * 
 * @author Arieh 'Vainolo' Bibliowicz
 * @created 10 Jul 2012
 * 
 */
public enum IsOPMProcessIncomingDataLink implements Predicate<OPMProceduralLink> {
  INSTANCE;

  private ArrayList<EClass> TrueTypes;
  
  IsOPMProcessIncomingDataLink(){
	  TrueTypes = new ArrayList<>();
	  TrueTypes.add(OPMPackage.eINSTANCE.getOPMAgentLink());
	  TrueTypes.add(OPMPackage.eINSTANCE.getOPMConsumptionLink());
	  TrueTypes.add(OPMPackage.eINSTANCE.getOPMConsumptionConditionLink());
	  TrueTypes.add(OPMPackage.eINSTANCE.getOPMConsumptionEventLink());
	  TrueTypes.add(OPMPackage.eINSTANCE.getOPMInstrumentLink());
	  TrueTypes.add(OPMPackage.eINSTANCE.getOPMInstrumentConditionLink());
	  TrueTypes.add(OPMPackage.eINSTANCE.getOPMInstrumentEventLink());
	  TrueTypes.add(OPMPackage.eINSTANCE.getOPMEffectLink());
	  TrueTypes.add(OPMPackage.eINSTANCE.getOPMEffectConditionLink());
	  TrueTypes.add(OPMPackage.eINSTANCE.getOPMEffectEventLink());
  }
  
  @Override
  public boolean apply(final OPMProceduralLink link) {
	  return MultiTypeSelectionHelper.apply(TrueTypes, link);
    }
}
