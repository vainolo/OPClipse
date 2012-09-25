/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/
package com.vainolo.phd.opm.utilities.predicates;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClass;

import com.google.common.base.Predicate;
import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.model.OPMProceduralLink;

/**
 * Predicate that returns true for links that provide data from a process.
 * 
 * @author Arieh 'Vainolo' Bibliowicz
 * @created 10 Jul 2012
 * 
 * @author Eyal
 */
public enum IsOPMProcessOutgoingDataLink implements Predicate<OPMProceduralLink> {
  INSTANCE;

  private ArrayList<EClass> TrueTypes;
  
  private IsOPMProcessOutgoingDataLink(){
	  TrueTypes = new ArrayList<>();
	  TrueTypes.add(OPMPackage.eINSTANCE.getOPMResultLink());
	  TrueTypes.add(OPMPackage.eINSTANCE.getOPMEffectLink());
  }
  
  
  @Override
  public boolean apply(final OPMProceduralLink link) {
	  for (EClass type:TrueTypes)
	    	if (type.isInstance(link)) return true;
	    return false;
  }
  
  

}
