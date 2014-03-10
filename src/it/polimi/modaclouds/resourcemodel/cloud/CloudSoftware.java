/*******************************************************************************
 * Copyright 2014 Giovanni Paolo Gibilisco
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
/**
 */
package it.polimi.modaclouds.resourcemodel.cloud;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.CloudSoftware#getDeployedOnCloudPlatform <em>Deployed On Cloud Platform</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.CloudSoftware#getRunsOnCloudResource <em>Runs On Cloud Resource</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.CloudSoftware#getSoftwareType <em>Software Type</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.CloudSoftware#getRunsOnResourcePool <em>Runs On Resource Pool</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCloudSoftware()
 * @model
 * @generated
 */
public interface CloudSoftware extends CloudElement {
	/**
	 * Returns the value of the '<em><b>Deployed On Cloud Platform</b></em>' reference list.
	 * The list contents are of type {@link it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed On Cloud Platform</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed On Cloud Platform</em>' reference list.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCloudSoftware_DeployedOnCloudPlatform()
	 * @model
	 * @generated
	 */
	EList<CloudPlatform> getDeployedOnCloudPlatform();

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
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCloudSoftware_RunsOnCloudResource()
	 * @model
	 * @generated
	 */
	EList<CloudResource> getRunsOnCloudResource();

	/**
	 * Returns the value of the '<em><b>Software Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.polimi.modaclouds.resourcemodel.cloud.CloudSoftwareType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Type</em>' attribute.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudSoftwareType
	 * @see #setSoftwareType(CloudSoftwareType)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCloudSoftware_SoftwareType()
	 * @model required="true"
	 * @generated
	 */
	CloudSoftwareType getSoftwareType();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudSoftware#getSoftwareType <em>Software Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Type</em>' attribute.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudSoftwareType
	 * @see #getSoftwareType()
	 * @generated
	 */
	void setSoftwareType(CloudSoftwareType value);

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
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCloudSoftware_RunsOnResourcePool()
	 * @model
	 * @generated
	 */
	EList<ResourcePool> getRunsOnResourcePool();

} // CloudSoftware
