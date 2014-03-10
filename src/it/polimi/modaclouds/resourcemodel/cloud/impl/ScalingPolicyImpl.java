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
import it.polimi.modaclouds.resourcemodel.cloud.ResourcePool;
import it.polimi.modaclouds.resourcemodel.cloud.ScalingPolicy;
import it.polimi.modaclouds.resourcemodel.cloud.ScalingRule;
import it.polimi.modaclouds.resourcemodel.cloud.ScalingType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scaling Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.ScalingPolicyImpl#getDefinedOn <em>Defined On</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.ScalingPolicyImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.ScalingPolicyImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.ScalingPolicyImpl#getAction <em>Action</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.ScalingPolicyImpl#getComposedOf <em>Composed Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScalingPolicyImpl extends EObjectImpl implements ScalingPolicy {
	/**
	 * The cached value of the '{@link #getDefinedOn() <em>Defined On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourcePool> definedOn;

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
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final ScalingType ACTION_EDEFAULT = ScalingType.SCALE_IN;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected ScalingType action = ACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComposedOf() <em>Composed Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposedOf()
	 * @generated
	 * @ordered
	 */
	protected EList<ScalingRule> composedOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScalingPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudPackage.Literals.SCALING_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourcePool> getDefinedOn() {
		if (definedOn == null) {
			definedOn = new EObjectResolvingEList<ResourcePool>(ResourcePool.class, this, CloudPackage.SCALING_POLICY__DEFINED_ON);
		}
		return definedOn;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.SCALING_POLICY__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.SCALING_POLICY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingType getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(ScalingType newAction) {
		ScalingType oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.SCALING_POLICY__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScalingRule> getComposedOf() {
		if (composedOf == null) {
			composedOf = new EObjectContainmentEList<ScalingRule>(ScalingRule.class, this, CloudPackage.SCALING_POLICY__COMPOSED_OF);
		}
		return composedOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CloudPackage.SCALING_POLICY__COMPOSED_OF:
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
			case CloudPackage.SCALING_POLICY__DEFINED_ON:
				return getDefinedOn();
			case CloudPackage.SCALING_POLICY__ID:
				return getId();
			case CloudPackage.SCALING_POLICY__NAME:
				return getName();
			case CloudPackage.SCALING_POLICY__ACTION:
				return getAction();
			case CloudPackage.SCALING_POLICY__COMPOSED_OF:
				return getComposedOf();
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
			case CloudPackage.SCALING_POLICY__DEFINED_ON:
				getDefinedOn().clear();
				getDefinedOn().addAll((Collection<? extends ResourcePool>)newValue);
				return;
			case CloudPackage.SCALING_POLICY__ID:
				setId((Integer)newValue);
				return;
			case CloudPackage.SCALING_POLICY__NAME:
				setName((String)newValue);
				return;
			case CloudPackage.SCALING_POLICY__ACTION:
				setAction((ScalingType)newValue);
				return;
			case CloudPackage.SCALING_POLICY__COMPOSED_OF:
				getComposedOf().clear();
				getComposedOf().addAll((Collection<? extends ScalingRule>)newValue);
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
			case CloudPackage.SCALING_POLICY__DEFINED_ON:
				getDefinedOn().clear();
				return;
			case CloudPackage.SCALING_POLICY__ID:
				setId(ID_EDEFAULT);
				return;
			case CloudPackage.SCALING_POLICY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CloudPackage.SCALING_POLICY__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case CloudPackage.SCALING_POLICY__COMPOSED_OF:
				getComposedOf().clear();
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
			case CloudPackage.SCALING_POLICY__DEFINED_ON:
				return definedOn != null && !definedOn.isEmpty();
			case CloudPackage.SCALING_POLICY__ID:
				return id != ID_EDEFAULT;
			case CloudPackage.SCALING_POLICY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CloudPackage.SCALING_POLICY__ACTION:
				return action != ACTION_EDEFAULT;
			case CloudPackage.SCALING_POLICY__COMPOSED_OF:
				return composedOf != null && !composedOf.isEmpty();
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
		result.append(", action: ");
		result.append(action);
		result.append(')');
		return result.toString();
	}

} //ScalingPolicyImpl
