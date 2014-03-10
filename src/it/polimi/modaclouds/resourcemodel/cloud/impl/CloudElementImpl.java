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

import it.polimi.modaclouds.resourcemodel.cloud.CloudElement;
import it.polimi.modaclouds.resourcemodel.cloud.CloudElementType;
import it.polimi.modaclouds.resourcemodel.cloud.CloudPackage;
import it.polimi.modaclouds.resourcemodel.cloud.Cost;
import it.polimi.modaclouds.resourcemodel.cloud.CostProfile;
import it.polimi.modaclouds.resourcemodel.cloud.FreeQuota;
import it.polimi.modaclouds.resourcemodel.cloud.Link;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudElementImpl#getCloudElementA <em>Cloud Element A</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudElementImpl#getCloudElementB <em>Cloud Element B</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudElementImpl#getHasCostProfile <em>Has Cost Profile</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudElementImpl#getHasCost <em>Has Cost</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudElementImpl#getHasFreeQuota <em>Has Free Quota</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CloudElementImpl extends EObjectImpl implements CloudElement {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CloudElementType TYPE_EDEFAULT = CloudElementType.PLATFORM;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CloudElementType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCloudElementA() <em>Cloud Element A</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudElementA()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> cloudElementA;

	/**
	 * The cached value of the '{@link #getCloudElementB() <em>Cloud Element B</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudElementB()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> cloudElementB;

	/**
	 * The cached value of the '{@link #getHasCostProfile() <em>Has Cost Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCostProfile()
	 * @generated
	 * @ordered
	 */
	protected CostProfile hasCostProfile;

	/**
	 * The cached value of the '{@link #getHasCost() <em>Has Cost</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCost()
	 * @generated
	 * @ordered
	 */
	protected EList<Cost> hasCost;

	/**
	 * The cached value of the '{@link #getHasFreeQuota() <em>Has Free Quota</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasFreeQuota()
	 * @generated
	 * @ordered
	 */
	protected EList<FreeQuota> hasFreeQuota;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudPackage.Literals.CLOUD_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.CLOUD_ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.CLOUD_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudElementType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CloudElementType newType) {
		CloudElementType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.CLOUD_ELEMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getCloudElementA() {
		if (cloudElementA == null) {
			cloudElementA = new EObjectWithInverseResolvingEList<Link>(Link.class, this, CloudPackage.CLOUD_ELEMENT__CLOUD_ELEMENT_A, CloudPackage.LINK__REVERSE_LINK_TO_A);
		}
		return cloudElementA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getCloudElementB() {
		if (cloudElementB == null) {
			cloudElementB = new EObjectWithInverseResolvingEList<Link>(Link.class, this, CloudPackage.CLOUD_ELEMENT__CLOUD_ELEMENT_B, CloudPackage.LINK__REVERSE_LINK_TO_B);
		}
		return cloudElementB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostProfile getHasCostProfile() {
		if (hasCostProfile != null && hasCostProfile.eIsProxy()) {
			InternalEObject oldHasCostProfile = (InternalEObject)hasCostProfile;
			hasCostProfile = (CostProfile)eResolveProxy(oldHasCostProfile);
			if (hasCostProfile != oldHasCostProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CloudPackage.CLOUD_ELEMENT__HAS_COST_PROFILE, oldHasCostProfile, hasCostProfile));
			}
		}
		return hasCostProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostProfile basicGetHasCostProfile() {
		return hasCostProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasCostProfile(CostProfile newHasCostProfile, NotificationChain msgs) {
		CostProfile oldHasCostProfile = hasCostProfile;
		hasCostProfile = newHasCostProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CloudPackage.CLOUD_ELEMENT__HAS_COST_PROFILE, oldHasCostProfile, newHasCostProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasCostProfile(CostProfile newHasCostProfile) {
		if (newHasCostProfile != hasCostProfile) {
			NotificationChain msgs = null;
			if (hasCostProfile != null)
				msgs = ((InternalEObject)hasCostProfile).eInverseRemove(this, CloudPackage.COST_PROFILE__ASSOCIATED_TO_CLOUD_ELEMENT, CostProfile.class, msgs);
			if (newHasCostProfile != null)
				msgs = ((InternalEObject)newHasCostProfile).eInverseAdd(this, CloudPackage.COST_PROFILE__ASSOCIATED_TO_CLOUD_ELEMENT, CostProfile.class, msgs);
			msgs = basicSetHasCostProfile(newHasCostProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.CLOUD_ELEMENT__HAS_COST_PROFILE, newHasCostProfile, newHasCostProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cost> getHasCost() {
		if (hasCost == null) {
			hasCost = new EObjectWithInverseResolvingEList<Cost>(Cost.class, this, CloudPackage.CLOUD_ELEMENT__HAS_COST, CloudPackage.COST__ASSOCIATED_TO_CLOUD_ELEMENT);
		}
		return hasCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FreeQuota> getHasFreeQuota() {
		if (hasFreeQuota == null) {
			hasFreeQuota = new EObjectWithInverseResolvingEList<FreeQuota>(FreeQuota.class, this, CloudPackage.CLOUD_ELEMENT__HAS_FREE_QUOTA, CloudPackage.FREE_QUOTA__ASSOCIATED_TO_CLOUD_ELEMENT);
		}
		return hasFreeQuota;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CloudPackage.CLOUD_ELEMENT__CLOUD_ELEMENT_A:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCloudElementA()).basicAdd(otherEnd, msgs);
			case CloudPackage.CLOUD_ELEMENT__CLOUD_ELEMENT_B:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCloudElementB()).basicAdd(otherEnd, msgs);
			case CloudPackage.CLOUD_ELEMENT__HAS_COST_PROFILE:
				if (hasCostProfile != null)
					msgs = ((InternalEObject)hasCostProfile).eInverseRemove(this, CloudPackage.COST_PROFILE__ASSOCIATED_TO_CLOUD_ELEMENT, CostProfile.class, msgs);
				return basicSetHasCostProfile((CostProfile)otherEnd, msgs);
			case CloudPackage.CLOUD_ELEMENT__HAS_COST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasCost()).basicAdd(otherEnd, msgs);
			case CloudPackage.CLOUD_ELEMENT__HAS_FREE_QUOTA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasFreeQuota()).basicAdd(otherEnd, msgs);
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
			case CloudPackage.CLOUD_ELEMENT__CLOUD_ELEMENT_A:
				return ((InternalEList<?>)getCloudElementA()).basicRemove(otherEnd, msgs);
			case CloudPackage.CLOUD_ELEMENT__CLOUD_ELEMENT_B:
				return ((InternalEList<?>)getCloudElementB()).basicRemove(otherEnd, msgs);
			case CloudPackage.CLOUD_ELEMENT__HAS_COST_PROFILE:
				return basicSetHasCostProfile(null, msgs);
			case CloudPackage.CLOUD_ELEMENT__HAS_COST:
				return ((InternalEList<?>)getHasCost()).basicRemove(otherEnd, msgs);
			case CloudPackage.CLOUD_ELEMENT__HAS_FREE_QUOTA:
				return ((InternalEList<?>)getHasFreeQuota()).basicRemove(otherEnd, msgs);
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
			case CloudPackage.CLOUD_ELEMENT__ID:
				return getId();
			case CloudPackage.CLOUD_ELEMENT__NAME:
				return getName();
			case CloudPackage.CLOUD_ELEMENT__TYPE:
				return getType();
			case CloudPackage.CLOUD_ELEMENT__CLOUD_ELEMENT_A:
				return getCloudElementA();
			case CloudPackage.CLOUD_ELEMENT__CLOUD_ELEMENT_B:
				return getCloudElementB();
			case CloudPackage.CLOUD_ELEMENT__HAS_COST_PROFILE:
				if (resolve) return getHasCostProfile();
				return basicGetHasCostProfile();
			case CloudPackage.CLOUD_ELEMENT__HAS_COST:
				return getHasCost();
			case CloudPackage.CLOUD_ELEMENT__HAS_FREE_QUOTA:
				return getHasFreeQuota();
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
			case CloudPackage.CLOUD_ELEMENT__ID:
				setId((Integer)newValue);
				return;
			case CloudPackage.CLOUD_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case CloudPackage.CLOUD_ELEMENT__TYPE:
				setType((CloudElementType)newValue);
				return;
			case CloudPackage.CLOUD_ELEMENT__CLOUD_ELEMENT_A:
				getCloudElementA().clear();
				getCloudElementA().addAll((Collection<? extends Link>)newValue);
				return;
			case CloudPackage.CLOUD_ELEMENT__CLOUD_ELEMENT_B:
				getCloudElementB().clear();
				getCloudElementB().addAll((Collection<? extends Link>)newValue);
				return;
			case CloudPackage.CLOUD_ELEMENT__HAS_COST_PROFILE:
				setHasCostProfile((CostProfile)newValue);
				return;
			case CloudPackage.CLOUD_ELEMENT__HAS_COST:
				getHasCost().clear();
				getHasCost().addAll((Collection<? extends Cost>)newValue);
				return;
			case CloudPackage.CLOUD_ELEMENT__HAS_FREE_QUOTA:
				getHasFreeQuota().clear();
				getHasFreeQuota().addAll((Collection<? extends FreeQuota>)newValue);
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
			case CloudPackage.CLOUD_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case CloudPackage.CLOUD_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CloudPackage.CLOUD_ELEMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CloudPackage.CLOUD_ELEMENT__CLOUD_ELEMENT_A:
				getCloudElementA().clear();
				return;
			case CloudPackage.CLOUD_ELEMENT__CLOUD_ELEMENT_B:
				getCloudElementB().clear();
				return;
			case CloudPackage.CLOUD_ELEMENT__HAS_COST_PROFILE:
				setHasCostProfile((CostProfile)null);
				return;
			case CloudPackage.CLOUD_ELEMENT__HAS_COST:
				getHasCost().clear();
				return;
			case CloudPackage.CLOUD_ELEMENT__HAS_FREE_QUOTA:
				getHasFreeQuota().clear();
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
			case CloudPackage.CLOUD_ELEMENT__ID:
				return id != ID_EDEFAULT;
			case CloudPackage.CLOUD_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CloudPackage.CLOUD_ELEMENT__TYPE:
				return type != TYPE_EDEFAULT;
			case CloudPackage.CLOUD_ELEMENT__CLOUD_ELEMENT_A:
				return cloudElementA != null && !cloudElementA.isEmpty();
			case CloudPackage.CLOUD_ELEMENT__CLOUD_ELEMENT_B:
				return cloudElementB != null && !cloudElementB.isEmpty();
			case CloudPackage.CLOUD_ELEMENT__HAS_COST_PROFILE:
				return hasCostProfile != null;
			case CloudPackage.CLOUD_ELEMENT__HAS_COST:
				return hasCost != null && !hasCost.isEmpty();
			case CloudPackage.CLOUD_ELEMENT__HAS_FREE_QUOTA:
				return hasFreeQuota != null && !hasFreeQuota.isEmpty();
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
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //CloudElementImpl
