package com.vainolo.phd.opm.validation;

import org.eclipse.emf.ecore.EClass;

import com.vainolo.phd.opm.model.OPMContainer;
import com.vainolo.phd.opm.model.OPMNode;

public interface OpmValidator {

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpmValidator eINSTANCE = com.vainolo.phd.opm.validation.impl.OpmValidatorImpl.init();
	
	boolean validateLink(OPMNode from, EClass linkType);
	
	boolean validateLink(EClass fromType, EClass linkType);
	
	boolean validateLink(OPMNode from, EClass link, OPMNode to);
	
	boolean validateLink(EClass fromType, EClass link, EClass toType);
	
	boolean validateContaiment(OPMContainer container, EClass node);
	
	boolean validateContaiment(EClass container, EClass node);
	
}
