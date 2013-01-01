/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmodel.model.util;

import com.vainolo.phd.opm.model.OPMNamedElement;
import com.vainolo.phd.opmodel.model.*;

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
 * @see com.vainolo.phd.opmodel.model.opmodelPackage
 * @generated
 */
public class opmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static opmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public opmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = opmodelPackage.eINSTANCE;
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
			case opmodelPackage.KEY_VALUE_PAIR: {
				keyValuePair keyValuePair = (keyValuePair)theEObject;
				T result = casekeyValuePair(keyValuePair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case opmodelPackage.INSTANCE_BASE: {
				InstanceBase instanceBase = (InstanceBase)theEObject;
				T result = caseInstanceBase(instanceBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case opmodelPackage.NODE_INSTANCE: {
				NodeInstance nodeInstance = (NodeInstance)theEObject;
				T result = caseNodeInstance(nodeInstance);
				if (result == null) result = caseInstanceBase(nodeInstance);
				if (result == null) result = caseOPMNamedElement(nodeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case opmodelPackage.LINK_INSTANCE: {
				LinkInstance linkInstance = (LinkInstance)theEObject;
				T result = caseLinkInstance(linkInstance);
				if (result == null) result = caseInstanceBase(linkInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case opmodelPackage.CONTAINER_INSTANCE: {
				ContainerInstance containerInstance = (ContainerInstance)theEObject;
				T result = caseContainerInstance(containerInstance);
				if (result == null) result = caseInstanceBase(containerInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case opmodelPackage.THING_INSTANCE: {
				ThingInstance thingInstance = (ThingInstance)theEObject;
				T result = caseThingInstance(thingInstance);
				if (result == null) result = caseNodeInstance(thingInstance);
				if (result == null) result = caseContainerInstance(thingInstance);
				if (result == null) result = caseInstanceBase(thingInstance);
				if (result == null) result = caseOPMNamedElement(thingInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case opmodelPackage.TYPE_DESCRIPTOR: {
				TypeDescriptor typeDescriptor = (TypeDescriptor)theEObject;
				T result = caseTypeDescriptor(typeDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case opmodelPackage.PROPERTY_DESCRIPTOR: {
				PropertyDescriptor propertyDescriptor = (PropertyDescriptor)theEObject;
				T result = casePropertyDescriptor(propertyDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case opmodelPackage.OPMODEL_HOLDER: {
				OPmodelHolder oPmodelHolder = (OPmodelHolder)theEObject;
				T result = caseOPmodelHolder(oPmodelHolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case opmodelPackage.OPMETA_DEFINITION: {
				OPmetaDefinition oPmetaDefinition = (OPmetaDefinition)theEObject;
				T result = caseOPmetaDefinition(oPmetaDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case opmodelPackage.PROPERTY_INSTANCE: {
				PropertyInstance propertyInstance = (PropertyInstance)theEObject;
				T result = casePropertyInstance(propertyInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case opmodelPackage.PROPERTY_INT_INSTANCE: {
				PropertyIntInstance propertyIntInstance = (PropertyIntInstance)theEObject;
				T result = casePropertyIntInstance(propertyIntInstance);
				if (result == null) result = casePropertyInstance(propertyIntInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case opmodelPackage.PROPERTY_FLOAT_INSTANCE: {
				PropertyFloatInstance propertyFloatInstance = (PropertyFloatInstance)theEObject;
				T result = casePropertyFloatInstance(propertyFloatInstance);
				if (result == null) result = casePropertyInstance(propertyFloatInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case opmodelPackage.PROPERTY_BOOLEAN_INSTANCE: {
				PropertyBooleanInstance propertyBooleanInstance = (PropertyBooleanInstance)theEObject;
				T result = casePropertyBooleanInstance(propertyBooleanInstance);
				if (result == null) result = casePropertyInstance(propertyBooleanInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>key Value Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>key Value Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casekeyValuePair(keyValuePair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceBase(InstanceBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeInstance(NodeInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkInstance(LinkInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerInstance(ContainerInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thing Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thing Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThingInstance(ThingInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDescriptor(TypeDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyDescriptor(PropertyDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OPmodel Holder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OPmodel Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPmodelHolder(OPmodelHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OPmeta Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OPmeta Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPmetaDefinition(OPmetaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyInstance(PropertyInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Int Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Int Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyIntInstance(PropertyIntInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Float Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Float Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyFloatInstance(PropertyFloatInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Boolean Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Boolean Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyBooleanInstance(PropertyBooleanInstance object) {
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

} //opmodelSwitch
