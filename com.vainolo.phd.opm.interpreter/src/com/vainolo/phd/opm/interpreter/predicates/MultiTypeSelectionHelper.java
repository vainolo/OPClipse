package com.vainolo.phd.opm.interpreter.predicates;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import com.vainolo.phd.opm.model.OPMProceduralLink;

/**
 * Helper for Predicates that returns true for some types
 * 
 * @author Eyal
 * @created 22 September 2012
 * 
 */
public class MultiTypeSelectionHelper {
	
	public static boolean apply(final List<EClass> TrueTypes,final OPMProceduralLink link) {
	    for (EClass type:TrueTypes)
	    	if (type.isInstance(link)) return true;
	    return false;
	}
}
