/* ****************************************************************************
 *	 OpmetaInterpretation.java
 *	@author Eyal Heinemann
 * 
 */
package com.vainolo.phd.opmeta.interpreter;

import com.vainolo.phd.opmeta.model.OPMetaModelDiagram;
import com.vainolo.phd.opm.model.OPMNode;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class OpmetaInterpretation {
	
	public static OpmetaInterpretation CreateInterpretation(OPMetaModelDiagram diagram){
		OpmetaInterpretation interpretation = new OpmetaInterpretation(); 
		List<OPMNode> elementsDiagramNodes = diagram.getElementsDiagram().getNodes();
		List<OPMNode> linksDiagramNodes = diagram.getLinksDiagram().getNodes();
	 	
		OpmetaInterpretationCreator creator = new OpmetaInterpretationCreator();
		interpretation.nodes = creator.CreateGraph(elementsDiagramNodes, "node");
		interpretation.containers = creator.CreateGraph(elementsDiagramNodes, "container");
		//creator.clearCache();
		interpretation.links = creator.CreateGraph(linksDiagramNodes, "link");
	 	
		return interpretation;
	}
	
	
	public Collection<TypeDescriptor> getNodes() {
		return Collections.unmodifiableCollection(nodes.values());
	}
	
	public boolean isNode(String typeName){
		return nodes.containsKey(typeName);
	}
	
	public Collection<TypeDescriptor> getContainers() {
		return Collections.unmodifiableCollection(containers.values());
	}
	
	public boolean isContainer(String typeName){
		return containers.containsKey(typeName);
	}
	
	public Collection<TypeDescriptor> getLinks() {
		return Collections.unmodifiableCollection(links.values());
	}

	private HashMap<String,TypeDescriptor> nodes;
	private HashMap<String,TypeDescriptor> containers;
	private HashMap<String,TypeDescriptor> links;

}
