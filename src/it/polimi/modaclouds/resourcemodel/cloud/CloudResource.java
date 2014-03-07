/**
 */
package it.polimi.modaclouds.resourcemodel.cloud;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.CloudResource#getInLocation <em>In Location</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.CloudResource#getFrom <em>From</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.CloudResource#getComposedOf <em>Composed Of</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.CloudResource#getResourceType <em>Resource Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCloudResource()
 * @model abstract="true"
 * @generated
 */
public interface CloudResource extends CloudElement {
	/**
	 * Returns the value of the '<em><b>In Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Location</em>' reference.
	 * @see #setInLocation(Location)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCloudResource_InLocation()
	 * @model
	 * @generated
	 */
	Location getInLocation();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudResource#getInLocation <em>In Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Location</em>' reference.
	 * @see #getInLocation()
	 * @generated
	 */
	void setInLocation(Location value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference list.
	 * The list contents are of type {@link it.polimi.modaclouds.resourcemodel.cloud.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference list.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCloudResource_From()
	 * @model
	 * @generated
	 */
	EList<Link> getFrom();

	/**
	 * Returns the value of the '<em><b>Composed Of</b></em>' containment reference list.
	 * The list contents are of type {@link it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed Of</em>' containment reference list.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCloudResource_ComposedOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<VirtualHWResource> getComposedOf();

	/**
	 * Returns the value of the '<em><b>Resource Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.polimi.modaclouds.resourcemodel.cloud.CloudResourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Type</em>' attribute.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudResourceType
	 * @see #setResourceType(CloudResourceType)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCloudResource_ResourceType()
	 * @model required="true"
	 * @generated
	 */
	CloudResourceType getResourceType();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudResource#getResourceType <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type</em>' attribute.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudResourceType
	 * @see #getResourceType()
	 * @generated
	 */
	void setResourceType(CloudResourceType value);

} // CloudResource
