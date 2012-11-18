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
		Collection<ElementTypeDescriptor> descriptors = interpretation.getElementTypes();
		assertEquals(5,descriptors.size());
		for (ElementTypeDescriptor descriptor:descriptors){
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
	
	@Test public void testInheritanceCreationNode(){
		testInheritanceCreation("Node");
	}
	
	@Test public void testInheritanceCreationContainer(){
		testInheritanceCreation("Container");
	}
	
	private void testInheritanceCreation(final String mainName){
		OPMetaModelDiagram systemDiagram=opmetaFactory.eINSTANCE.createOPMetaModelDiagram();
		OPMObjectProcessDiagram opmDiagram = systemDiagram.getElementsDiagram();
		OPMNode node = OPMFactory.eINSTANCE.createOPMObject();
		node.setName(mainName);
		opmDiagram.getNodes().add(node);
		OPMNode otherParent = OPMFactory.eINSTANCE.createOPMObject();
		otherParent.setName("OtherParent");
		opmDiagram.getNodes().add(otherParent);
		OPMNode child = OPMFactory.eINSTANCE.createOPMObject();
		child.setName("Child");
		opmDiagram.getNodes().add(child);
		OPMNode otherChild = OPMFactory.eINSTANCE.createOPMObject();
		otherChild.setName("OtherChild");
		opmDiagram.getNodes().add(otherChild);
		
		
		OPMLink link = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
		link.setSource(node);
		link.setTarget(child);
		link = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
		link.setSource(otherParent);
		link.setTarget(child);
		link = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
		link.setSource(otherParent);
		link.setTarget(otherChild);
		
		OpmetaInterpretation interpretation = OpmetaInterpretation.CreateInterpretation(systemDiagram);
		Collection<ElementTypeDescriptor> descriptors = interpretation.getElementTypes();
		ElementTypeDescriptor nodeDescriptor = getDescriptor(descriptors,mainName);
		assertEquals(0,count(nodeDescriptor.getParents()));
		ElementTypeDescriptor otherDescriptor = getDescriptor(descriptors,"OtherParent");
		assertEquals(0,count(otherDescriptor.getParents()));
		ElementTypeDescriptor childDescriptor = getDescriptor(descriptors,"Child");
		assertEquals(2,count(childDescriptor.getParents()));
		for(ElementTypeDescriptor parent:childDescriptor.getParents()){
			if (parent.getName().equals(mainName) || parent.getName().equals("OtherParent")) continue;
			fail();
		}
		ElementTypeDescriptor otherChildDescriptor = getDescriptor(descriptors,"OtherChild");
		assertEquals(1,count(otherChildDescriptor.getParents()));
		for(ElementTypeDescriptor parent:otherChildDescriptor.getParents()){
			switch(parent.getName()){
				case "OtherParent":
					break;
				default: fail();
			}
		}
	}
	
	private static ElementTypeDescriptor getDescriptor(Collection<ElementTypeDescriptor> descriptors, String name){
		for (ElementTypeDescriptor descriptor:descriptors){
			if (descriptor.getName().equalsIgnoreCase(name)) return descriptor;
		}
		return null;
	}
	
	private int count(@SuppressWarnings("rawtypes") Iterable  itr){
		if (itr == null) return 0;
		int count = 0;
		for (@SuppressWarnings("unused") Object it:itr) count++;
		return count;
	}
}
