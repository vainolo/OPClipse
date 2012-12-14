/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model.util;

import com.vainolo.phd.opmeta.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.vainolo.phd.opmeta.model.opmetaPackage
 * @generated
 */
public class opmetaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static opmetaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public opmetaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = opmetaPackage.eINSTANCE;
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
	protected opmetaSwitch<Adapter> modelSwitch =
		new opmetaSwitch<Adapter>() {
			@Override
			public Adapter caseOPMetaModelDiagram(OPMetaModelDiagram object) {
				return createOPMetaModelDiagramAdapter();
			}
			@Override
			public Adapter caseOPMetaModelContaimentValidationRule(OPMetaModelContaimentValidationRule object) {
				return createOPMetaModelContaimentValidationRuleAdapter();
			}
			@Override
			public Adapter caseOPMetaModelLinkValidationRule(OPMetaModelLinkValidationRule object) {
				return createOPMetaModelLinkValidationRuleAdapter();
			}
			@Override
			public Adapter caseOPModel(OPModel object) {
				return createOPModelAdapter();
			}
			@Override
			public Adapter caseInstanceBase(InstanceBase object) {
				return createInstanceBaseAdapter();
			}
			@Override
			public Adapter caseNodeInstanceBase(NodeInstanceBase object) {
				return createNodeInstanceBaseAdapter();
			}
			@Override
			public Adapter caseContainerInstanceBase(ContainerInstanceBase object) {
				return createContainerInstanceBaseAdapter();
			}
			@Override
			public Adapter caseLinkInstanceBase(LinkInstanceBase object) {
				return createLinkInstanceBaseAdapter();
			}
			@Override
			public Adapter caseThingInstanceBase(ThingInstanceBase object) {
				return createThingInstanceBaseAdapter();
			}
			@Override
			public Adapter caseKeyValuePair(KeyValuePair object) {
				return createKeyValuePairAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opmeta.model.OPMetaModelDiagram <em>OP Meta Model Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opmeta.model.OPMetaModelDiagram
	 * @generated
	 */
	public Adapter createOPMetaModelDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opmeta.model.OPMetaModelContaimentValidationRule <em>OP Meta Model Contaiment Validation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opmeta.model.OPMetaModelContaimentValidationRule
	 * @generated
	 */
	public Adapter createOPMetaModelContaimentValidationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule <em>OP Meta Model Link Validation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule
	 * @generated
	 */
	public Adapter createOPMetaModelLinkValidationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opmeta.model.OPModel <em>OP Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opmeta.model.OPModel
	 * @generated
	 */
	public Adapter createOPModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opmeta.model.InstanceBase <em>Instance Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opmeta.model.InstanceBase
	 * @generated
	 */
	public Adapter createInstanceBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opmeta.model.NodeInstanceBase <em>Node Instance Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opmeta.model.NodeInstanceBase
	 * @generated
	 */
	public Adapter createNodeInstanceBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opmeta.model.ContainerInstanceBase <em>Container Instance Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opmeta.model.ContainerInstanceBase
	 * @generated
	 */
	public Adapter createContainerInstanceBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opmeta.model.LinkInstanceBase <em>Link Instance Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opmeta.model.LinkInstanceBase
	 * @generated
	 */
	public Adapter createLinkInstanceBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opmeta.model.ThingInstanceBase <em>Thing Instance Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opmeta.model.ThingInstanceBase
	 * @generated
	 */
	public Adapter createThingInstanceBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.vainolo.phd.opmeta.model.KeyValuePair <em>Key Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.vainolo.phd.opmeta.model.KeyValuePair
	 * @generated
	 */
	public Adapter createKeyValuePairAdapter() {
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

} //opmetaAdapterFactory
