package com.vainolo.phd.opm.gef.decorationLayer;

import java.util.HashMap;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EClass;

import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.model.OPMStructuralLink;

public enum OPMStructuralLinkToStructuralLinkKindConverter {
INSTANCE;
	
	private HashMap<OPMStructuralLinkKind, EClass> Map;
	  
	OPMStructuralLinkToStructuralLinkKindConverter(){
		Map = new HashMap<>();
		Map.put(OPMStructuralLinkKind.AGGREGATION, OPMPackage.eINSTANCE.getOPMAggregationLink());
		Map.put(OPMStructuralLinkKind.EXHIBITION,OPMPackage.eINSTANCE.getOPMExhibitionLink());
		Map.put(OPMStructuralLinkKind.GENERALIZATION, OPMPackage.eINSTANCE.getOPMGeneralizationLink());
	}
	
	public OPMStructuralLinkKind convert(final OPMStructuralLink link) {
		for (Entry<OPMStructuralLinkKind,EClass> entry : Map.entrySet()) {
			if (entry.getValue().isInstance(link)) return entry.getKey();
		}
		
		return null;
	}
}
