package com.vainolo.phd.opmeta.interpreter.validation;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.vainolo.phd.opmeta.model.OPMetaModelContainmentValidationRule;
import com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule;
import com.vainolo.phd.opmeta.model.opmetaFactory;
import com.vainolo.phd.opmodel.model.OPmetaDefinition;
import com.vainolo.phd.opmodel.model.OPmodelContainmentValidationRule;
import com.vainolo.phd.opmodel.model.OPmodelLinkValidationRule;
import com.vainolo.phd.opmodel.model.TypeDescriptor;
import com.vainolo.phd.opmodel.model.opmodelFactory;

public class ValidationInterpreterTester {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateLinkValidationRules() {
		OPmetaDefinition interpretation = opmodelFactory.eINSTANCE.createOPmetaDefinition();
		TypeDescriptor descriptor1 = opmodelFactory.eINSTANCE.createTypeDescriptor();
		descriptor1.setName("Node1");
		interpretation.getNodes().add(descriptor1);
		TypeDescriptor descriptor2 = opmodelFactory.eINSTANCE.createTypeDescriptor();
		descriptor2.setName("Node2");
		interpretation.getNodes().add(descriptor2);
		TypeDescriptor descriptor3 = opmodelFactory.eINSTANCE.createTypeDescriptor();
		descriptor3.setName("link");
		interpretation.getLinks().add(descriptor3);
		
		OPMetaModelLinkValidationRule rule = opmetaFactory.eINSTANCE.createOPMetaModelLinkValidationRule();
		rule.setLinkTypeName("link");
		rule.setSourceTypeName("Node1");
		rule.setTargetTypeName("Node2");
		rule.setValid(true);
		
		LinkedList<OPMetaModelLinkValidationRule> ruleLinks = new LinkedList<>();
		ruleLinks.add(rule);
		List<OPmodelLinkValidationRule> result = ValidationInterpreter.calculateLinkValidationRules(ruleLinks, interpretation);
		
		assertEquals(1,result.size());
		OPmodelLinkValidationRule tested =result.get(0);
		assertEquals(descriptor3 ,tested.getLinkType());
		assertEquals(descriptor1 ,tested.getSourceType());
		assertEquals(descriptor2 ,tested.getTargetType());
		assertTrue(tested.isValid());
		
		rule.setLinkTypeName("Non-Type");
		try{
			ValidationInterpreter.calculateLinkValidationRules(ruleLinks, interpretation);
			fail("should have failed on bad link type name");
		}catch (RuntimeException ex) {}
		
		rule.setLinkTypeName("link");
		rule.setSourceTypeName("Non-Type");
		try{
			ValidationInterpreter.calculateLinkValidationRules(ruleLinks, interpretation);
			fail("should have failed on bad source type name");
		}catch (RuntimeException ex) {}
		
		rule.setSourceTypeName("Node1");
		rule.setTargetTypeName("Non-Type");
		try{
			ValidationInterpreter.calculateLinkValidationRules(ruleLinks, interpretation);
			fail("should have failed on bad target type name");
		}catch (RuntimeException ex) {}
	}

	@Test
	public void testCalculateContainmentValidationRules() {
		OPmetaDefinition interpretation = opmodelFactory.eINSTANCE.createOPmetaDefinition();
		TypeDescriptor descriptor1 = opmodelFactory.eINSTANCE.createTypeDescriptor();
		descriptor1.setName("Node1");
		interpretation.getNodes().add(descriptor1);
		TypeDescriptor descriptor2 = opmodelFactory.eINSTANCE.createTypeDescriptor();
		descriptor2.setName("Container1");
		interpretation.getContainers().add(descriptor2);

		OPMetaModelContainmentValidationRule rule = opmetaFactory.eINSTANCE.createOPMetaModelContainmentValidationRule();
		rule.setContainerTypeName("Container1");
		rule.setNodeTypeName("Node1");
		rule.setValid(true);
		
		LinkedList<OPMetaModelContainmentValidationRule> ruleLinks = new LinkedList<>();
		ruleLinks.add(rule);
		List<OPmodelContainmentValidationRule> result = ValidationInterpreter.calculateContainmentValidationRules(ruleLinks, interpretation);
		
		assertEquals(1,result.size());
		OPmodelContainmentValidationRule tested =result.get(0);
		assertEquals(descriptor1 ,tested.getNodeType());
		assertEquals(descriptor2 ,tested.getContainerType());
		assertTrue(tested.isValid());
		
		rule.setContainerTypeName("Non-Type");
		try{
			ValidationInterpreter.calculateContainmentValidationRules(ruleLinks, interpretation);
			fail("should have failed on bad link type name");
		}catch (RuntimeException ex) {}
		
		rule.setContainerTypeName("Container1");
		rule.setNodeTypeName("Non-Type");
		try{
			ValidationInterpreter.calculateContainmentValidationRules(ruleLinks, interpretation);
			fail("should have failed on bad source type name");
		}catch (RuntimeException ex) {}
		
	}
}
