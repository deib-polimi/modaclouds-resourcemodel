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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Efficiency Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.EfficiencyProfile#getId <em>Id</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.EfficiencyProfile#getPeriod <em>Period</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.EfficiencyProfile#getEfficiency <em>Efficiency</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getEfficiencyProfile()
 * @model
 * @generated
 */
public interface EfficiencyProfile extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getEfficiencyProfile_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.EfficiencyProfile#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(int)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getEfficiencyProfile_Period()
	 * @model
	 * @generated
	 */
	int getPeriod();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.EfficiencyProfile#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(int value);

	/**
	 * Returns the value of the '<em><b>Efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Efficiency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Efficiency</em>' attribute.
	 * @see #setEfficiency(double)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getEfficiencyProfile_Efficiency()
	 * @model
	 * @generated
	 */
	double getEfficiency();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.EfficiencyProfile#getEfficiency <em>Efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Efficiency</em>' attribute.
	 * @see #getEfficiency()
	 * @generated
	 */
	void setEfficiency(double value);

} // EfficiencyProfile
