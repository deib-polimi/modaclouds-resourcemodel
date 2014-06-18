/**
 */
package it.polimi.modaclouds.resourcemodel.cloud;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform#getRunsOnCloudResource <em>Runs On Cloud Resource</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform#getPlatformType <em>Platform Type</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform#getLanguage <em>Language</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform#getTechnology <em>Technology</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform#getRunsOnResourcePool <em>Runs On Resource Pool</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCloudPlatform()
 * @model abstract="true"
 * @generated
 */
public interface CloudPlatform extends CloudElement {
	/**
	 * Returns the value of the '<em><b>Runs On Cloud Resource</b></em>' reference list.
	 * The list contents are of type {@link it.polimi.modaclouds.resourcemodel.cloud.CloudResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runs On Cloud Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs On Cloud Resource</em>' reference list.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCloudPlatform_RunsOnCloudResource()
	 * @model
	 * @generated
	 */
	EList<CloudResource> getRunsOnCloudResource();

	/**
	 * Returns the value of the '<em><b>Platform Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.polimi.modaclouds.resourcemodel.cloud.CloudPlatformType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Type</em>' attribute.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPlatformType
	 * @see #setPlatformType(CloudPlatformType)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCloudPlatform_PlatformType()
	 * @model required="true"
	 * @generated
	 */
	CloudPlatformType getPlatformType();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform#getPlatformType <em>Platform Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Type</em>' attribute.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPlatformType
	 * @see #getPlatformType()
	 * @generated
	 */
	void setPlatformType(CloudPlatformType value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCloudPlatform_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology</em>' attribute.
	 * @see #setTechnology(String)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCloudPlatform_Technology()
	 * @model
	 * @generated
	 */
	String getTechnology();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform#getTechnology <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology</em>' attribute.
	 * @see #getTechnology()
	 * @generated
	 */
	void setTechnology(String value);

	/**
	 * Returns the value of the '<em><b>Runs On Resource Pool</b></em>' reference list.
	 * The list contents are of type {@link it.polimi.modaclouds.resourcemodel.cloud.ResourcePool}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runs On Resource Pool</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs On Resource Pool</em>' reference list.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCloudPlatform_RunsOnResourcePool()
	 * @model
	 * @generated
	 */
	EList<ResourcePool> getRunsOnResourcePool();

} // CloudPlatform
