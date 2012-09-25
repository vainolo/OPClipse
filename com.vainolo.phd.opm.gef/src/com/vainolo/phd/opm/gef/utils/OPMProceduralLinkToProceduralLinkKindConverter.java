package com.vainolo.phd.opm.gef.utils;

import java.util.HashMap;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EClass;

import com.vainolo.phd.opm.gef.editor.figure.ProceduralLinkKind;
import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.model.OPMProceduralLink;

public enum OPMProceduralLinkToProceduralLinkKindConverter {
	INSTANCE;
	
	private HashMap<ProceduralLinkKind, EClass> Map;
	  
	OPMProceduralLinkToProceduralLinkKindConverter(){
		Map = new HashMap<>();
		Map.put(ProceduralLinkKind.AGENT, OPMPackage.eINSTANCE.getOPMAgentLink());
		Map.put(ProceduralLinkKind.CONSUMPTION,OPMPackage.eINSTANCE.getOPMConsumptionLink());
		Map.put(ProceduralLinkKind.INSTRUMENT, OPMPackage.eINSTANCE.getOPMInstrumentLink());
		Map.put(ProceduralLinkKind.EFFECT,OPMPackage.eINSTANCE.getOPMEffectLink());
		Map.put(ProceduralLinkKind.RESULT, OPMPackage.eINSTANCE.getOPMResultLink());
		Map.put(ProceduralLinkKind.INVOCATION,OPMPackage.eINSTANCE.getOPMInvocationLink());
	  }
	
	public ProceduralLinkKind Convert(OPMProceduralLink link) {
		for (Entry<ProceduralLinkKind,EClass> entry : Map.entrySet()) {
			if (entry.getValue().isInstance(link)) return entry.getKey();
		}
		
		return null;
	}
}
