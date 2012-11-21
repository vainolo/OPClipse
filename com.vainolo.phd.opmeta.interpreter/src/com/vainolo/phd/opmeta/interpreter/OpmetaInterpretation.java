/* ****************************************************************************
 *	 OpmetaInterpretation.java
 *	@author Eyal Heinemann
 * 
 */
package com.vainolo.phd.opmeta.interpreter;

import com.vainolo.phd.opmeta.model.OPMetaModelDiagram;
import com.vainolo.phd.opm.model.OPMNode;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class OpmetaInterpretation {
	
	private OpmetaInterpretation(){
		elementTypes = new HashMap<String,ElementTypeDescriptor>();
	}
	
	public static OpmetaInterpretation CreateInterpretation(OPMetaModelDiagram diagram){
		OpmetaInterpretation interpretation = new OpmetaInterpretation(); 
		List<OPMNode> elementsDiagramNodes = diagram.getElementsDiagram().getNodes();
		List<OPMNode> linksDiagramNodes = diagram.getLinksDiagram().getNodes();
	 	
	 	ElementsInterpretationCreator.Create(elementsDiagramNodes, interpretation.elementTypes);
	 	
	 	LinksInterpretationCreator.Create(linksDiagramNodes, interpretation.linkTypes);
	 	
		return interpretation;
	}
		
	private HashMap<String,ElementTypeDescriptor> elementTypes;
	
	private List<TypeDescriptor> nodes;
	private List<TypeDescriptor> containers;
	private List<TypeDescriptor> links;

	public Collection<ElementTypeDescriptor> getElementTypes() {
		return elementTypes.values();
	}
	
	private HashMap<String,LinkTypeDescriptor> linkTypes;

	public Collection<LinkTypeDescriptor> getLinkTypes() {
		return linkTypes.values();
	}

}
