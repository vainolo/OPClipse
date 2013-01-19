package com.vainolo.phd.opm.validation.test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.junit.Before;
import org.junit.Test;

import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.validation.ElementType;
import com.vainolo.phd.opm.validation.impl.ElementTypeEClassImpl;

public class ElementTypeTest {

	ElementTypeEClassImpl element;
	EClass real;
	
	@Before
	public void setUp() throws Exception {
		real = OPMPackage.eINSTANCE.getOPMObject();
		element = new ElementTypeEClassImpl(real);
	}

	@Test
	public void testHashCode() {
		assertEquals(real.hashCode(), element.hashCode());
	}

	@Test
	public void testGetType() {
		assertEquals(real, element.GetType());
	}

	@Test
	public void testGetParentsOfType() {
		List<ElementType> actualParents =  element.GetParentsOfType();
		assertEquals(1, actualParents.size());
		assertEquals(OPMPackage.eINSTANCE.getOPMThing(), actualParents.get(0).GetType());
	}

	@Test
	public void testGetSonsOfType() {
		assertEquals(Collections.emptyList(),element.GetSonsOfType());
	}

	@Test
	public void testEqualsObject() {
		ElementTypeEClassImpl secEle = new ElementTypeEClassImpl(real);
		assertTrue(secEle.equals(element));
		ElementTypeEClassImpl otherEle = new ElementTypeEClassImpl(OPMPackage.eINSTANCE.getOPMThing());
		assertFalse(otherEle.equals(element));
	}

}
