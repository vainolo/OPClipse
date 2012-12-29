//package com.vainolo.phd.opmeta.interpreter;
//
//import static org.junit.Assert.*;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Iterator;
//
//import org.junit.Test;
//
//import com.vainolo.phd.opm.model.OPMFactory;
//import com.vainolo.phd.opm.model.OPMNode;
//import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
//import com.vainolo.phd.opmeta.model.OPMetaModelDiagram;
//import com.vainolo.phd.opmeta.model.opmetaFactory;
//
//public class OpmetaInterpretationTester {
//	
//	@Test public void testSimpleCreateInterpretation(){
//		OPMetaModelDiagram systemDiagram=TesterUtils.createBasicMetaModelDiag();
//		
//		OpmetaInterpretation interpretation = OpmetaInterpretation.CreateInterpretation(systemDiagram);
//		Collection<TypeDescriptor> descriptors = interpretation.getContainers();
//		assertEquals(3,descriptors.size());
//		for (TypeDescriptor descriptor:descriptors){
//			switch(descriptor.getName()){
//				case "Container":
//					assertTrue(descriptor.isAbstract());
//					break;
//				case "Thing":
//				case "Diagram":
//					assertFalse(descriptor.isAbstract());
//					break;
//				default:
//					fail();
//			}
//		}
//					
//		descriptors = interpretation.getNodes();
//		assertEquals(3,descriptors.size());
//		for (TypeDescriptor descriptor:descriptors){
//			switch(descriptor.getName()){
//				case "Node":
//					assertTrue(descriptor.isAbstract());
//					System.out.println("Node");
//					for (Iterator<propertyDescriptor> it = descriptor.getProperties().iterator(); it.hasNext(); )
//						System.out.println(it.next().getPropertyType());
//					break;
//				case "State":
//					break;
//				case "Thing":
//					assertFalse(descriptor.isAbstract());
//					System.out.println("Thing");
//					for (Iterator<propertyDescriptor> it = descriptor.getProperties().iterator(); it.hasNext(); )
//						System.out.println(it.next().getPropertyType());	
//					break;
//				default:
//					fail();
//			}
//		}
//
//		TypeDescriptor type1 = interpretation.getContainerDescriptor("Thing");
//		TypeDescriptor type2 = interpretation.getNodeDescriptor("Thing");
//		assertSame(type1,type2);
//		
//		descriptors = interpretation.getLinks();
//		assertEquals(2,descriptors.size());
//		for (TypeDescriptor descriptor:descriptors){
//			switch(descriptor.getName()){
//				case "Link":
//					assertTrue(descriptor.isAbstract());
//					break;
//				case "LinkSon":
//					assertFalse(descriptor.isAbstract());
//					break;
//				default:
//					fail();
//			}
//		}
//
//	}
//	
//	@Test public void testDiamondCreateInterpretation(){
//		OPMetaModelDiagram basicDiag=opmetaFactory.eINSTANCE.createOPMetaModelDiagram();
//		basicDiag.setElementsDiagram(OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
//		basicDiag.setLinksDiagram(OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
//		OPMObjectProcessDiagram opmDiagram = basicDiag.getElementsDiagram();
//		OPMNode node = TesterUtils.createObject("Node",opmDiagram); 
//		TesterUtils.createObject("Container",opmDiagram);
//		OPMNode nodeSon1 = TesterUtils.createObject("NodeSon1",opmDiagram); 
//		OPMNode nodeSon2 = TesterUtils.createObject("NodeSon2",opmDiagram); 
//		OPMNode nodeGrandSon = TesterUtils.createObject("NodeGrandSon",opmDiagram);
//		
//		TesterUtils.createGeneralizationLink(node, nodeSon1);
//		TesterUtils.createGeneralizationLink(node, nodeSon2);
//		TesterUtils.createGeneralizationLink(nodeSon1, nodeGrandSon);
//		TesterUtils.createGeneralizationLink(nodeSon2, nodeGrandSon);
//	
//		try{
//			OpmetaInterpretation.CreateInterpretation(basicDiag);
//			fail("diamonds suppose to throw exception");
//		}catch(RuntimeException re) {}
//	}
//	
//	@Test public void testCreateThingAndPassPropertiesInterpretation(){
//		OPMetaModelDiagram basicDiag=opmetaFactory.eINSTANCE.createOPMetaModelDiagram();
//		basicDiag.setElementsDiagram(OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
//		basicDiag.setLinksDiagram(OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
//		OPMObjectProcessDiagram opmDiagram = basicDiag.getElementsDiagram();
//		
//		// structure
//		OPMNode node = TesterUtils.createObject("Node",opmDiagram); 
//		OPMNode contianer = TesterUtils.createObject("Container",opmDiagram);
//		OPMNode thing = TesterUtils.createObject("Thing",opmDiagram);
//		OPMNode thing1 = TesterUtils.createObject("Thing1",opmDiagram);
//		
//		TesterUtils.createGeneralizationLink(node, thing);
//		TesterUtils.createGeneralizationLink(contianer, thing);
//		TesterUtils.createGeneralizationLink(thing, thing1);
//		
//		OPMObjectProcessDiagram linkDiagram = basicDiag.getLinksDiagram();
//		TesterUtils.createObject("Link",linkDiagram);
//		
//		// properties
//		OPMNode prop1 = TesterUtils.createObject("Prop1:int",opmDiagram);
//		OPMNode prop2 = TesterUtils.createObject("Prop2:String",opmDiagram);
//		
//		TesterUtils.createAggregationLink(contianer,prop1);
//		TesterUtils.createAggregationLink(contianer,prop2);
//		
//		OpmetaInterpretation interpretation = OpmetaInterpretation.CreateInterpretation(basicDiag);
//		
//		TypeDescriptor testable = interpretation.getNodeDescriptor("Thing");
//		testCreateThingAndPassPropertiesInterpretationTestProperties(testable);
//		testable = interpretation.getNodeDescriptor("Thing1");
//		testCreateThingAndPassPropertiesInterpretationTestProperties(testable);
//		
//	}
//	
//	private void testCreateThingAndPassPropertiesInterpretationTestProperties(TypeDescriptor testable){
//		Iterable<propertyDescriptor> properties = testable.getProperties();
//		ArrayList<propertyDescriptor> props = new ArrayList<propertyDescriptor>();  
//		for (propertyDescriptor prop:properties){
//			props.add(prop);
//			if (prop.propertyName.equals("Prop1")){
//				assertEquals("int", prop.propertyType);
//			}else if (prop.propertyName.equals("Prop2")){
//				assertEquals("String", prop.propertyType);
//			}else fail("Unknown property");
//		}
//		assertEquals(2, props.size());
//	}
//	
//}
