package com.vainolo.phd.opmeta.interpreter.opmodel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notifier;

public interface OpmodelInstance extends Notifier {
	 void setId(long id);
	 
	public OpmodelPropertyInstance lookupProperty(String name);
	
	public Collection<OpmodelPropertyInstance> getPropertyCollection();

}
