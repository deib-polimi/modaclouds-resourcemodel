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
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getId <em>Id</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getName <em>Name</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getType <em>Type</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getCloudElementA <em>Cloud Element A</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getCloudElementB <em>Cloud Element B</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getHasCostProfile <em>Has Cost Profile</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getHasCost <em>Has Cost</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getHasFreeQuota <em>Has Free Quota</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCloudElement()
 * @model abstract="true"
 * @generated
 */
public interface CloudElement extends EObject {
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
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCloudElement_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getId <em>Id</em>}' attribute.
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
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCloudElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.polimi.modaclouds.resourcemodel.cloud.CloudElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudElementType
	 * @see #setType(CloudElementType)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCloudElement_Type()
	 * @model required="true"
	 * @generated
	 */
	CloudElementType getType();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudElementType
	 * @see #getType()
	 * @generated
	 */
	void setType(CloudElementType value);

	/**
	 * Returns the value of the '<em><b>Cloud Element A</b></em>' reference list.
	 * The list contents are of type {@link it.polimi.modaclouds.resourcemodel.cloud.Link}.
	 * It is bidirectional and its opposite is '{@link it.polimi.modaclouds.resourcemodel.cloud.Link#getReverseLinkToA <em>Reverse Link To A</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud Element A</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud Element A</em>' reference list.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCloudElement_CloudElementA()
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Link#getReverseLinkToA
	 * @model opposite="reverseLinkToA"
	 * @generated
	 */
	EList<Link> getCloudElementA();

	/**
	 * Returns the value of the '<em><b>Cloud Element B</b></em>' reference list.
	 * The list contents are of type {@link it.polimi.modaclouds.resourcemodel.cloud.Link}.
	 * It is bidirectional and its opposite is '{@link it.polimi.modaclouds.resourcemodel.cloud.Link#getReverseLinkToB <em>Reverse Link To B</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud Element B</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud Element B</em>' reference list.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCloudElement_CloudElementB()
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Link#getReverseLinkToB
	 * @model opposite="reverseLinkToB"
	 * @generated
	 */
	EList<Link> getCloudElementB();

	/**
	 * Returns the value of the '<em><b>Has Cost Profile</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link it.polimi.modaclouds.resourcemodel.cloud.CostProfile#getAssociatedToCloudElement <em>Associated To Cloud Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Cost Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Cost Profile</em>' reference.
	 * @see #setHasCostProfile(CostProfile)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCloudElement_HasCostProfile()
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CostProfile#getAssociatedToCloudElement
	 * @model opposite="associatedToCloudElement"
	 * @generated
	 */
	CostProfile getHasCostProfile();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getHasCostProfile <em>Has Cost Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Cost Profile</em>' reference.
	 * @see #getHasCostProfile()
	 * @generated
	 */
	void setHasCostProfile(CostProfile value);

	/**
	 * Returns the value of the '<em><b>Has Cost</b></em>' reference list.
	 * The list contents are of type {@link it.polimi.modaclouds.resourcemodel.cloud.Cost}.
	 * It is bidirectional and its opposite is '{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getAssociatedToCloudElement <em>Associated To Cloud Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Cost</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Cost</em>' reference list.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCloudElement_HasCost()
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Cost#getAssociatedToCloudElement
	 * @model opposite="associatedToCloudElement"
	 * @generated
	 */
	EList<Cost> getHasCost();

	/**
	 * Returns the value of the '<em><b>Has Free Quota</b></em>' reference list.
	 * The list contents are of type {@link it.polimi.modaclouds.resourcemodel.cloud.FreeQuota}.
	 * It is bidirectional and its opposite is '{@link it.polimi.modaclouds.resourcemodel.cloud.FreeQuota#getAssociatedToCloudElement <em>Associated To Cloud Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Free Quota</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Free Quota</em>' reference list.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCloudElement_HasFreeQuota()
	 * @see it.polimi.modaclouds.resourcemodel.cloud.FreeQuota#getAssociatedToCloudElement
	 * @model opposite="associatedToCloudElement"
	 * @generated
	 */
	EList<FreeQuota> getHasFreeQuota();

} // CloudElement
