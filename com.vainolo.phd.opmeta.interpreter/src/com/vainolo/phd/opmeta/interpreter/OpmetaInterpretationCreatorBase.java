package com.vainolo.phd.opmeta.interpreter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.utilities.analysis.OPDAnalysis;

public abstract class OpmetaInterpretationCreatorBase<TDesc extends TypeDescriptor<TDesc>> {

	protected List<TDesc> getInheritedTypes(OPMNode rootNode){
		if (rootNode == null) return null;
		List<TDesc> retList = new LinkedList<>();
		TDesc descriptor = getTypeDescriptorFromNode(rootNode);
		retList.add(descriptor);
		Collection<OPMLink> generalizeLinks = OPDAnalysis.findOutgoingLinks(rootNode,OPMPackage.eINSTANCE.getOPMGeneralizationLink());
		if (generalizeLinks.isEmpty()) descriptor.setLeaf(true);
		else
			for (OPMLink generalizeLink: generalizeLinks){
				OPMNode generalizeNode = generalizeLink.getTarget();
				List<TDesc> generalizedTypes =  getInheritedTypes(generalizeNode);
				if (generalizedTypes != null) retList.addAll(generalizedTypes);
			}
		return retList;
	}
	
	protected abstract TDesc getTypeDescriptorFromNode(OPMNode node);
	
	protected abstract HashMap<String,TDesc> getTypes();
	
	protected void createInheritanceTreeIncludingUnchartedConnectedDescriptions(List<OPMNode> allNodes){
		// create first initial existing types list
		LinkedBlockingQueue<OPMNode> existings = new LinkedBlockingQueue<>();
		for (OPMNode node:allNodes){
			if(getTypes().containsKey(node.getName())){
				existings.add(node);
			}
		}
		ArrayList<OPMNode> passed = new ArrayList<OPMNode>();
		// process all existing types
		while (!existings.isEmpty()){
			OPMNode existing=existings.poll();
			if (existing == null) continue;
			TDesc descriptor = getTypes().get(existing.getName());
			// get type parents
			Collection<OPMLink> parentsLinks = OPDAnalysis.findIncomingLinks(existing, OPMPackage.eINSTANCE.getOPMGeneralizationLink());
			for (OPMLink parentsLink:parentsLinks){
				OPMNode parentNode = parentsLink.getSource();
				if ((!passed.contains(parentNode)) && (!existings.contains(parentNode))) existings.add(parentNode);
				// add to list if new
				TDesc parentDescriptor = getTypeDescriptorFromNode(parentNode);
				descriptor.addParent(parentDescriptor);
			}
			// get type children - add to list if new
			Collection<OPMLink> childrenLinks = OPDAnalysis.findOutgoingLinks(existing, OPMPackage.eINSTANCE.getOPMGeneralizationLink());
			for (OPMLink childLink:childrenLinks){
				OPMNode childNode = childLink.getTarget();
				if ((!passed.contains(childNode)) && (!existings.contains(childNode))){
					existings.add(childNode);
					getTypeDescriptorFromNode(childNode);
				}
			}
			passed.add(existing);
		}
	}

}
