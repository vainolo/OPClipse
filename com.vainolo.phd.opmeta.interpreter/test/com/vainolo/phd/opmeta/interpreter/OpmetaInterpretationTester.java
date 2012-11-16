package com.vainolo.phd.opmeta.interpreter;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;

import com.vainolo.phd.opm.model.OPMFactory;
import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
import com.vainolo.phd.opmeta.model.OPMetaModelDiagram;
import com.vainolo.phd.opmeta.model.opmetaFactory;

public class OpmetaInterpretationTester {
	
	@Test public void testSimpleCreateInterpretation(){
		OPMetaModelDiagram systemDiagram=opmetaFactory.eINSTANCE.createOPMetaModelDiagram();
		OPMObjectProcessDiagram opmDiagram = systemDiagram.getElementsDiagram();
		OPMNode node = OPMFactory.eINSTANCE.createOPMObject();
		node.setName("Node");
		opmDiagram.getNodes().add(node);
		OPMNode container = OPMFactory.eINSTANCE.createOPMObject();
		container.setName("Container");
		opmDiagram.getNodes().add(container);
		OPMNode thingNode = OPMFactory.eINSTANCE.createOPMObject();
		thingNode.setName("Thing");
		opmDiagram.getNodes().add(thingNode);
		OPMNode diagNode = OPMFactory.eINSTANCE.createOPMObject();
		diagNode.setName("Diagram");
		opmDiagram.getNodes().add(diagNode);
		OPMNode nodeInheritNode = OPMFactory.eINSTANCE.createOPMObject();
		nodeInheritNode.setName("NodeSon");
		opmDiagram.getNodes().add(nodeInheritNode);
		
		OPMLink link = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
		link.setSource(node);
		link.setTarget(nodeInheritNode);
		link = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
		link.setSource(node);
		link.setTarget(thingNode);
		link = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
		link.setSource(container);
		link.setTarget(thingNode);
		link = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
		link.setSource(container);
		link.setTarget(diagNode);
		
		OpmetaInterpretation interpretation = OpmetaInterpretation.CreateInterpretation(systemDiagram);
		Collection<TypeDescriptor> descriptors = interpretation.getTypes();
		assertEquals(5,descriptors.size());
		for (TypeDescriptor descriptor:descriptors){
			switch(descriptor.getName()){
				case "Node":
					assertTrue(descriptor.isNode());
					assertFalse(descriptor.isContainer());
					assertFalse(descriptor.isLeaf());
					break;
				case "Container":
					assertFalse(descriptor.isNode());
					assertTrue(descriptor.isContainer());
					assertFalse(descriptor.isLeaf());
					break;
				case "Thing":
					assertTrue(descriptor.isNode());
					assertTrue(descriptor.isContainer());
					assertTrue(descriptor.isLeaf());
					break;
				case "Diagram":
					assertFalse(descriptor.isNode());
					assertTrue(descriptor.isContainer());
					assertTrue(descriptor.isLeaf());
					break;
				case "NodeSon":
					assertTrue(descriptor.isNode());
					assertFalse(descriptor.isContainer());
					assertTrue(descriptor.isLeaf());
					break;
				default:
					fail();
			}
		}
	}
	
}
