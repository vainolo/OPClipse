/* ****************************************************************************
 *	 OpmetaInterpretation.java
 *	@author Eyal Heinemann
 * 
 */
package com.vainolo.phd.opmeta.interpreter;

import com.vainolo.phd.opmeta.model.OPMetaModelDiagram;
import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.utilities.analysis.OPDAnalysis;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.notify.Notifier;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class OpmetaInterpretation {
	
	private OpmetaInterpretation(){
		types = new HashMap<String,TypeDescriptor>();
	}
	
	public static OpmetaInterpretation CreateInterpretation(OPMetaModelDiagram diagram){
		OpmetaInterpretation interpretation = new OpmetaInterpretation(); 
		OPMObjectProcessDiagram elementsDiagram = diagram.getElementsDiagram();
	 	List<OPMNode> nodes = elementsDiagram.getNodes();
	 	
	 	Collection<OPMNode> nodeNodes = OPDAnalysis.findNamedNodes(nodes,"node");
	 	for (OPMNode nodeNode:nodeNodes){
	 		List<TypeDescriptor> nodesDescriptors = interpretation.getInheritedTypes(nodeNode);
	 		for (TypeDescriptor nodeDesc:nodesDescriptors) nodeDesc.setIsNode(true);
	 	}
		
	 	Collection<OPMNode> containerNodes = OPDAnalysis.findNamedNodes(nodes,"container");
	 	for (OPMNode containerNode:containerNodes){
	 		List<TypeDescriptor> containersDescriptors = interpretation.getInheritedTypes(containerNode);
	 		for (TypeDescriptor containerDesc:containersDescriptors) containerDesc.setIsContainer(true);
	 	}
	 	// OHHH shit!!!
	 	// TODO: find other roots?
	 	
		return interpretation;
	}
	
	private List<TypeDescriptor> getInheritedTypes(OPMNode rootNode){
		if (rootNode == null) return null;
		List<TypeDescriptor> retList = new LinkedList<TypeDescriptor>();
		TypeDescriptor descriptor = getTypeDescriptorFromNode(rootNode);
		retList.add(descriptor);
		Collection<OPMLink> generalizeLinks = OPDAnalysis.findOutgoingLinks(rootNode,OPMPackage.eINSTANCE.getOPMGeneralizationLink());
		if (generalizeLinks.isEmpty()) descriptor.setLeaf(true);
		else
			for (OPMLink generalizeLink: generalizeLinks){
				OPMNode generalizeNode = generalizeLink.getTarget();
				List<TypeDescriptor> generalizedTypes =  getInheritedTypes(generalizeNode);
				if (generalizedTypes != null) retList.addAll(generalizedTypes);
			}
		return retList;
	}
	
	private TypeDescriptor getTypeDescriptorFromNode(OPMNode node){
		String name = node.getName();
		for (Map.Entry<String,TypeDescriptor> type:types.entrySet())
			if (type.getKey().equalsIgnoreCase(name)) return type.getValue();
		TypeDescriptor type = new TypeDescriptor();
		type.setName(name);
		types.put(name,type);
		return type;
	}
	
//	private List<TypeDescriptor> getUnchartedConnectedDescriptions(List<OPMNode> allNodes){
//		ArrayList<OPMNode> existing = new ArrayList<>();
//		for (OPMNode node:allNodes){
//			if(types.containsKey(node.getName())){
//				existing.add(node);
//			}
//		}
//		return Collections.emptyList();
//	}
	
	private HashMap<String,TypeDescriptor> types;

	public Collection<TypeDescriptor> getTypes() {
		return types.values();
	}
}
