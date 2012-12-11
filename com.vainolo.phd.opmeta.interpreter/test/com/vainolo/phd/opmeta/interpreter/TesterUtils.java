package com.vainolo.phd.opmeta.interpreter;

import com.vainolo.phd.opm.model.OPMAggregationLink;
import com.vainolo.phd.opm.model.OPMFactory;
import com.vainolo.phd.opm.model.OPMGeneralizationLink;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMObject;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
import com.vainolo.phd.opmeta.model.OPMetaModelDiagram;
import com.vainolo.phd.opmeta.model.opmetaFactory;

public class TesterUtils {

	public static OPMObject createObject(String name, OPMObjectProcessDiagram diagram){
		OPMObject nodeObject = OPMFactory.eINSTANCE.createOPMObject();
		nodeObject.setName(name);
		diagram.getNodes().add(nodeObject);
		return nodeObject;
	}
	
	public static OPMGeneralizationLink createGeneralizationLink(OPMNode parent, OPMNode child){
		OPMGeneralizationLink link = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
		link.setSource(parent);
		link.setTarget(child);
		return link;
	}
	
	
	// properties test
	
	public static OPMAggregationLink createAggregationLink(OPMNode parent, OPMNode child){
		OPMAggregationLink link = OPMFactory.eINSTANCE.createOPMAggregationLink();
		link.setSource(parent);
		link.setTarget(child);
		return link;
	}
	
	
	
	public static OPMetaModelDiagram createBasicMetaModelDiag(){
		OPMetaModelDiagram basicDiag=opmetaFactory.eINSTANCE.createOPMetaModelDiagram();
		basicDiag.setElementsDiagram(OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
		basicDiag.setLinksDiagram(OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
		OPMObjectProcessDiagram opmDiagram = basicDiag.getElementsDiagram();
		OPMNode node = TesterUtils.createObject("Node",opmDiagram); 
		OPMNode container = TesterUtils.createObject("Container",opmDiagram);
		OPMNode thingNode = TesterUtils.createObject("Thing",opmDiagram);
		OPMNode diagNode = TesterUtils.createObject("Diagram",opmDiagram);
		OPMNode nodeInheritNode = TesterUtils.createObject("State",opmDiagram);
		
		//kobi&alex
		OPMNode prop1 = TesterUtils.createObject("Prop1:int",opmDiagram);
		OPMNode prop2 = TesterUtils.createObject("Prop2:String",opmDiagram);
		OPMNode prop3 = TesterUtils.createObject("Prop3:int",opmDiagram);
		OPMNode prop4 = TesterUtils.createObject("Prop4:String",opmDiagram);
		OPMNode prop5 = TesterUtils.createObject("Prop1:String",opmDiagram);
		
		OPMObjectProcessDiagram linkDiagram = basicDiag.getLinksDiagram();
		OPMNode linkNode = TesterUtils.createObject("Link",linkDiagram);
		OPMNode linkSonNode = TesterUtils.createObject("LinkSon",linkDiagram);
		
		TesterUtils.createGeneralizationLink(node, nodeInheritNode);
		TesterUtils.createGeneralizationLink(node, thingNode);
		TesterUtils.createGeneralizationLink(container, thingNode);
		TesterUtils.createGeneralizationLink(container, diagNode);
		TesterUtils.createGeneralizationLink(linkNode, linkSonNode);
		
		
		//alex&kobi
		TesterUtils.createAggregationLink(node,prop1);
		TesterUtils.createAggregationLink(node,prop2);
		TesterUtils.createAggregationLink(thingNode,prop5);
		TesterUtils.createAggregationLink(thingNode,prop3);
		TesterUtils.createAggregationLink(thingNode,prop4);

		return basicDiag;
	}
}
