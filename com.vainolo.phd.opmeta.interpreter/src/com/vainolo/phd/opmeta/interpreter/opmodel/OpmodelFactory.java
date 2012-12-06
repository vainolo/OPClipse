package com.vainolo.phd.opmeta.interpreter.opmodel;

import com.vainolo.phd.opmeta.interpreter.OpmetaInterpretation;
import com.vainolo.phd.opmeta.interpreter.TypeDescriptor;
import com.vainolo.phd.opmeta.interpreter.opmodel.impl.OpmodelContainerInstanceImpl;
import com.vainolo.phd.opmeta.interpreter.opmodel.impl.OpmodelLinkInstanceImpl;
import com.vainolo.phd.opmeta.interpreter.opmodel.impl.OpmodelNodeInstanceImpl;
import com.vainolo.phd.opmeta.interpreter.opmodel.impl.OpmodelThingInstanceImpl;

public class OpmodelFactory {

	public OpmodelFactory(OpmetaInterpretation interpretation) {
		super();
		this.interpretation = interpretation;
	}

	private OpmetaInterpretation interpretation;
	
	public OpmodelInstance createOpmodelInstance(TypeDescriptor descriptor){
		if (descriptor.isAbstract()) return null;
		
		OpmodelInstance instance=null; 
		if (interpretation.getLinks().contains(descriptor)) 
			instance = new OpmodelLinkInstanceImpl(descriptor);
		else if (interpretation.isNode(descriptor.getName()))
			{
				if (interpretation.isContainer(descriptor.getName()))
					instance = new OpmodelThingInstanceImpl(descriptor); // TODO : re-think this shit!
				else
					instance = new OpmodelNodeInstanceImpl(descriptor);
			}
		else if (interpretation.getContainers().contains(descriptor))
			instance = new OpmodelContainerInstanceImpl(descriptor);
		
		return instance;
	}

	public Object getInstanceType(TypeDescriptor descriptor){
		if (interpretation.getLinks().contains(descriptor)) return OpmodelLinkInstance.class; 
		else if (interpretation.isNode(descriptor.getName()))
			{
				if (interpretation.isContainer(descriptor.getName()))
					return OpmodelThingInstance.class;
				else
					return OpmodelNodeInstance.class;
			}
		else if (interpretation.getContainers().contains(descriptor))
			return OpmodelContainerInstance.class;
		
		return null;
	}
}
