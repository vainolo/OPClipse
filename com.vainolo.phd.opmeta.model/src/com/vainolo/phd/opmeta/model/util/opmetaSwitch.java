/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model.util;

import com.vainolo.phd.opmeta.model.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.vainolo.phd.opmeta.model.opmetaPackage
 * @generated
 */
public class opmetaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static opmetaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public opmetaSwitch() {
		if (modelPackage == null) {
			modelPackage = opmetaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case opmetaPackage.OP_META_MODEL_DIAGRAM: {
				OPMetaModelDiagram opMetaModelDiagram = (OPMetaModelDiagram)theEObject;
				T result = caseOPMetaModelDiagram(opMetaModelDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case opmetaPackage.OP_META_MODEL_CONTAIMENT_VALIDATION_RULE: {
				OPMetaModelContaimentValidationRule opMetaModelContaimentValidationRule = (OPMetaModelContaimentValidationRule)theEObject;
				T result = caseOPMetaModelContaimentValidationRule(opMetaModelContaimentValidationRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case opmetaPackage.OP_META_MODEL_LINK_VALIDATION_RULE: {
				OPMetaModelLinkValidationRule opMetaModelLinkValidationRule = (OPMetaModelLinkValidationRule)theEObject;
				T result = caseOPMetaModelLinkValidationRule(opMetaModelLinkValidationRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OP Meta Model Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OP Meta Model Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPMetaModelDiagram(OPMetaModelDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OP Meta Model Contaiment Validation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OP Meta Model Contaiment Validation Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPMetaModelContaimentValidationRule(OPMetaModelContaimentValidationRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OP Meta Model Link Validation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OP Meta Model Link Validation Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPMetaModelLinkValidationRule(OPMetaModelLinkValidationRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //opmetaSwitch
