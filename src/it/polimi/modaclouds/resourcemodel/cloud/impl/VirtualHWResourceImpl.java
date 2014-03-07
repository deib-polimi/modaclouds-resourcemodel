/**
 */
package it.polimi.modaclouds.resourcemodel.cloud.impl;

import it.polimi.modaclouds.resourcemodel.cloud.CloudPackage;
import it.polimi.modaclouds.resourcemodel.cloud.EfficiencyProfile;
import it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource;
import it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResourceType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual HW Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.VirtualHWResourceImpl#getHas <em>Has</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.VirtualHWResourceImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.VirtualHWResourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.VirtualHWResourceImpl#getProcessingRate <em>Processing Rate</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.VirtualHWResourceImpl#getNumberOfReplicas <em>Number Of Replicas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VirtualHWResourceImpl extends EObjectImpl implements VirtualHWResource {
	/**
	 * The cached value of the '{@link #getHas() <em>Has</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas()
	 * @generated
	 * @ordered
	 */
	protected EList<EfficiencyProfile> has;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final VirtualHWResourceType TYPE_EDEFAULT = VirtualHWResourceType.CPU;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected VirtualHWResourceType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessingRate() <em>Processing Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingRate()
	 * @generated
	 * @ordered
	 */
	protected static final double PROCESSING_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProcessingRate() <em>Processing Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingRate()
	 * @generated
	 * @ordered
	 */
	protected double processingRate = PROCESSING_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfReplicas() <em>Number Of Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfReplicas()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_REPLICAS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfReplicas() <em>Number Of Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfReplicas()
	 * @generated
	 * @ordered
	 */
	protected int numberOfReplicas = NUMBER_OF_REPLICAS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualHWResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudPackage.Literals.VIRTUAL_HW_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EfficiencyProfile> getHas() {
		if (has == null) {
			has = new EObjectResolvingEList<EfficiencyProfile>(EfficiencyProfile.class, this, CloudPackage.VIRTUAL_HW_RESOURCE__HAS);
		}
		return has;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.VIRTUAL_HW_RESOURCE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualHWResourceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(VirtualHWResourceType newType) {
		VirtualHWResourceType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.VIRTUAL_HW_RESOURCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProcessingRate() {
		return processingRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingRate(double newProcessingRate) {
		double oldProcessingRate = processingRate;
		processingRate = newProcessingRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.VIRTUAL_HW_RESOURCE__PROCESSING_RATE, oldProcessingRate, processingRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfReplicas() {
		return numberOfReplicas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfReplicas(int newNumberOfReplicas) {
		int oldNumberOfReplicas = numberOfReplicas;
		numberOfReplicas = newNumberOfReplicas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.VIRTUAL_HW_RESOURCE__NUMBER_OF_REPLICAS, oldNumberOfReplicas, numberOfReplicas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudPackage.VIRTUAL_HW_RESOURCE__HAS:
				return getHas();
			case CloudPackage.VIRTUAL_HW_RESOURCE__ID:
				return getId();
			case CloudPackage.VIRTUAL_HW_RESOURCE__TYPE:
				return getType();
			case CloudPackage.VIRTUAL_HW_RESOURCE__PROCESSING_RATE:
				return getProcessingRate();
			case CloudPackage.VIRTUAL_HW_RESOURCE__NUMBER_OF_REPLICAS:
				return getNumberOfReplicas();
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
			case CloudPackage.VIRTUAL_HW_RESOURCE__HAS:
				getHas().clear();
				getHas().addAll((Collection<? extends EfficiencyProfile>)newValue);
				return;
			case CloudPackage.VIRTUAL_HW_RESOURCE__ID:
				setId((Integer)newValue);
				return;
			case CloudPackage.VIRTUAL_HW_RESOURCE__TYPE:
				setType((VirtualHWResourceType)newValue);
				return;
			case CloudPackage.VIRTUAL_HW_RESOURCE__PROCESSING_RATE:
				setProcessingRate((Double)newValue);
				return;
			case CloudPackage.VIRTUAL_HW_RESOURCE__NUMBER_OF_REPLICAS:
				setNumberOfReplicas((Integer)newValue);
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
			case CloudPackage.VIRTUAL_HW_RESOURCE__HAS:
				getHas().clear();
				return;
			case CloudPackage.VIRTUAL_HW_RESOURCE__ID:
				setId(ID_EDEFAULT);
				return;
			case CloudPackage.VIRTUAL_HW_RESOURCE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CloudPackage.VIRTUAL_HW_RESOURCE__PROCESSING_RATE:
				setProcessingRate(PROCESSING_RATE_EDEFAULT);
				return;
			case CloudPackage.VIRTUAL_HW_RESOURCE__NUMBER_OF_REPLICAS:
				setNumberOfReplicas(NUMBER_OF_REPLICAS_EDEFAULT);
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
			case CloudPackage.VIRTUAL_HW_RESOURCE__HAS:
				return has != null && !has.isEmpty();
			case CloudPackage.VIRTUAL_HW_RESOURCE__ID:
				return id != ID_EDEFAULT;
			case CloudPackage.VIRTUAL_HW_RESOURCE__TYPE:
				return type != TYPE_EDEFAULT;
			case CloudPackage.VIRTUAL_HW_RESOURCE__PROCESSING_RATE:
				return processingRate != PROCESSING_RATE_EDEFAULT;
			case CloudPackage.VIRTUAL_HW_RESOURCE__NUMBER_OF_REPLICAS:
				return numberOfReplicas != NUMBER_OF_REPLICAS_EDEFAULT;
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
		result.append(", type: ");
		result.append(type);
		result.append(", processingRate: ");
		result.append(processingRate);
		result.append(", numberOfReplicas: ");
		result.append(numberOfReplicas);
		result.append(')');
		return result.toString();
	}

} //VirtualHWResourceImpl
