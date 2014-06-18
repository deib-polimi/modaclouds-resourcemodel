/**
 */
package it.polimi.modaclouds.resourcemodel.cloud.impl;

import it.polimi.modaclouds.resourcemodel.cloud.CloudPackage;
import it.polimi.modaclouds.resourcemodel.cloud.CloudStorage;
import it.polimi.modaclouds.resourcemodel.cloud.Database;
import it.polimi.modaclouds.resourcemodel.cloud.DatabaseType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.DatabaseImpl#getUsesCloudStorage <em>Uses Cloud Storage</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.DatabaseImpl#getDBType <em>DB Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DatabaseImpl extends CloudPlatformImpl implements Database {
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
	 * The default value of the '{@link #getDBType() <em>DB Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBType()
	 * @generated
	 * @ordered
	 */
	protected static final DatabaseType DB_TYPE_EDEFAULT = DatabaseType.RELATIONAL;

	/**
	 * The cached value of the '{@link #getDBType() <em>DB Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBType()
	 * @generated
	 * @ordered
	 */
	protected DatabaseType dbType = DB_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudPackage.Literals.DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CloudStorage> getUsesCloudStorage() {
		if (usesCloudStorage == null) {
			usesCloudStorage = new EObjectResolvingEList<CloudStorage>(CloudStorage.class, this, CloudPackage.DATABASE__USES_CLOUD_STORAGE);
		}
		return usesCloudStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseType getDBType() {
		return dbType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDBType(DatabaseType newDBType) {
		DatabaseType oldDBType = dbType;
		dbType = newDBType == null ? DB_TYPE_EDEFAULT : newDBType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.DATABASE__DB_TYPE, oldDBType, dbType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudPackage.DATABASE__USES_CLOUD_STORAGE:
				return getUsesCloudStorage();
			case CloudPackage.DATABASE__DB_TYPE:
				return getDBType();
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
			case CloudPackage.DATABASE__USES_CLOUD_STORAGE:
				getUsesCloudStorage().clear();
				getUsesCloudStorage().addAll((Collection<? extends CloudStorage>)newValue);
				return;
			case CloudPackage.DATABASE__DB_TYPE:
				setDBType((DatabaseType)newValue);
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
			case CloudPackage.DATABASE__USES_CLOUD_STORAGE:
				getUsesCloudStorage().clear();
				return;
			case CloudPackage.DATABASE__DB_TYPE:
				setDBType(DB_TYPE_EDEFAULT);
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
			case CloudPackage.DATABASE__USES_CLOUD_STORAGE:
				return usesCloudStorage != null && !usesCloudStorage.isEmpty();
			case CloudPackage.DATABASE__DB_TYPE:
				return dbType != DB_TYPE_EDEFAULT;
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
		result.append(" (DBType: ");
		result.append(dbType);
		result.append(')');
		return result.toString();
	}

} //DatabaseImpl
