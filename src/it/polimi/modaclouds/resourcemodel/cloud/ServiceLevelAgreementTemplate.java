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
 * A representation of the model object '<em><b>Service Level Agreement Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.ServiceLevelAgreementTemplate#getDefinedBy <em>Defined By</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.ServiceLevelAgreementTemplate#getId <em>Id</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.ServiceLevelAgreementTemplate#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getServiceLevelAgreementTemplate()
 * @model
 * @generated
 */
public interface ServiceLevelAgreementTemplate extends EObject {
	/**
	 * Returns the value of the '<em><b>Defined By</b></em>' containment reference list.
	 * The list contents are of type {@link it.polimi.modaclouds.resourcemodel.cloud.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined By</em>' containment reference list.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getServiceLevelAgreementTemplate_DefinedBy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Requirement> getDefinedBy();

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
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getServiceLevelAgreementTemplate_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.ServiceLevelAgreementTemplate#getId <em>Id</em>}' attribute.
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
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getServiceLevelAgreementTemplate_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.ServiceLevelAgreementTemplate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ServiceLevelAgreementTemplate
