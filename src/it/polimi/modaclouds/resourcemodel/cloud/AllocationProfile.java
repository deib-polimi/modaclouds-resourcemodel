/**
 */
package it.polimi.modaclouds.resourcemodel.cloud;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.AllocationProfile#getId <em>Id</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.AllocationProfile#getDescription <em>Description</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.AllocationProfile#getComposedOf <em>Composed Of</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.AllocationProfile#getRelatedToResourcePool <em>Related To Resource Pool</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getAllocationProfile()
 * @model
 * @generated
 */
public interface AllocationProfile extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getAllocationProfile_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.AllocationProfile#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getAllocationProfile_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.AllocationProfile#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Composed Of</b></em>' containment reference list.
	 * The list contents are of type {@link it.polimi.modaclouds.resourcemodel.cloud.Allocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed Of</em>' containment reference list.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getAllocationProfile_ComposedOf()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Allocation> getComposedOf();

	/**
	 * Returns the value of the '<em><b>Related To Resource Pool</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link it.polimi.modaclouds.resourcemodel.cloud.ResourcePool#getHasAllocationProfile <em>Has Allocation Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related To Resource Pool</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related To Resource Pool</em>' reference.
	 * @see #setRelatedToResourcePool(ResourcePool)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getAllocationProfile_RelatedToResourcePool()
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ResourcePool#getHasAllocationProfile
	 * @model opposite="hasAllocationProfile" required="true"
	 * @generated
	 */
	ResourcePool getRelatedToResourcePool();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.AllocationProfile#getRelatedToResourcePool <em>Related To Resource Pool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related To Resource Pool</em>' reference.
	 * @see #getRelatedToResourcePool()
	 * @generated
	 */
	void setRelatedToResourcePool(ResourcePool value);

} // AllocationProfile
