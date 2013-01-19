/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmodel.model.util;

import com.vainolo.phd.opm.model.OPMNamedElement;
import com.vainolo.phd.opmodel.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.vainolo.phd.opmodel.model.opmodelPackage
 * @generated
 */
public class opmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static opmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public opmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = opmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected opmodelSwitch<Adapter> modelSwitch =
		new opmodelSwitch<Adapter>() {
			@Override
			public Adapter casekeyValuePair(keyValuePair object) {
				return createkeyValuePairAdapter();
			}
			@Override
			public Adapter caseInstanceBase(InstanceBase object) {
				return createInstanceBaseAdapter();
			}
			@Override
			public Adapter caseNodeInstance(NodeInstance object) {
				return createNodeInstanceAdapter();
			}
			@Override
			public Adapter caseLinkInstance(LinkInstance object) {
				return createLinkInstanceAdapter();
			}
			@Override
			public Adapter caseContainerInstance(ContainerInstance object) {
				return createContainerInstanceAdapter();
			}
			@Override
			public Adapter caseThingInstance(ThingInstance object) {
				return createThingInstanceAdapter();
			}
			@Override
			public Adapter caseTypeDescriptor(TypeDescriptor object) {
				return createTypeDescriptorAdapter();
			}
			@Override
			public Adapter casePropertyDescriptor(PropertyDescriptor object) {
				return createPropertyDescriptorAdapter();
			}
			@Override
			public Adapter caseOPmodelHolder(OPmodelHolder object) {
				return createOPmodelHolderAdapter();
			}
			@Override
			public Adapter caseOPmetaDefinition(OPmetaDefinition object) {
				return createOPmetaDefinitionAdapter();
			}
			@Override
			public Adapter casePropertyInstance(PropertyInstance object) {
				return createPropertyInstanceAdapter();
			}
			@Override
			public Adapter casePropertyIntInstance(PropertyIntInstance object) {
				return createPropertyIntInstanceAdapter();
			}
			@Override
			public Adapter casePropertyFloatInstance(PropertyFloatInstance object) {
				return createPropertyFloatInstanceAdapter();
			}
			@Override
			public Adapter casePropertyBooleanInstance(PropertyBooleanInstance object) {
				return createPropertyBooleanInstanceAdapter();
			}
			@Override
			public Adapter caseOPmodelLinkValidationRule(OPmodelLinkValidationRule object) {
				return createOPmodelLinkValidationRuleAdapter();
			}
			@Override
			public Adapter caseOPmodelContaimentValidationRule(OPmodelContaimentValidationRule object) {
				return createOPmodelContaimentValidationRuleAdapter();
			}
			@Override
			public Adapter caseOPMNamedElement(OPMNamedElement object) {
				return createOPMNamedElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opmodel.model.keyValuePair <em>key Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opmodel.model.keyValuePair
	 * @generated
	 */
	public Adapter createkeyValuePairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opmodel.model.InstanceBase <em>Instance Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opmodel.model.InstanceBase
	 * @generated
	 */
	public Adapter createInstanceBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opmodel.model.NodeInstance <em>Node Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opmodel.model.NodeInstance
	 * @generated
	 */
	public Adapter createNodeInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opmodel.model.LinkInstance <em>Link Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opmodel.model.LinkInstance
	 * @generated
	 */
	public Adapter createLinkInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opmodel.model.ContainerInstance <em>Container Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opmodel.model.ContainerInstance
	 * @generated
	 */
	public Adapter createContainerInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opmodel.model.ThingInstance <em>Thing Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opmodel.model.ThingInstance
	 * @generated
	 */
	public Adapter createThingInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opmodel.model.TypeDescriptor <em>Type Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opmodel.model.TypeDescriptor
	 * @generated
	 */
	public Adapter createTypeDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opmodel.model.PropertyDescriptor <em>Property Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opmodel.model.PropertyDescriptor
	 * @generated
	 */
	public Adapter createPropertyDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opmodel.model.OPmodelHolder <em>OPmodel Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opmodel.model.OPmodelHolder
	 * @generated
	 */
	public Adapter createOPmodelHolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opmodel.model.OPmetaDefinition <em>OPmeta Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opmodel.model.OPmetaDefinition
	 * @generated
	 */
	public Adapter createOPmetaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opmodel.model.PropertyInstance <em>Property Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opmodel.model.PropertyInstance
	 * @generated
	 */
	public Adapter createPropertyInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opmodel.model.PropertyIntInstance <em>Property Int Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opmodel.model.PropertyIntInstance
	 * @generated
	 */
	public Adapter createPropertyIntInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opmodel.model.PropertyFloatInstance <em>Property Float Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opmodel.model.PropertyFloatInstance
	 * @generated
	 */
	public Adapter createPropertyFloatInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opmodel.model.PropertyBooleanInstance <em>Property Boolean Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opmodel.model.PropertyBooleanInstance
	 * @generated
	 */
	public Adapter createPropertyBooleanInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opmodel.model.OPmodelLinkValidationRule <em>OPmodel Link Validation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opmodel.model.OPmodelLinkValidationRule
	 * @generated
	 */
	public Adapter createOPmodelLinkValidationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opmodel.model.OPmodelContaimentValidationRule <em>OPmodel Contaiment Validation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opmodel.model.OPmodelContaimentValidationRule
	 * @generated
	 */
	public Adapter createOPmodelContaimentValidationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opm.model.OPMNamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opm.model.OPMNamedElement
	 * @generated
	 */
	public Adapter createOPMNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //opmodelAdapterFactory
