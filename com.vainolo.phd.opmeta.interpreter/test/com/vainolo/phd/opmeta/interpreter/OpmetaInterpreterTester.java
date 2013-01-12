package com.vainolo.phd.opmeta.interpreter;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
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
			// TODO Auto-generated catch block
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
					System.out.println("Node");
					for (Iterator<PropertyDescriptor> it = descriptor.getProperties().iterator(); it.hasNext(); )
						System.out.println(it.next().getType());
					break;
				case "State":
					break;
				case "Thing":
					assertFalse(descriptor.isAbstract());
					System.out.println("Thing");
					for (Iterator<PropertyDescriptor> it = descriptor.getProperties().iterator(); it.hasNext(); )
						System.out.println(it.next().getType());	
					break;
				default:
					fail();
			}
		}

		TypeDescriptor type1 = getDescriptor(interpretation.getContainers(),"Thing");
		TypeDescriptor type2 = getDescriptor(interpretation.getNodes(),"Thing");
		assertNotNull(type1);
		assertSame(type1,type2);
		
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
	
	@Test public void testDiamondCreateInterpretation(){
		OPMetaModelDiagram basicDiag=opmetaFactory.eINSTANCE.createOPMetaModelDiagram();
		basicDiag.setElementsDiagram(OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
		basicDiag.setLinksDiagram(OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
		OPMObjectProcessDiagram opmDiagram = basicDiag.getElementsDiagram();
		OPMNode node = TesterUtils.createObject("Node",opmDiagram); 
		TesterUtils.createObject("Container",opmDiagram);
		OPMNode nodeSon1 = TesterUtils.createObject("NodeSon1",opmDiagram); 
		OPMNode nodeSon2 = TesterUtils.createObject("NodeSon2",opmDiagram); 
		OPMNode nodeGrandSon = TesterUtils.createObject("NodeGrandSon",opmDiagram);
		
		TesterUtils.createGeneralizationLink(node, nodeSon1);
		TesterUtils.createGeneralizationLink(node, nodeSon2);
		TesterUtils.createGeneralizationLink(nodeSon1, nodeGrandSon);
		TesterUtils.createGeneralizationLink(nodeSon2, nodeGrandSon);
	
		try{
			OpmetaInterpreter.CreateOPmodelHolder(basicDiag);
			fail("diamonds suppose to throw exception");
		}catch(RuntimeException re) {}
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
