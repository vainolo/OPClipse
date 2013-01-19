package com.vainolo.phd.opmeta.interpreter;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Test;

import com.vainolo.phd.opm.model.OPMFactory;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opmeta.model.OPMetaModelDiagram;
import com.vainolo.phd.opmeta.model.opmetaFactory;
import com.vainolo.phd.opmeta.model.opmetaPackage;
import com.vainolo.phd.opmodel.model.OPmetaDefinition;
import com.vainolo.phd.opmodel.model.OPmodelHolder;
import com.vainolo.phd.opmodel.model.PropertyDescriptor;
import com.vainolo.phd.opmodel.model.TypeDescriptor;
import com.vainolo.phd.opmodel.model.opmodelFactory;
import com.vainolo.phd.opmodel.model.opmodelPackage;
import com.vainolo.phd.opmodel.model.propertyType;

public class OpmetaInterpreterTester {
	
//	@Test 
	public void testSimpleFileCreateInterpretation(){
		OPMetaModelDiagram systemDiagram=TesterUtils.createBasicMetaModelDiag();
		
		OPmodelHolder opmodelHolder = OpmetaInterpreter.CreateOPmodelHolder(systemDiagram);
		opmodelHolder.setContainer(opmodelFactory.eINSTANCE.createContainerInstance());
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
	    .put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(OPMPackage.eNS_URI,OPMPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(opmetaPackage.eNS_URI,opmetaPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(opmodelPackage.eNS_URI,opmodelPackage.eINSTANCE);
		Resource resource = resourceSet.createResource(URI.createFileURI("c:\\temp\\test4.opmodel"));
		
		resource.getContents().add(opmodelHolder);
		
		// Save the contents of the resource to the file system.
		//
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put("ENCODING", "UTF-8");
		try {
			resource.save(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test public void testSimpleCreateInterpretation(){
		OPMetaModelDiagram systemDiagram=TesterUtils.createBasicMetaModelDiag();
		
		OPmodelHolder opmodelHolder = OpmetaInterpreter.CreateOPmodelHolder(systemDiagram);
		assertEquals(13, opmodelHolder.getNextId());
		assertEquals(null, opmodelHolder.getContainer());
		OPmetaDefinition interpretation = opmodelHolder.getMetaDefinition();
		
		Collection<TypeDescriptor> descriptors = interpretation.getContainers();
		assertEquals(3,descriptors.size());
		for (TypeDescriptor descriptor:descriptors){
			switch(descriptor.getName()){
				case "Container":
					assertTrue(descriptor.isAbstract());
					break;
				case "Thing":
				case "Diagram":
					assertFalse(descriptor.isAbstract());
					break;
				default:
					fail();
			}
		}
					
		descriptors = interpretation.getNodes();
		assertEquals(3,descriptors.size());
		for (TypeDescriptor descriptor:descriptors){
			switch(descriptor.getName()){
				case "Node":
					assertTrue(descriptor.isAbstract());
					break;
				case "State":
					break;
				case "Thing":
					assertFalse(descriptor.isAbstract());
					break;
				default:
					fail();
			}
		}
		TypeDescriptor curr= getDescriptor(descriptors, "Node");
		assertEquals(2, curr.getProperties().size());
		assertTrue(((curr.getProperties().get(0).getType() == propertyType.BOOLEAN) &&
				(curr.getProperties().get(1).getType() == propertyType.FLOAT)) ||
				((curr.getProperties().get(0).getType() == propertyType.FLOAT) &&
						(curr.getProperties().get(1).getType() == propertyType.BOOLEAN)));

		TypeDescriptor type1 = getDescriptor(interpretation.getContainers(),"Thing");
		TypeDescriptor type2 = getDescriptor(interpretation.getNodes(),"Thing");
		assertNotNull(type1);
		assertSame(type1,type2);
		propertyType[] expectedTypes = new propertyType[] {propertyType.STRING ,propertyType.INT, propertyType.STRING,propertyType.BOOLEAN};
		List<propertyType> actualTypes = new LinkedList<propertyType>();
		for (PropertyDescriptor propDesc:type2.getProperties())
			actualTypes.add(propDesc.getType());
		assertArrayEquals(expectedTypes, actualTypes.toArray());
		
		
		
		descriptors = interpretation.getLinks();
		assertEquals(2,descriptors.size());
		for (TypeDescriptor descriptor:descriptors){
			switch(descriptor.getName()){
				case "Link":
					assertTrue(descriptor.isAbstract());
					break;
				case "LinkSon":
					assertFalse(descriptor.isAbstract());
					break;
				default:
					fail();
			}
		}

	}
	
	@Test public void testSimpleDiamondCreateInterpretation(){
		OPMetaModelDiagram basicDiag=opmetaFactory.eINSTANCE.createOPMetaModelDiagram();
		basicDiag.setElementsDiagram(OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
		basicDiag.setLinksDiagram(OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
		OPMObjectProcessDiagram opmDiagram = basicDiag.getElementsDiagram();
		OPMNode node = TesterUtils.createObject("Node",opmDiagram); 
		TesterUtils.createObject("Container",opmDiagram);
		OPMNode nodeSon1 = TesterUtils.createObject("NodeSon1",opmDiagram); 
		OPMNode nodeSon2 = TesterUtils.createObject("NodeSon2",opmDiagram); 
		OPMNode nodeGrandSon = TesterUtils.createObject("NodeGrandSon",opmDiagram);
		TesterUtils.createObject("Link",basicDiag.getLinksDiagram());
		
		TesterUtils.createGeneralizationLink(node, nodeSon1);
		TesterUtils.createGeneralizationLink(node, nodeSon2);
		TesterUtils.createGeneralizationLink(nodeSon1, nodeGrandSon);
		TesterUtils.createGeneralizationLink(nodeSon2, nodeGrandSon);
	
		OPmodelHolder opmodelHolder = OpmetaInterpreter.CreateOPmodelHolder(basicDiag);
		assertEquals(7, opmodelHolder.getNextId());
		assertEquals(null, opmodelHolder.getContainer());
		OPmetaDefinition interpretation = opmodelHolder.getMetaDefinition();
		
		List<TypeDescriptor> nodes = interpretation.getNodes();
		assertEquals(4, nodes.size());
		TypeDescriptor testable = getDescriptor(interpretation.getNodes(),"NodeGrandSon");
		assertEquals(2,testable.getParents().size());
		assertTrue(testable.getParents().contains(getDescriptor(interpretation.getNodes(),"NodeSon1")));
		assertTrue(testable.getParents().contains(getDescriptor(interpretation.getNodes(),"NodeSon2")));
		testable = getDescriptor(interpretation.getNodes(),"Node");
		assertEquals(2,testable.getChildren().size());
		assertTrue(testable.getChildren().contains(getDescriptor(interpretation.getNodes(),"NodeSon1")));
		assertTrue(testable.getChildren().contains(getDescriptor(interpretation.getNodes(),"NodeSon2")));
	}
	
	@Test public void testDiffLevelsDiamondCreateInterpretation(){
		OPMetaModelDiagram basicDiag=opmetaFactory.eINSTANCE.createOPMetaModelDiagram();
		basicDiag.setElementsDiagram(OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
		basicDiag.setLinksDiagram(OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
		OPMObjectProcessDiagram opmDiagram = basicDiag.getElementsDiagram();
		OPMNode node = TesterUtils.createObject("Node",opmDiagram); 
		TesterUtils.createObject("Container",opmDiagram);
		OPMNode nodeSon1 = TesterUtils.createObject("NodeLevel1",opmDiagram); 
		OPMNode nodeSon2 = TesterUtils.createObject("NodeLevel2",opmDiagram); 
		OPMNode nodeSon3 = TesterUtils.createObject("NodeLevel3",opmDiagram);
		OPMNode nodeSon4 = TesterUtils.createObject("NodeSon",opmDiagram);
		OPMNode nodeGrandSon = TesterUtils.createObject("NodeGrandSon",opmDiagram);
		TesterUtils.createObject("Link",basicDiag.getLinksDiagram());
		
		TesterUtils.createGeneralizationLink(node, nodeSon1);
		TesterUtils.createGeneralizationLink(nodeSon1,nodeSon2);
		TesterUtils.createGeneralizationLink(nodeSon2, nodeSon3);
		TesterUtils.createGeneralizationLink(node, nodeSon4);
		TesterUtils.createGeneralizationLink(nodeSon3, nodeGrandSon);
		TesterUtils.createGeneralizationLink(nodeSon4, nodeGrandSon);
	
		OPmodelHolder opmodelHolder = OpmetaInterpreter.CreateOPmodelHolder(basicDiag);
		assertEquals(9, opmodelHolder.getNextId());
		assertEquals(null, opmodelHolder.getContainer());
		OPmetaDefinition interpretation = opmodelHolder.getMetaDefinition();
		
		List<TypeDescriptor> nodes = interpretation.getNodes();
		assertEquals(6, nodes.size());
		TypeDescriptor testable = getDescriptor(interpretation.getNodes(),"NodeGrandSon");
		assertEquals(2,testable.getParents().size());
		assertTrue(testable.getParents().contains(getDescriptor(interpretation.getNodes(),"NodeSon")));
		assertTrue(testable.getParents().contains(getDescriptor(interpretation.getNodes(),"NodeLevel3")));
		testable = getDescriptor(interpretation.getNodes(),"Node");
		assertEquals(2,testable.getChildren().size());
		assertTrue(testable.getChildren().contains(getDescriptor(interpretation.getNodes(),"NodeLevel1")));
		assertTrue(testable.getChildren().contains(getDescriptor(interpretation.getNodes(),"NodeSon")));
	}
	
	@Test public void testSimpleDiamondPropertiesPassCreateInterpretation(){
		OPMetaModelDiagram basicDiag=opmetaFactory.eINSTANCE.createOPMetaModelDiagram();
		basicDiag.setElementsDiagram(OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
		basicDiag.setLinksDiagram(OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
		OPMObjectProcessDiagram opmDiagram = basicDiag.getElementsDiagram();
		OPMNode node = TesterUtils.createObject("Node",opmDiagram);
		OPMNode nodeProp = TesterUtils.createObject("NodeProp:String",opmDiagram);
		TesterUtils.createObject("Container",opmDiagram);
		OPMNode nodeSon1 = TesterUtils.createObject("NodeSon1",opmDiagram); 
		OPMNode node1Prop = TesterUtils.createObject("Node1Prop:int",opmDiagram);
		OPMNode nodeSon2 = TesterUtils.createObject("NodeSon2",opmDiagram);
		OPMNode node2Prop = TesterUtils.createObject("Node2Prop:String",opmDiagram);
		OPMNode nodeGrandSon = TesterUtils.createObject("NodeGrandSon",opmDiagram);
		OPMNode node3Prop = TesterUtils.createObject("Node3Prop:String",opmDiagram);
		TesterUtils.createObject("Link",basicDiag.getLinksDiagram());
		
		TesterUtils.createGeneralizationLink(node, nodeSon1);
		TesterUtils.createGeneralizationLink(node, nodeSon2);
		TesterUtils.createGeneralizationLink(nodeSon1, nodeGrandSon);
		TesterUtils.createGeneralizationLink(nodeSon2, nodeGrandSon);
	
		TesterUtils.createAggregationLink(node, nodeProp);
		TesterUtils.createAggregationLink(nodeSon1, node1Prop);
		TesterUtils.createAggregationLink(nodeSon2, node2Prop);
		TesterUtils.createAggregationLink(nodeGrandSon, node3Prop);
		
		OPmodelHolder opmodelHolder = OpmetaInterpreter.CreateOPmodelHolder(basicDiag);
		assertEquals(11, opmodelHolder.getNextId());
		assertEquals(null, opmodelHolder.getContainer());
		OPmetaDefinition interpretation = opmodelHolder.getMetaDefinition();
		
		List<TypeDescriptor> nodes = interpretation.getNodes();
		assertEquals(4, nodes.size());
		TypeDescriptor testable = getDescriptor(interpretation.getNodes(),"NodeGrandSon");
		List<PropertyDescriptor> props = testable.getProperties();
		assertEquals(4, props.size());
		
		propertyType[] expectedTypes = new propertyType[] {propertyType.STRING ,propertyType.INT,propertyType.STRING, propertyType.STRING};
		String[] expectedNames = new String[] {"Node3Prop", "Node1Prop","NodeProp" ,"Node2Prop" };
		List<propertyType> actualTypes = new LinkedList<propertyType>();
		List<String> actualNames= new LinkedList<String>();
		for (PropertyDescriptor propDesc:props){
			actualTypes.add(propDesc.getType());
			actualNames.add(propDesc.getName());
		}
		
		assertArrayEquals(expectedTypes, actualTypes.toArray());
		assertArrayEquals(expectedNames, actualNames.toArray());
	}
	
	@Test public void testMultiInheritenceOfSameTypeProperties()
	{
		OPMetaModelDiagram basicDiag=opmetaFactory.eINSTANCE.createOPMetaModelDiagram();
		basicDiag.setElementsDiagram(OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
		basicDiag.setLinksDiagram(OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
		TesterUtils.createObject("Link",basicDiag.getLinksDiagram());
		OPMObjectProcessDiagram opmDiagram = basicDiag.getElementsDiagram();
		OPMNode node = TesterUtils.createObject("Node",opmDiagram);
		OPMNode nodeProp = TesterUtils.createObject("Prop:String",opmDiagram);
		OPMNode container = TesterUtils.createObject("Container",opmDiagram);
		OPMNode containerProp = TesterUtils.createObject("Prop:String",opmDiagram);
		OPMNode thing = TesterUtils.createObject("Thing",opmDiagram);
		
		TesterUtils.createGeneralizationLink(node, thing);
		TesterUtils.createGeneralizationLink(container, thing);
		
		TesterUtils.createAggregationLink(node, nodeProp);
		TesterUtils.createAggregationLink(container, containerProp);
		
		OPmodelHolder opmodelHolder = OpmetaInterpreter.CreateOPmodelHolder(basicDiag);
		OPmetaDefinition interpretation = opmodelHolder.getMetaDefinition();
		TypeDescriptor testable = getDescriptor(interpretation.getNodes(),"Thing");
		assertEquals(1, testable.getProperties().size());
		PropertyDescriptor prop = testable.getProperties().get(0);
		assertEquals("Prop", prop.getName());
		assertEquals(propertyType.STRING, prop.getType());
	}
	
	@Test public void testMultiInheritenceOfDiffTypeProperties()
	{
		OPMetaModelDiagram basicDiag=opmetaFactory.eINSTANCE.createOPMetaModelDiagram();
		basicDiag.setElementsDiagram(OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
		basicDiag.setLinksDiagram(OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
		OPMObjectProcessDiagram opmDiagram = basicDiag.getElementsDiagram();
		OPMNode node = TesterUtils.createObject("Node",opmDiagram);
		OPMNode nodeProp = TesterUtils.createObject("Prop:String",opmDiagram);
		OPMNode container = TesterUtils.createObject("Container",opmDiagram);
		OPMNode containerProp = TesterUtils.createObject("Prop:String",opmDiagram);
		OPMNode thing = TesterUtils.createObject("Thing",opmDiagram);
		
		TesterUtils.createGeneralizationLink(node, thing);
		TesterUtils.createGeneralizationLink(container, thing);
		
		TesterUtils.createAggregationLink(node, nodeProp);
		TesterUtils.createAggregationLink(container, containerProp);
		
		try{
			OpmetaInterpreter.CreateOPmodelHolder(basicDiag);
			fail("OPmodel creation should have failed");
		} catch (RuntimeException ex){}
	}

	@Test public void testSimpleDiamondSinglePropCreateInterpretation(){
		// if testSimpleDiamondCreateInterpretation doesn't pass - this is useless
		
		OPMetaModelDiagram basicDiag=opmetaFactory.eINSTANCE.createOPMetaModelDiagram();
		basicDiag.setElementsDiagram(OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
		basicDiag.setLinksDiagram(OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
		OPMObjectProcessDiagram opmDiagram = basicDiag.getElementsDiagram();
		OPMNode node = TesterUtils.createObject("Node",opmDiagram); 
		OPMNode nodeProp = TesterUtils.createObject("Prop:int",opmDiagram);
		TesterUtils.createObject("Container",opmDiagram);
		OPMNode nodeSon1 = TesterUtils.createObject("NodeSon1",opmDiagram); 
		OPMNode nodeSon2 = TesterUtils.createObject("NodeSon2",opmDiagram); 
		OPMNode nodeGrandSon = TesterUtils.createObject("NodeGrandSon",opmDiagram);
		TesterUtils.createObject("Link",basicDiag.getLinksDiagram());
		
		TesterUtils.createGeneralizationLink(node, nodeSon1);
		TesterUtils.createGeneralizationLink(node, nodeSon2);
		TesterUtils.createGeneralizationLink(nodeSon1, nodeGrandSon);
		TesterUtils.createGeneralizationLink(nodeSon2, nodeGrandSon);
	
		TesterUtils.createAggregationLink(node, nodeProp);
		
		OPmodelHolder opmodelHolder = OpmetaInterpreter.CreateOPmodelHolder(basicDiag);
		assertEquals(null, opmodelHolder.getContainer());
		OPmetaDefinition interpretation = opmodelHolder.getMetaDefinition();
		
		TypeDescriptor testable = getDescriptor(interpretation.getNodes(),"NodeGrandSon");
		assertEquals(1,testable.getProperties().size());
		PropertyDescriptor propDesc = testable.getProperties().get(0);
		assertEquals("Prop", propDesc.getName());
		assertEquals(propertyType.INT,propDesc.getType());
	}
	
	@Test public void testCreateThingAndPassPropertiesInterpretation(){
		OPMetaModelDiagram basicDiag=opmetaFactory.eINSTANCE.createOPMetaModelDiagram();
		basicDiag.setElementsDiagram(OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
		basicDiag.setLinksDiagram(OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
		OPMObjectProcessDiagram opmDiagram = basicDiag.getElementsDiagram();
		
		// structure
		OPMNode node = TesterUtils.createObject("Node",opmDiagram); 
		OPMNode contianer = TesterUtils.createObject("Container",opmDiagram);
		OPMNode thing = TesterUtils.createObject("Thing",opmDiagram);
		OPMNode thing1 = TesterUtils.createObject("Thing1",opmDiagram);
		
		TesterUtils.createGeneralizationLink(node, thing);
		TesterUtils.createGeneralizationLink(contianer, thing);
		TesterUtils.createGeneralizationLink(thing, thing1);
		
		OPMObjectProcessDiagram linkDiagram = basicDiag.getLinksDiagram();
		TesterUtils.createObject("Link",linkDiagram);
		
		// properties
		OPMNode prop1 = TesterUtils.createObject("Prop1:int",opmDiagram);
		OPMNode prop2 = TesterUtils.createObject("Prop2:String",opmDiagram);
		
		TesterUtils.createAggregationLink(contianer,prop1);
		TesterUtils.createAggregationLink(contianer,prop2);
		
		OPmodelHolder opmodelHolder = OpmetaInterpreter.CreateOPmodelHolder(basicDiag);
		assertEquals(8, opmodelHolder.getNextId());
		assertEquals(null, opmodelHolder.getContainer());
		OPmetaDefinition interpretation = opmodelHolder.getMetaDefinition();
		
		TypeDescriptor testable = getDescriptor(interpretation.getNodes(),"Thing");
		testCreateThingAndPassPropertiesInterpretationTestProperties(testable);
		testable = getDescriptor(interpretation.getNodes(),"Thing1");
		testCreateThingAndPassPropertiesInterpretationTestProperties(testable);
		
	}
	
	private void testCreateThingAndPassPropertiesInterpretationTestProperties(TypeDescriptor testable){
		Iterable<PropertyDescriptor> properties = testable.getProperties();
		ArrayList<PropertyDescriptor> props = new ArrayList<PropertyDescriptor>();  
		for (PropertyDescriptor prop:properties){
			props.add(prop);
			if (prop.getName().equals("Prop1")){
				assertEquals(propertyType.INT, prop.getType());
			}else if (prop.getName().equals("Prop2")){
				assertEquals(propertyType.STRING, prop.getType());
			}else fail("Unknown property");
		}
		assertEquals(2, props.size());
	}
	
	private static TypeDescriptor getDescriptor(Iterable<TypeDescriptor> descriptors, String name){
		for (TypeDescriptor descriptor:descriptors){
			if (descriptor.getName().equals(name)) return descriptor;
		}
		return null;
	}
	
}
