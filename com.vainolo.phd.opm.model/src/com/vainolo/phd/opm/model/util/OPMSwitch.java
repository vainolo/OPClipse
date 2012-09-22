/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opm.model.util;

import com.vainolo.phd.opm.model.*;

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
 * @see com.vainolo.phd.opm.model.OPMPackage
 * @generated
 */
public class OPMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OPMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMSwitch() {
		if (modelPackage == null) {
			modelPackage = OPMPackage.eINSTANCE;
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
			case OPMPackage.OPM_ELEMENT_WITH_ID: {
				OPMElementWithID opmElementWithID = (OPMElementWithID)theEObject;
				T result = caseOPMElementWithID(opmElementWithID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.OPM_NAMED_ELEMENT: {
				OPMNamedElement opmNamedElement = (OPMNamedElement)theEObject;
				T result = caseOPMNamedElement(opmNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.OPM_CONTAINER: {
				OPMContainer opmContainer = (OPMContainer)theEObject;
				T result = caseOPMContainer(opmContainer);
				if (result == null) result = caseOPMElementWithID(opmContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.OPM_NODE: {
				OPMNode opmNode = (OPMNode)theEObject;
				T result = caseOPMNode(opmNode);
				if (result == null) result = caseOPMElementWithID(opmNode);
				if (result == null) result = caseOPMNamedElement(opmNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM: {
				OPMObjectProcessDiagram opmObjectProcessDiagram = (OPMObjectProcessDiagram)theEObject;
				T result = caseOPMObjectProcessDiagram(opmObjectProcessDiagram);
				if (result == null) result = caseOPMContainer(opmObjectProcessDiagram);
				if (result == null) result = caseOPMNamedElement(opmObjectProcessDiagram);
				if (result == null) result = caseOPMElementWithID(opmObjectProcessDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.OPM_THING: {
				OPMThing opmThing = (OPMThing)theEObject;
				T result = caseOPMThing(opmThing);
				if (result == null) result = caseOPMNode(opmThing);
				if (result == null) result = caseOPMContainer(opmThing);
				if (result == null) result = caseOPMElementWithID(opmThing);
				if (result == null) result = caseOPMNamedElement(opmThing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.OPM_STATE: {
				OPMState opmState = (OPMState)theEObject;
				T result = caseOPMState(opmState);
				if (result == null) result = caseOPMNode(opmState);
				if (result == null) result = caseOPMElementWithID(opmState);
				if (result == null) result = caseOPMNamedElement(opmState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.OPM_OBJECT: {
				OPMObject opmObject = (OPMObject)theEObject;
				T result = caseOPMObject(opmObject);
				if (result == null) result = caseOPMThing(opmObject);
				if (result == null) result = caseOPMNode(opmObject);
				if (result == null) result = caseOPMContainer(opmObject);
				if (result == null) result = caseOPMElementWithID(opmObject);
				if (result == null) result = caseOPMNamedElement(opmObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.OPM_PROCESS: {
				OPMProcess opmProcess = (OPMProcess)theEObject;
				T result = caseOPMProcess(opmProcess);
				if (result == null) result = caseOPMThing(opmProcess);
				if (result == null) result = caseOPMNode(opmProcess);
				if (result == null) result = caseOPMContainer(opmProcess);
				if (result == null) result = caseOPMElementWithID(opmProcess);
				if (result == null) result = caseOPMNamedElement(opmProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.OPM_LINK: {
				OPMLink opmLink = (OPMLink)theEObject;
				T result = caseOPMLink(opmLink);
				if (result == null) result = caseOPMElementWithID(opmLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.OPM_PROCEDURAL_LINK: {
				OPMProceduralLink opmProceduralLink = (OPMProceduralLink)theEObject;
				T result = caseOPMProceduralLink(opmProceduralLink);
				if (result == null) result = caseOPMLink(opmProceduralLink);
				if (result == null) result = caseOPMElementWithID(opmProceduralLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = caseOPMNode(label);
				if (result == null) result = caseOPMElementWithID(label);
				if (result == null) result = caseOPMNamedElement(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.OPM_AGENT_LINK: {
				OPMAgentLink opmAgentLink = (OPMAgentLink)theEObject;
				T result = caseOPMAgentLink(opmAgentLink);
				if (result == null) result = caseOPMProceduralLink(opmAgentLink);
				if (result == null) result = caseOPMLink(opmAgentLink);
				if (result == null) result = caseOPMElementWithID(opmAgentLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.OPM_EFFECT_LINK: {
				OPMEffectLink opmEffectLink = (OPMEffectLink)theEObject;
				T result = caseOPMEffectLink(opmEffectLink);
				if (result == null) result = caseOPMProceduralLink(opmEffectLink);
				if (result == null) result = caseOPMLink(opmEffectLink);
				if (result == null) result = caseOPMElementWithID(opmEffectLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.OPM_EFFECT_EVENT_LINK: {
				OPMEffectEventLink opmEffectEventLink = (OPMEffectEventLink)theEObject;
				T result = caseOPMEffectEventLink(opmEffectEventLink);
				if (result == null) result = caseOPMProceduralLink(opmEffectEventLink);
				if (result == null) result = caseOPMLink(opmEffectEventLink);
				if (result == null) result = caseOPMElementWithID(opmEffectEventLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.OPM_EFFECT_CONDITION_LINK: {
				OPMEffectConditionLink opmEffectConditionLink = (OPMEffectConditionLink)theEObject;
				T result = caseOPMEffectConditionLink(opmEffectConditionLink);
				if (result == null) result = caseOPMProceduralLink(opmEffectConditionLink);
				if (result == null) result = caseOPMLink(opmEffectConditionLink);
				if (result == null) result = caseOPMElementWithID(opmEffectConditionLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.OPM_RESULT_LINK: {
				OPMResultLink opmResultLink = (OPMResultLink)theEObject;
				T result = caseOPMResultLink(opmResultLink);
				if (result == null) result = caseOPMProceduralLink(opmResultLink);
				if (result == null) result = caseOPMLink(opmResultLink);
				if (result == null) result = caseOPMElementWithID(opmResultLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.OPM_INVOCATION_LINK: {
				OPMInvocationLink opmInvocationLink = (OPMInvocationLink)theEObject;
				T result = caseOPMInvocationLink(opmInvocationLink);
				if (result == null) result = caseOPMProceduralLink(opmInvocationLink);
				if (result == null) result = caseOPMLink(opmInvocationLink);
				if (result == null) result = caseOPMElementWithID(opmInvocationLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.OPM_INSTRUMENT_LINK: {
				OPMInstrumentLink opmInstrumentLink = (OPMInstrumentLink)theEObject;
				T result = caseOPMInstrumentLink(opmInstrumentLink);
				if (result == null) result = caseOPMProceduralLink(opmInstrumentLink);
				if (result == null) result = caseOPMLink(opmInstrumentLink);
				if (result == null) result = caseOPMElementWithID(opmInstrumentLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.OPM_INSTRUMENT_EVENT_LINK: {
				OPMInstrumentEventLink opmInstrumentEventLink = (OPMInstrumentEventLink)theEObject;
				T result = caseOPMInstrumentEventLink(opmInstrumentEventLink);
				if (result == null) result = caseOPMProceduralLink(opmInstrumentEventLink);
				if (result == null) result = caseOPMLink(opmInstrumentEventLink);
				if (result == null) result = caseOPMElementWithID(opmInstrumentEventLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.OPM_INSTRUMENT_CONDITION_LINK: {
				OPMInstrumentConditionLink opmInstrumentConditionLink = (OPMInstrumentConditionLink)theEObject;
				T result = caseOPMInstrumentConditionLink(opmInstrumentConditionLink);
				if (result == null) result = caseOPMProceduralLink(opmInstrumentConditionLink);
				if (result == null) result = caseOPMLink(opmInstrumentConditionLink);
				if (result == null) result = caseOPMElementWithID(opmInstrumentConditionLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.OPM_CONSUMPTION_LINK: {
				OPMConsumptionLink opmConsumptionLink = (OPMConsumptionLink)theEObject;
				T result = caseOPMConsumptionLink(opmConsumptionLink);
				if (result == null) result = caseOPMProceduralLink(opmConsumptionLink);
				if (result == null) result = caseOPMLink(opmConsumptionLink);
				if (result == null) result = caseOPMElementWithID(opmConsumptionLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.OPM_CONSUMPTION_EVENT_LINK: {
				OPMConsumptionEventLink opmConsumptionEventLink = (OPMConsumptionEventLink)theEObject;
				T result = caseOPMConsumptionEventLink(opmConsumptionEventLink);
				if (result == null) result = caseOPMProceduralLink(opmConsumptionEventLink);
				if (result == null) result = caseOPMLink(opmConsumptionEventLink);
				if (result == null) result = caseOPMElementWithID(opmConsumptionEventLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.OPM_CONSUMPTION_CONDITION_LINK: {
				OPMConsumptionConditionLink opmConsumptionConditionLink = (OPMConsumptionConditionLink)theEObject;
				T result = caseOPMConsumptionConditionLink(opmConsumptionConditionLink);
				if (result == null) result = caseOPMProceduralLink(opmConsumptionConditionLink);
				if (result == null) result = caseOPMLink(opmConsumptionConditionLink);
				if (result == null) result = caseOPMElementWithID(opmConsumptionConditionLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.OPM_STRUCTURAL_LINK: {
				OPMStructuralLink opmStructuralLink = (OPMStructuralLink)theEObject;
				T result = caseOPMStructuralLink(opmStructuralLink);
				if (result == null) result = caseOPMLink(opmStructuralLink);
				if (result == null) result = caseOPMElementWithID(opmStructuralLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.OPM_AGGREGATION_LINK: {
				OPMAggregationLink opmAggregationLink = (OPMAggregationLink)theEObject;
				T result = caseOPMAggregationLink(opmAggregationLink);
				if (result == null) result = caseOPMStructuralLink(opmAggregationLink);
				if (result == null) result = caseOPMLink(opmAggregationLink);
				if (result == null) result = caseOPMElementWithID(opmAggregationLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.OPM_EXHIBITION_LINK: {
				OPMExhibitionLink opmExhibitionLink = (OPMExhibitionLink)theEObject;
				T result = caseOPMExhibitionLink(opmExhibitionLink);
				if (result == null) result = caseOPMStructuralLink(opmExhibitionLink);
				if (result == null) result = caseOPMLink(opmExhibitionLink);
				if (result == null) result = caseOPMElementWithID(opmExhibitionLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPMPackage.OPM_GENERALIZATION_LINK: {
				OPMGeneralizationLink opmGeneralizationLink = (OPMGeneralizationLink)theEObject;
				T result = caseOPMGeneralizationLink(opmGeneralizationLink);
				if (result == null) result = caseOPMStructuralLink(opmGeneralizationLink);
				if (result == null) result = caseOPMLink(opmGeneralizationLink);
				if (result == null) result = caseOPMElementWithID(opmGeneralizationLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseOPMContainer(OPMContainer object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Element With ID</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element With ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseOPMElementWithID(OPMElementWithID object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Object Process Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Process Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPMObjectProcessDiagram(OPMObjectProcessDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPMObject(OPMObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPMProcess(OPMProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPMLink(OPMLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPMThing(OPMThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseOPMState(OPMState object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPMNode(OPMNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedural Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedural Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPMProceduralLink(OPMProceduralLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseOPMNamedElement(OPMNamedElement object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPMAgentLink(OPMAgentLink object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Effect Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effect Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPMEffectLink(OPMEffectLink object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Effect Event Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effect Event Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPMEffectEventLink(OPMEffectEventLink object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Effect Condition Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effect Condition Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPMEffectConditionLink(OPMEffectConditionLink object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPMResultLink(OPMResultLink object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Invocation Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invocation Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPMInvocationLink(OPMInvocationLink object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Instrument Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instrument Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPMInstrumentLink(OPMInstrumentLink object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Instrument Event Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instrument Event Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPMInstrumentEventLink(OPMInstrumentEventLink object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Instrument Condition Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instrument Condition Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPMInstrumentConditionLink(OPMInstrumentConditionLink object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Consumption Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consumption Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPMConsumptionLink(OPMConsumptionLink object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Consumption Event Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consumption Event Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPMConsumptionEventLink(OPMConsumptionEventLink object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Consumption Condition Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consumption Condition Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPMConsumptionConditionLink(OPMConsumptionConditionLink object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPMStructuralLink(OPMStructuralLink object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPMAggregationLink(OPMAggregationLink object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Exhibition Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exhibition Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPMExhibitionLink(OPMExhibitionLink object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPMGeneralizationLink(OPMGeneralizationLink object) {
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

} //OPMSwitch
