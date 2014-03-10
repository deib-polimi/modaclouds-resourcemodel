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
 * A representation of the model object '<em><b>Cost Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.CostProfile#getId <em>Id</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.CostProfile#getDescription <em>Description</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.CostProfile#getComposedOf <em>Composed Of</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.CostProfile#getAssociatedToCloudElement <em>Associated To Cloud Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCostProfile()
 * @model
 * @generated
 */
public interface CostProfile extends EObject {
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
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCostProfile_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.CostProfile#getId <em>Id</em>}' attribute.
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
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCostProfile_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.CostProfile#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Composed Of</b></em>' containment reference list.
	 * The list contents are of type {@link it.polimi.modaclouds.resourcemodel.cloud.Cost}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed Of</em>' containment reference list.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCostProfile_ComposedOf()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Cost> getComposedOf();

	/**
	 * Returns the value of the '<em><b>Associated To Cloud Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getHasCostProfile <em>Has Cost Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated To Cloud Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated To Cloud Element</em>' reference.
	 * @see #setAssociatedToCloudElement(CloudElement)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCostProfile_AssociatedToCloudElement()
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getHasCostProfile
	 * @model opposite="hasCostProfile" required="true"
	 * @generated
	 */
	CloudElement getAssociatedToCloudElement();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.CostProfile#getAssociatedToCloudElement <em>Associated To Cloud Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated To Cloud Element</em>' reference.
	 * @see #getAssociatedToCloudElement()
	 * @generated
	 */
	void setAssociatedToCloudElement(CloudElement value);

} // CostProfile
