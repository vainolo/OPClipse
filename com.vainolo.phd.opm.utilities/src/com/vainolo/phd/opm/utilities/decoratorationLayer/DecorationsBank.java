package com.vainolo.phd.opm.utilities.decoratorationLayer;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;

import com.vainolo.phd.opm.model.OPMObject;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
import com.vainolo.phd.opm.model.OPMProceduralLink;
import com.vainolo.phd.opm.model.OPMProcess;
import com.vainolo.phd.opm.model.OPMState;

enum DecorationsBank {
	INSTANCE;
	
	private HashMap<EObject,EObjectDecorator> bank = new HashMap<EObject,EObjectDecorator>(); 
	
	public EObjectDecorator getDecorator(EObject decorated){
		return bank.get(decorated);
	}
	
	public EObjectDecorator putDecorator(EObject decorated, EObjectDecorator decorator){
		if (bank.containsKey(decorated)) return getDecorator(decorated);
		bank.put(decorated, decorator);
		return decorator;
	}
	
	EObjectDecorator GetOrCreateDecorator(EObject opmOrig){
		if (opmOrig == null)return null;
		if (opmOrig instanceof EObjectDecorator) return (EObjectDecorator)opmOrig;
		EObjectDecorator wrapper = getDecorator(opmOrig);
		if (wrapper != null) return wrapper;
		if (opmOrig instanceof OPMObjectProcessDiagram)
			return putDecorator(opmOrig, new OPMObjectProcessDiagramDecorator((OPMObjectProcessDiagram)opmOrig));
		if (opmOrig instanceof OPMObject)
			return putDecorator(opmOrig, new OPMObjectDecorator((OPMObject)opmOrig));
		if (opmOrig instanceof OPMProcess)
			return putDecorator(opmOrig, new OPMProcessDecorator((OPMProcess)opmOrig));
		if (opmOrig instanceof OPMState)
			return putDecorator(opmOrig, new OPMStateDecorator((OPMState)opmOrig));
		if (opmOrig instanceof OPMProceduralLink)
			return putDecorator(opmOrig, new OPMProceduralLinkDecorator((OPMProceduralLink)opmOrig));
		
		return null;
	}
}
