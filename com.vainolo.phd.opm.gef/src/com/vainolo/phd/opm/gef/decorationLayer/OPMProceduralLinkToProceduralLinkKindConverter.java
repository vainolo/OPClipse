package com.vainolo.phd.opm.gef.decorationLayer;

import java.util.HashMap;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EClass;

import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.model.OPMProceduralLink;

public enum OPMProceduralLinkToProceduralLinkKindConverter {
	INSTANCE;
	
	private HashMap<OPMProceduralLinkKind, EClass> Map;
	  
	OPMProceduralLinkToProceduralLinkKindConverter(){
		Map = new HashMap<>();
		Map.put(OPMProceduralLinkKind.AGENT, OPMPackage.eINSTANCE.getOPMAgentLink());
		Map.put(OPMProceduralLinkKind.CONSUMPTION,OPMPackage.eINSTANCE.getOPMConsumptionLink());
		Map.put(OPMProceduralLinkKind.INSTRUMENT, OPMPackage.eINSTANCE.getOPMInstrumentLink());
		Map.put(OPMProceduralLinkKind.EFFECT,OPMPackage.eINSTANCE.getOPMEffectLink());
		Map.put(OPMProceduralLinkKind.RESULT, OPMPackage.eINSTANCE.getOPMResultLink());
		Map.put(OPMProceduralLinkKind.INVOCATION,OPMPackage.eINSTANCE.getOPMInvocationLink());
	  }
	
	public OPMProceduralLinkKind convert(OPMProceduralLink link) {
		if (link instanceof OPMProceduralLinkDecorator) link = ((OPMProceduralLinkDecorator)link).getDecorated();
		
		for (Entry<OPMProceduralLinkKind,EClass> entry : Map.entrySet()) {
			if (entry.getValue().isInstance(link)) return entry.getKey();
		}
		
		return null;
	}
}
