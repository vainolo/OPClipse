/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opm.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedural Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vainolo.phd.opm.model.OPMProceduralLink#getActivationKind <em>Activation Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vainolo.phd.opm.model.OPMPackage#getOPMProceduralLink()
 * @model abstract="true"
 * @generated
 */
public interface OPMProceduralLink extends OPMLink {

	/**
	 * Returns the value of the '<em><b>Activation Kind</b></em>' attribute.
	 * The default value is <code>"Normal"</code>.
	 * The literals are from the enumeration {@link com.vainolo.phd.opm.model.OPMProceduralActivationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Kind</em>' attribute.
	 * @see com.vainolo.phd.opm.model.OPMProceduralActivationKind
	 * @see com.vainolo.phd.opm.model.OPMPackage#getOPMProceduralLink_ActivationKind()
	 * @model default="Normal" required="true" transient="true" changeable="false"
	 * @generated
	 */
	OPMProceduralActivationKind getActivationKind();

} // OPMProceduralLink
