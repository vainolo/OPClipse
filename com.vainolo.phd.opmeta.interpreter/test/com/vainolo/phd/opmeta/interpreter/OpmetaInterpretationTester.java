package com.vainolo.phd.opmeta.interpreter;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

import com.vainolo.phd.opmeta.model.OPMetaModelDiagram;

public class OpmetaInterpretationTester {
	
	@Test public void testSimpleCreateInterpretation(){
		OPMetaModelDiagram systemDiagram=TesterUtils.createBasicMetaModelDiag();
		
		OpmetaInterpretation interpretation = OpmetaInterpretation.CreateInterpretation(systemDiagram);
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
					
					for (Iterator<propertyDescriptor> it = descriptor.getProperties().iterator(); it.hasNext(); )
						System.out.println(it.next().getPropertyName());
					break;
				case "State":
					break;
				case "Thing":
					assertFalse(descriptor.isAbstract());
					for (Iterator<propertyDescriptor> it = descriptor.getProperties().iterator(); it.hasNext(); )
						System.out.println(it.next().getPropertyName());	
					break;
				default:
					fail();
			}
		}

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
}
