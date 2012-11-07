package com.vainolo.phd.opm.gef.decorationLayer;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

@SuppressWarnings("serial")
class MyEList<E> extends LinkedList<E> implements EList<E> {

	@Override
	public void move(int newPosition, E object) {
		int index = super.indexOf(object);
		if (index != -1){
			if (index == newPosition) return;
			super.remove(object);
		} 
		super.add(newPosition, object);
	}

	@Override
	public E move(int newPosition, int oldPosition) {
		E obj =  super.get(oldPosition);
		if (oldPosition != newPosition){
			super.remove(oldPosition);
			super.add(newPosition,obj);
		}
		return obj;
	}


}
