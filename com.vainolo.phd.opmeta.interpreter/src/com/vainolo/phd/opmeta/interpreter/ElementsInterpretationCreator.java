package com.vainolo.phd.opmeta.interpreter;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.utilities.analysis.OPDAnalysis;

class ElementsInterpretationCreator extends OpmetaInterpretationCreatorBase<ElementTypeDescriptor>
{
	HashMap<String, ElementTypeDescriptor> types;
	
	public static void Create(List<OPMNode> nodes, HashMap<String, ElementTypeDescriptor> types)
	{
		ElementsInterpretationCreator creator = new ElementsInterpretationCreator();
		creator.types = types;
		
		Collection<OPMNode> nodeNodes = OPDAnalysis.findNamedNodes(nodes,"node");
	 	for (OPMNode nodeNode:nodeNodes){
	 		List<ElementTypeDescriptor> nodesDescriptors = creator.getInheritedTypes(nodeNode);
	 		for (ElementTypeDescriptor nodeDesc:nodesDescriptors) nodeDesc.setIsNode(true);
	 	}
		
	 	Collection<OPMNode> containerNodes = OPDAnalysis.findNamedNodes(nodes,"container");
	 	for (OPMNode containerNode:containerNodes){
	 		List<ElementTypeDescriptor> containersDescriptors = creator.getInheritedTypes(containerNode);
	 		for (ElementTypeDescriptor containerDesc:containersDescriptors) containerDesc.setIsContainer(true);
	 	}
	 	
	 	creator.createInheritanceTreeIncludingUnchartedConnectedDescriptions(nodes);
	}
	
	private ElementsInterpretationCreator(){}
	
	@Override
	protected ElementTypeDescriptor getTypeDescriptorFromNode(OPMNode node) {
		String name = node.getName();
		if (types.containsKey(name)){
			ElementTypeDescriptor descriptor = types.get(name);
			if (descriptor != null) return descriptor;
		}
		ElementTypeDescriptor type = new ElementTypeDescriptor(name);
		types.put(name,type);
		return type;
	}

	@Override
	protected HashMap<String, ElementTypeDescriptor> getTypes() {
		return types;
	}	
}

