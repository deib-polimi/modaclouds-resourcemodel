/**
 */
package it.polimi.modaclouds.resourcemodel.cloud;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.Compute#getUsesCloudStorage <em>Uses Cloud Storage</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.Compute#getOS <em>OS</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCompute()
 * @model
 * @generated
 */
public interface Compute extends CloudResource {
	/**
	 * Returns the value of the '<em><b>Uses Cloud Storage</b></em>' reference list.
	 * The list contents are of type {@link it.polimi.modaclouds.resourcemodel.cloud.CloudStorage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Cloud Storage</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Cloud Storage</em>' reference list.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCompute_UsesCloudStorage()
	 * @model
	 * @generated
	 */
	EList<CloudStorage> getUsesCloudStorage();

	/**
	 * Returns the value of the '<em><b>OS</b></em>' attribute.
	 * The literals are from the enumeration {@link it.polimi.modaclouds.resourcemodel.cloud.OSType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OS</em>' attribute.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.OSType
	 * @see #setOS(OSType)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCompute_OS()
	 * @model
	 * @generated
	 */
	OSType getOS();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.Compute#getOS <em>OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS</em>' attribute.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.OSType
	 * @see #getOS()
	 * @generated
	 */
	void setOS(OSType value);

} // Compute
