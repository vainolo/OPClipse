package com.vainolo.phd.opm.utilities.decoratorationLayer;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

public class EObjectDecorator implements EObject{

	public EObjectDecorator(EObject decorated){
		Assert.isNotNull(decorated);
		this.decorated = decorated;
	}
	
	EObject decorated;
	
	@Override
	public EClass eClass() {
		return decorated.eClass();
	}

	@Override
	public Resource eResource() {
		return decorated.eResource();
	}

	@Override
	public EObject eContainer() {
		return decorated.eContainer();
	}

	@Override
	public EStructuralFeature eContainingFeature() {
		return decorated.eContainingFeature();
	}

	@Override
	public EReference eContainmentFeature() {
		return decorated.eContainmentFeature();
	}

	@Override
	public EList<EObject> eContents() {
		return decorated.eContents();
	}

	@Override
	public TreeIterator<EObject> eAllContents() {
		return decorated.eAllContents();
	}

	@Override
	public boolean eIsProxy() {
		return decorated.eIsProxy();
	}

	@Override
	public EList<EObject> eCrossReferences() {
		return decorated.eCrossReferences();
	}

	@Override
	public Object eGet(EStructuralFeature feature) {
		return decorated.eGet(feature);
	}

	@Override
	public Object eGet(EStructuralFeature feature, boolean resolve) {
		return decorated.eGet(feature,resolve);
	}

	@Override
	public void eSet(EStructuralFeature feature, Object newValue) {
		decorated.eSet(feature, newValue);
	}

	@Override
	public boolean eIsSet(EStructuralFeature feature) {
		return decorated.eIsSet(feature);
	}

	@Override
	public void eUnset(EStructuralFeature feature) {
		decorated.eUnset(feature);
	}

	@Override
	public Object eInvoke(EOperation operation, EList<?> arguments)
			throws InvocationTargetException {
		return decorated.eInvoke(operation, arguments);
	}

	@Override
	public EList<Adapter> eAdapters() {
		return decorated.eAdapters();
	}

	@Override
	public boolean eDeliver() {
		return decorated.eDeliver();
	}

	@Override
	public void eSetDeliver(boolean deliver) {
		decorated.eSetDeliver(deliver);
	}

	@Override
	public void eNotify(Notification notification) {
		decorated.eNotify(notification);
	}
	
}
