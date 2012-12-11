package com.vainolo.phd.opmeta.model.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.common.util.EList;

import com.vainolo.phd.opm.model.util.LinkedEList;

public class NotifiableLinkedCollection<T> implements Collection<T>, Notifier{

	LinkedList<T> m_underList = new LinkedList<T>();
	
	@Override
	public boolean add(T e) {
		boolean retVal = m_underList.add(e);
		if (retVal)
			eNotify(new NotificationImpl(Notification.ADD,null, e));
		return retVal;
	}

	@Override
	public boolean addAll(Collection<? extends T> arg0) {
		boolean retVal = false;
		for (T item:arg0){
			retVal |= add(item);
		}
		return retVal;
	}

	@Override
	public void clear() {
		m_underList.clear();
		eNotify(new NotificationImpl(Notification.UNSET,null, null));
	}

	@Override
	public boolean remove(Object e) {
		boolean retVal = m_underList.remove(e);
		if (retVal)
			eNotify(new NotificationImpl(Notification.REMOVE,e,null));
		return retVal; 
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		boolean retVal = false;
		for (Object item:arg0){
			retVal |= remove(item);
		}
		return retVal;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		LinkedList<T> goes = new LinkedList<>();
		for (T item:m_underList){
			if (!arg0.contains(item))
				goes.add(item);
		}
		boolean retVal = false;
		for (T item:goes){
			retVal |= remove(item);
		}
		return retVal;
	}
	
	@Override
	public boolean contains(Object arg0) {
		return m_underList.contains(arg0);
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		return m_underList.containsAll(arg0);
	}

	@Override
	public boolean isEmpty() {
		return m_underList.isEmpty();
	}

	@Override
	public Iterator<T> iterator() {
		return m_underList.iterator();
	}

	@Override
	public int size() {
		return m_underList.size();
	}

	@Override
	public Object[] toArray() {
		return m_underList.toArray();
	}

	@Override
	public <Ts> Ts[] toArray(Ts[] arg0) { 
		return m_underList.toArray(arg0);
	}

	private LinkedEList<Adapter> adapters = new LinkedEList<>(); 
	
	@Override
	public EList<Adapter> eAdapters() {
		return adapters;
	}

	boolean deliver = true;
	
	@Override
	public boolean eDeliver() {
		return deliver;
	}

	@Override
	public void eSetDeliver(boolean deliver) {
		this.deliver=deliver; 
	}

	@Override
	public void eNotify(Notification notification) {
		if (!deliver) return;
		for (Adapter adap:adapters){
			adap.notifyChanged(notification);
		}
		
	}

}
