package com.vainolo.phd.opm.utilities.decoratorationLayer;

import org.eclipse.emf.ecore.EObject;

import com.vainolo.phd.opm.model.OPMConsumptionLink;
import com.vainolo.phd.opm.model.OPMInstrumentLink;
import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMObject;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
import com.vainolo.phd.opm.model.OPMProceduralActivationKind;
import com.vainolo.phd.opm.model.OPMProceduralLink;
import com.vainolo.phd.opm.model.OPMProcess;
import com.vainolo.phd.opm.model.OPMState;

public class OPMFactory {
	private OPMFactory(){}
	
	private static OPMFactory instance;
	
	public static OPMFactory Instance(){
		if (instance == null) instance=new OPMFactory();
		return instance;
	}
	
	public OPMProceduralLink createOPMAgentLink(){
		OPMProceduralLink link = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMAgentLink();
		return (OPMProceduralLink)DecorationsBank.INSTANCE.putDecorator(link,  new OPMProceduralLinkDecorator(link));
	}
	
	public OPMProceduralLink createOPMConsumptionConditionLink(){
		OPMConsumptionLink link = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMConsumptionLink();
		link.setActivationKind(OPMProceduralActivationKind.CONDITION);
		return (OPMProceduralLink)DecorationsBank.INSTANCE.putDecorator(link,  new OPMProceduralLinkDecorator(link));
	}
	
	public OPMProceduralLink createOPMConsumptionEventLink(){
		OPMConsumptionLink link = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMConsumptionLink();
		link.setActivationKind(OPMProceduralActivationKind.EVENT);
		return (OPMProceduralLink)DecorationsBank.INSTANCE.putDecorator(link,  new OPMProceduralLinkDecorator(link));
	}
	public OPMProceduralLink createOPMConsumptionLink(){
		OPMConsumptionLink link = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMConsumptionLink();
		return (OPMProceduralLink)DecorationsBank.INSTANCE.putDecorator(link,  new OPMProceduralLinkDecorator(link));
	}
	
	public OPMProceduralLink createOPMEffectLink(){
		OPMProceduralLink link = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMEffectLink();
		return (OPMProceduralLink)DecorationsBank.INSTANCE.putDecorator(link,  new OPMProceduralLinkDecorator(link));
	}
	public OPMProceduralLink createOPMInstrumentLink(){
		OPMInstrumentLink link = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMInstrumentLink();
		return (OPMProceduralLink)DecorationsBank.INSTANCE.putDecorator(link,  new OPMProceduralLinkDecorator(link));
	}
	
	public OPMProceduralLink createOPMInstrumentConditionLink(){
		OPMInstrumentLink link = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMInstrumentLink();
		link.setActivationKind(OPMProceduralActivationKind.CONDITION);
		return (OPMProceduralLink)DecorationsBank.INSTANCE.putDecorator(link,  new OPMProceduralLinkDecorator(link));
	}
	public OPMProceduralLink createOPMInstrumentEventLink(){
		OPMInstrumentLink link = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMInstrumentLink();
		link.setActivationKind(OPMProceduralActivationKind.EVENT);
		return (OPMProceduralLink)DecorationsBank.INSTANCE.putDecorator(link,  new OPMProceduralLinkDecorator(link));
	}
	
	public OPMProceduralLink createOPMInvocationLink(){
		OPMProceduralLink link = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMInvocationLink();
		return (OPMProceduralLink)DecorationsBank.INSTANCE.putDecorator(link,  new OPMProceduralLinkDecorator(link));
	}
	
	public OPMProceduralLink createOPMResultLink(){
		OPMProceduralLink link = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMResultLink();
		return (OPMProceduralLink)DecorationsBank.INSTANCE.putDecorator(link,  new OPMProceduralLinkDecorator(link));
	}
	
	public OPMObject createOPMObject() {
		OPMObject model = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMObject();
		return (OPMObject)DecorationsBank.INSTANCE.putDecorator(model,new OPMObjectDecorator(model));
	}
	
	public OPMProcess createOPMProcess() {
		OPMProcess model = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMProcess();
		return (OPMProcess)DecorationsBank.INSTANCE.putDecorator(model,new OPMProcessDecorator(model));
	}
	
	public OPMObjectProcessDiagram createOPMObjectProcessDiagram() {
		OPMObjectProcessDiagram model = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMObjectProcessDiagram();
		return (OPMObjectProcessDiagram)DecorationsBank.INSTANCE.putDecorator(model,new OPMObjectProcessDiagramDecorator(model));
		
	}
	
	public OPMState createOPMState() {
		OPMState model = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMState();
		return (OPMState)DecorationsBank.INSTANCE.putDecorator(model,new OPMStateDecorator(model));
	}
	
	public OPMStructuralLinkAggregator createOPMStructuralLinkAggregator() {
		return new OPMStructuralLinkAggregatorImpl();
	}
	
	public OPMLink createOPMSimpleLink(){
		return new OPMSimpleLink();
	}
	
	
}
