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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual HW Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource#getHas <em>Has</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource#getId <em>Id</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource#getType <em>Type</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource#getProcessingRate <em>Processing Rate</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource#getNumberOfReplicas <em>Number Of Replicas</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getVirtualHWResource()
 * @model abstract="true"
 * @generated
 */
public interface VirtualHWResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Has</b></em>' reference list.
	 * The list contents are of type {@link it.polimi.modaclouds.resourcemodel.cloud.EfficiencyProfile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' reference list.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getVirtualHWResource_Has()
	 * @model
	 * @generated
	 */
	EList<EfficiencyProfile> getHas();

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
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getVirtualHWResource_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResourceType
	 * @see #setType(VirtualHWResourceType)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getVirtualHWResource_Type()
	 * @model required="true"
	 * @generated
	 */
	VirtualHWResourceType getType();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResourceType
	 * @see #getType()
	 * @generated
	 */
	void setType(VirtualHWResourceType value);

	/**
	 * Returns the value of the '<em><b>Processing Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Rate</em>' attribute.
	 * @see #setProcessingRate(double)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getVirtualHWResource_ProcessingRate()
	 * @model required="true"
	 * @generated
	 */
	double getProcessingRate();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource#getProcessingRate <em>Processing Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Rate</em>' attribute.
	 * @see #getProcessingRate()
	 * @generated
	 */
	void setProcessingRate(double value);

	/**
	 * Returns the value of the '<em><b>Number Of Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Replicas</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Replicas</em>' attribute.
	 * @see #setNumberOfReplicas(int)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getVirtualHWResource_NumberOfReplicas()
	 * @model required="true"
	 * @generated
	 */
	int getNumberOfReplicas();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource#getNumberOfReplicas <em>Number Of Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Replicas</em>' attribute.
	 * @see #getNumberOfReplicas()
	 * @generated
	 */
	void setNumberOfReplicas(int value);

} // VirtualHWResource
