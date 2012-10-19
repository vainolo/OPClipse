/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/
package com.vainolo.phd.opm.utilities.predicates;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClass;

import com.google.common.base.Predicate;
import com.vainolo.phd.opm.model.*;
import com.vainolo.phd.opm.utilities.decoratorationLayer.OPMProceduralLinkDecorator;

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
  
  private IsOPMProcessIncomingDataLink(){
	  TrueTypes = new ArrayList<>();
	  TrueTypes.add(OPMPackage.eINSTANCE.getOPMAgentLink());
	  TrueTypes.add(OPMPackage.eINSTANCE.getOPMConsumptionLink());
	  TrueTypes.add(OPMPackage.eINSTANCE.getOPMInstrumentLink());
	  TrueTypes.add(OPMPackage.eINSTANCE.getOPMEffectLink());
  }
  
  
  @Override
  public boolean apply(final OPMProceduralLink link) {
	  OPMProceduralLink proceduralLink = link;
	  if (link instanceof OPMProceduralLinkDecorator) proceduralLink = ((OPMProceduralLinkDecorator)link).getDecorated();
	  for (EClass type:TrueTypes)
	    	if (type.isInstance(proceduralLink)) return true;
	    return false;
  }

}
