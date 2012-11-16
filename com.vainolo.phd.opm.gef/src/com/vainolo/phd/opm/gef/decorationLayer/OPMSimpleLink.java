package com.vainolo.phd.opm.gef.decorationLayer;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMLinkRouterKind;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
import com.vainolo.phd.opm.model.OPMStructuralLink;

public class OPMSimpleLink implements OPMLink{
	private OPMStructuralLink link;
	
	OPMSimpleLink(){}

	OPMSimpleLink(final OPMStructuralLink link){
		this.link = link;
		this.link.eAdapters().add(new Adapter(){

			@Override
			public void notifyChanged(Notification notification) {
				eNotify(notification);
			}

			@Override
			public Notifier getTarget() {
				return link;
			}

			@Override
			public void setTarget(Notifier newTarget) {
			}

			@Override
			public boolean isAdapterForType(Object type) {
				return type.equals(OPMLink.class);
			}
			
		});
	}
	
	public OPMLink getUnderliningLink()
	{
		return link;
	}
	
	private OPMObjectProcessDiagram opd;
	
	@Override
	public OPMObjectProcessDiagram getOpd() {
		return opd;
	}

	@Override
	public void setOpd(OPMObjectProcessDiagram value) {
		Object old= opd;
		opd = value;
		if (link !=null){
			OPMObjectProcessDiagram diagram = value;
			if (value instanceof OPMObjectProcessDiagramDecorator) diagram = ((OPMObjectProcessDiagramDecorator)value).getDecorated();
			link.setOpd(diagram);
		}
		eNotify(new NotificationImpl(NotificationImpl.PRIMITIVE_TYPE_OBJECT,old,value));
	}

	private OPMNode source, target;
	
	@Override
	public OPMNode getSource() {
		return source;
	}

	@Override
	public void setSource(OPMNode value) {
		if (source == value) return;
		Object old= source;
		source = value;
		eNotify(new NotificationImpl(NotificationImpl.PRIMITIVE_TYPE_OBJECT,old,value));
	}

	@Override
	public OPMNode getTarget() {
		return target;
	}

	@Override
	public void setTarget(OPMNode value) {
		if (target == value) return;
		Object old= target;
		target = value;
		eNotify(new NotificationImpl(NotificationImpl.PRIMITIVE_TYPE_OBJECT,old,value));
	}

	@Override
	public List<Point> getBendpoints() {
		if (link == null) return null;
		return link.getBendpoints();
	}
	
	private OPMLinkRouterKind routerkind = OPMLinkRouterKind.BENDPOINT;
	
	@Override
	public OPMLinkRouterKind getRouterKind() {
		if (link == null) return routerkind;
				
		return link.getRouterKind();
	}

	@Override
	public void setRouterKind(OPMLinkRouterKind value) {
		OPMLinkRouterKind old =routerkind;
		routerkind = value;
		if (link !=null){
			link.setRouterKind(value);
		}
		eNotify(new NotificationImpl(NotificationImpl.PRIMITIVE_TYPE_OBJECT,old,value));
	}

	private MyEList<Adapter> adapters = new MyEList<>();
	
	@Override
	public EList<Adapter> eAdapters() {
		return adapters;
	}
	
	@Override
	public void eNotify(Notification notification) {
		for (Adapter adapter:adapters) adapter.notifyChanged(notification);
	}
	
	private long id;
	
	@Override
	public long getId() {
		return id;
	}

	@Override
	public void setId(long value) {
		id = value;
	}

	@Override
	public EClass eClass() {
		return null;
	}

	@Override
	public Resource eResource() {
		return null;
	}

	@Override
	public EObject eContainer() {
		return null;
	}

	@Override
	public EStructuralFeature eContainingFeature() {
		return null;
	}

	@Override
	public EReference eContainmentFeature() {
		return null;
	}

	@Override
	public EList<EObject> eContents() {
		return null;
	}

	@Override
	public TreeIterator<EObject> eAllContents() {
		return null;
	}

	@Override
	public boolean eIsProxy() {
		return false;
	}

	@Override
	public EList<EObject> eCrossReferences() {
		return null;
	}

	@Override
	public Object eGet(EStructuralFeature feature) {
		return null;
	}

	@Override
	public Object eGet(EStructuralFeature feature, boolean resolve) {
		return null;
	}

	@Override
	public void eSet(EStructuralFeature feature, Object newValue) {
	}

	@Override
	public boolean eIsSet(EStructuralFeature feature) {
		return false;
	}

	@Override
	public void eUnset(EStructuralFeature feature) {	
	}

	@Override
	public Object eInvoke(EOperation operation, EList<?> arguments)
			throws InvocationTargetException {
		return null;
	}

	

	@Override
	public boolean eDeliver() {
		return false;
	}

	@Override
	public void eSetDeliver(boolean deliver) {		
	}

	@Override
	public String getSourceDecoration() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSourceDecoration(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTargetDecoration() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTargetDecoration(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCenterDecoration() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCenterDecoration(String value) {
		// TODO Auto-generated method stub
		
	}
}
