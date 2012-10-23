package com.vainolo.phd.opm.utilities.decoratorationLayer;

import java.util.HashMap;

import com.vainolo.phd.opm.model.OPMContainer;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMStructuralLink;

enum OPMStructuralLinkAggregatorPool {
	INSTANCE;
	
	private HashMap<KindAndSourceKey, OPMStructuralLinkAggregator> Map = new HashMap<>();
	
	public OPMStructuralLinkAggregator getOrCreateAggregator(OPMStructuralLink link,OPMContainer container){
		OPMStructuralLinkAggregator aggragetor = getAggregator(link);
		if (aggragetor != null || link.getSource()==null) return aggragetor;
		OPMStructuralLinkKind kind = OPMStructuralLinkToStructuralLinkKindConverter.INSTANCE.Convert(link);
		aggragetor = new OPMStructuralLinkAggregator(link);
		Map.put(new KindAndSourceKey(kind,link.getSource()), aggragetor);
		return aggragetor;
	}
	
	public OPMStructuralLinkAggregator getAggregator(OPMStructuralLink link){
		OPMStructuralLinkAggregator aggragetor =  getAggregator(OPMStructuralLinkToStructuralLinkKindConverter.INSTANCE.Convert(link),link.getSource());
		if (aggragetor != null){
			aggragetor.AddOPMStructuralLink(link);
		}
		return aggragetor;
	}
	
	public OPMStructuralLinkAggregator getAggregator(OPMStructuralLinkKind kind,OPMNode source){
		if (source == null) return null;
		return Map.get(new KindAndSourceKey(kind,source));
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
}
