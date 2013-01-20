package com.vainolo.phd.opm.validation.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import com.vainolo.phd.opm.validation.LinkValidator;
import com.vainolo.phd.opm.validation.ElementType;
import com.vainolo.phd.opm.validation.rules.LinkRule;

public class LinkValidatorTest {
	
	// class members
	LinkValidator validator;
	ElementTypeImpl nodeA 			= new ElementTypeImpl("nodeA");
	ElementTypeImpl nodeA_son 		= new ElementTypeImpl("nodeA_son");
	ElementTypeImpl nodeA_son2 		= new ElementTypeImpl("nodeA_son2");
	ElementTypeImpl nodeA_grandSon1	= new ElementTypeImpl("nodeA_grandSon1");
	ElementTypeImpl nodeA_grandSon2	= new ElementTypeImpl("nodeA_grandSon2");
	ElementTypeImpl nodeB 			= new ElementTypeImpl("nodeB");
	ElementTypeImpl nodeB_son 		= new ElementTypeImpl("nodeB_son");
	ElementTypeImpl nodeC 			= new ElementTypeImpl("nodeC");
	ElementTypeImpl nodeC_son 		= new ElementTypeImpl("nodeC_son");
	ElementTypeImpl linkA 			= new ElementTypeImpl("linkA");
	ElementTypeImpl linkA_son 		= new ElementTypeImpl("linkA_son");
	
	@Before
	public void setup() {
		validator =new LinkValidator();
	}
	
	@Test
	public void OneRuleAssertBasicInheritence() {
		addInheritence(nodeA, nodeA_son);
		addInheritence(nodeB, nodeB_son);
		addInheritence(linkA, linkA_son);
		List<ElementType> Parents = new ArrayList<ElementType>();
		Parents.add(nodeA);
		List<ElementType> sons = new ArrayList<ElementType>();
		sons.add(nodeA_son);
		assertEquals(Parents, nodeA_son.GetParentsOfType());
		assertEquals(sons, nodeA.GetSonsOfType());
		validator.addRule(nodeA, linkA, nodeB, true);
		assertFalse(validator.valdidate(nodeA, linkA, nodeB));
		try {
			validator.finalizeInit();
		} catch (Exception e) {
			assertTrue(false);
		}
		assertTrue(validator.valdidate(nodeA, linkA, nodeB));
		assertTrue(validator.valdidate(nodeA, linkA_son, nodeB));
		assertTrue(validator.valdidate(nodeA, linkA, nodeB_son));
		assertTrue(validator.valdidate(nodeA, linkA_son, nodeB_son));
		assertTrue(validator.valdidate(nodeA_son, linkA, nodeB_son));
		assertTrue(validator.valdidate(nodeA_son, linkA_son, nodeB));
		assertTrue(validator.valdidate(nodeA_son, linkA_son, nodeB_son));
		assertTrue(validator.valdidate(nodeA_son, linkA, nodeB));
	}
	
	@Test
	public void conflictedRulesTset() {
		addInheritence(nodeA, nodeA_son);
		addInheritence(nodeA, nodeA_son2);
		addInheritence(nodeA_son2, nodeA_grandSon1);
		addInheritence(nodeA_son, nodeA_grandSon1);
		addInheritence(nodeA_son, nodeA_grandSon2);
		validator.addRule(nodeA, linkA, nodeB, true);
		validator.addRule(nodeA_son, linkA, nodeB, false);
		assertFalse(validator.valdidate(nodeA, linkA, nodeB));
		boolean excepetionCaught = false;
		try {
			validator.finalizeInit();
		} catch (Exception e) {
			assertEquals("unhandled conflicet rule: 'from 'nodeA_grandSon1' to 'nodeB' with link 'linkA''", e.getMessage());
			excepetionCaught = true;
		}
		assertTrue(excepetionCaught);
		validator.addRule(nodeA_grandSon1, linkA, nodeB, true);
		try {
			validator.finalizeInit();
		} catch (Exception e) {
			assertTrue(false);
		}
		assertTrue(validator.valdidate(nodeA_grandSon1, linkA));
		assertFalse(validator.valdidate(nodeB_son, linkA));
		assertFalse(validator.valdidate(nodeB_son, linkA, nodeA));
		assertTrue(validator.valdidate(nodeA_grandSon1, linkA, nodeB));
		assertFalse(validator.valdidate(nodeA_grandSon2, linkA, nodeB));
		List<LinkRule> leafRules = new ArrayList<LinkRule>();
		LinkRule rule1 = new LinkRule(nodeA_grandSon1,linkA,nodeB,0,0,true,true);
		LinkRule rule2 = new LinkRule(nodeA_grandSon2,linkA,nodeB,0,0,true,true);
		leafRules.add(rule1);
		leafRules.add(rule2);
		assertEquals(leafRules, validator.getLeafRules());
	}
	
	private void addInheritence(ElementTypeImpl parent, ElementTypeImpl son) {
		parent.AddSon(son);
		son.AddParent(parent);
	}
	
	
	private class ElementTypeImpl implements ElementType {

		private String type;
		private List<ElementType> Parents;
		private List<ElementType> Sons;
		public ElementTypeImpl(String type) {
			this.type = type;
			Parents = new ArrayList<ElementType>();
			Sons = new ArrayList<ElementType>();
		}
		public void AddParent(ElementTypeImpl parent) {
			this.Parents.add(parent);
		}
		public void AddSon(ElementTypeImpl son) {
			this.Sons.add(son);
		}
		@Override
		public Object GetType() {
			return this.type;
		}

		@Override
		public List<ElementType> GetParentsOfType() {
			return Parents;
		}

		@Override
		public List<ElementType> GetSonsOfType() {
			return Sons;
		}
		@Override
		public boolean equals(Object obj) {
			if ((obj == null ) || (!(obj instanceof ElementTypeImpl))) return false;
			return type.equals(((ElementTypeImpl)obj).type);
		}
		
		@Override
		public int hashCode() {
			return type.hashCode();
		}
		@Override
		public String getTypeName() {
			return type;
		}
	}
}
