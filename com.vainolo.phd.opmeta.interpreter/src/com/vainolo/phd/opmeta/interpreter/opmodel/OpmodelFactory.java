package com.vainolo.phd.opmeta.interpreter.opmodel;

import java.util.logging.Logger;

import com.vainolo.phd.opmeta.interpreter.OpmetaInterpretation;
import com.vainolo.phd.opmeta.interpreter.TypeDescriptor;
import com.vainolo.phd.opmeta.interpreter.opmodel.impl.OpmodelContainerInstanceImpl;
import com.vainolo.phd.opmeta.interpreter.opmodel.impl.OpmodelLinkInstanceImpl;
import com.vainolo.phd.opmeta.interpreter.opmodel.impl.OpmodelNodeInstanceImpl;
import com.vainolo.phd.opmeta.interpreter.opmodel.impl.OpmodelThingInstanceImpl;
import com.vainolo.phd.opmeta.model.ContainerInstanceBase;
import com.vainolo.phd.opmeta.model.InstanceBase;
import com.vainolo.phd.opmeta.model.LinkInstanceBase;
import com.vainolo.phd.opmeta.model.NodeInstanceBase;
import com.vainolo.phd.opmeta.model.ThingInstanceBase;
import com.vainolo.phd.opmeta.model.opmetaFactory;

public class OpmodelFactory {

	private Logger logger = Logger.getLogger(OpmodelFactory.class.getName());
	
	public OpmodelFactory(OpmetaInterpretation interpretation) {
		super();
		this.interpretation = interpretation;
	}

	private OpmetaInterpretation interpretation;
	
	public OpmodelInstance createOpmodelInstance(ContainerInstanceBase instance){
		TypeDescriptor descriptor=interpretation.getDescriptorByName(instance.getTypeName());		
		if (!interpretation.getContainers().contains(descriptor)){
			logger.warning("Container instance had illegal type: "+instance.getTypeName());
			return null;
		}
		return  new OpmodelContainerInstanceImpl(descriptor,(ContainerInstanceBase)instance); 
	}
	
	public OpmodelInstance createOpmodelInstance(LinkInstanceBase instance){
		TypeDescriptor descriptor=interpretation.getDescriptorByName(instance.getTypeName());
		if (!interpretation.getLinks().contains(descriptor)){
			logger.warning("Link instance had illegal type: "+instance.getTypeName());
			return null;
		}
		return  new OpmodelLinkInstanceImpl(descriptor,(LinkInstanceBase)instance);
	}
	
	public OpmodelInstance createOpmodelInstance(NodeInstanceBase instance){
		TypeDescriptor descriptor=interpretation.getDescriptorByName(instance.getTypeName());
		if (!interpretation.getNodes().contains(descriptor)){
			logger.warning("Node instance had illegal type: "+instance.getTypeName());
			return null;
		}
		return  new OpmodelNodeInstanceImpl(descriptor,(NodeInstanceBase)instance); 
	}
	
	public OpmodelInstance createOpmodelInstance(ThingInstanceBase instance){
		String typeName = instance.getTypeName();
		TypeDescriptor descriptor=interpretation.getDescriptorByName(typeName);
		if (!interpretation.isContainer(typeName) || !interpretation.isNode(typeName)){
			logger.warning("Thing instance had illegal type: "+instance.getTypeName());
			return null;
		}
		return  new OpmodelThingInstanceImpl(descriptor,(ThingInstanceBase)instance);
	}
	
	public OpmodelInstance createOpmodelInstance(InstanceBase instance){
		if (instance instanceof ThingInstanceBase){
			return createOpmodelInstance((ThingInstanceBase) instance);
		}
		if (instance instanceof NodeInstanceBase){
			return createOpmodelInstance((NodeInstanceBase) instance); 
		}
		if (instance instanceof ContainerInstanceBase){
			return createOpmodelInstance((ContainerInstanceBase)instance); 
		}	
		if (instance instanceof LinkInstanceBase){
			return createOpmodelInstance((LinkInstanceBase)instance);
		}	
		return null;
	}
	
	public OpmodelInstance createOpmodelInstance(String typeName){
		TypeDescriptor descriptor=interpretation.getDescriptorByName(typeName);
		
		return createOpmodelInstance(descriptor);
	}
	
	public OpmodelInstance createOpmodelInstance(TypeDescriptor descriptor){
		if (descriptor == null) return null;
		if (descriptor.isAbstract()) return null;
		
		OpmodelInstance instance=null; 
		if (interpretation.getLinks().contains(descriptor)) {
			LinkInstanceBase instanceBase = opmetaFactory.eINSTANCE.createLinkInstanceBase();
			instanceBase.setTypeName(descriptor.getName());
			instance = new OpmodelLinkInstanceImpl(descriptor,instanceBase);
		} else if (interpretation.isNode(descriptor.getName()))	{
			if (interpretation.isContainer(descriptor.getName())){
				ThingInstanceBase instanceBase = opmetaFactory.eINSTANCE.createThingInstanceBase();// TODO : re-think this shit!
				instanceBase.setTypeName(descriptor.getName());
				instance = new OpmodelThingInstanceImpl(descriptor,instanceBase);
			} else {
				NodeInstanceBase instanceBase = opmetaFactory.eINSTANCE.createNodeInstanceBase();
				instanceBase.setTypeName(descriptor.getName());
				instance = new OpmodelNodeInstanceImpl(descriptor,instanceBase);
			}
		} else if (interpretation.getContainers().contains(descriptor)){
			ContainerInstanceBase instanceBase = opmetaFactory.eINSTANCE.createContainerInstanceBase();
			instanceBase.setTypeName(descriptor.getName());
			instance = new OpmodelContainerInstanceImpl(descriptor,instanceBase);
		}
		
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
