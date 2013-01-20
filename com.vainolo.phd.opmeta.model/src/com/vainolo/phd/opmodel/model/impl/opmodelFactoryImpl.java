/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmodel.model.impl;

import com.vainolo.phd.opmodel.model.*;

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
public class opmodelFactoryImpl extends EFactoryImpl implements opmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static opmodelFactory init() {
		try {
			opmodelFactory theopmodelFactory = (opmodelFactory)EPackage.Registry.INSTANCE.getEFactory("www.vainolo.com/phd/opmodel"); 
			if (theopmodelFactory != null) {
				return theopmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new opmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public opmodelFactoryImpl() {
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
			case opmodelPackage.KEY_VALUE_PAIR: return createkeyValuePair();
			case opmodelPackage.NODE_INSTANCE: return createNodeInstance();
			case opmodelPackage.LINK_INSTANCE: return createLinkInstance();
			case opmodelPackage.CONTAINER_INSTANCE: return createContainerInstance();
			case opmodelPackage.THING_INSTANCE: return createThingInstance();
			case opmodelPackage.TYPE_DESCRIPTOR: return createTypeDescriptor();
			case opmodelPackage.PROPERTY_DESCRIPTOR: return createPropertyDescriptor();
			case opmodelPackage.OPMODEL_HOLDER: return createOPmodelHolder();
			case opmodelPackage.OPMETA_DEFINITION: return createOPmetaDefinition();
			case opmodelPackage.PROPERTY_INSTANCE: return createPropertyInstance();
			case opmodelPackage.PROPERTY_INT_INSTANCE: return createPropertyIntInstance();
			case opmodelPackage.PROPERTY_FLOAT_INSTANCE: return createPropertyFloatInstance();
			case opmodelPackage.PROPERTY_BOOLEAN_INSTANCE: return createPropertyBooleanInstance();
			case opmodelPackage.OPMODEL_LINK_VALIDATION_RULE: return createOPmodelLinkValidationRule();
			case opmodelPackage.OPMODEL_CONTAINMENT_VALIDATION_RULE: return createOPmodelContainmentValidationRule();
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
			case opmodelPackage.PROPERTY_TYPE:
				return createpropertyTypeFromString(eDataType, initialValue);
			case opmodelPackage.RECTANGLE:
				return createRectangleFromString(eDataType, initialValue);
			case opmodelPackage.POINT:
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
			case opmodelPackage.PROPERTY_TYPE:
				return convertpropertyTypeToString(eDataType, instanceValue);
			case opmodelPackage.RECTANGLE:
				return convertRectangleToString(eDataType, instanceValue);
			case opmodelPackage.POINT:
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
	public keyValuePair createkeyValuePair() {
		keyValuePairImpl keyValuePair = new keyValuePairImpl();
		return keyValuePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeInstance createNodeInstance() {
		NodeInstanceImpl nodeInstance = new NodeInstanceImpl();
		return nodeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkInstance createLinkInstance() {
		LinkInstanceImpl linkInstance = new LinkInstanceImpl();
		return linkInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerInstance createContainerInstance() {
		ContainerInstanceImpl containerInstance = new ContainerInstanceImpl();
		return containerInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThingInstance createThingInstance() {
		ThingInstanceImpl thingInstance = new ThingInstanceImpl();
		return thingInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDescriptor createTypeDescriptor() {
		TypeDescriptorImpl typeDescriptor = new TypeDescriptorImpl();
		return typeDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyDescriptor createPropertyDescriptor() {
		PropertyDescriptorImpl propertyDescriptor = new PropertyDescriptorImpl();
		return propertyDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPmodelHolder createOPmodelHolder() {
		OPmodelHolderImpl oPmodelHolder = new OPmodelHolderImpl();
		return oPmodelHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPmetaDefinition createOPmetaDefinition() {
		OPmetaDefinitionImpl oPmetaDefinition = new OPmetaDefinitionImpl();
		return oPmetaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyInstance createPropertyInstance() {
		PropertyInstanceImpl propertyInstance = new PropertyInstanceImpl();
		return propertyInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyIntInstance createPropertyIntInstance() {
		PropertyIntInstanceImpl propertyIntInstance = new PropertyIntInstanceImpl();
		return propertyIntInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyFloatInstance createPropertyFloatInstance() {
		PropertyFloatInstanceImpl propertyFloatInstance = new PropertyFloatInstanceImpl();
		return propertyFloatInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyBooleanInstance createPropertyBooleanInstance() {
		PropertyBooleanInstanceImpl propertyBooleanInstance = new PropertyBooleanInstanceImpl();
		return propertyBooleanInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPmodelLinkValidationRule createOPmodelLinkValidationRule() {
		OPmodelLinkValidationRuleImpl oPmodelLinkValidationRule = new OPmodelLinkValidationRuleImpl();
		return oPmodelLinkValidationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPmodelContainmentValidationRule createOPmodelContainmentValidationRule() {
		OPmodelContainmentValidationRuleImpl oPmodelContainmentValidationRule = new OPmodelContainmentValidationRuleImpl();
		return oPmodelContainmentValidationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public propertyType createpropertyTypeFromString(EDataType eDataType, String initialValue) {
		propertyType result = propertyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertpropertyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
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
	 * @generated NOT
	 */
	public Point createPointFromString(EDataType eDataType, String initialValue) {
		if(initialValue == null) {
			return null;
		}
		initialValue.replaceAll("\\s", "");
		String[] values = initialValue.split(",");
		if(values.length != 2) {
			return null;
		}
		
		Point point = new Point();
		try { 
			point.setLocation(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
		} catch(NumberFormatException e) {
			EcorePlugin.INSTANCE.log(e);
			point = null;		
		}
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertPointToString(EDataType eDataType, Object instanceValue) {
		if(instanceValue == null) {
			return null;
		}
		Point p = (Point)instanceValue;
		return p.x+","+p.y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public opmodelPackage getopmodelPackage() {
		return (opmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static opmodelPackage getPackage() {
		return opmodelPackage.eINSTANCE;
	}

} //opmodelFactoryImpl
