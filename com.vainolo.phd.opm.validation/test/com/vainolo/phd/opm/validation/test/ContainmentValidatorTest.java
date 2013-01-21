package com.vainolo.phd.opm.validation.test;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import com.vainolo.phd.opm.validation.ContainmentValidator;
import com.vainolo.phd.opm.validation.ElementType;
import com.vainolo.phd.opm.validation.rules.ContainmentRule;
import com.vainolo.phd.opm.validation.test.utils.ElementTypeImpl;

public class ContainmentValidatorTest {
	
	// class members
	ContainmentValidator validator;
	ElementTypeImpl nodeA 			= new ElementTypeImpl("nodeA");
	ElementTypeImpl nodeA_son 		= new ElementTypeImpl("nodeA_son");
	ElementTypeImpl nodeA_son2 		= new ElementTypeImpl("nodeA_son2");
	ElementTypeImpl nodeA_grandSon1	= new ElementTypeImpl("nodeA_grandSon1");
	ElementTypeImpl nodeA_grandSon2	= new ElementTypeImpl("nodeA_grandSon2");
	ElementTypeImpl nodeB 			= new ElementTypeImpl("nodeB");
	ElementTypeImpl nodeB_son 		= new ElementTypeImpl("nodeB_son");
	ElementTypeImpl nodeC 			= new ElementTypeImpl("nodeC");
	ElementTypeImpl nodeC_son 		= new ElementTypeImpl("nodeC_son");
	
	@Before
	public void setup() {
		validator =new ContainmentValidator();
	}
	
	@Test
	public void OneRuleAssertBasicInheritence() {
		addInheritence(nodeA, nodeA_son);
		addInheritence(nodeA, nodeA_son2);
		addInheritence(nodeB, nodeB_son);
		List<ElementType> Parents = new ArrayList<ElementType>();
		Parents.add(nodeA);
		List<ElementType> sons = new ArrayList<ElementType>();
		sons.add(nodeA_son);
		sons.add(nodeA_son2);
		assertEquals(Parents, nodeA_son.GetParentsOfType());
		assertEquals(sons, nodeA.GetSonsOfType());
		validator.addRule(nodeA, nodeB, true);
		try {
			validator.finalizeInit();
		} catch (Exception e) {
			assertTrue(false);
		}
		assertTrue(validator.valdidate(nodeA, nodeB));
		assertTrue(validator.valdidate(nodeA,nodeB_son));
		assertTrue(validator.valdidate(nodeA_son, nodeB_son));
		assertTrue(validator.valdidate(nodeA_son, nodeB));
		assertTrue(validator.valdidate(nodeA_son2, nodeB_son));
		assertTrue(validator.valdidate(nodeA_son2, nodeB));
		assertFalse(validator.valdidate(nodeA, nodeC));
		
		List<ContainmentRule> leafRules = new ArrayList<ContainmentRule>();
		ContainmentRule rule = new ContainmentRule(nodeA_son,nodeB_son,0,0,true,true);
		ContainmentRule rule2 = new ContainmentRule(nodeA_son2,nodeB_son,0,0,true,true);
		leafRules.add(rule);
		leafRules.add(rule2);
		assertEquals(leafRules, validator.getLeafRules());
		
	}
		
//	@Test
//	public void 
	
	private void addInheritence(ElementTypeImpl parent, ElementTypeImpl son) {
		parent.AddSon(son);
		son.AddParent(parent);
	}
	
	

}
