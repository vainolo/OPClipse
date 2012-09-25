/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opm.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instrument Link</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.vainolo.phd.opm.model.OPMPackage#getOPMInstrumentLink()
 * @model
 * @generated
 */
public interface OPMInstrumentLink extends OPMProceduralLink {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (this.activationKind==activationKind) return;\r\nthis.activationKind=activationKind;'"
	 * @generated
	 */
	void setActivationKind(OPMProceduralActivationKind activationKind);
} // OPMInstrumentLink
