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
import it.polimi.modaclouds.resourcemodel.cloud.EfficiencyProfile;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Efficiency Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.EfficiencyProfileImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.EfficiencyProfileImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.EfficiencyProfileImpl#getEfficiency <em>Efficiency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EfficiencyProfileImpl extends EObjectImpl implements EfficiencyProfile {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int PERIOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected int period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getEfficiency() <em>Efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfficiency()
	 * @generated
	 * @ordered
	 */
	protected static final double EFFICIENCY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEfficiency() <em>Efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfficiency()
	 * @generated
	 * @ordered
	 */
	protected double efficiency = EFFICIENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EfficiencyProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudPackage.Literals.EFFICIENCY_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.EFFICIENCY_PROFILE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(int newPeriod) {
		int oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.EFFICIENCY_PROFILE__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEfficiency() {
		return efficiency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEfficiency(double newEfficiency) {
		double oldEfficiency = efficiency;
		efficiency = newEfficiency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.EFFICIENCY_PROFILE__EFFICIENCY, oldEfficiency, efficiency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudPackage.EFFICIENCY_PROFILE__ID:
				return getId();
			case CloudPackage.EFFICIENCY_PROFILE__PERIOD:
				return getPeriod();
			case CloudPackage.EFFICIENCY_PROFILE__EFFICIENCY:
				return getEfficiency();
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
			case CloudPackage.EFFICIENCY_PROFILE__ID:
				setId((String)newValue);
				return;
			case CloudPackage.EFFICIENCY_PROFILE__PERIOD:
				setPeriod((Integer)newValue);
				return;
			case CloudPackage.EFFICIENCY_PROFILE__EFFICIENCY:
				setEfficiency((Double)newValue);
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
			case CloudPackage.EFFICIENCY_PROFILE__ID:
				setId(ID_EDEFAULT);
				return;
			case CloudPackage.EFFICIENCY_PROFILE__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case CloudPackage.EFFICIENCY_PROFILE__EFFICIENCY:
				setEfficiency(EFFICIENCY_EDEFAULT);
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
			case CloudPackage.EFFICIENCY_PROFILE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CloudPackage.EFFICIENCY_PROFILE__PERIOD:
				return period != PERIOD_EDEFAULT;
			case CloudPackage.EFFICIENCY_PROFILE__EFFICIENCY:
				return efficiency != EFFICIENCY_EDEFAULT;
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
		result.append(", period: ");
		result.append(period);
		result.append(", efficiency: ");
		result.append(efficiency);
		result.append(')');
		return result.toString();
	}

} //EfficiencyProfileImpl
