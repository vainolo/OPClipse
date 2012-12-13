/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model.impl;

import com.vainolo.phd.opmeta.model.*;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class opmetaFactoryImpl extends EFactoryImpl implements opmetaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static opmetaFactory init() {
		try {
			opmetaFactory theopmetaFactory = (opmetaFactory)EPackage.Registry.INSTANCE.getEFactory("www.vainolo.com/phd/opmeta"); 
			if (theopmetaFactory != null) {
				return theopmetaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new opmetaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public opmetaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case opmetaPackage.OP_META_MODEL_DIAGRAM: return createOPMetaModelDiagram();
			case opmetaPackage.OP_META_MODEL_CONTAIMENT_VALIDATION_RULE: return createOPMetaModelContaimentValidationRule();
			case opmetaPackage.OP_META_MODEL_LINK_VALIDATION_RULE: return createOPMetaModelLinkValidationRule();
			case opmetaPackage.OP_MODEL: return createOPModel();
			case opmetaPackage.NODE_INSTANCE_BASE: return createNodeInstanceBase();
			case opmetaPackage.CONTAINER_INSTANCE_BASE: return createContainerInstanceBase();
			case opmetaPackage.LINK_INSTANCE_BASE: return createLinkInstanceBase();
			case opmetaPackage.THING_INSTANCE_BASE: return createThingInstanceBase();
			case opmetaPackage.KEY_VALUE_PAIR: return createKeyValuePair();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case opmetaPackage.RECTANGLE:
				return createRectangleFromString(eDataType, initialValue);
			case opmetaPackage.POINT:
				return createPointFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case opmetaPackage.RECTANGLE:
				return convertRectangleToString(eDataType, instanceValue);
			case opmetaPackage.POINT:
				return convertPointToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMetaModelDiagram createOPMetaModelDiagram() {
		OPMetaModelDiagramImpl opMetaModelDiagram = new OPMetaModelDiagramImpl();
		return opMetaModelDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMetaModelContaimentValidationRule createOPMetaModelContaimentValidationRule() {
		OPMetaModelContaimentValidationRuleImpl opMetaModelContaimentValidationRule = new OPMetaModelContaimentValidationRuleImpl();
		return opMetaModelContaimentValidationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMetaModelLinkValidationRule createOPMetaModelLinkValidationRule() {
		OPMetaModelLinkValidationRuleImpl opMetaModelLinkValidationRule = new OPMetaModelLinkValidationRuleImpl();
		return opMetaModelLinkValidationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPModel createOPModel() {
		OPModelImpl opModel = new OPModelImpl();
		return opModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeInstanceBase createNodeInstanceBase() {
		NodeInstanceBaseImpl nodeInstanceBase = new NodeInstanceBaseImpl();
		return nodeInstanceBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerInstanceBase createContainerInstanceBase() {
		ContainerInstanceBaseImpl containerInstanceBase = new ContainerInstanceBaseImpl();
		return containerInstanceBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkInstanceBase createLinkInstanceBase() {
		LinkInstanceBaseImpl linkInstanceBase = new LinkInstanceBaseImpl();
		return linkInstanceBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThingInstanceBase createThingInstanceBase() {
		ThingInstanceBaseImpl thingInstanceBase = new ThingInstanceBaseImpl();
		return thingInstanceBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValuePair createKeyValuePair() {
		KeyValuePairImpl keyValuePair = new KeyValuePairImpl();
		return keyValuePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Create a <code>Rectangle</code> instance from a <code>String</code>. The expected
	 * representation is "x,y,width,height". Illegal representations will return a null
	 * value. 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Rectangle createRectangleFromString(EDataType eDataType, String initialValue) {
		if(initialValue == null) {
			return null;
		}
		initialValue.replaceAll("\\s", "");
		String[] values = initialValue.split(",");
		if(values.length != 4) {
			return null;
		}

		Rectangle rect = new Rectangle();
		try {
			rect.setLocation(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
			rect.setSize(Integer.parseInt(values[2]), Integer.parseInt(values[3]));
		} catch(NumberFormatException e) {
			EcorePlugin.INSTANCE.log(e);
			rect = null;
		}
		return rect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Convert a <code>Rectangle</code> to a <code>String</code> representation. The
	 * <code>Rectangle</code> is represented as "x,y,width,height". 
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	public String convertRectangleToString(EDataType eDataType, Object instanceValue) {
		if(instanceValue == null) {
			return null;
		}
		Rectangle rect = (Rectangle) instanceValue;
		return rect.x+","+rect.y+","+rect.width+","+rect.height;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createPointFromString(EDataType eDataType, String initialValue) {
		return (Point)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPointToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public opmetaPackage getopmetaPackage() {
		return (opmetaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static opmetaPackage getPackage() {
		return opmetaPackage.eINSTANCE;
	}
	
	

} //opmetaFactoryImpl
