package com.vainolo.phd.opmeta.interpreter.opmodel.impl;

import java.util.Collection;
import java.util.HashMap;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;

import com.vainolo.phd.opm.model.util.LinkedEList;
import com.vainolo.phd.opmeta.interpreter.TypeDescriptor;
import com.vainolo.phd.opmeta.interpreter.propertyDescriptor;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelPropertiesFactory;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelPropertyInstance;
import com.vainolo.phd.opmeta.interpreter.properties.OpmodelPropertyInstanceImpl;
import com.vainolo.phd.opmeta.model.InstanceBase;

public class OpmodelInstanceImpl implements OpmodelInstance {

	private InstanceBase instanceBase;
	
	public void setId(long id){
		instanceBase.setId(id);
	}
	
	public OpmodelInstanceImpl(TypeDescriptor descriptor, InstanceBase instanceBase) {
		super();
		this.descriptor = descriptor;
		this.instanceBase = instanceBase;
		instanceBase.eAdapters().add(new InstanceBaseAdapter());
		PopulateProperties();
	}

	private TypeDescriptor descriptor;
	
	protected TypeDescriptor getTypeDescriptor(){
		return descriptor;
	}

	LinkedEList<Adapter> adapters = new LinkedEList<>();
	
	@Override
	public EList<Adapter> eAdapters() {
		return adapters;
	}

	private boolean deliver = true;
	
	@Override
	public boolean eDeliver() {
		return deliver;
	}

	@Override
	public void eSetDeliver(boolean deliver) {
		this.deliver = deliver;
	}

	@Override
	public void eNotify(Notification notification) {
		if (!eDeliver()) return;
		for (Adapter adap:adapters){
			adap.notifyChanged(notification);
		}
	}
	
	private HashMap<String,OpmodelPropertyInstance> properties = new HashMap<>();
	
	private void PopulateProperties(){
		OpmodelPropertiesFactory PropertiesFactory = new OpmodelPropertiesFactory();
		for(propertyDescriptor desc : descriptor.getProperties()){
			OpmodelPropertyInstanceImpl property = PropertiesFactory.CreateProperties(desc);
			properties.put(desc.getPropertyName(), property);
		}
	}
	
	public OpmodelPropertyInstance lookupProperty(String name){
		return properties.get(name);
	}
	
	public Collection<OpmodelPropertyInstance> getPropertyCollection(){
		return properties.values();
	}
	
	
	protected class InstanceBaseAdapter implements Adapter{

		@Override
		public void notifyChanged(Notification notification) {
			eNotify(notification);
		}

		@Override
		public Notifier getTarget() {
			return instanceBase;
		}

		@Override
		public void setTarget(Notifier newTarget) {
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return InstanceBase.class.equals(type);
		}
		
	}
}
