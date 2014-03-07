/**
 */
package it.polimi.modaclouds.resourcemodel.cloud;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.SubRegion#getInRegion <em>In Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getSubRegion()
 * @model
 * @generated
 */
public interface SubRegion extends Location {
	/**
	 * Returns the value of the '<em><b>In Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Region</em>' reference.
	 * @see #setInRegion(Region)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getSubRegion_InRegion()
	 * @model required="true"
	 * @generated
	 */
	Region getInRegion();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.SubRegion#getInRegion <em>In Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Region</em>' reference.
	 * @see #getInRegion()
	 * @generated
	 */
	void setInRegion(Region value);

} // SubRegion
