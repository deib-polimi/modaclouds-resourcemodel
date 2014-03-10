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

import it.polimi.modaclouds.resourcemodel.cloud.Allocation;
import it.polimi.modaclouds.resourcemodel.cloud.AllocationProfile;
import it.polimi.modaclouds.resourcemodel.cloud.CloudPackage;
import it.polimi.modaclouds.resourcemodel.cloud.ResourcePool;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocation Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.AllocationProfileImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.AllocationProfileImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.AllocationProfileImpl#getComposedOf <em>Composed Of</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.AllocationProfileImpl#getRelatedToResourcePool <em>Related To Resource Pool</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllocationProfileImpl extends EObjectImpl implements AllocationProfile {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComposedOf() <em>Composed Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposedOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Allocation> composedOf;

	/**
	 * The cached value of the '{@link #getRelatedToResourcePool() <em>Related To Resource Pool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedToResourcePool()
	 * @generated
	 * @ordered
	 */
	protected ResourcePool relatedToResourcePool;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudPackage.Literals.ALLOCATION_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.ALLOCATION_PROFILE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.ALLOCATION_PROFILE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Allocation> getComposedOf() {
		if (composedOf == null) {
			composedOf = new EObjectContainmentEList<Allocation>(Allocation.class, this, CloudPackage.ALLOCATION_PROFILE__COMPOSED_OF);
		}
		return composedOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePool getRelatedToResourcePool() {
		if (relatedToResourcePool != null && relatedToResourcePool.eIsProxy()) {
			InternalEObject oldRelatedToResourcePool = (InternalEObject)relatedToResourcePool;
			relatedToResourcePool = (ResourcePool)eResolveProxy(oldRelatedToResourcePool);
			if (relatedToResourcePool != oldRelatedToResourcePool) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CloudPackage.ALLOCATION_PROFILE__RELATED_TO_RESOURCE_POOL, oldRelatedToResourcePool, relatedToResourcePool));
			}
		}
		return relatedToResourcePool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePool basicGetRelatedToResourcePool() {
		return relatedToResourcePool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedToResourcePool(ResourcePool newRelatedToResourcePool, NotificationChain msgs) {
		ResourcePool oldRelatedToResourcePool = relatedToResourcePool;
		relatedToResourcePool = newRelatedToResourcePool;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CloudPackage.ALLOCATION_PROFILE__RELATED_TO_RESOURCE_POOL, oldRelatedToResourcePool, newRelatedToResourcePool);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedToResourcePool(ResourcePool newRelatedToResourcePool) {
		if (newRelatedToResourcePool != relatedToResourcePool) {
			NotificationChain msgs = null;
			if (relatedToResourcePool != null)
				msgs = ((InternalEObject)relatedToResourcePool).eInverseRemove(this, CloudPackage.RESOURCE_POOL__HAS_ALLOCATION_PROFILE, ResourcePool.class, msgs);
			if (newRelatedToResourcePool != null)
				msgs = ((InternalEObject)newRelatedToResourcePool).eInverseAdd(this, CloudPackage.RESOURCE_POOL__HAS_ALLOCATION_PROFILE, ResourcePool.class, msgs);
			msgs = basicSetRelatedToResourcePool(newRelatedToResourcePool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.ALLOCATION_PROFILE__RELATED_TO_RESOURCE_POOL, newRelatedToResourcePool, newRelatedToResourcePool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CloudPackage.ALLOCATION_PROFILE__RELATED_TO_RESOURCE_POOL:
				if (relatedToResourcePool != null)
					msgs = ((InternalEObject)relatedToResourcePool).eInverseRemove(this, CloudPackage.RESOURCE_POOL__HAS_ALLOCATION_PROFILE, ResourcePool.class, msgs);
				return basicSetRelatedToResourcePool((ResourcePool)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CloudPackage.ALLOCATION_PROFILE__COMPOSED_OF:
				return ((InternalEList<?>)getComposedOf()).basicRemove(otherEnd, msgs);
			case CloudPackage.ALLOCATION_PROFILE__RELATED_TO_RESOURCE_POOL:
				return basicSetRelatedToResourcePool(null, msgs);
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
			case CloudPackage.ALLOCATION_PROFILE__ID:
				return getId();
			case CloudPackage.ALLOCATION_PROFILE__DESCRIPTION:
				return getDescription();
			case CloudPackage.ALLOCATION_PROFILE__COMPOSED_OF:
				return getComposedOf();
			case CloudPackage.ALLOCATION_PROFILE__RELATED_TO_RESOURCE_POOL:
				if (resolve) return getRelatedToResourcePool();
				return basicGetRelatedToResourcePool();
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
			case CloudPackage.ALLOCATION_PROFILE__ID:
				setId((Integer)newValue);
				return;
			case CloudPackage.ALLOCATION_PROFILE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CloudPackage.ALLOCATION_PROFILE__COMPOSED_OF:
				getComposedOf().clear();
				getComposedOf().addAll((Collection<? extends Allocation>)newValue);
				return;
			case CloudPackage.ALLOCATION_PROFILE__RELATED_TO_RESOURCE_POOL:
				setRelatedToResourcePool((ResourcePool)newValue);
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
			case CloudPackage.ALLOCATION_PROFILE__ID:
				setId(ID_EDEFAULT);
				return;
			case CloudPackage.ALLOCATION_PROFILE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CloudPackage.ALLOCATION_PROFILE__COMPOSED_OF:
				getComposedOf().clear();
				return;
			case CloudPackage.ALLOCATION_PROFILE__RELATED_TO_RESOURCE_POOL:
				setRelatedToResourcePool((ResourcePool)null);
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
			case CloudPackage.ALLOCATION_PROFILE__ID:
				return id != ID_EDEFAULT;
			case CloudPackage.ALLOCATION_PROFILE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CloudPackage.ALLOCATION_PROFILE__COMPOSED_OF:
				return composedOf != null && !composedOf.isEmpty();
			case CloudPackage.ALLOCATION_PROFILE__RELATED_TO_RESOURCE_POOL:
				return relatedToResourcePool != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //AllocationProfileImpl
