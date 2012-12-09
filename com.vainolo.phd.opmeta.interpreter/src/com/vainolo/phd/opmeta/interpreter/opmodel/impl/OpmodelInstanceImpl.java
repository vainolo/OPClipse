package com.vainolo.phd.opmeta.interpreter.opmodel.impl;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import com.vainolo.phd.opm.model.util.LinkedEList;
import com.vainolo.phd.opmeta.interpreter.TypeDescriptor;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelInstance;
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
	
	
}
