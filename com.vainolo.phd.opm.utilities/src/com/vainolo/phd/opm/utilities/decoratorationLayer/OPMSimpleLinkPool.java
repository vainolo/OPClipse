package com.vainolo.phd.opm.utilities.decoratorationLayer;

import java.util.ArrayList;

import com.vainolo.phd.opm.model.OPMNode;

enum OPMSimpleLinkPool {
INSTANCE;

	private ArrayList<OPMSimpleLink> simpleLinks = new ArrayList<>();

	public OPMSimpleLink getSimpleLink(OPMNode source, OPMNode target)
	{
		for (OPMSimpleLink link:simpleLinks){
			if (link.getSource() == source && link.getTarget() == target) return link;
		}
		
		return null;
	}
	
	public void put (OPMSimpleLink link){
		if (link != null){
			simpleLinks.add(link);
		}
	}
}
