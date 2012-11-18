package com.vainolo.phd.opmeta.interpreter;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.utilities.analysis.OPDAnalysis;

class LinksInterpretationCreator extends OpmetaInterpretationCreatorBase<LinkTypeDescriptor>{

	private LinksInterpretationCreator() {}
	
	private HashMap<String, LinkTypeDescriptor> types;
	
	public static void Create(List<OPMNode> nodes, HashMap<String, LinkTypeDescriptor> types){
		LinksInterpretationCreator creator = new LinksInterpretationCreator();
		creator.types = types;
		
		Collection<OPMNode> nodeNodes = OPDAnalysis.findNamedNodes(nodes,"link");
	 	for (OPMNode nodeNode:nodeNodes){
	 		List<LinkTypeDescriptor> linkDescriptors = creator.getInheritedTypes(nodeNode);
	 		//for (LinkTypeDescriptor linkDesc:linkDescriptors) linkDesc.setIsNode(true);
	 	}
	 	
	 	creator.createInheritanceTreeIncludingUnchartedConnectedDescriptions(nodes);
	}
	
	@Override
	protected LinkTypeDescriptor getTypeDescriptorFromNode(OPMNode node) {
		String name = node.getName();
		if (types.containsKey(name)){
			LinkTypeDescriptor descriptor = types.get(name);
			if (descriptor != null) return descriptor;
		}
		LinkTypeDescriptor type = new LinkTypeDescriptor(name);
		types.put(name,type);
		return type;
	}

	@Override
	protected HashMap<String, LinkTypeDescriptor> getTypes() {
		return types;
	}

}
