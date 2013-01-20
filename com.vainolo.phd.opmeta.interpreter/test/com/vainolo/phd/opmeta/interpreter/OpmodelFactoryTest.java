package com.vainolo.phd.opmeta.interpreter;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import com.vainolo.phd.opmodel.model.TypeDescriptor;

import com.vainolo.phd.opmeta.interpreter.OpmetaInterpreter;
import com.vainolo.phd.opmeta.interpreter.OpmodelFactory;

import com.vainolo.phd.opmeta.model.OPMetaModelDiagram;
import com.vainolo.phd.opmodel.model.ContainerInstance;
import com.vainolo.phd.opmodel.model.InstanceBase;
import com.vainolo.phd.opmodel.model.LinkInstance;
import com.vainolo.phd.opmodel.model.NodeInstance;
import com.vainolo.phd.opmodel.model.OPmetaDefinition;
import com.vainolo.phd.opmodel.model.OPmodelHolder;
import com.vainolo.phd.opmodel.model.PropertyInstance;
import com.vainolo.phd.opmodel.model.ThingInstance;
import com.vainolo.phd.opmodel.model.opmodelFactory;
import com.vainolo.phd.opmodel.model.propertyType;

public class OpmodelFactoryTest {

	OPmetaDefinition interpretation;
	OpmodelFactory factory;
	
	@Before
	public void setUp() throws Exception {
		OPMetaModelDiagram meta = TesterUtils.createBasicMetaModelDiag();
		OPmodelHolder opmodelHolder = OpmetaInterpreter.CreateOPmodelHolder(meta);
		assertEquals(13, opmodelHolder.getNextId());
		assertEquals(null, opmodelHolder.getContainer());
		interpretation = opmodelHolder.getMetaDefinition();
		
		factory = new OpmodelFactory(interpretation);
	}

	@Test
	public void testCreateOpmodelInstance() {
		Collection<TypeDescriptor> nodes = interpretation.getNodes();
		for (TypeDescriptor descriptor:nodes){
			 InstanceBase instance = factory.createOpmodelInstance(descriptor);
			 if (descriptor.isAbstract()) assertNull(instance);
			 else if (descriptor.getName().equalsIgnoreCase("Thing")) 
				 assertTrue(instance instanceof ThingInstance);
			 else if (descriptor.getName().equalsIgnoreCase("State")){
				 assertFalse(instance instanceof ThingInstance);
				 assertTrue(instance instanceof NodeInstance);
				 assertFalse(instance instanceof ContainerInstance);
			 }
			 else fail("Unexpected type descriptor");
		}
		Collection<TypeDescriptor> containers = interpretation.getContainers();
		for (TypeDescriptor descriptor:containers){
			InstanceBase instance = factory.createOpmodelInstance(descriptor);
			 if (descriptor.isAbstract()) assertNull(instance);
			 else if (descriptor.getName().equalsIgnoreCase("Thing")) assertTrue(instance instanceof ThingInstance);
			 else if (descriptor.getName().equalsIgnoreCase("Diagram")){
				 assertFalse(instance instanceof ThingInstance);
				 assertFalse(instance instanceof NodeInstance);
				 assertTrue(instance instanceof ContainerInstance);
			 }
			 else fail("Unexpected type descriptor");
		}
		Collection<TypeDescriptor> links = interpretation.getLinks();
		for (TypeDescriptor descriptor:links){
			InstanceBase instance = factory.createOpmodelInstance(descriptor);
			 if (descriptor.isAbstract()) assertNull(instance);
			 else if (descriptor.getName().equalsIgnoreCase("LinkSon")) assertTrue(instance instanceof LinkInstance);
			 else fail("Unexpected type descriptor");
		}
		
		TypeDescriptor temp = opmodelFactory.eINSTANCE.createTypeDescriptor();
		temp.setName("noName");
		InstanceBase instance = factory.createOpmodelInstance(temp);
		assertNull(instance);
	}

	@Test
	public void testGetInstanceType() {
		Collection<TypeDescriptor> nodes = interpretation.getNodes();
		for (TypeDescriptor descriptor:nodes){
			 Object type = factory.getInstanceType(descriptor);
			 if (descriptor.getName().equalsIgnoreCase("Thing")) 
				 assertEquals(ThingInstance.class,type);
			 else assertEquals(NodeInstance.class,type);
		}
		Collection<TypeDescriptor> containers = interpretation.getContainers();
		for (TypeDescriptor descriptor:containers){
			 Object type= factory.getInstanceType(descriptor);
			 if (descriptor.getName().equalsIgnoreCase("Thing")) assertEquals(ThingInstance.class,type);
			 else assertEquals(ContainerInstance.class,type);
		}
		Collection<TypeDescriptor> links = interpretation.getLinks();
		for (TypeDescriptor descriptor:links){
			Object type= factory.getInstanceType(descriptor);
			 assertEquals(LinkInstance.class,type);
		}
		
		TypeDescriptor temp = opmodelFactory.eINSTANCE.createTypeDescriptor();
		temp.setName("noName");
		Object type = factory.getInstanceType(temp);
		assertNull(type);
	}
	
	
	// TODO make this into a unit test!
	public void testSettingProperties() {
		// print ALL the stuff and modify and shit
		Collection<TypeDescriptor> nodes = interpretation.getNodes();
		for (TypeDescriptor descriptor:nodes){
			 InstanceBase instance = factory.createOpmodelInstance(descriptor);
			 System.out.println("");
			 System.out.println("Node name: " + descriptor.getName());
			 try {
				 Collection<PropertyInstance> propertyCollection = instance.getProperties();
				 for (PropertyInstance property : propertyCollection) {
					 System.out.println("Property name: "+ property.getName());
					 System.out.println("Property type: "+ property.getType());
					 System.out.println("Property value: "+property.getValue());
					 if (property.getType().equals(propertyType.INT)){
						 property.setValue("10");
					 } else if (property.getType().equals(propertyType.FLOAT)){
						 property.setValue("10.1");
					 } else if (property.getType().equals(propertyType.STRING)){
						 property.setValue("success!");
					 } else if (property.getType().equals(propertyType.BOOLEAN)){
						 property.setValue("true");
					 }
					 System.out.println("Updated value from lookup result: "+instance.getProperty(property.getName()).getValue());
				 }
			 }
			 catch (NullPointerException e)
			 {
				 System.out.println("Node name: " + descriptor.getName());

			 }
		}
	}	
	}
