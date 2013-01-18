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
		EClass currLink = OPMPackage.eINSTANCE.getOPMAggregationLink();
		
		assertTrue(validator.validateLink(opmObject, currLink));
		assertTrue(validator.validateLink(opmProcess, currLink));
		assertFalse(validator.validateLink(opmState, currLink));
		assertFalse(validator.validateLink(opmLabel, currLink));
		
		currLink = OPMPackage.eINSTANCE.getOPMExhibitionLink();
		
		assertTrue(validator.validateLink(opmObject, currLink));
		assertTrue(validator.validateLink(opmProcess, currLink));
		assertFalse(validator.validateLink(opmState, currLink));
		assertFalse(validator.validateLink(opmLabel, currLink));
		
		currLink = OPMPackage.eINSTANCE.getOPMGeneralizationLink();
		
		assertTrue(validator.validateLink(opmObject, currLink));
		assertTrue(validator.validateLink(opmProcess, currLink));
		assertFalse(validator.validateLink(opmState, currLink));
		assertFalse(validator.validateLink(opmLabel, currLink));
		
		currLink = OPMPackage.eINSTANCE.getOPMAgentLink();
		
		assertTrue(validator.validateLink(opmObject, currLink));
		assertFalse(validator.validateLink(opmProcess, currLink));
		assertTrue(validator.validateLink(opmState, currLink));
		assertFalse(validator.validateLink(opmLabel, currLink));
		
		currLink = OPMPackage.eINSTANCE.getOPMInstrumentLink();
		
		assertTrue(validator.validateLink(opmObject, currLink));
		assertFalse(validator.validateLink(opmProcess, currLink));
		assertTrue(validator.validateLink(opmState, currLink));
		assertFalse(validator.validateLink(opmLabel, currLink));
		
		currLink = OPMPackage.eINSTANCE.getOPMConsumptionLink();
		
		assertTrue(validator.validateLink(opmObject, currLink));
		assertFalse(validator.validateLink(opmProcess, currLink));
		assertTrue(validator.validateLink(opmState, currLink));
		assertFalse(validator.validateLink(opmLabel, currLink));
		
		currLink = OPMPackage.eINSTANCE.getOPMEffectLink();
		
		assertTrue(validator.validateLink(opmObject, currLink));
		assertFalse(validator.validateLink(opmProcess, currLink));
		assertTrue(validator.validateLink(opmState, currLink));
		assertFalse(validator.validateLink(opmLabel, currLink));
		
		currLink = OPMPackage.eINSTANCE.getOPMResultLink();
		
		assertFalse(validator.validateLink(opmObject, currLink));
		assertTrue(validator.validateLink(opmProcess, currLink));
		assertFalse(validator.validateLink(opmState, currLink));
		assertFalse(validator.validateLink(opmLabel, currLink));
		
		currLink = OPMPackage.eINSTANCE.getOPMInvocationLink();
		
		assertFalse(validator.validateLink(opmObject, currLink));
		assertTrue(validator.validateLink(opmProcess, currLink));
		assertFalse(validator.validateLink(opmState, currLink));
		assertFalse(validator.validateLink(opmLabel, currLink));
	}

	@Test
	public void testValidateLinkClassOfQClassOfQClassOfQ() {
		EClass currLink = OPMPackage.eINSTANCE.getOPMAggregationLink();
		testFromLinkToValidation(opmObject, currLink,true,false,false);
		testFromLinkToValidation(opmProcess, currLink,false,true,false);
		testFromLinkToValidation(opmState, currLink,false,false,false);
		testFromLinkToValidation(opmLabel, currLink,false,false,false);
		
		currLink = OPMPackage.eINSTANCE.getOPMExhibitionLink();
		testFromLinkToValidation(opmObject, currLink,true,true,false);
		testFromLinkToValidation(opmProcess, currLink,true,true,false);
		testFromLinkToValidation(opmState, currLink,false,false,false);
		testFromLinkToValidation(opmLabel, currLink,false,false,false);

		currLink = OPMPackage.eINSTANCE.getOPMGeneralizationLink();
		testFromLinkToValidation(opmObject, currLink,true,false,false);
		testFromLinkToValidation(opmProcess, currLink,false,true,false);
		testFromLinkToValidation(opmState, currLink,false,false,false);
		testFromLinkToValidation(opmLabel, currLink,false,false,false);

		currLink = OPMPackage.eINSTANCE.getOPMAgentLink();
		testFromLinkToValidation(opmObject, currLink,false,true,false);
		testFromLinkToValidation(opmProcess, currLink,false,false,false);
		testFromLinkToValidation(opmState, currLink,false,true,false);
		testFromLinkToValidation(opmLabel, currLink,false,false,false);

		currLink = OPMPackage.eINSTANCE.getOPMInstrumentLink();
		testFromLinkToValidation(opmObject, currLink,false,true,false);
		testFromLinkToValidation(opmProcess, currLink,false,false,false);
		testFromLinkToValidation(opmState, currLink,false,true,false);
		testFromLinkToValidation(opmLabel, currLink,false,false,false);
		
		currLink = OPMPackage.eINSTANCE.getOPMConsumptionLink();
		testFromLinkToValidation(opmObject, currLink,false,true,false);
		testFromLinkToValidation(opmProcess, currLink,false,false,false);
		testFromLinkToValidation(opmState, currLink,false,true,false);
		testFromLinkToValidation(opmLabel, currLink,false,false,false);
		
		currLink = OPMPackage.eINSTANCE.getOPMEffectLink();
		testFromLinkToValidation(opmObject, currLink,false,true,false);
		testFromLinkToValidation(opmProcess, currLink,false,false,false);
		testFromLinkToValidation(opmState, currLink,false,true,false);
		testFromLinkToValidation(opmLabel, currLink,false,false,false);
		
		currLink = OPMPackage.eINSTANCE.getOPMResultLink();
		testFromLinkToValidation(opmObject, currLink,false,false,false);
		testFromLinkToValidation(opmProcess, currLink,true,false,true);
		testFromLinkToValidation(opmState, currLink,false,false,false);
		testFromLinkToValidation(opmLabel, currLink,false,false,false);
		
		currLink = OPMPackage.eINSTANCE.getOPMInvocationLink();
		testFromLinkToValidation(opmObject, currLink,false,false,false);
		testFromLinkToValidation(opmProcess, currLink,false,true,false);
		testFromLinkToValidation(opmState, currLink,false,false,false);
		testFromLinkToValidation(opmLabel, currLink,false,false,false);
	}

	private void testFromLinkToValidation(EClass from, EClass link, boolean objectExpected, boolean processExpected, boolean stateExpected)
	{
		assertEquals(objectExpected, validator.validateLink(from, link,opmObject ));
		assertEquals(processExpected, validator.validateLink(from, link, opmProcess));
		assertEquals(stateExpected, validator.validateLink(from, link, opmState));
		assertFalse(validator.validateLink(from, link, opmLabel));
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
