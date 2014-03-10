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
import it.polimi.modaclouds.resourcemodel.cloud.CloudPackage;
import it.polimi.modaclouds.resourcemodel.cloud.Cost;
import it.polimi.modaclouds.resourcemodel.cloud.CostProfile;

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
 * An implementation of the model object '<em><b>Cost Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CostProfileImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CostProfileImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CostProfileImpl#getComposedOf <em>Composed Of</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CostProfileImpl#getAssociatedToCloudElement <em>Associated To Cloud Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CostProfileImpl extends EObjectImpl implements CostProfile {
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
	protected EList<Cost> composedOf;

	/**
	 * The cached value of the '{@link #getAssociatedToCloudElement() <em>Associated To Cloud Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedToCloudElement()
	 * @generated
	 * @ordered
	 */
	protected CloudElement associatedToCloudElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CostProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudPackage.Literals.COST_PROFILE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.COST_PROFILE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.COST_PROFILE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cost> getComposedOf() {
		if (composedOf == null) {
			composedOf = new EObjectContainmentEList<Cost>(Cost.class, this, CloudPackage.COST_PROFILE__COMPOSED_OF);
		}
		return composedOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudElement getAssociatedToCloudElement() {
		if (associatedToCloudElement != null && associatedToCloudElement.eIsProxy()) {
			InternalEObject oldAssociatedToCloudElement = (InternalEObject)associatedToCloudElement;
			associatedToCloudElement = (CloudElement)eResolveProxy(oldAssociatedToCloudElement);
			if (associatedToCloudElement != oldAssociatedToCloudElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CloudPackage.COST_PROFILE__ASSOCIATED_TO_CLOUD_ELEMENT, oldAssociatedToCloudElement, associatedToCloudElement));
			}
		}
		return associatedToCloudElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudElement basicGetAssociatedToCloudElement() {
		return associatedToCloudElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociatedToCloudElement(CloudElement newAssociatedToCloudElement, NotificationChain msgs) {
		CloudElement oldAssociatedToCloudElement = associatedToCloudElement;
		associatedToCloudElement = newAssociatedToCloudElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CloudPackage.COST_PROFILE__ASSOCIATED_TO_CLOUD_ELEMENT, oldAssociatedToCloudElement, newAssociatedToCloudElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatedToCloudElement(CloudElement newAssociatedToCloudElement) {
		if (newAssociatedToCloudElement != associatedToCloudElement) {
			NotificationChain msgs = null;
			if (associatedToCloudElement != null)
				msgs = ((InternalEObject)associatedToCloudElement).eInverseRemove(this, CloudPackage.CLOUD_ELEMENT__HAS_COST_PROFILE, CloudElement.class, msgs);
			if (newAssociatedToCloudElement != null)
				msgs = ((InternalEObject)newAssociatedToCloudElement).eInverseAdd(this, CloudPackage.CLOUD_ELEMENT__HAS_COST_PROFILE, CloudElement.class, msgs);
			msgs = basicSetAssociatedToCloudElement(newAssociatedToCloudElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.COST_PROFILE__ASSOCIATED_TO_CLOUD_ELEMENT, newAssociatedToCloudElement, newAssociatedToCloudElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CloudPackage.COST_PROFILE__ASSOCIATED_TO_CLOUD_ELEMENT:
				if (associatedToCloudElement != null)
					msgs = ((InternalEObject)associatedToCloudElement).eInverseRemove(this, CloudPackage.CLOUD_ELEMENT__HAS_COST_PROFILE, CloudElement.class, msgs);
				return basicSetAssociatedToCloudElement((CloudElement)otherEnd, msgs);
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
			case CloudPackage.COST_PROFILE__COMPOSED_OF:
				return ((InternalEList<?>)getComposedOf()).basicRemove(otherEnd, msgs);
			case CloudPackage.COST_PROFILE__ASSOCIATED_TO_CLOUD_ELEMENT:
				return basicSetAssociatedToCloudElement(null, msgs);
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
			case CloudPackage.COST_PROFILE__ID:
				return getId();
			case CloudPackage.COST_PROFILE__DESCRIPTION:
				return getDescription();
			case CloudPackage.COST_PROFILE__COMPOSED_OF:
				return getComposedOf();
			case CloudPackage.COST_PROFILE__ASSOCIATED_TO_CLOUD_ELEMENT:
				if (resolve) return getAssociatedToCloudElement();
				return basicGetAssociatedToCloudElement();
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
			case CloudPackage.COST_PROFILE__ID:
				setId((Integer)newValue);
				return;
			case CloudPackage.COST_PROFILE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CloudPackage.COST_PROFILE__COMPOSED_OF:
				getComposedOf().clear();
				getComposedOf().addAll((Collection<? extends Cost>)newValue);
				return;
			case CloudPackage.COST_PROFILE__ASSOCIATED_TO_CLOUD_ELEMENT:
				setAssociatedToCloudElement((CloudElement)newValue);
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
			case CloudPackage.COST_PROFILE__ID:
				setId(ID_EDEFAULT);
				return;
			case CloudPackage.COST_PROFILE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CloudPackage.COST_PROFILE__COMPOSED_OF:
				getComposedOf().clear();
				return;
			case CloudPackage.COST_PROFILE__ASSOCIATED_TO_CLOUD_ELEMENT:
				setAssociatedToCloudElement((CloudElement)null);
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
			case CloudPackage.COST_PROFILE__ID:
				return id != ID_EDEFAULT;
			case CloudPackage.COST_PROFILE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CloudPackage.COST_PROFILE__COMPOSED_OF:
				return composedOf != null && !composedOf.isEmpty();
			case CloudPackage.COST_PROFILE__ASSOCIATED_TO_CLOUD_ELEMENT:
				return associatedToCloudElement != null;
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

} //CostProfileImpl
