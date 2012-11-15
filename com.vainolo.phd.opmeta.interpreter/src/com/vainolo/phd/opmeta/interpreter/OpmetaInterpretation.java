package com.vainolo.phd.opmeta.interpreter;

import com.vainolo.phd.opmeta.model.OPMetaModelDiagram;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;

public class OpmetaInterpretation {
	
	private OpmetaInterpretation(){}
	
	public static OpmetaInterpretation CreateInterpretation(OPMetaModelDiagram diagram){
		OpmetaInterpretation interpretation = new OpmetaInterpretation(); 
		OPMObjectProcessDiagram elementsDiagram = diagram.getElementsDiagram();
		// elementsDiagram.getNodes();
		
		
		return interpretation;
	}
}
