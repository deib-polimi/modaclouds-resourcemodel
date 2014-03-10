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
import it.polimi.modaclouds.resourcemodel.cloud.CloudResource;
import it.polimi.modaclouds.resourcemodel.cloud.Link;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.LinkImpl#getTo <em>To</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.LinkImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.LinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.LinkImpl#getLatency <em>Latency</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.LinkImpl#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.LinkImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.LinkImpl#getReverseLinkToB <em>Reverse Link To B</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.LinkImpl#getReverseLinkToA <em>Reverse Link To A</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkImpl extends EObjectImpl implements Link {
	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected CloudResource to;

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
	 * The default value of the '{@link #getLatency() <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected static final double LATENCY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLatency() <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected double latency = LATENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getThroughput() <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected static final double THROUGHPUT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThroughput() <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected double throughput = THROUGHPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected double cost = COST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReverseLinkToB() <em>Reverse Link To B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverseLinkToB()
	 * @generated
	 * @ordered
	 */
	protected CloudElement reverseLinkToB;

	/**
	 * The cached value of the '{@link #getReverseLinkToA() <em>Reverse Link To A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverseLinkToA()
	 * @generated
	 * @ordered
	 */
	protected CloudElement reverseLinkToA;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudResource getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (CloudResource)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CloudPackage.LINK__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudResource basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(CloudResource newTo) {
		CloudResource oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.LINK__TO, oldTo, to));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.LINK__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.LINK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLatency() {
		return latency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatency(double newLatency) {
		double oldLatency = latency;
		latency = newLatency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.LINK__LATENCY, oldLatency, latency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getThroughput() {
		return throughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughput(double newThroughput) {
		double oldThroughput = throughput;
		throughput = newThroughput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.LINK__THROUGHPUT, oldThroughput, throughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(double newCost) {
		double oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.LINK__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudElement getReverseLinkToB() {
		if (reverseLinkToB != null && reverseLinkToB.eIsProxy()) {
			InternalEObject oldReverseLinkToB = (InternalEObject)reverseLinkToB;
			reverseLinkToB = (CloudElement)eResolveProxy(oldReverseLinkToB);
			if (reverseLinkToB != oldReverseLinkToB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CloudPackage.LINK__REVERSE_LINK_TO_B, oldReverseLinkToB, reverseLinkToB));
			}
		}
		return reverseLinkToB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudElement basicGetReverseLinkToB() {
		return reverseLinkToB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReverseLinkToB(CloudElement newReverseLinkToB, NotificationChain msgs) {
		CloudElement oldReverseLinkToB = reverseLinkToB;
		reverseLinkToB = newReverseLinkToB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CloudPackage.LINK__REVERSE_LINK_TO_B, oldReverseLinkToB, newReverseLinkToB);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReverseLinkToB(CloudElement newReverseLinkToB) {
		if (newReverseLinkToB != reverseLinkToB) {
			NotificationChain msgs = null;
			if (reverseLinkToB != null)
				msgs = ((InternalEObject)reverseLinkToB).eInverseRemove(this, CloudPackage.CLOUD_ELEMENT__CLOUD_ELEMENT_B, CloudElement.class, msgs);
			if (newReverseLinkToB != null)
				msgs = ((InternalEObject)newReverseLinkToB).eInverseAdd(this, CloudPackage.CLOUD_ELEMENT__CLOUD_ELEMENT_B, CloudElement.class, msgs);
			msgs = basicSetReverseLinkToB(newReverseLinkToB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.LINK__REVERSE_LINK_TO_B, newReverseLinkToB, newReverseLinkToB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudElement getReverseLinkToA() {
		if (reverseLinkToA != null && reverseLinkToA.eIsProxy()) {
			InternalEObject oldReverseLinkToA = (InternalEObject)reverseLinkToA;
			reverseLinkToA = (CloudElement)eResolveProxy(oldReverseLinkToA);
			if (reverseLinkToA != oldReverseLinkToA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CloudPackage.LINK__REVERSE_LINK_TO_A, oldReverseLinkToA, reverseLinkToA));
			}
		}
		return reverseLinkToA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudElement basicGetReverseLinkToA() {
		return reverseLinkToA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReverseLinkToA(CloudElement newReverseLinkToA, NotificationChain msgs) {
		CloudElement oldReverseLinkToA = reverseLinkToA;
		reverseLinkToA = newReverseLinkToA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CloudPackage.LINK__REVERSE_LINK_TO_A, oldReverseLinkToA, newReverseLinkToA);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReverseLinkToA(CloudElement newReverseLinkToA) {
		if (newReverseLinkToA != reverseLinkToA) {
			NotificationChain msgs = null;
			if (reverseLinkToA != null)
				msgs = ((InternalEObject)reverseLinkToA).eInverseRemove(this, CloudPackage.CLOUD_ELEMENT__CLOUD_ELEMENT_A, CloudElement.class, msgs);
			if (newReverseLinkToA != null)
				msgs = ((InternalEObject)newReverseLinkToA).eInverseAdd(this, CloudPackage.CLOUD_ELEMENT__CLOUD_ELEMENT_A, CloudElement.class, msgs);
			msgs = basicSetReverseLinkToA(newReverseLinkToA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.LINK__REVERSE_LINK_TO_A, newReverseLinkToA, newReverseLinkToA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CloudPackage.LINK__REVERSE_LINK_TO_B:
				if (reverseLinkToB != null)
					msgs = ((InternalEObject)reverseLinkToB).eInverseRemove(this, CloudPackage.CLOUD_ELEMENT__CLOUD_ELEMENT_B, CloudElement.class, msgs);
				return basicSetReverseLinkToB((CloudElement)otherEnd, msgs);
			case CloudPackage.LINK__REVERSE_LINK_TO_A:
				if (reverseLinkToA != null)
					msgs = ((InternalEObject)reverseLinkToA).eInverseRemove(this, CloudPackage.CLOUD_ELEMENT__CLOUD_ELEMENT_A, CloudElement.class, msgs);
				return basicSetReverseLinkToA((CloudElement)otherEnd, msgs);
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
			case CloudPackage.LINK__REVERSE_LINK_TO_B:
				return basicSetReverseLinkToB(null, msgs);
			case CloudPackage.LINK__REVERSE_LINK_TO_A:
				return basicSetReverseLinkToA(null, msgs);
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
			case CloudPackage.LINK__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case CloudPackage.LINK__ID:
				return getId();
			case CloudPackage.LINK__NAME:
				return getName();
			case CloudPackage.LINK__LATENCY:
				return getLatency();
			case CloudPackage.LINK__THROUGHPUT:
				return getThroughput();
			case CloudPackage.LINK__COST:
				return getCost();
			case CloudPackage.LINK__REVERSE_LINK_TO_B:
				if (resolve) return getReverseLinkToB();
				return basicGetReverseLinkToB();
			case CloudPackage.LINK__REVERSE_LINK_TO_A:
				if (resolve) return getReverseLinkToA();
				return basicGetReverseLinkToA();
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
			case CloudPackage.LINK__TO:
				setTo((CloudResource)newValue);
				return;
			case CloudPackage.LINK__ID:
				setId((Integer)newValue);
				return;
			case CloudPackage.LINK__NAME:
				setName((String)newValue);
				return;
			case CloudPackage.LINK__LATENCY:
				setLatency((Double)newValue);
				return;
			case CloudPackage.LINK__THROUGHPUT:
				setThroughput((Double)newValue);
				return;
			case CloudPackage.LINK__COST:
				setCost((Double)newValue);
				return;
			case CloudPackage.LINK__REVERSE_LINK_TO_B:
				setReverseLinkToB((CloudElement)newValue);
				return;
			case CloudPackage.LINK__REVERSE_LINK_TO_A:
				setReverseLinkToA((CloudElement)newValue);
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
			case CloudPackage.LINK__TO:
				setTo((CloudResource)null);
				return;
			case CloudPackage.LINK__ID:
				setId(ID_EDEFAULT);
				return;
			case CloudPackage.LINK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CloudPackage.LINK__LATENCY:
				setLatency(LATENCY_EDEFAULT);
				return;
			case CloudPackage.LINK__THROUGHPUT:
				setThroughput(THROUGHPUT_EDEFAULT);
				return;
			case CloudPackage.LINK__COST:
				setCost(COST_EDEFAULT);
				return;
			case CloudPackage.LINK__REVERSE_LINK_TO_B:
				setReverseLinkToB((CloudElement)null);
				return;
			case CloudPackage.LINK__REVERSE_LINK_TO_A:
				setReverseLinkToA((CloudElement)null);
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
			case CloudPackage.LINK__TO:
				return to != null;
			case CloudPackage.LINK__ID:
				return id != ID_EDEFAULT;
			case CloudPackage.LINK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CloudPackage.LINK__LATENCY:
				return latency != LATENCY_EDEFAULT;
			case CloudPackage.LINK__THROUGHPUT:
				return throughput != THROUGHPUT_EDEFAULT;
			case CloudPackage.LINK__COST:
				return cost != COST_EDEFAULT;
			case CloudPackage.LINK__REVERSE_LINK_TO_B:
				return reverseLinkToB != null;
			case CloudPackage.LINK__REVERSE_LINK_TO_A:
				return reverseLinkToA != null;
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
		result.append(", latency: ");
		result.append(latency);
		result.append(", throughput: ");
		result.append(throughput);
		result.append(", cost: ");
		result.append(cost);
		result.append(')');
		return result.toString();
	}

} //LinkImpl
