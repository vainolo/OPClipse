package com.vainolo.phd.opm.gef.decorationLayer;

import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;

import com.vainolo.phd.opm.model.Label;
import com.vainolo.phd.opm.model.OPMContainer;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMObject;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
import com.vainolo.phd.opm.model.OPMProceduralLink;
import com.vainolo.phd.opm.model.OPMProcess;
import com.vainolo.phd.opm.model.OPMState;
import com.vainolo.phd.opm.model.OPMStructuralLink;

class DecorationsBank {
	
	private HashMap<EObject,EObjectDecorator<?>> bank = new HashMap<EObject,EObjectDecorator<?>>(); 
	
	public EObjectDecorator<?> getDecorator(EObject decorated){
		return bank.get(decorated);
	}
	
	public EObjectDecorator<?> putDecorator(EObject decorated, EObjectDecorator<?> decorator){
		if (bank.containsKey(decorated)) return getDecorator(decorated);
		bank.put(decorated, decorator);
		return decorator;
	}
	
	EObjectDecorator<?> getOrCreateDecorator(EObject opmOrig){
		if (opmOrig == null){
			return null;
		}
		if (opmOrig instanceof EObjectDecorator){
			return (EObjectDecorator<?>)opmOrig;
		}	
		EObjectDecorator<?> wrapper = getDecorator(opmOrig);
		if (wrapper != null){ 
			return wrapper;
			}
		if (opmOrig instanceof OPMObjectProcessDiagram){
			return putDecorator(opmOrig, new OPMObjectProcessDiagramDecorator((OPMObjectProcessDiagram)opmOrig));
		}
		if (opmOrig instanceof OPMObject){
			return putDecorator(opmOrig, new OPMObjectDecorator((OPMObject)opmOrig, this));
		}
		if (opmOrig instanceof OPMProcess){
			return putDecorator(opmOrig, new OPMProcessDecorator((OPMProcess)opmOrig, this));
		}
		if (opmOrig instanceof OPMState){
			return putDecorator(opmOrig, new OPMStateDecorator((OPMState)opmOrig,this));
		}
		if (opmOrig instanceof OPMProceduralLink){
			return putDecorator(opmOrig, new OPMProceduralLinkDecorator((OPMProceduralLink)opmOrig, this));
		}
		if (opmOrig instanceof Label){
			return putDecorator(opmOrig, new LabelDecorator((Label)opmOrig, this));
		}
			
		return null;
	}
	
	private HashMap<KindAndSourceKey, OPMStructuralLinkAggregator> Map = new HashMap<>();
	
	public OPMStructuralLinkAggregator getOrCreateAggregator(OPMStructuralLink link,OPMContainer container){
		OPMStructuralLinkAggregator aggragetor = getAggregator(link);
		if (aggragetor != null || link.getSource()==null) return aggragetor;
		OPMStructuralLinkKind kind = OPMStructuralLinkToStructuralLinkKindConverter.INSTANCE.convert(link);
		aggragetor = new OPMStructuralLinkAggregator(link, this, link.getSource());
		Map.put(new KindAndSourceKey(kind,link.getSource()), aggragetor);
		aggragetor.setContainer(container);
		return aggragetor;
	}
	
	public OPMStructuralLinkAggregator getAggregator(OPMStructuralLink link){
		OPMStructuralLinkAggregator aggragetor =  getAggregator(OPMStructuralLinkToStructuralLinkKindConverter.INSTANCE.convert(link),link.getSource());
		if (aggragetor != null){
			aggragetor.addOPMStructuralLink(link);
		}
		return aggragetor;
	}
	
	public OPMStructuralLinkAggregator getAggregator(OPMStructuralLinkKind kind,OPMNode source){
		if (source == null) return null;
		return Map.get(new KindAndSourceKey(kind,source));
	}
	
	void onNumberOfOriginalsChangedInAggregator(OPMStructuralLinkAggregator aggregator){
		if (aggregator.originals.isEmpty()){
			Map.remove(new KindAndSourceKey(aggregator.kind,aggregator.source));
			// TODO: source connecting link?
		}
	}
	
	private class KindAndSourceKey{
		OPMStructuralLinkKind kind;
		OPMNode source;
		public KindAndSourceKey(OPMStructuralLinkKind kind,OPMNode source){
			this.kind = kind;
			this.source = source;
		}
		
		@Override
		public boolean equals(Object aThat){
			if (aThat == null) return false;
			if (!(aThat instanceof KindAndSourceKey)) return false;
			KindAndSourceKey other = (KindAndSourceKey)aThat;
			return (kind.equals(other.kind) && source.equals(other.source));
		}
		
		@Override public int hashCode() {
			return kind.hashCode() + source.hashCode();
		}
	}
	
	private HashSet<OPMSimpleLink> simpleLinks = new HashSet<>();

	public OPMSimpleLink getSimpleLink(OPMNode source, OPMNode target)
	{
		for (OPMSimpleLink link:simpleLinks){
			if (link.getSource() == source && link.getTarget() == target) return link;
		}
		
		return null;
	}
	
	public void putSimpleLink(OPMSimpleLink link){
		if (link != null){
			simpleLinks.add(link);
		}
	}

	void removeSimpleLink(OPMSimpleLink link){
		simpleLinks.remove(link);
	}
}
