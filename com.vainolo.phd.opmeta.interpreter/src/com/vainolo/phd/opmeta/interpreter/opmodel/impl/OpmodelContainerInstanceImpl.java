package com.vainolo.phd.opmeta.interpreter.opmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import com.vainolo.phd.opmeta.interpreter.TypeDescriptor;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelContainerInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelLinkInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelNodeInstance;
import com.vainolo.phd.opmeta.model.ContainerInstanceBase;
import com.vainolo.phd.opmeta.model.util.NotifiableLinkedCollection;

public class OpmodelContainerInstanceImpl extends OpmodelInstanceImpl implements
		OpmodelContainerInstance {

	private ContainerInstanceBase containerInstanceBase;
	
	public OpmodelContainerInstanceImpl(TypeDescriptor descriptor, ContainerInstanceBase instanceBase) {
		super(descriptor, instanceBase);
		containerInstanceBase = instanceBase;
		nodes = new NotifiableLinkedCollection<>();
		nodes.eAdapters().add(new containerAdapter(this));
		links = new NotifiableLinkedCollection<>();
		links.eAdapters().add(new containerAdapter(this));
	}

	private NotifiableLinkedCollection<OpmodelNodeInstance> nodes;
	
	@Override
	public Collection<OpmodelNodeInstance> getNodes() {
		return nodes;
	}

	private NotifiableLinkedCollection<OpmodelLinkInstance> links;
	
	@Override
	public Collection<OpmodelLinkInstance> getLinks() {
		return links;
	}

	private class containerAdapter implements Adapter{

		private Notifier notifier;
		public containerAdapter(Notifier notifier){
			this.notifier = notifier;
		}
		
		@Override
		public void notifyChanged(Notification notification) {
			eNotify(notification);
		}

		@Override
		public Notifier getTarget() {
			return notifier;
		}

		@Override
		public void setTarget(Notifier newTarget) {
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return OpmodelContainerInstanceImpl.class.equals(type);
		}
		
	}
	
}
