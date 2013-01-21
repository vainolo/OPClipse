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
	public void testValidateContainment() {
		
		// test Diagram
		assertTrue(validator.validateContainment(opmDiagram, opmObject));
		assertTrue(validator.validateContainment(opmDiagram, opmProcess));
		assertFalse(validator.validateContainment(opmDiagram, opmState));
		assertTrue(validator.validateContainment(opmDiagram, opmLabel));
		assertFalse(validator.validateContainment(opmDiagram, opmDiagram));
		
		// test Object
		assertTrue(validator.validateContainment(opmObject, opmObject));
		assertTrue(validator.validateContainment(opmObject, opmProcess));
		assertTrue(validator.validateContainment(opmObject, opmState));
		assertFalse(validator.validateContainment(opmObject, opmLabel));
		assertFalse(validator.validateContainment(opmObject, opmDiagram));
		
		// test Process
		assertTrue(validator.validateContainment(opmProcess, opmObject));
		assertTrue(validator.validateContainment(opmProcess, opmProcess));
		assertFalse(validator.validateContainment(opmProcess, opmState));
		assertFalse(validator.validateContainment(opmProcess, opmLabel));
		assertFalse(validator.validateContainment(opmProcess, opmDiagram));
		
		// test State
		assertFalse(validator.validateContainment(opmState, opmObject));
		assertFalse(validator.validateContainment(opmState, opmProcess));
		assertFalse(validator.validateContainment(opmState, opmState));
		assertFalse(validator.validateContainment(opmState, opmLabel));
		assertFalse(validator.validateContainment(opmState, opmDiagram));
		
		// test Label
		assertFalse(validator.validateContainment(opmLabel, opmObject));
		assertFalse(validator.validateContainment(opmLabel, opmProcess));
		assertFalse(validator.validateContainment(opmLabel, opmState));
		assertFalse(validator.validateContainment(opmLabel, opmLabel));
		assertFalse(validator.validateContainment(opmState, opmDiagram));		
	}

}
