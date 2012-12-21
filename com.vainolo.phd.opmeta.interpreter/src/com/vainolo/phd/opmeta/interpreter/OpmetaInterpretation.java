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
		interpretation.containers = creator.CreateGraph(elementsDiagramNodes, "container",interpretation.nodes);
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

	public boolean isLink(String typeName){
		return links.containsKey(typeName);
	}
	
	public TypeDescriptor getNodeDescriptor(String name){
		if (!nodes.containsKey(name)) return null;
		return nodes.get(name);
	}
	
	public TypeDescriptor getLinkDescriptor(String name){
		if (!links.containsKey(name)) return null;
		return links.get(name);
	}
	
	public TypeDescriptor getContainerDescriptor(String name){
		if (!containers.containsKey(name)) return null;
		return containers.get(name);
	}
	
	private HashMap<String,TypeDescriptor> nodes;
	private HashMap<String,TypeDescriptor> containers;
	private HashMap<String,TypeDescriptor> links;

	public TypeDescriptor getDescriptorByName(String typeName){
		if (nodes.containsKey(typeName))
			return nodes.get(typeName);
		else if (containers.containsKey(typeName))
			return containers.get(typeName);
		else if (links.containsKey(typeName))
			return links.get(typeName);
		return null;
	}
}
