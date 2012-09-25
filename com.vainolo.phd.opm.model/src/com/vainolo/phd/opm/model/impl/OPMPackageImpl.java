/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opm.model.impl;

import com.vainolo.phd.opm.model.Label;
import com.vainolo.phd.opm.model.OPMAgentLink;
import com.vainolo.phd.opm.model.OPMAggregationLink;
import com.vainolo.phd.opm.model.OPMConsumptionLink;
import com.vainolo.phd.opm.model.OPMContainer;
import com.vainolo.phd.opm.model.OPMEffectLink;
import com.vainolo.phd.opm.model.OPMElementWithID;
import com.vainolo.phd.opm.model.OPMExhibitionLink;
import com.vainolo.phd.opm.model.OPMFactory;
import com.vainolo.phd.opm.model.OPMGeneralizationLink;
import com.vainolo.phd.opm.model.OPMInstrumentLink;
import com.vainolo.phd.opm.model.OPMInvocationLink;
import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMLinkRouterKind;
import com.vainolo.phd.opm.model.OPMNamedElement;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMObject;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagramKind;
import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.model.OPMProceduralActivationKind;
import com.vainolo.phd.opm.model.OPMProceduralLink;
import com.vainolo.phd.opm.model.OPMProcess;
import com.vainolo.phd.opm.model.OPMProcessKind;
import com.vainolo.phd.opm.model.OPMResultLink;
import com.vainolo.phd.opm.model.OPMState;
import com.vainolo.phd.opm.model.OPMStructuralLink;
import com.vainolo.phd.opm.model.OPMThing;

import com.vainolo.phd.opm.model.VerticalAlignment;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OPMPackageImpl extends EPackageImpl implements OPMPackage {
	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass opmContainerEClass = null;

    /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass opmElementWithIDEClass = null;

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opmObjectProcessDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opmObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opmProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opmLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opmThingEClass = null;

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass opmStateEClass = null;

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opmNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opmProceduralLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass opmNamedElementEClass = null;

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opmAgentLinkEClass = null;

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opmEffectLinkEClass = null;

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opmResultLinkEClass = null;

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opmInvocationLinkEClass = null;

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opmInstrumentLinkEClass = null;

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opmConsumptionLinkEClass = null;

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opmStructuralLinkEClass = null;

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opmAggregationLinkEClass = null;

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opmExhibitionLinkEClass = null;

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opmGeneralizationLinkEClass = null;

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EEnum opmLinkRouterKindEEnum = null;

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum opmProcessKindEEnum = null;

				/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum opmObjectProcessDiagramKindEEnum = null;

        /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum verticalAlignmentEEnum = null;

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum opmProceduralActivationKindEEnum = null;

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rectangleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pointEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.vainolo.phd.opm.model.OPMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OPMPackageImpl() {
		super(eNS_URI, OPMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OPMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OPMPackage init() {
		if (isInited) return (OPMPackage)EPackage.Registry.INSTANCE.getEPackage(OPMPackage.eNS_URI);

		// Obtain or create and register package
		OPMPackageImpl theOPMPackage = (OPMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OPMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OPMPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theOPMPackage.createPackageContents();

		// Initialize created meta-data
		theOPMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOPMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OPMPackage.eNS_URI, theOPMPackage);
		return theOPMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getOPMContainer() {
		return opmContainerEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getOPMContainer_Nodes() {
		return (EReference)opmContainerEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getOPMElementWithID() {
		return opmElementWithIDEClass;
	}

    /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getOPMElementWithID_Id() {
		return (EAttribute)opmElementWithIDEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMObjectProcessDiagram() {
		return opmObjectProcessDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPMObjectProcessDiagram_Links() {
		return (EReference)opmObjectProcessDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getOPMObjectProcessDiagram_NextId() {
		return (EAttribute)opmObjectProcessDiagramEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getOPMObjectProcessDiagram_Kind() {
		return (EAttribute)opmObjectProcessDiagramEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMObject() {
		return opmObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMProcess() {
		return opmProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPMProcess_Kind() {
		return (EAttribute)opmProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMLink() {
		return opmLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPMLink_Opd() {
		return (EReference)opmLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPMLink_Source() {
		return (EReference)opmLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPMLink_Target() {
		return (EReference)opmLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPMLink_Bendpoints() {
		return (EAttribute)opmLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getOPMLink_RouterKind() {
		return (EAttribute)opmLinkEClass.getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getOPMLink_SourceDecoration() {
		return (EAttribute)opmLinkEClass.getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getOPMLink_TargetDecoration() {
		return (EAttribute)opmLinkEClass.getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getOPMLink_CenterDecoration() {
		return (EAttribute)opmLinkEClass.getEStructuralFeatures().get(7);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMThing() {
		return opmThingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getOPMThing_Description() {
		return (EAttribute)opmThingEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getOPMState() {
		return opmStateEClass;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMNode() {
		return opmNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPMNode_IncomingLinks() {
		return (EReference)opmNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPMNode_OutgoingLinks() {
		return (EReference)opmNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getOPMNode_Container() {
		return (EReference)opmNodeEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getOPMNode_Constraints() {
		return (EAttribute)opmNodeEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMProceduralLink() {
		return opmProceduralLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPMProceduralLink_ActivationKind() {
		return (EAttribute)opmProceduralLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getOPMNamedElement() {
		return opmNamedElementEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getOPMNamedElement_Name() {
		return (EAttribute)opmNamedElementEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getOPMNamedElement_Alignment() {
		return (EAttribute)opmNamedElementEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel() {
		return labelEClass;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMAgentLink() {
		return opmAgentLinkEClass;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMEffectLink() {
		return opmEffectLinkEClass;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMResultLink() {
		return opmResultLinkEClass;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMInvocationLink() {
		return opmInvocationLinkEClass;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMInstrumentLink() {
		return opmInstrumentLinkEClass;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMConsumptionLink() {
		return opmConsumptionLinkEClass;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMStructuralLink() {
		return opmStructuralLinkEClass;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPMStructuralLink_AggregatorPosition() {
		return (EAttribute)opmStructuralLinkEClass.getEStructuralFeatures().get(0);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMAggregationLink() {
		return opmAggregationLinkEClass;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMExhibitionLink() {
		return opmExhibitionLinkEClass;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMGeneralizationLink() {
		return opmGeneralizationLinkEClass;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EEnum getOPMLinkRouterKind() {
		return opmLinkRouterKindEEnum;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOPMProcessKind() {
		return opmProcessKindEEnum;
	}

				/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getOPMObjectProcessDiagramKind() {
		return opmObjectProcessDiagramKindEEnum;
	}

        /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getVerticalAlignment() {
		return verticalAlignmentEEnum;
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOPMProceduralActivationKind() {
		return opmProceduralActivationKindEEnum;
	}

								/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRectangle() {
		return rectangleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPoint() {
		return pointEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMFactory getOPMFactory() {
		return (OPMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		opmElementWithIDEClass = createEClass(OPM_ELEMENT_WITH_ID);
		createEAttribute(opmElementWithIDEClass, OPM_ELEMENT_WITH_ID__ID);

		opmNamedElementEClass = createEClass(OPM_NAMED_ELEMENT);
		createEAttribute(opmNamedElementEClass, OPM_NAMED_ELEMENT__NAME);
		createEAttribute(opmNamedElementEClass, OPM_NAMED_ELEMENT__ALIGNMENT);

		opmContainerEClass = createEClass(OPM_CONTAINER);
		createEReference(opmContainerEClass, OPM_CONTAINER__NODES);

		opmNodeEClass = createEClass(OPM_NODE);
		createEReference(opmNodeEClass, OPM_NODE__INCOMING_LINKS);
		createEReference(opmNodeEClass, OPM_NODE__OUTGOING_LINKS);
		createEReference(opmNodeEClass, OPM_NODE__CONTAINER);
		createEAttribute(opmNodeEClass, OPM_NODE__CONSTRAINTS);

		opmObjectProcessDiagramEClass = createEClass(OPM_OBJECT_PROCESS_DIAGRAM);
		createEReference(opmObjectProcessDiagramEClass, OPM_OBJECT_PROCESS_DIAGRAM__LINKS);
		createEAttribute(opmObjectProcessDiagramEClass, OPM_OBJECT_PROCESS_DIAGRAM__NEXT_ID);
		createEAttribute(opmObjectProcessDiagramEClass, OPM_OBJECT_PROCESS_DIAGRAM__KIND);

		opmThingEClass = createEClass(OPM_THING);
		createEAttribute(opmThingEClass, OPM_THING__DESCRIPTION);

		opmStateEClass = createEClass(OPM_STATE);

		opmObjectEClass = createEClass(OPM_OBJECT);

		opmProcessEClass = createEClass(OPM_PROCESS);
		createEAttribute(opmProcessEClass, OPM_PROCESS__KIND);

		opmLinkEClass = createEClass(OPM_LINK);
		createEReference(opmLinkEClass, OPM_LINK__OPD);
		createEReference(opmLinkEClass, OPM_LINK__SOURCE);
		createEReference(opmLinkEClass, OPM_LINK__TARGET);
		createEAttribute(opmLinkEClass, OPM_LINK__BENDPOINTS);
		createEAttribute(opmLinkEClass, OPM_LINK__ROUTER_KIND);
		createEAttribute(opmLinkEClass, OPM_LINK__SOURCE_DECORATION);
		createEAttribute(opmLinkEClass, OPM_LINK__TARGET_DECORATION);
		createEAttribute(opmLinkEClass, OPM_LINK__CENTER_DECORATION);

		opmProceduralLinkEClass = createEClass(OPM_PROCEDURAL_LINK);
		createEAttribute(opmProceduralLinkEClass, OPM_PROCEDURAL_LINK__ACTIVATION_KIND);

		labelEClass = createEClass(LABEL);

		opmAgentLinkEClass = createEClass(OPM_AGENT_LINK);

		opmEffectLinkEClass = createEClass(OPM_EFFECT_LINK);

		opmResultLinkEClass = createEClass(OPM_RESULT_LINK);

		opmInvocationLinkEClass = createEClass(OPM_INVOCATION_LINK);

		opmInstrumentLinkEClass = createEClass(OPM_INSTRUMENT_LINK);

		opmConsumptionLinkEClass = createEClass(OPM_CONSUMPTION_LINK);

		opmStructuralLinkEClass = createEClass(OPM_STRUCTURAL_LINK);
		createEAttribute(opmStructuralLinkEClass, OPM_STRUCTURAL_LINK__AGGREGATOR_POSITION);

		opmAggregationLinkEClass = createEClass(OPM_AGGREGATION_LINK);

		opmExhibitionLinkEClass = createEClass(OPM_EXHIBITION_LINK);

		opmGeneralizationLinkEClass = createEClass(OPM_GENERALIZATION_LINK);

		// Create enums
		opmLinkRouterKindEEnum = createEEnum(OPM_LINK_ROUTER_KIND);
		opmProcessKindEEnum = createEEnum(OPM_PROCESS_KIND);
		opmObjectProcessDiagramKindEEnum = createEEnum(OPM_OBJECT_PROCESS_DIAGRAM_KIND);
		verticalAlignmentEEnum = createEEnum(VERTICAL_ALIGNMENT);
		opmProceduralActivationKindEEnum = createEEnum(OPM_PROCEDURAL_ACTIVATION_KIND);

		// Create data types
		pointEDataType = createEDataType(POINT);
		rectangleEDataType = createEDataType(RECTANGLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		opmContainerEClass.getESuperTypes().add(this.getOPMElementWithID());
		opmNodeEClass.getESuperTypes().add(this.getOPMElementWithID());
		opmNodeEClass.getESuperTypes().add(this.getOPMNamedElement());
		opmObjectProcessDiagramEClass.getESuperTypes().add(this.getOPMContainer());
		opmObjectProcessDiagramEClass.getESuperTypes().add(this.getOPMNamedElement());
		opmThingEClass.getESuperTypes().add(this.getOPMNode());
		opmThingEClass.getESuperTypes().add(this.getOPMContainer());
		opmStateEClass.getESuperTypes().add(this.getOPMNode());
		opmObjectEClass.getESuperTypes().add(this.getOPMThing());
		opmProcessEClass.getESuperTypes().add(this.getOPMThing());
		opmLinkEClass.getESuperTypes().add(this.getOPMElementWithID());
		opmProceduralLinkEClass.getESuperTypes().add(this.getOPMLink());
		labelEClass.getESuperTypes().add(this.getOPMNode());
		opmAgentLinkEClass.getESuperTypes().add(this.getOPMProceduralLink());
		opmEffectLinkEClass.getESuperTypes().add(this.getOPMProceduralLink());
		opmResultLinkEClass.getESuperTypes().add(this.getOPMProceduralLink());
		opmInvocationLinkEClass.getESuperTypes().add(this.getOPMProceduralLink());
		opmInstrumentLinkEClass.getESuperTypes().add(this.getOPMProceduralLink());
		opmConsumptionLinkEClass.getESuperTypes().add(this.getOPMProceduralLink());
		opmStructuralLinkEClass.getESuperTypes().add(this.getOPMLink());
		opmAggregationLinkEClass.getESuperTypes().add(this.getOPMStructuralLink());
		opmExhibitionLinkEClass.getESuperTypes().add(this.getOPMStructuralLink());
		opmGeneralizationLinkEClass.getESuperTypes().add(this.getOPMStructuralLink());

		// Initialize classes and features; add operations and parameters
		initEClass(opmElementWithIDEClass, OPMElementWithID.class, "OPMElementWithID", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOPMElementWithID_Id(), ecorePackage.getELong(), "id", null, 0, 1, OPMElementWithID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opmNamedElementEClass, OPMNamedElement.class, "OPMNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOPMNamedElement_Name(), ecorePackage.getEString(), "name", "<<name>>", 0, 1, OPMNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOPMNamedElement_Alignment(), this.getVerticalAlignment(), "alignment", "Center", 0, 1, OPMNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opmContainerEClass, OPMContainer.class, "OPMContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOPMContainer_Nodes(), this.getOPMNode(), this.getOPMNode_Container(), "nodes", null, 0, -1, OPMContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opmNodeEClass, OPMNode.class, "OPMNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOPMNode_IncomingLinks(), this.getOPMLink(), this.getOPMLink_Target(), "incomingLinks", null, 0, -1, OPMNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOPMNode_OutgoingLinks(), this.getOPMLink(), this.getOPMLink_Source(), "outgoingLinks", null, 0, -1, OPMNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOPMNode_Container(), this.getOPMContainer(), this.getOPMContainer_Nodes(), "container", null, 0, 1, OPMNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOPMNode_Constraints(), this.getRectangle(), "constraints", "0,0,50,50", 0, 1, OPMNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opmObjectProcessDiagramEClass, OPMObjectProcessDiagram.class, "OPMObjectProcessDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOPMObjectProcessDiagram_Links(), this.getOPMLink(), this.getOPMLink_Opd(), "links", null, 0, -1, OPMObjectProcessDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOPMObjectProcessDiagram_NextId(), ecorePackage.getELong(), "nextId", null, 0, 1, OPMObjectProcessDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOPMObjectProcessDiagram_Kind(), this.getOPMObjectProcessDiagramKind(), "kind", "Compound", 1, 1, OPMObjectProcessDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opmThingEClass, OPMThing.class, "OPMThing", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOPMThing_Description(), ecorePackage.getEString(), "description", null, 0, 1, OPMThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opmStateEClass, OPMState.class, "OPMState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opmObjectEClass, OPMObject.class, "OPMObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opmProcessEClass, OPMProcess.class, "OPMProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOPMProcess_Kind(), this.getOPMProcessKind(), "kind", "", 1, 1, OPMProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opmLinkEClass, OPMLink.class, "OPMLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOPMLink_Opd(), this.getOPMObjectProcessDiagram(), this.getOPMObjectProcessDiagram_Links(), "opd", null, 0, 1, OPMLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOPMLink_Source(), this.getOPMNode(), this.getOPMNode_OutgoingLinks(), "source", null, 0, 1, OPMLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOPMLink_Target(), this.getOPMNode(), this.getOPMNode_IncomingLinks(), "target", null, 0, 1, OPMLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOPMLink_Bendpoints(), this.getPoint(), "bendpoints", null, 0, -1, OPMLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOPMLink_RouterKind(), this.getOPMLinkRouterKind(), "routerKind", "", 0, 1, OPMLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOPMLink_SourceDecoration(), ecorePackage.getEString(), "sourceDecoration", null, 0, 1, OPMLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOPMLink_TargetDecoration(), ecorePackage.getEString(), "targetDecoration", null, 0, 1, OPMLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOPMLink_CenterDecoration(), ecorePackage.getEString(), "centerDecoration", null, 0, 1, OPMLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opmProceduralLinkEClass, OPMProceduralLink.class, "OPMProceduralLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOPMProceduralLink_ActivationKind(), this.getOPMProceduralActivationKind(), "ActivationKind", "Normal", 1, 1, OPMProceduralLink.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opmAgentLinkEClass, OPMAgentLink.class, "OPMAgentLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opmEffectLinkEClass, OPMEffectLink.class, "OPMEffectLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(opmEffectLinkEClass, null, "setActivationKind", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOPMProceduralActivationKind(), "activationKind", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(opmResultLinkEClass, OPMResultLink.class, "OPMResultLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opmInvocationLinkEClass, OPMInvocationLink.class, "OPMInvocationLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opmInstrumentLinkEClass, OPMInstrumentLink.class, "OPMInstrumentLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(opmInstrumentLinkEClass, null, "setActivationKind", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOPMProceduralActivationKind(), "activationKind", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(opmConsumptionLinkEClass, OPMConsumptionLink.class, "OPMConsumptionLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(opmConsumptionLinkEClass, null, "setActivationKind", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOPMProceduralActivationKind(), "activationKind", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(opmStructuralLinkEClass, OPMStructuralLink.class, "OPMStructuralLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOPMStructuralLink_AggregatorPosition(), this.getPoint(), "aggregatorPosition", null, 0, 1, OPMStructuralLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opmAggregationLinkEClass, OPMAggregationLink.class, "OPMAggregationLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opmExhibitionLinkEClass, OPMExhibitionLink.class, "OPMExhibitionLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opmGeneralizationLinkEClass, OPMGeneralizationLink.class, "OPMGeneralizationLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(opmLinkRouterKindEEnum, OPMLinkRouterKind.class, "OPMLinkRouterKind");
		addEEnumLiteral(opmLinkRouterKindEEnum, OPMLinkRouterKind.BENDPOINT);
		addEEnumLiteral(opmLinkRouterKindEEnum, OPMLinkRouterKind.MANHATTAN);

		initEEnum(opmProcessKindEEnum, OPMProcessKind.class, "OPMProcessKind");
		addEEnumLiteral(opmProcessKindEEnum, OPMProcessKind.COMPOUND);
		addEEnumLiteral(opmProcessKindEEnum, OPMProcessKind.BUILT_IN);
		addEEnumLiteral(opmProcessKindEEnum, OPMProcessKind.JAVA);
		addEEnumLiteral(opmProcessKindEEnum, OPMProcessKind.CONCEPTUAL);

		initEEnum(opmObjectProcessDiagramKindEEnum, OPMObjectProcessDiagramKind.class, "OPMObjectProcessDiagramKind");
		addEEnumLiteral(opmObjectProcessDiagramKindEEnum, OPMObjectProcessDiagramKind.COMPOUND);
		addEEnumLiteral(opmObjectProcessDiagramKindEEnum, OPMObjectProcessDiagramKind.SYSTEM);

		initEEnum(verticalAlignmentEEnum, VerticalAlignment.class, "VerticalAlignment");
		addEEnumLiteral(verticalAlignmentEEnum, VerticalAlignment.TOP);
		addEEnumLiteral(verticalAlignmentEEnum, VerticalAlignment.CENTER);
		addEEnumLiteral(verticalAlignmentEEnum, VerticalAlignment.BOTTOM);

		initEEnum(opmProceduralActivationKindEEnum, OPMProceduralActivationKind.class, "OPMProceduralActivationKind");
		addEEnumLiteral(opmProceduralActivationKindEEnum, OPMProceduralActivationKind.NORMAL);
		addEEnumLiteral(opmProceduralActivationKindEEnum, OPMProceduralActivationKind.EVENT);
		addEEnumLiteral(opmProceduralActivationKindEEnum, OPMProceduralActivationKind.CONDITION);

		// Initialize data types
		initEDataType(pointEDataType, Point.class, "Point", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rectangleEDataType, Rectangle.class, "Rectangle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //OPMPackageImpl
