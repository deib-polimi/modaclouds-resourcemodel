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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.SubRegion#getInRegion <em>In Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getSubRegion()
 * @model
 * @generated
 */
public interface SubRegion extends Location {
	/**
	 * Returns the value of the '<em><b>In Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Region</em>' reference.
	 * @see #setInRegion(Region)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getSubRegion_InRegion()
	 * @model required="true"
	 * @generated
	 */
	Region getInRegion();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.SubRegion#getInRegion <em>In Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Region</em>' reference.
	 * @see #getInRegion()
	 * @generated
	 */
	void setInRegion(Region value);

} // SubRegion
