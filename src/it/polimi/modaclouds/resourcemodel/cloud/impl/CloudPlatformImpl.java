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
import it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform;
import it.polimi.modaclouds.resourcemodel.cloud.CloudPlatformType;
import it.polimi.modaclouds.resourcemodel.cloud.CloudResource;
import it.polimi.modaclouds.resourcemodel.cloud.ResourcePool;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPlatformImpl#getRunsOnCloudResource <em>Runs On Cloud Resource</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPlatformImpl#getPlatformType <em>Platform Type</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPlatformImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPlatformImpl#getTechnology <em>Technology</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPlatformImpl#getRunsOnResourcePool <em>Runs On Resource Pool</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CloudPlatformImpl extends CloudElementImpl implements CloudPlatform {
	/**
	 * The cached value of the '{@link #getRunsOnCloudResource() <em>Runs On Cloud Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunsOnCloudResource()
	 * @generated
	 * @ordered
	 */
	protected EList<CloudResource> runsOnCloudResource;

	/**
	 * The default value of the '{@link #getPlatformType() <em>Platform Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformType()
	 * @generated
	 * @ordered
	 */
	protected static final CloudPlatformType PLATFORM_TYPE_EDEFAULT = CloudPlatformType.FRONTEND;

	/**
	 * The cached value of the '{@link #getPlatformType() <em>Platform Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformType()
	 * @generated
	 * @ordered
	 */
	protected CloudPlatformType platformType = PLATFORM_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final String TECHNOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected String technology = TECHNOLOGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRunsOnResourcePool() <em>Runs On Resource Pool</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunsOnResourcePool()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourcePool> runsOnResourcePool;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudPlatformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudPackage.Literals.CLOUD_PLATFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CloudResource> getRunsOnCloudResource() {
		if (runsOnCloudResource == null) {
			runsOnCloudResource = new EObjectResolvingEList<CloudResource>(CloudResource.class, this, CloudPackage.CLOUD_PLATFORM__RUNS_ON_CLOUD_RESOURCE);
		}
		return runsOnCloudResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudPlatformType getPlatformType() {
		return platformType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatformType(CloudPlatformType newPlatformType) {
		CloudPlatformType oldPlatformType = platformType;
		platformType = newPlatformType == null ? PLATFORM_TYPE_EDEFAULT : newPlatformType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.CLOUD_PLATFORM__PLATFORM_TYPE, oldPlatformType, platformType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.CLOUD_PLATFORM__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTechnology() {
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnology(String newTechnology) {
		String oldTechnology = technology;
		technology = newTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.CLOUD_PLATFORM__TECHNOLOGY, oldTechnology, technology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourcePool> getRunsOnResourcePool() {
		if (runsOnResourcePool == null) {
			runsOnResourcePool = new EObjectResolvingEList<ResourcePool>(ResourcePool.class, this, CloudPackage.CLOUD_PLATFORM__RUNS_ON_RESOURCE_POOL);
		}
		return runsOnResourcePool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudPackage.CLOUD_PLATFORM__RUNS_ON_CLOUD_RESOURCE:
				return getRunsOnCloudResource();
			case CloudPackage.CLOUD_PLATFORM__PLATFORM_TYPE:
				return getPlatformType();
			case CloudPackage.CLOUD_PLATFORM__LANGUAGE:
				return getLanguage();
			case CloudPackage.CLOUD_PLATFORM__TECHNOLOGY:
				return getTechnology();
			case CloudPackage.CLOUD_PLATFORM__RUNS_ON_RESOURCE_POOL:
				return getRunsOnResourcePool();
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
			case CloudPackage.CLOUD_PLATFORM__RUNS_ON_CLOUD_RESOURCE:
				getRunsOnCloudResource().clear();
				getRunsOnCloudResource().addAll((Collection<? extends CloudResource>)newValue);
				return;
			case CloudPackage.CLOUD_PLATFORM__PLATFORM_TYPE:
				setPlatformType((CloudPlatformType)newValue);
				return;
			case CloudPackage.CLOUD_PLATFORM__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case CloudPackage.CLOUD_PLATFORM__TECHNOLOGY:
				setTechnology((String)newValue);
				return;
			case CloudPackage.CLOUD_PLATFORM__RUNS_ON_RESOURCE_POOL:
				getRunsOnResourcePool().clear();
				getRunsOnResourcePool().addAll((Collection<? extends ResourcePool>)newValue);
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
			case CloudPackage.CLOUD_PLATFORM__RUNS_ON_CLOUD_RESOURCE:
				getRunsOnCloudResource().clear();
				return;
			case CloudPackage.CLOUD_PLATFORM__PLATFORM_TYPE:
				setPlatformType(PLATFORM_TYPE_EDEFAULT);
				return;
			case CloudPackage.CLOUD_PLATFORM__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case CloudPackage.CLOUD_PLATFORM__TECHNOLOGY:
				setTechnology(TECHNOLOGY_EDEFAULT);
				return;
			case CloudPackage.CLOUD_PLATFORM__RUNS_ON_RESOURCE_POOL:
				getRunsOnResourcePool().clear();
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
			case CloudPackage.CLOUD_PLATFORM__RUNS_ON_CLOUD_RESOURCE:
				return runsOnCloudResource != null && !runsOnCloudResource.isEmpty();
			case CloudPackage.CLOUD_PLATFORM__PLATFORM_TYPE:
				return platformType != PLATFORM_TYPE_EDEFAULT;
			case CloudPackage.CLOUD_PLATFORM__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case CloudPackage.CLOUD_PLATFORM__TECHNOLOGY:
				return TECHNOLOGY_EDEFAULT == null ? technology != null : !TECHNOLOGY_EDEFAULT.equals(technology);
			case CloudPackage.CLOUD_PLATFORM__RUNS_ON_RESOURCE_POOL:
				return runsOnResourcePool != null && !runsOnResourcePool.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (platformType: ");
		result.append(platformType);
		result.append(", language: ");
		result.append(language);
		result.append(", technology: ");
		result.append(technology);
		result.append(')');
		return result.toString();
	}

} //CloudPlatformImpl
