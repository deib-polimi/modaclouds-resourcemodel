/**
 */
package it.polimi.modaclouds.resourcemodel.cloud.impl;

import it.polimi.modaclouds.resourcemodel.cloud.AllocationProfile;
import it.polimi.modaclouds.resourcemodel.cloud.CloudPackage;
import it.polimi.modaclouds.resourcemodel.cloud.Compute;
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
 * An implementation of the model object '<em><b>Resource Pool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.ResourcePoolImpl#getComposedOf <em>Composed Of</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.ResourcePoolImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.ResourcePoolImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.ResourcePoolImpl#getHasAllocationProfile <em>Has Allocation Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourcePoolImpl extends EObjectImpl implements ResourcePool {
	/**
	 * The cached value of the '{@link #getComposedOf() <em>Composed Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposedOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Compute> composedOf;

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
	 * The cached value of the '{@link #getHasAllocationProfile() <em>Has Allocation Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAllocationProfile()
	 * @generated
	 * @ordered
	 */
	protected AllocationProfile hasAllocationProfile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourcePoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudPackage.Literals.RESOURCE_POOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Compute> getComposedOf() {
		if (composedOf == null) {
			composedOf = new EObjectContainmentEList<Compute>(Compute.class, this, CloudPackage.RESOURCE_POOL__COMPOSED_OF);
		}
		return composedOf;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.RESOURCE_POOL__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.RESOURCE_POOL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationProfile getHasAllocationProfile() {
		if (hasAllocationProfile != null && hasAllocationProfile.eIsProxy()) {
			InternalEObject oldHasAllocationProfile = (InternalEObject)hasAllocationProfile;
			hasAllocationProfile = (AllocationProfile)eResolveProxy(oldHasAllocationProfile);
			if (hasAllocationProfile != oldHasAllocationProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CloudPackage.RESOURCE_POOL__HAS_ALLOCATION_PROFILE, oldHasAllocationProfile, hasAllocationProfile));
			}
		}
		return hasAllocationProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationProfile basicGetHasAllocationProfile() {
		return hasAllocationProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasAllocationProfile(AllocationProfile newHasAllocationProfile, NotificationChain msgs) {
		AllocationProfile oldHasAllocationProfile = hasAllocationProfile;
		hasAllocationProfile = newHasAllocationProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CloudPackage.RESOURCE_POOL__HAS_ALLOCATION_PROFILE, oldHasAllocationProfile, newHasAllocationProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAllocationProfile(AllocationProfile newHasAllocationProfile) {
		if (newHasAllocationProfile != hasAllocationProfile) {
			NotificationChain msgs = null;
			if (hasAllocationProfile != null)
				msgs = ((InternalEObject)hasAllocationProfile).eInverseRemove(this, CloudPackage.ALLOCATION_PROFILE__RELATED_TO_RESOURCE_POOL, AllocationProfile.class, msgs);
			if (newHasAllocationProfile != null)
				msgs = ((InternalEObject)newHasAllocationProfile).eInverseAdd(this, CloudPackage.ALLOCATION_PROFILE__RELATED_TO_RESOURCE_POOL, AllocationProfile.class, msgs);
			msgs = basicSetHasAllocationProfile(newHasAllocationProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.RESOURCE_POOL__HAS_ALLOCATION_PROFILE, newHasAllocationProfile, newHasAllocationProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CloudPackage.RESOURCE_POOL__HAS_ALLOCATION_PROFILE:
				if (hasAllocationProfile != null)
					msgs = ((InternalEObject)hasAllocationProfile).eInverseRemove(this, CloudPackage.ALLOCATION_PROFILE__RELATED_TO_RESOURCE_POOL, AllocationProfile.class, msgs);
				return basicSetHasAllocationProfile((AllocationProfile)otherEnd, msgs);
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
			case CloudPackage.RESOURCE_POOL__COMPOSED_OF:
				return ((InternalEList<?>)getComposedOf()).basicRemove(otherEnd, msgs);
			case CloudPackage.RESOURCE_POOL__HAS_ALLOCATION_PROFILE:
				return basicSetHasAllocationProfile(null, msgs);
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
			case CloudPackage.RESOURCE_POOL__COMPOSED_OF:
				return getComposedOf();
			case CloudPackage.RESOURCE_POOL__ID:
				return getId();
			case CloudPackage.RESOURCE_POOL__NAME:
				return getName();
			case CloudPackage.RESOURCE_POOL__HAS_ALLOCATION_PROFILE:
				if (resolve) return getHasAllocationProfile();
				return basicGetHasAllocationProfile();
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
			case CloudPackage.RESOURCE_POOL__COMPOSED_OF:
				getComposedOf().clear();
				getComposedOf().addAll((Collection<? extends Compute>)newValue);
				return;
			case CloudPackage.RESOURCE_POOL__ID:
				setId((Integer)newValue);
				return;
			case CloudPackage.RESOURCE_POOL__NAME:
				setName((String)newValue);
				return;
			case CloudPackage.RESOURCE_POOL__HAS_ALLOCATION_PROFILE:
				setHasAllocationProfile((AllocationProfile)newValue);
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
			case CloudPackage.RESOURCE_POOL__COMPOSED_OF:
				getComposedOf().clear();
				return;
			case CloudPackage.RESOURCE_POOL__ID:
				setId(ID_EDEFAULT);
				return;
			case CloudPackage.RESOURCE_POOL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CloudPackage.RESOURCE_POOL__HAS_ALLOCATION_PROFILE:
				setHasAllocationProfile((AllocationProfile)null);
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
			case CloudPackage.RESOURCE_POOL__COMPOSED_OF:
				return composedOf != null && !composedOf.isEmpty();
			case CloudPackage.RESOURCE_POOL__ID:
				return id != ID_EDEFAULT;
			case CloudPackage.RESOURCE_POOL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CloudPackage.RESOURCE_POOL__HAS_ALLOCATION_PROFILE:
				return hasAllocationProfile != null;
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
		result.append(')');
		return result.toString();
	}

} //ResourcePoolImpl
