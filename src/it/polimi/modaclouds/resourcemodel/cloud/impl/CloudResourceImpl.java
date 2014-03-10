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
import it.polimi.modaclouds.resourcemodel.cloud.CloudResource;
import it.polimi.modaclouds.resourcemodel.cloud.CloudResourceType;
import it.polimi.modaclouds.resourcemodel.cloud.Link;
import it.polimi.modaclouds.resourcemodel.cloud.Location;
import it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudResourceImpl#getInLocation <em>In Location</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudResourceImpl#getFrom <em>From</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudResourceImpl#getComposedOf <em>Composed Of</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudResourceImpl#getResourceType <em>Resource Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CloudResourceImpl extends CloudElementImpl implements CloudResource {
	/**
	 * The cached value of the '{@link #getInLocation() <em>In Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInLocation()
	 * @generated
	 * @ordered
	 */
	protected Location inLocation;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> from;

	/**
	 * The cached value of the '{@link #getComposedOf() <em>Composed Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposedOf()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualHWResource> composedOf;

	/**
	 * The default value of the '{@link #getResourceType() <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected static final CloudResourceType RESOURCE_TYPE_EDEFAULT = CloudResourceType.COMPUTE;

	/**
	 * The cached value of the '{@link #getResourceType() <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected CloudResourceType resourceType = RESOURCE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudPackage.Literals.CLOUD_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getInLocation() {
		if (inLocation != null && inLocation.eIsProxy()) {
			InternalEObject oldInLocation = (InternalEObject)inLocation;
			inLocation = (Location)eResolveProxy(oldInLocation);
			if (inLocation != oldInLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CloudPackage.CLOUD_RESOURCE__IN_LOCATION, oldInLocation, inLocation));
			}
		}
		return inLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetInLocation() {
		return inLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInLocation(Location newInLocation) {
		Location oldInLocation = inLocation;
		inLocation = newInLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.CLOUD_RESOURCE__IN_LOCATION, oldInLocation, inLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getFrom() {
		if (from == null) {
			from = new EObjectResolvingEList<Link>(Link.class, this, CloudPackage.CLOUD_RESOURCE__FROM);
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualHWResource> getComposedOf() {
		if (composedOf == null) {
			composedOf = new EObjectContainmentEList<VirtualHWResource>(VirtualHWResource.class, this, CloudPackage.CLOUD_RESOURCE__COMPOSED_OF);
		}
		return composedOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudResourceType getResourceType() {
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceType(CloudResourceType newResourceType) {
		CloudResourceType oldResourceType = resourceType;
		resourceType = newResourceType == null ? RESOURCE_TYPE_EDEFAULT : newResourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.CLOUD_RESOURCE__RESOURCE_TYPE, oldResourceType, resourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CloudPackage.CLOUD_RESOURCE__COMPOSED_OF:
				return ((InternalEList<?>)getComposedOf()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudPackage.CLOUD_RESOURCE__IN_LOCATION:
				if (resolve) return getInLocation();
				return basicGetInLocation();
			case CloudPackage.CLOUD_RESOURCE__FROM:
				return getFrom();
			case CloudPackage.CLOUD_RESOURCE__COMPOSED_OF:
				return getComposedOf();
			case CloudPackage.CLOUD_RESOURCE__RESOURCE_TYPE:
				return getResourceType();
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
			case CloudPackage.CLOUD_RESOURCE__IN_LOCATION:
				setInLocation((Location)newValue);
				return;
			case CloudPackage.CLOUD_RESOURCE__FROM:
				getFrom().clear();
				getFrom().addAll((Collection<? extends Link>)newValue);
				return;
			case CloudPackage.CLOUD_RESOURCE__COMPOSED_OF:
				getComposedOf().clear();
				getComposedOf().addAll((Collection<? extends VirtualHWResource>)newValue);
				return;
			case CloudPackage.CLOUD_RESOURCE__RESOURCE_TYPE:
				setResourceType((CloudResourceType)newValue);
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
			case CloudPackage.CLOUD_RESOURCE__IN_LOCATION:
				setInLocation((Location)null);
				return;
			case CloudPackage.CLOUD_RESOURCE__FROM:
				getFrom().clear();
				return;
			case CloudPackage.CLOUD_RESOURCE__COMPOSED_OF:
				getComposedOf().clear();
				return;
			case CloudPackage.CLOUD_RESOURCE__RESOURCE_TYPE:
				setResourceType(RESOURCE_TYPE_EDEFAULT);
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
			case CloudPackage.CLOUD_RESOURCE__IN_LOCATION:
				return inLocation != null;
			case CloudPackage.CLOUD_RESOURCE__FROM:
				return from != null && !from.isEmpty();
			case CloudPackage.CLOUD_RESOURCE__COMPOSED_OF:
				return composedOf != null && !composedOf.isEmpty();
			case CloudPackage.CLOUD_RESOURCE__RESOURCE_TYPE:
				return resourceType != RESOURCE_TYPE_EDEFAULT;
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
		result.append(" (resourceType: ");
		result.append(resourceType);
		result.append(')');
		return result.toString();
	}

} //CloudResourceImpl
