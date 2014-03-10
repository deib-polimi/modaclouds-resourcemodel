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
import it.polimi.modaclouds.resourcemodel.cloud.CostUnitType;
import it.polimi.modaclouds.resourcemodel.cloud.FreeQuota;
import it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Free Quota</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.FreeQuotaImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.FreeQuotaImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.FreeQuotaImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.FreeQuotaImpl#getAssociatedToCloudElement <em>Associated To Cloud Element</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.FreeQuotaImpl#getDefinedOn <em>Defined On</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FreeQuotaImpl extends EObjectImpl implements FreeQuota {
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
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final CostUnitType UNIT_EDEFAULT = CostUnitType.PER_HOUR;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected CostUnitType unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final double AMOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected double amount = AMOUNT_EDEFAULT;

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
	 * The cached value of the '{@link #getDefinedOn() <em>Defined On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedOn()
	 * @generated
	 * @ordered
	 */
	protected VirtualHWResource definedOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FreeQuotaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudPackage.Literals.FREE_QUOTA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.FREE_QUOTA__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostUnitType getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(CostUnitType newUnit) {
		CostUnitType oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.FREE_QUOTA__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(double newAmount) {
		double oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.FREE_QUOTA__AMOUNT, oldAmount, amount));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CloudPackage.FREE_QUOTA__ASSOCIATED_TO_CLOUD_ELEMENT, oldAssociatedToCloudElement, associatedToCloudElement));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CloudPackage.FREE_QUOTA__ASSOCIATED_TO_CLOUD_ELEMENT, oldAssociatedToCloudElement, newAssociatedToCloudElement);
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
				msgs = ((InternalEObject)associatedToCloudElement).eInverseRemove(this, CloudPackage.CLOUD_ELEMENT__HAS_FREE_QUOTA, CloudElement.class, msgs);
			if (newAssociatedToCloudElement != null)
				msgs = ((InternalEObject)newAssociatedToCloudElement).eInverseAdd(this, CloudPackage.CLOUD_ELEMENT__HAS_FREE_QUOTA, CloudElement.class, msgs);
			msgs = basicSetAssociatedToCloudElement(newAssociatedToCloudElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.FREE_QUOTA__ASSOCIATED_TO_CLOUD_ELEMENT, newAssociatedToCloudElement, newAssociatedToCloudElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualHWResource getDefinedOn() {
		if (definedOn != null && definedOn.eIsProxy()) {
			InternalEObject oldDefinedOn = (InternalEObject)definedOn;
			definedOn = (VirtualHWResource)eResolveProxy(oldDefinedOn);
			if (definedOn != oldDefinedOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CloudPackage.FREE_QUOTA__DEFINED_ON, oldDefinedOn, definedOn));
			}
		}
		return definedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualHWResource basicGetDefinedOn() {
		return definedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinedOn(VirtualHWResource newDefinedOn) {
		VirtualHWResource oldDefinedOn = definedOn;
		definedOn = newDefinedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.FREE_QUOTA__DEFINED_ON, oldDefinedOn, definedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CloudPackage.FREE_QUOTA__ASSOCIATED_TO_CLOUD_ELEMENT:
				if (associatedToCloudElement != null)
					msgs = ((InternalEObject)associatedToCloudElement).eInverseRemove(this, CloudPackage.CLOUD_ELEMENT__HAS_FREE_QUOTA, CloudElement.class, msgs);
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
			case CloudPackage.FREE_QUOTA__ASSOCIATED_TO_CLOUD_ELEMENT:
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
			case CloudPackage.FREE_QUOTA__ID:
				return getId();
			case CloudPackage.FREE_QUOTA__UNIT:
				return getUnit();
			case CloudPackage.FREE_QUOTA__AMOUNT:
				return getAmount();
			case CloudPackage.FREE_QUOTA__ASSOCIATED_TO_CLOUD_ELEMENT:
				if (resolve) return getAssociatedToCloudElement();
				return basicGetAssociatedToCloudElement();
			case CloudPackage.FREE_QUOTA__DEFINED_ON:
				if (resolve) return getDefinedOn();
				return basicGetDefinedOn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CloudPackage.FREE_QUOTA__ID:
				setId((Integer)newValue);
				return;
			case CloudPackage.FREE_QUOTA__UNIT:
				setUnit((CostUnitType)newValue);
				return;
			case CloudPackage.FREE_QUOTA__AMOUNT:
				setAmount((Double)newValue);
				return;
			case CloudPackage.FREE_QUOTA__ASSOCIATED_TO_CLOUD_ELEMENT:
				setAssociatedToCloudElement((CloudElement)newValue);
				return;
			case CloudPackage.FREE_QUOTA__DEFINED_ON:
				setDefinedOn((VirtualHWResource)newValue);
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
			case CloudPackage.FREE_QUOTA__ID:
				setId(ID_EDEFAULT);
				return;
			case CloudPackage.FREE_QUOTA__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case CloudPackage.FREE_QUOTA__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case CloudPackage.FREE_QUOTA__ASSOCIATED_TO_CLOUD_ELEMENT:
				setAssociatedToCloudElement((CloudElement)null);
				return;
			case CloudPackage.FREE_QUOTA__DEFINED_ON:
				setDefinedOn((VirtualHWResource)null);
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
			case CloudPackage.FREE_QUOTA__ID:
				return id != ID_EDEFAULT;
			case CloudPackage.FREE_QUOTA__UNIT:
				return unit != UNIT_EDEFAULT;
			case CloudPackage.FREE_QUOTA__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case CloudPackage.FREE_QUOTA__ASSOCIATED_TO_CLOUD_ELEMENT:
				return associatedToCloudElement != null;
			case CloudPackage.FREE_QUOTA__DEFINED_ON:
				return definedOn != null;
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
		result.append(", unit: ");
		result.append(unit);
		result.append(", amount: ");
		result.append(amount);
		result.append(')');
		return result.toString();
	}

} //FreeQuotaImpl
