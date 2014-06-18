/**
 */
package it.polimi.modaclouds.resourcemodel.cloud.impl;

import it.polimi.modaclouds.resourcemodel.cloud.CloudPackage;
import it.polimi.modaclouds.resourcemodel.cloud.CloudStorage;
import it.polimi.modaclouds.resourcemodel.cloud.Compute;
import it.polimi.modaclouds.resourcemodel.cloud.OSType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.ComputeImpl#getUsesCloudStorage <em>Uses Cloud Storage</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.ComputeImpl#getOS <em>OS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComputeImpl extends CloudResourceImpl implements Compute {
	/**
	 * The cached value of the '{@link #getUsesCloudStorage() <em>Uses Cloud Storage</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesCloudStorage()
	 * @generated
	 * @ordered
	 */
	protected EList<CloudStorage> usesCloudStorage;

	/**
	 * The default value of the '{@link #getOS() <em>OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS()
	 * @generated
	 * @ordered
	 */
	protected static final OSType OS_EDEFAULT = OSType.LINUX;

	/**
	 * The cached value of the '{@link #getOS() <em>OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS()
	 * @generated
	 * @ordered
	 */
	protected OSType os = OS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudPackage.Literals.COMPUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CloudStorage> getUsesCloudStorage() {
		if (usesCloudStorage == null) {
			usesCloudStorage = new EObjectResolvingEList<CloudStorage>(CloudStorage.class, this, CloudPackage.COMPUTE__USES_CLOUD_STORAGE);
		}
		return usesCloudStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSType getOS() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOS(OSType newOS) {
		OSType oldOS = os;
		os = newOS == null ? OS_EDEFAULT : newOS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.COMPUTE__OS, oldOS, os));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudPackage.COMPUTE__USES_CLOUD_STORAGE:
				return getUsesCloudStorage();
			case CloudPackage.COMPUTE__OS:
				return getOS();
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
			case CloudPackage.COMPUTE__USES_CLOUD_STORAGE:
				getUsesCloudStorage().clear();
				getUsesCloudStorage().addAll((Collection<? extends CloudStorage>)newValue);
				return;
			case CloudPackage.COMPUTE__OS:
				setOS((OSType)newValue);
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
			case CloudPackage.COMPUTE__USES_CLOUD_STORAGE:
				getUsesCloudStorage().clear();
				return;
			case CloudPackage.COMPUTE__OS:
				setOS(OS_EDEFAULT);
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
			case CloudPackage.COMPUTE__USES_CLOUD_STORAGE:
				return usesCloudStorage != null && !usesCloudStorage.isEmpty();
			case CloudPackage.COMPUTE__OS:
				return os != OS_EDEFAULT;
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
		result.append(" (OS: ");
		result.append(os);
		result.append(')');
		return result.toString();
	}

} //ComputeImpl
