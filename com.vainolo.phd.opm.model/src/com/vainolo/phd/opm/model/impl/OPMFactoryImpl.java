/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opm.model.impl;

import com.vainolo.phd.opm.model.*;

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
public class OPMFactoryImpl extends EFactoryImpl implements OPMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OPMFactory init() {
		try {
			OPMFactory theOPMFactory = (OPMFactory)EPackage.Registry.INSTANCE.getEFactory("www.vainolo.com/phd/opm"); 
			if (theOPMFactory != null) {
				return theOPMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OPMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMFactoryImpl() {
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
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM: return createOPMObjectProcessDiagram();
			case OPMPackage.OPM_STATE: return createOPMState();
			case OPMPackage.OPM_OBJECT: return createOPMObject();
			case OPMPackage.OPM_PROCESS: return createOPMProcess();
			case OPMPackage.OPM_LINK: return createOPMLink();
			case OPMPackage.LABEL: return createLabel();
			case OPMPackage.OPM_AGENT_LINK: return createOPMAgentLink();
			case OPMPackage.OPM_EFFECT_LINK: return createOPMEffectLink();
			case OPMPackage.OPM_EFFECT_EVENT_LINK: return createOPMEffectEventLink();
			case OPMPackage.OPM_EFFECT_CONDITION_LINK: return createOPMEffectConditionLink();
			case OPMPackage.OPM_RESULT_LINK: return createOPMResultLink();
			case OPMPackage.OPM_INVOCATION_LINK: return createOPMInvocationLink();
			case OPMPackage.OPM_INSTRUMENT_LINK: return createOPMInstrumentLink();
			case OPMPackage.OPM_INSTRUMENT_EVENT_LINK: return createOPMInstrumentEventLink();
			case OPMPackage.OPM_INSTRUMENT_CONDITION_LINK: return createOPMInstrumentConditionLink();
			case OPMPackage.OPM_CONSUMPTION_LINK: return createOPMConsumptionLink();
			case OPMPackage.OPM_CONSUMPTION_EVENT_LINK: return createOPMConsumptionEventLink();
			case OPMPackage.OPM_CONSUMPTION_CONDITION_LINK: return createOPMConsumptionConditionLink();
			case OPMPackage.OPM_AGGREGATION_LINK: return createOPMAggregationLink();
			case OPMPackage.OPM_EXHIBITION_LINK: return createOPMExhibitionLink();
			case OPMPackage.OPM_GENERALIZATION_LINK: return createOPMGeneralizationLink();
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
			case OPMPackage.OPM_LINK_ROUTER_KIND:
				return createOPMLinkRouterKindFromString(eDataType, initialValue);
			case OPMPackage.OPM_PROCESS_KIND:
				return createOPMProcessKindFromString(eDataType, initialValue);
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM_KIND:
				return createOPMObjectProcessDiagramKindFromString(eDataType, initialValue);
			case OPMPackage.VERTICAL_ALIGNMENT:
				return createVerticalAlignmentFromString(eDataType, initialValue);
			case OPMPackage.POINT:
				return createPointFromString(eDataType, initialValue);
			case OPMPackage.RECTANGLE:
				return createRectangleFromString(eDataType, initialValue);
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
			case OPMPackage.OPM_LINK_ROUTER_KIND:
				return convertOPMLinkRouterKindToString(eDataType, instanceValue);
			case OPMPackage.OPM_PROCESS_KIND:
				return convertOPMProcessKindToString(eDataType, instanceValue);
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM_KIND:
				return convertOPMObjectProcessDiagramKindToString(eDataType, instanceValue);
			case OPMPackage.VERTICAL_ALIGNMENT:
				return convertVerticalAlignmentToString(eDataType, instanceValue);
			case OPMPackage.POINT:
				return convertPointToString(eDataType, instanceValue);
			case OPMPackage.RECTANGLE:
				return convertRectangleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMObjectProcessDiagram createOPMObjectProcessDiagram() {
		OPMObjectProcessDiagramImpl opmObjectProcessDiagram = new OPMObjectProcessDiagramImpl();
		return opmObjectProcessDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMObject createOPMObject() {
		OPMObjectImpl opmObject = new OPMObjectImpl();
		return opmObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMProcess createOPMProcess() {
		OPMProcessImpl opmProcess = new OPMProcessImpl();
		return opmProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMLink createOPMLink() {
		OPMLinkImpl opmLink = new OPMLinkImpl();
		return opmLink;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public OPMState createOPMState() {
		OPMStateImpl opmState = new OPMStateImpl();
		return opmState;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMAgentLink createOPMAgentLink() {
		OPMAgentLinkImpl opmAgentLink = new OPMAgentLinkImpl();
		return opmAgentLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMEffectLink createOPMEffectLink() {
		OPMEffectLinkImpl opmEffectLink = new OPMEffectLinkImpl();
		return opmEffectLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMEffectEventLink createOPMEffectEventLink() {
		OPMEffectEventLinkImpl opmEffectEventLink = new OPMEffectEventLinkImpl();
		return opmEffectEventLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMEffectConditionLink createOPMEffectConditionLink() {
		OPMEffectConditionLinkImpl opmEffectConditionLink = new OPMEffectConditionLinkImpl();
		return opmEffectConditionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMResultLink createOPMResultLink() {
		OPMResultLinkImpl opmResultLink = new OPMResultLinkImpl();
		return opmResultLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMInvocationLink createOPMInvocationLink() {
		OPMInvocationLinkImpl opmInvocationLink = new OPMInvocationLinkImpl();
		return opmInvocationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMInstrumentLink createOPMInstrumentLink() {
		OPMInstrumentLinkImpl opmInstrumentLink = new OPMInstrumentLinkImpl();
		return opmInstrumentLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMInstrumentEventLink createOPMInstrumentEventLink() {
		OPMInstrumentEventLinkImpl opmInstrumentEventLink = new OPMInstrumentEventLinkImpl();
		return opmInstrumentEventLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMInstrumentConditionLink createOPMInstrumentConditionLink() {
		OPMInstrumentConditionLinkImpl opmInstrumentConditionLink = new OPMInstrumentConditionLinkImpl();
		return opmInstrumentConditionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMConsumptionLink createOPMConsumptionLink() {
		OPMConsumptionLinkImpl opmConsumptionLink = new OPMConsumptionLinkImpl();
		return opmConsumptionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMConsumptionEventLink createOPMConsumptionEventLink() {
		OPMConsumptionEventLinkImpl opmConsumptionEventLink = new OPMConsumptionEventLinkImpl();
		return opmConsumptionEventLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMConsumptionConditionLink createOPMConsumptionConditionLink() {
		OPMConsumptionConditionLinkImpl opmConsumptionConditionLink = new OPMConsumptionConditionLinkImpl();
		return opmConsumptionConditionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMAggregationLink createOPMAggregationLink() {
		OPMAggregationLinkImpl opmAggregationLink = new OPMAggregationLinkImpl();
		return opmAggregationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMExhibitionLink createOPMExhibitionLink() {
		OPMExhibitionLinkImpl opmExhibitionLink = new OPMExhibitionLinkImpl();
		return opmExhibitionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMGeneralizationLink createOPMGeneralizationLink() {
		OPMGeneralizationLinkImpl opmGeneralizationLink = new OPMGeneralizationLinkImpl();
		return opmGeneralizationLink;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public OPMLinkRouterKind createOPMLinkRouterKindFromString(EDataType eDataType, String initialValue) {
		OPMLinkRouterKind result = OPMLinkRouterKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String convertOPMLinkRouterKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMProcessKind createOPMProcessKindFromString(EDataType eDataType, String initialValue) {
		OPMProcessKind result = OPMProcessKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOPMProcessKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

				/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OPMObjectProcessDiagramKind createOPMObjectProcessDiagramKindFromString(EDataType eDataType, String initialValue) {
		OPMObjectProcessDiagramKind result = OPMObjectProcessDiagramKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

        /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertOPMObjectProcessDiagramKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

        /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VerticalAlignment createVerticalAlignmentFromString(EDataType eDataType, String initialValue) {
		VerticalAlignment result = VerticalAlignment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

        /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertVerticalAlignmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	 * <code>Rectangle</code> is represented as "x,y,width,heigth". 
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
	public OPMPackage getOPMPackage() {
		return (OPMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OPMPackage getPackage() {
		return OPMPackage.eINSTANCE;
	}

} //OPMFactoryImpl
