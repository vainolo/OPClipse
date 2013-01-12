package com.vainolo.phd.opmeta.interpreter;

import java.util.List;

import com.vainolo.phd.opmodel.model.InstanceBase;
import com.vainolo.phd.opmodel.model.TypeDescriptor;
import com.vainolo.phd.opmodel.model.ContainerInstance;
import com.vainolo.phd.opmodel.model.LinkInstance;
import com.vainolo.phd.opmodel.model.NodeInstance;
import com.vainolo.phd.opmodel.model.OPmetaDefinition;
import com.vainolo.phd.opmodel.model.PropertyDescriptor;
import com.vainolo.phd.opmodel.model.PropertyInstance;
import com.vainolo.phd.opmodel.model.ThingInstance;
import com.vainolo.phd.opmodel.model.opmodelFactory;

public class OpmodelFactory {
	
	public OpmodelFactory(OPmetaDefinition interpretation) {
		super();
		this.interpretation = interpretation;
	}

	private OPmetaDefinition interpretation;
	
	public InstanceBase createOpmodelInstance(TypeDescriptor descriptor){
		if (descriptor == null) return null;
		if (descriptor.isAbstract()) return null;
		
		InstanceBase instance=null; 
		if (interpretation.getLinks().contains(descriptor)) {
			instance = opmodelFactory.eINSTANCE.createLinkInstance();
		} else if (interpretation.getNodes().contains(descriptor))	{
			if (interpretation.getContainers().contains(descriptor)){
				instance = opmodelFactory.eINSTANCE.createThingInstance();
			} else {
				instance = opmodelFactory.eINSTANCE.createNodeInstance();
			}
		} else if (interpretation.getContainers().contains(descriptor)){
			instance = opmodelFactory.eINSTANCE.createContainerInstance();
		}
		if (instance != null){
			instance.setType(descriptor);
			CreateProperties(instance);
		}
		return instance;
	}
	
	private void CreateProperties(InstanceBase instance) {
		TypeDescriptor descriptor = instance.getType();
		List<PropertyDescriptor> propDescs = descriptor.getProperties();
		for (PropertyDescriptor propDesc:propDescs){
			PropertyInstance property;
			switch (propDesc.getType()){
			case STRING:
				property = opmodelFactory.eINSTANCE.createPropertyInstance();
				break;
			case BOOLEAN:
				property = opmodelFactory.eINSTANCE.createPropertyBooleanInstance();
				break;
			case INT:
				property = opmodelFactory.eINSTANCE.createPropertyIntInstance();
				break;
			case FLOAT:
				property = opmodelFactory.eINSTANCE.createPropertyFloatInstance();
				break;
				default:
					throw new RuntimeException("Unknwon property type");
			}
			property.setDescriptor(propDesc);
			instance.getProperties().add(property);
		}
	}

	public Object getInstanceType(TypeDescriptor descriptor){
		if (interpretation.getLinks().contains(descriptor)) return LinkInstance.class; 
		else if (interpretation.getNodes().contains(descriptor))
			{
				if (interpretation.getContainers().contains(descriptor))
					return ThingInstance.class;
				else
					return NodeInstance.class;
			}
		else if (interpretation.getContainers().contains(descriptor))
			return ContainerInstance.class;
		
		return null;
	}
}
