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
 * A representation of the model object '<em><b>Application Service Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.ApplicationServiceProvider#getProvidesCloudSoftware <em>Provides Cloud Software</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getApplicationServiceProvider()
 * @model
 * @generated
 */
public interface ApplicationServiceProvider extends Provider {
	/**
	 * Returns the value of the '<em><b>Provides Cloud Software</b></em>' reference list.
	 * The list contents are of type {@link it.polimi.modaclouds.resourcemodel.cloud.CloudSoftware}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides Cloud Software</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides Cloud Software</em>' reference list.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getApplicationServiceProvider_ProvidesCloudSoftware()
	 * @model required="true"
	 * @generated
	 */
	EList<CloudSoftware> getProvidesCloudSoftware();

} // ApplicationServiceProvider
