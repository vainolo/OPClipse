package com.vainolo.phd.opmeta.interpreter.opmodel;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import com.vainolo.phd.opmeta.interpreter.OpmetaInterpretation;
import com.vainolo.phd.opmeta.interpreter.TesterUtils;
import com.vainolo.phd.opmeta.interpreter.TypeDescriptor;
import com.vainolo.phd.opmeta.model.OPMetaModelDiagram;

public class OpmodelFactoryTest {

	OpmetaInterpretation interpretation;
	OpmodelFactory factory;
	@Before
	public void setUp() throws Exception {
		OPMetaModelDiagram meta = TesterUtils.createBasicMetaModelDiag();
		interpretation = OpmetaInterpretation.CreateInterpretation(meta);
		factory = new OpmodelFactory(interpretation);
	}

	@Test
	public void testCreateOpmodelInstance() {
		Collection<TypeDescriptor> nodes = interpretation.getNodes();
		for (TypeDescriptor descriptor:nodes){
			 OpmodelInstance instance = factory.createOpmodelInstance(descriptor);
			 if (descriptor.isAbstract()) assertNull(instance);
			 else if (descriptor.getName().equalsIgnoreCase("Thing")) assertTrue(instance instanceof OpmodelThingInstance);
			 else if (descriptor.getName().equalsIgnoreCase("State")){
				 assertFalse(instance instanceof OpmodelThingInstance);
				 assertTrue(instance instanceof OpmodelNodeInstance);
				 assertFalse(instance instanceof OpmodelContainerInstance);
			 }
			 else fail("Unexpected type descriptor");
		}
		Collection<TypeDescriptor> containers = interpretation.getContainers();
		for (TypeDescriptor descriptor:containers){
			 OpmodelInstance instance = factory.createOpmodelInstance(descriptor);
			 if (descriptor.isAbstract()) assertNull(instance);
			 else if (descriptor.getName().equalsIgnoreCase("Thing")) assertTrue(instance instanceof OpmodelThingInstance);
			 else if (descriptor.getName().equalsIgnoreCase("Diagram")){
				 assertFalse(instance instanceof OpmodelThingInstance);
				 assertFalse(instance instanceof OpmodelNodeInstance);
				 assertTrue(instance instanceof OpmodelContainerInstance);
			 }
			 else fail("Unexpected type descriptor");
		}
		Collection<TypeDescriptor> links = interpretation.getLinks();
		for (TypeDescriptor descriptor:links){
			 OpmodelInstance instance = factory.createOpmodelInstance(descriptor);
			 if (descriptor.isAbstract()) assertNull(instance);
			 else if (descriptor.getName().equalsIgnoreCase("LinkSon")) assertTrue(instance instanceof OpmodelLinkInstance);
			 else fail("Unexpected type descriptor");
		}
		
		TypeDescriptor temp = new TypeDescriptor("noName");
		OpmodelInstance instance = factory.createOpmodelInstance(temp);
		assertNull(instance);
	}

	@Test
	public void testGetInstanceType() {
		Collection<TypeDescriptor> nodes = interpretation.getNodes();
		for (TypeDescriptor descriptor:nodes){
			 Object type = factory.getInstanceType(descriptor);
			 if (descriptor.getName().equalsIgnoreCase("Thing")) assertEquals(OpmodelThingInstance.class,type);
			 else assertEquals(OpmodelNodeInstance.class,type);
		}
		Collection<TypeDescriptor> containers = interpretation.getContainers();
		for (TypeDescriptor descriptor:containers){
			 Object type= factory.getInstanceType(descriptor);
			 if (descriptor.getName().equalsIgnoreCase("Thing")) assertEquals(OpmodelThingInstance.class,type);
			 else assertEquals(OpmodelContainerInstance.class,type);
		}
		Collection<TypeDescriptor> links = interpretation.getLinks();
		for (TypeDescriptor descriptor:links){
			Object type= factory.getInstanceType(descriptor);
			 assertEquals(OpmodelLinkInstance.class,type);
		}
		
		TypeDescriptor temp = new TypeDescriptor("noName");
		Object type = factory.getInstanceType(temp);
		assertNull(type);
	}

}
