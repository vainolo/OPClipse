/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model;

import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;

import java.util.List;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OP Meta Model Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmeta.model.OPMetaModelDiagram#getElementsDiagram <em>Elements Diagram</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.OPMetaModelDiagram#getLinksDiagram <em>Links Diagram</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.OPMetaModelDiagram#getLinkValidations <em>Link Validations</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.OPMetaModelDiagram#getContainmentValidations <em>Containment Validations</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getOPMetaModelDiagram()
 * @model
 * @generated
 */
public interface OPMetaModelDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements Diagram</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements Diagram</em>' containment reference.
	 * @see #setElementsDiagram(OPMObjectProcessDiagram)
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getOPMetaModelDiagram_ElementsDiagram()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OPMObjectProcessDiagram getElementsDiagram();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmeta.model.OPMetaModelDiagram#getElementsDiagram <em>Elements Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elements Diagram</em>' containment reference.
	 * @see #getElementsDiagram()
	 * @generated
	 */
	void setElementsDiagram(OPMObjectProcessDiagram value);

	/**
	 * Returns the value of the '<em><b>Links Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links Diagram</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links Diagram</em>' containment reference.
	 * @see #setLinksDiagram(OPMObjectProcessDiagram)
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getOPMetaModelDiagram_LinksDiagram()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OPMObjectProcessDiagram getLinksDiagram();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmeta.model.OPMetaModelDiagram#getLinksDiagram <em>Links Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Links Diagram</em>' containment reference.
	 * @see #getLinksDiagram()
	 * @generated
	 */
	void setLinksDiagram(OPMObjectProcessDiagram value);

	/**
	 * Returns the value of the '<em><b>Link Validations</b></em>' containment reference list.
	 * The list contents are of type {@link com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Validations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Validations</em>' containment reference list.
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getOPMetaModelDiagram_LinkValidations()
	 * @model containment="true"
	 * @generated
	 */
	List<OPMetaModelLinkValidationRule> getLinkValidations();

	/**
	 * Returns the value of the '<em><b>Containment Validations</b></em>' containment reference list.
	 * The list contents are of type {@link com.vainolo.phd.opmeta.model.OPMetaModelContainmentValidationRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment Validations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment Validations</em>' containment reference list.
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getOPMetaModelDiagram_ContainmentValidations()
	 * @model containment="true"
	 * @generated
	 */
	List<OPMetaModelContainmentValidationRule> getContainmentValidations();

} // OPMetaModelDiagram
