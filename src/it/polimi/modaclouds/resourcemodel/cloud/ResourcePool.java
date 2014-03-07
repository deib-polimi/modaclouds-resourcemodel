/**
 */
package it.polimi.modaclouds.resourcemodel.cloud;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.ResourcePool#getComposedOf <em>Composed Of</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.ResourcePool#getId <em>Id</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.ResourcePool#getName <em>Name</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.ResourcePool#getHasAllocationProfile <em>Has Allocation Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getResourcePool()
 * @model
 * @generated
 */
public interface ResourcePool extends EObject {
	/**
	 * Returns the value of the '<em><b>Composed Of</b></em>' containment reference list.
	 * The list contents are of type {@link it.polimi.modaclouds.resourcemodel.cloud.Compute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed Of</em>' containment reference list.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getResourcePool_ComposedOf()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Compute> getComposedOf();

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
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getResourcePool_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.ResourcePool#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getResourcePool_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.ResourcePool#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Allocation Profile</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link it.polimi.modaclouds.resourcemodel.cloud.AllocationProfile#getRelatedToResourcePool <em>Related To Resource Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Allocation Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Allocation Profile</em>' reference.
	 * @see #setHasAllocationProfile(AllocationProfile)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getResourcePool_HasAllocationProfile()
	 * @see it.polimi.modaclouds.resourcemodel.cloud.AllocationProfile#getRelatedToResourcePool
	 * @model opposite="relatedToResourcePool" required="true"
	 * @generated
	 */
	AllocationProfile getHasAllocationProfile();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.ResourcePool#getHasAllocationProfile <em>Has Allocation Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Allocation Profile</em>' reference.
	 * @see #getHasAllocationProfile()
	 * @generated
	 */
	void setHasAllocationProfile(AllocationProfile value);

} // ResourcePool
