package com.vainolo.phd.opmeta.interpreter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.utilities.analysis.OPDAnalysis;

class ElementsInterpretationCreator extends OpmetaInterpretationCreatorBase<ElementTypeDescriptor>
{
	HashMap<String, ElementTypeDescriptor> types;
	
	public static void Create(List<OPMNode> nodes, HashMap<String, ElementTypeDescriptor> types)
	{
		ArrayList<String> mainNames = new ArrayList<String>();
		mainNames.add("node");
		mainNames.add("container");
		
		Graph graph = Graph.CreateGraph(nodes, mainNames);
		LinkedList<GraphNode> preprocessedNodes = new LinkedList<>(graph.roots);
		while (!preprocessedNodes.isEmpty()){
			boolean foundAllParents = true;
			GraphNode current= preprocessedNodes.remove();
			for (GraphNode currParent:current.parents){
				if (!types.containsKey(currParent.getName())){
					foundAllParents = false;
					break;
				}
			}
			if (!foundAllParents){
				preprocessedNodes.add(current);
				continue;
			}
			ElementTypeDescriptor descriptor = new ElementTypeDescriptor(current.getName());
			types.put(descriptor.getName(),descriptor);
			for (GraphNode currParent:current.parents){
				descriptor.addParent(types.get(currParent.getName()));
			}
			for (GraphNode currChild:current.children){
				if (!preprocessedNodes.contains(currChild)) preprocessedNodes.add(currChild);
			}
		}
		
		// Start of old code
//		ElementsInterpretationCreator creator = new ElementsInterpretationCreator();
//		creator.types = types;
//		
//		Collection<OPMNode> nodeNodes = OPDAnalysis.findNamedNodes(nodes,"node");
//	 	for (OPMNode nodeNode:nodeNodes){
//	 		List<ElementTypeDescriptor> nodesDescriptors = creator.getInheritedTypes(nodeNode);
//	 		for (ElementTypeDescriptor nodeDesc:nodesDescriptors) nodeDesc.setIsNode(true);
//	 	}
//		
//	 	Collection<OPMNode> containerNodes = OPDAnalysis.findNamedNodes(nodes,"container");
//	 	for (OPMNode containerNode:containerNodes){
//	 		List<ElementTypeDescriptor> containersDescriptors = creator.getInheritedTypes(containerNode);
//	 		for (ElementTypeDescriptor containerDesc:containersDescriptors) containerDesc.setIsContainer(true);
//	 	}
//	 	
//	 	creator.createInheritanceTreeIncludingUnchartedConnectedDescriptions(nodes);
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

