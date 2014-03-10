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
package it.polimi.modaclouds.resourcemodel.cloud.impl;

import it.polimi.modaclouds.resourcemodel.cloud.ApplicationServiceProvider;
import it.polimi.modaclouds.resourcemodel.cloud.CloudPackage;
import it.polimi.modaclouds.resourcemodel.cloud.CloudSoftware;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Service Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.ApplicationServiceProviderImpl#getProvidesCloudSoftware <em>Provides Cloud Software</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationServiceProviderImpl extends ProviderImpl implements ApplicationServiceProvider {
	/**
	 * The cached value of the '{@link #getProvidesCloudSoftware() <em>Provides Cloud Software</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidesCloudSoftware()
	 * @generated
	 * @ordered
	 */
	protected EList<CloudSoftware> providesCloudSoftware;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationServiceProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudPackage.Literals.APPLICATION_SERVICE_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CloudSoftware> getProvidesCloudSoftware() {
		if (providesCloudSoftware == null) {
			providesCloudSoftware = new EObjectResolvingEList<CloudSoftware>(CloudSoftware.class, this, CloudPackage.APPLICATION_SERVICE_PROVIDER__PROVIDES_CLOUD_SOFTWARE);
		}
		return providesCloudSoftware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudPackage.APPLICATION_SERVICE_PROVIDER__PROVIDES_CLOUD_SOFTWARE:
				return getProvidesCloudSoftware();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CloudPackage.APPLICATION_SERVICE_PROVIDER__PROVIDES_CLOUD_SOFTWARE:
				getProvidesCloudSoftware().clear();
				getProvidesCloudSoftware().addAll((Collection<? extends CloudSoftware>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CloudPackage.APPLICATION_SERVICE_PROVIDER__PROVIDES_CLOUD_SOFTWARE:
				getProvidesCloudSoftware().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CloudPackage.APPLICATION_SERVICE_PROVIDER__PROVIDES_CLOUD_SOFTWARE:
				return providesCloudSoftware != null && !providesCloudSoftware.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ApplicationServiceProviderImpl
