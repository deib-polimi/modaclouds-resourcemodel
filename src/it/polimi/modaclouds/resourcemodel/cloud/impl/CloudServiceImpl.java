/**
 */
package it.polimi.modaclouds.resourcemodel.cloud.impl;

import it.polimi.modaclouds.resourcemodel.cloud.CloudPackage;
import it.polimi.modaclouds.resourcemodel.cloud.CloudService;
import it.polimi.modaclouds.resourcemodel.cloud.ScalingPolicy;
import it.polimi.modaclouds.resourcemodel.cloud.ServiceLevelAgreementTemplate;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudServiceImpl#getHasSLA <em>Has SLA</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudServiceImpl#getHasScalingPolicy <em>Has Scaling Policy</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudServiceImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudServiceImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CloudServiceImpl extends EObjectImpl implements CloudService {
	/**
	 * The cached value of the '{@link #getHasSLA() <em>Has SLA</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSLA()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceLevelAgreementTemplate> hasSLA;

	/**
	 * The cached value of the '{@link #getHasScalingPolicy() <em>Has Scaling Policy</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasScalingPolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<ScalingPolicy> hasScalingPolicy;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudPackage.Literals.CLOUD_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceLevelAgreementTemplate> getHasSLA() {
		if (hasSLA == null) {
			hasSLA = new EObjectResolvingEList<ServiceLevelAgreementTemplate>(ServiceLevelAgreementTemplate.class, this, CloudPackage.CLOUD_SERVICE__HAS_SLA);
		}
		return hasSLA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScalingPolicy> getHasScalingPolicy() {
		if (hasScalingPolicy == null) {
			hasScalingPolicy = new EObjectResolvingEList<ScalingPolicy>(ScalingPolicy.class, this, CloudPackage.CLOUD_SERVICE__HAS_SCALING_POLICY);
		}
		return hasScalingPolicy;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.CLOUD_SERVICE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.CLOUD_SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudPackage.CLOUD_SERVICE__HAS_SLA:
				return getHasSLA();
			case CloudPackage.CLOUD_SERVICE__HAS_SCALING_POLICY:
				return getHasScalingPolicy();
			case CloudPackage.CLOUD_SERVICE__ID:
				return getId();
			case CloudPackage.CLOUD_SERVICE__NAME:
				return getName();
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
			case CloudPackage.CLOUD_SERVICE__HAS_SLA:
				getHasSLA().clear();
				getHasSLA().addAll((Collection<? extends ServiceLevelAgreementTemplate>)newValue);
				return;
			case CloudPackage.CLOUD_SERVICE__HAS_SCALING_POLICY:
				getHasScalingPolicy().clear();
				getHasScalingPolicy().addAll((Collection<? extends ScalingPolicy>)newValue);
				return;
			case CloudPackage.CLOUD_SERVICE__ID:
				setId((Integer)newValue);
				return;
			case CloudPackage.CLOUD_SERVICE__NAME:
				setName((String)newValue);
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
			case CloudPackage.CLOUD_SERVICE__HAS_SLA:
				getHasSLA().clear();
				return;
			case CloudPackage.CLOUD_SERVICE__HAS_SCALING_POLICY:
				getHasScalingPolicy().clear();
				return;
			case CloudPackage.CLOUD_SERVICE__ID:
				setId(ID_EDEFAULT);
				return;
			case CloudPackage.CLOUD_SERVICE__NAME:
				setName(NAME_EDEFAULT);
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
			case CloudPackage.CLOUD_SERVICE__HAS_SLA:
				return hasSLA != null && !hasSLA.isEmpty();
			case CloudPackage.CLOUD_SERVICE__HAS_SCALING_POLICY:
				return hasScalingPolicy != null && !hasScalingPolicy.isEmpty();
			case CloudPackage.CLOUD_SERVICE__ID:
				return id != ID_EDEFAULT;
			case CloudPackage.CLOUD_SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //CloudServiceImpl
