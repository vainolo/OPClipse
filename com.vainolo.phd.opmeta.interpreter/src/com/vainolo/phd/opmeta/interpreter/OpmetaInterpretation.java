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
import java.util.List;

public class OpmetaInterpretation {
	
	public static OpmetaInterpretation CreateInterpretation(OPMetaModelDiagram diagram){
		OpmetaInterpretation interpretation = new OpmetaInterpretation(); 
		List<OPMNode> elementsDiagramNodes = diagram.getElementsDiagram().getNodes();
		List<OPMNode> linksDiagramNodes = diagram.getLinksDiagram().getNodes();
	 	
		OpmetaInterpretationCreator creator = new OpmetaInterpretationCreator();
		interpretation.nodes = creator.CreateGraph(elementsDiagramNodes, "node");
		interpretation.containers = creator.CreateGraph(elementsDiagramNodes, "container");
		creator.clearCache();
		interpretation.links = creator.CreateGraph(linksDiagramNodes, "link");
	 	
		return interpretation;
	}
	
	private List<TypeDescriptor> nodes;
	public Collection<TypeDescriptor> getNodes() {
		return Collections.unmodifiableCollection(nodes);
	}
	public Collection<TypeDescriptor> getContainers() {
		return Collections.unmodifiableCollection(containers);
	}
	public Collection<TypeDescriptor> getLinks() {
		return Collections.unmodifiableCollection(links);
	}

	private List<TypeDescriptor> containers;
	private List<TypeDescriptor> links;

}
