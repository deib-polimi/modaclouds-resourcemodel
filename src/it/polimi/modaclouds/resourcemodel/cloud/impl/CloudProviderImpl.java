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

import it.polimi.modaclouds.resourcemodel.cloud.CloudPackage;
import it.polimi.modaclouds.resourcemodel.cloud.CloudProvider;
import it.polimi.modaclouds.resourcemodel.cloud.CloudService;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudProviderImpl#getProvidesCloudService <em>Provides Cloud Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CloudProviderImpl extends ProviderImpl implements CloudProvider {
	/**
	 * The cached value of the '{@link #getProvidesCloudService() <em>Provides Cloud Service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidesCloudService()
	 * @generated
	 * @ordered
	 */
	protected EList<CloudService> providesCloudService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudPackage.Literals.CLOUD_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CloudService> getProvidesCloudService() {
		if (providesCloudService == null) {
			providesCloudService = new EObjectResolvingEList<CloudService>(CloudService.class, this, CloudPackage.CLOUD_PROVIDER__PROVIDES_CLOUD_SERVICE);
		}
		return providesCloudService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudPackage.CLOUD_PROVIDER__PROVIDES_CLOUD_SERVICE:
				return getProvidesCloudService();
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
			case CloudPackage.CLOUD_PROVIDER__PROVIDES_CLOUD_SERVICE:
				getProvidesCloudService().clear();
				getProvidesCloudService().addAll((Collection<? extends CloudService>)newValue);
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
			case CloudPackage.CLOUD_PROVIDER__PROVIDES_CLOUD_SERVICE:
				getProvidesCloudService().clear();
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
			case CloudPackage.CLOUD_PROVIDER__PROVIDES_CLOUD_SERVICE:
				return providesCloudService != null && !providesCloudService.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CloudProviderImpl
