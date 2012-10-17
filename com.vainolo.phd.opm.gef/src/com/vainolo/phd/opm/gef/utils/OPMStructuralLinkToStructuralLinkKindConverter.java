package com.vainolo.phd.opm.gef.utils;

import java.util.HashMap;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EClass;

import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.model.OPMProceduralLink;
import com.vainolo.phd.opm.model.OPMStructuralLink;
import com.vainolo.phd.opm.utilities.decoratorationLayer.StructuralLinkKind;

public enum OPMStructuralLinkToStructuralLinkKindConverter {
	INSTANCE;
	
	private HashMap<StructuralLinkKind, EClass> Map;
	  
	OPMStructuralLinkToStructuralLinkKindConverter(){
		Map = new HashMap<>();
		Map.put(StructuralLinkKind.AGGREGATION, OPMPackage.eINSTANCE.getOPMAggregationLink());
		Map.put(StructuralLinkKind.EXHIBITION,OPMPackage.eINSTANCE.getOPMExhibitionLink());
		Map.put(StructuralLinkKind.GENERALIZATION, OPMPackage.eINSTANCE.getOPMGeneralizationLink());
		
	  }
	
	public StructuralLinkKind Convert(OPMStructuralLink link){
		for (Entry<StructuralLinkKind,EClass> entry : Map.entrySet()) {
			if (entry.getValue().isInstance(link)) return entry.getKey();
		}
		
		return null;
	}
	
}
