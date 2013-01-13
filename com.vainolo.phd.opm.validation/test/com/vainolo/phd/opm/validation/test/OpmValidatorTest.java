package com.vainolo.phd.opm.validation.test;

import static org.junit.Assert.*;

import org.eclipse.emf.ecore.EClass;
import org.junit.Before;
import org.junit.Test;

import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.validation.OpmValidator;
import com.vainolo.phd.opm.validation.impl.OpmValidatorImpl;

public class OpmValidatorTest {

	OpmValidator validator;
	private EClass opmDiagram = OPMPackage.eINSTANCE.getOPMObjectProcessDiagram();
	private EClass opmObject = OPMPackage.eINSTANCE.getOPMObject();
	private EClass opmProcess = OPMPackage.eINSTANCE.getOPMProcess();
	private EClass opmState =  OPMPackage.eINSTANCE.getOPMState();
	private EClass opmLabel =  OPMPackage.eINSTANCE.getLabel();
	
	@Before
	public void setUp() throws Exception {
		validator = OpmValidatorImpl.init();
	}

	@Test
	public void testValidateLinkClassOfQClassOfQ() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateLinkClassOfQClassOfQClassOfQ() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateContaiment() {
		
		// test Diagram
		assertTrue(validator.validateContaiment(opmDiagram, opmObject));
		assertTrue(validator.validateContaiment(opmDiagram, opmProcess));
		assertFalse(validator.validateContaiment(opmDiagram, opmState));
		assertTrue(validator.validateContaiment(opmDiagram, opmLabel));
		assertFalse(validator.validateContaiment(opmDiagram, opmDiagram));
		
		// test Object
		assertTrue(validator.validateContaiment(opmObject, opmObject));
		assertTrue(validator.validateContaiment(opmObject, opmProcess));
		assertTrue(validator.validateContaiment(opmObject, opmState));
		assertFalse(validator.validateContaiment(opmObject, opmLabel));
		assertFalse(validator.validateContaiment(opmObject, opmDiagram));
		
		// test Process
		assertTrue(validator.validateContaiment(opmProcess, opmObject));
		assertTrue(validator.validateContaiment(opmProcess, opmProcess));
		assertFalse(validator.validateContaiment(opmProcess, opmState));
		assertFalse(validator.validateContaiment(opmProcess, opmLabel));
		assertFalse(validator.validateContaiment(opmProcess, opmDiagram));
		
		// test State
		assertFalse(validator.validateContaiment(opmState, opmObject));
		assertFalse(validator.validateContaiment(opmState, opmProcess));
		assertFalse(validator.validateContaiment(opmState, opmState));
		assertFalse(validator.validateContaiment(opmState, opmLabel));
		assertFalse(validator.validateContaiment(opmState, opmDiagram));
		
		// test Label
		assertFalse(validator.validateContaiment(opmLabel, opmObject));
		assertFalse(validator.validateContaiment(opmLabel, opmProcess));
		assertFalse(validator.validateContaiment(opmLabel, opmState));
		assertFalse(validator.validateContaiment(opmLabel, opmLabel));
		assertFalse(validator.validateContaiment(opmState, opmDiagram));		
	}

}
