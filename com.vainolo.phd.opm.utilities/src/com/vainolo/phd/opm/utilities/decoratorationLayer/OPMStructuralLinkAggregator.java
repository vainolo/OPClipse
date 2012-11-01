package com.vainolo.phd.opm.utilities.decoratorationLayer;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.geometry.Dimension;
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

import com.vainolo.phd.opm.model.OPMContainer;
import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.model.OPMStructuralLink;
import com.vainolo.phd.opm.model.VerticalAlignment;
import com.vainolo.phd.opm.utilities.analysis.OPMDecorated;

public class OPMStructuralLinkAggregator implements OPMNode{

	private DecorationsBank decorationsBank;
	protected OPMStructuralLinkKind kind;
	private final Dimension dimension = new Dimension(15,15);
	MyEList<Adapter> eAdapters = new MyEList<>();
	HashSet<OPMStructuralLink> originals = new HashSet<>();
	HashSet<OPMLink> incomingLinks = new HashSet<>();
	HashSet<OPMLink> outgoingLinks = new HashSet<>();
	OPMNode source;
	
	OPMStructuralLinkAggregator(OPMStructuralLink link, DecorationsBank decorationsBank, OPMNode source) {
		Assert.isNotNull(decorationsBank);
		this.decorationsBank = decorationsBank;
		this.kind = OPMStructuralLinkToStructuralLinkKindConverter.INSTANCE.Convert(link);
		this.source = source;
		Point linkPos = link.getAggregatorPosition();
		if (linkPos != null)
			location = new Point(linkPos);
		else
			location = new Point();
		createSourceLink(link);
		AddOPMStructuralLink(link);
    }

	private void createSourceLink(OPMStructuralLink link) {
		OPMSimpleLink sourceLink = new OPMSimpleLink();
		sourceLink.setSource((OPMNode)decorationsBank.getDecorator(link.getSource()));
		sourceLink.setTarget(this);
		sourceLink.setOpd((OPMObjectProcessDiagram)decorationsBank.getDecorator(link.getOpd()));
		incomingLinks.add(sourceLink);
		decorationsBank.putSimpleLink(sourceLink);
	}
	
	public boolean AddOPMStructuralLink(OPMStructuralLink link){
		if (OPMStructuralLinkToStructuralLinkKindConverter.INSTANCE.Convert(link) != kind) return false;
		if (link.getSource() == null || link.getTarget() == null) return false;
		
		if (originals.add(link)){
			link.setAggregatorPosition(location);
			link.eAdapters().add(new OPMStructuralLinkAggregatorOriginalAdapter(this));
			outgoingLinks.add(createSimpleLink(link));
			NotificationImpl notification = new NotificationImpl(NotificationImpl.PRIMITIVE_TYPE_OBJECT,null,link);
			NotifyAdapters(notification);
			decorationsBank.OnNumberOfOriginalsChangedInAggregator(this);
			return true;
		}
		return false;
		
	}
	
	private OPMLink createSimpleLink(OPMStructuralLink orig){
		OPMSimpleLink link = new OPMSimpleLink(orig);
		link.setSource(this);
		link.setTarget((OPMNode)decorationsBank.getDecorator(orig.getTarget()));
		link.setOpd((OPMObjectProcessDiagram)decorationsBank.getDecorator(orig.getOpd()));
		decorationsBank.putSimpleLink(link);
		return link;
	}
	
	@Override
	public List<OPMLink> getIncomingLinks() {
		return new ArrayList<>(incomingLinks);
	}

	@Override
	public List<OPMLink> getOutgoingLinks() {
		return new ArrayList<>(outgoingLinks);
	}
	
	private class OPMStructuralLinkAggregatorOriginalAdapter implements Adapter{

		OPMStructuralLinkAggregator aggregator;
		
		OPMStructuralLinkAggregatorOriginalAdapter(OPMStructuralLinkAggregator aggregator){
			this.aggregator = aggregator;
		}
		
		@Override
		public void notifyChanged(Notification notification) {
			int featureid = notification.getFeatureID(OPMStructuralLink.class);
			OPMStructuralLink link =  (OPMStructuralLink) notification.getNotifier();
			if (featureid ==OPMPackage.OPM_LINK__TARGET ){
				OPMNode oldTarget = (OPMNode)notification.getOldValue();
				removeSimpleLink(oldTarget,link);
			}
			if (featureid  == OPMPackage.OPM_LINK__SOURCE){
				OPMNode target = (OPMNode)decorationsBank.getDecorator(link.getTarget());
				removeSimpleLink(target,link);
			}
			NotifyAdapters(notification);
			
		}

		private void removeSimpleLink(OPMNode target,OPMStructuralLink link){
			if (target == null) return;
			OPMSimpleLink simpleLink = decorationsBank.getSimpleLink(aggregator, target);
			decorationsBank.removeSimpleLink(simpleLink);
			originals.remove(link);
			link.eAdapters().remove(this);
			outgoingLinks.remove(simpleLink);
			decorationsBank.OnNumberOfOriginalsChangedInAggregator(aggregator);
		}
		
		@Override
		public Notifier getTarget() {
			return aggregator;
		}

		@Override
		public void setTarget(Notifier newTarget) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return type.equals(OPMLink.class);
		}
		
	}

	
	private OPMContainer container; 
	
	@Override
	public OPMContainer getContainer() {
		return container;
	}
	
	@Override
	public void setContainer(OPMContainer value) {
		if (container == value) return;
		OPMContainer old = container;
		container = value;
		if (!(container instanceof OPMDecorated<?>)) container = (OPMContainer)decorationsBank.getDecorator(container);
		if (container instanceof OPMObjectProcessDiagram){
			OPMObjectProcessDiagram diagram = ((OPMObjectProcessDiagramDecorator)container).getDecorated();
		
			for (OPMStructuralLink original:originals){
				original.setOpd(diagram);
			}
		}
		
		NotificationImpl notification = new NotificationImpl(NotificationImpl.PRIMITIVE_TYPE_OBJECT,old,container);
		NotifyAdapters(notification);
	}

	private Point location;
	
	@Override
	public Rectangle getConstraints() {
		return new Rectangle(location,dimension);
	}

	@Override
	public void setConstraints(Rectangle value) {
		location.x = value.x;
		location.y = value.y;
		
		for (OPMStructuralLink orig:originals){
			orig.setAggregatorPosition(new Point(location));
		}
	}

	@Override
	public EList<Adapter> eAdapters() {
		return eAdapters;
	}
	
	void NotifyAdapters(Notification notification){
		for (Adapter adapter:eAdapters) adapter.notifyChanged(notification);
	}
	
	public OPMStructuralLinkKind getKind() {
		return kind;
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

	

	boolean deliver;
	
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
	}

	String name;
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String value) {
		name = value;
	}

	private VerticalAlignment verticalAlignment;
	
	@Override
	public VerticalAlignment getAlignment() {
		return verticalAlignment;
	}

	@Override
	public void setAlignment(VerticalAlignment value) {
		verticalAlignment = value;
	}

}
