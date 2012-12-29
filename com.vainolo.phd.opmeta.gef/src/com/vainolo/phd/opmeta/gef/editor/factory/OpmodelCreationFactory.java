package com.vainolo.phd.opmeta.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.vainolo.phd.opm.gef.editor.factory.OPMIdManager;
import com.vainolo.phd.opmodel.model.InstanceBase;
import com.vainolo.phd.opmodel.model.TypeDescriptor;
import com.vainolo.phd.opmeta.interpreter.OpmodelFactory;

public class OpmodelCreationFactory implements CreationFactory{

	private OPMIdManager opmIdManager;
	private TypeDescriptor descriptor;
	private OpmodelFactory factory;
	private Object objectType;
	
	public OpmodelCreationFactory(OpmodelFactory factory, TypeDescriptor descriptor,OPMIdManager opmIdManager){
		if (descriptor.isAbstract()) throw new RuntimeException("Cannot Build abstract type from type descriptor");
		this.factory = factory;
		this.opmIdManager = opmIdManager;
		this.descriptor = descriptor;
		objectType = factory.getInstanceType(descriptor);
	}
	
	@Override
	public Object getNewObject() {
		InstanceBase instance =  factory.createOpmodelInstance(descriptor);
		instance.setId(opmIdManager.getNextId());
		return instance;
	}

	@Override
	public Object getObjectType() {
		return objectType;
	}

}
