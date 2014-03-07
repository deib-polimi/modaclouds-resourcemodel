/**
 */
package it.polimi.modaclouds.resourcemodel.cloud.impl;

import it.polimi.modaclouds.resourcemodel.cloud.CloudPackage;
import it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform;
import it.polimi.modaclouds.resourcemodel.cloud.CloudResource;
import it.polimi.modaclouds.resourcemodel.cloud.CloudSoftware;
import it.polimi.modaclouds.resourcemodel.cloud.CloudSoftwareType;
import it.polimi.modaclouds.resourcemodel.cloud.ResourcePool;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudSoftwareImpl#getDeployedOnCloudPlatform <em>Deployed On Cloud Platform</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudSoftwareImpl#getRunsOnCloudResource <em>Runs On Cloud Resource</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudSoftwareImpl#getSoftwareType <em>Software Type</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudSoftwareImpl#getRunsOnResourcePool <em>Runs On Resource Pool</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CloudSoftwareImpl extends CloudElementImpl implements CloudSoftware {
	/**
	 * The cached value of the '{@link #getDeployedOnCloudPlatform() <em>Deployed On Cloud Platform</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedOnCloudPlatform()
	 * @generated
	 * @ordered
	 */
	protected EList<CloudPlatform> deployedOnCloudPlatform;

	/**
	 * The cached value of the '{@link #getRunsOnCloudResource() <em>Runs On Cloud Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunsOnCloudResource()
	 * @generated
	 * @ordered
	 */
	protected EList<CloudResource> runsOnCloudResource;

	/**
	 * The default value of the '{@link #getSoftwareType() <em>Software Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareType()
	 * @generated
	 * @ordered
	 */
	protected static final CloudSoftwareType SOFTWARE_TYPE_EDEFAULT = CloudSoftwareType.REST;

	/**
	 * The cached value of the '{@link #getSoftwareType() <em>Software Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareType()
	 * @generated
	 * @ordered
	 */
	protected CloudSoftwareType softwareType = SOFTWARE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRunsOnResourcePool() <em>Runs On Resource Pool</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunsOnResourcePool()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourcePool> runsOnResourcePool;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudSoftwareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudPackage.Literals.CLOUD_SOFTWARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CloudPlatform> getDeployedOnCloudPlatform() {
		if (deployedOnCloudPlatform == null) {
			deployedOnCloudPlatform = new EObjectResolvingEList<CloudPlatform>(CloudPlatform.class, this, CloudPackage.CLOUD_SOFTWARE__DEPLOYED_ON_CLOUD_PLATFORM);
		}
		return deployedOnCloudPlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CloudResource> getRunsOnCloudResource() {
		if (runsOnCloudResource == null) {
			runsOnCloudResource = new EObjectResolvingEList<CloudResource>(CloudResource.class, this, CloudPackage.CLOUD_SOFTWARE__RUNS_ON_CLOUD_RESOURCE);
		}
		return runsOnCloudResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudSoftwareType getSoftwareType() {
		return softwareType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareType(CloudSoftwareType newSoftwareType) {
		CloudSoftwareType oldSoftwareType = softwareType;
		softwareType = newSoftwareType == null ? SOFTWARE_TYPE_EDEFAULT : newSoftwareType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.CLOUD_SOFTWARE__SOFTWARE_TYPE, oldSoftwareType, softwareType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourcePool> getRunsOnResourcePool() {
		if (runsOnResourcePool == null) {
			runsOnResourcePool = new EObjectResolvingEList<ResourcePool>(ResourcePool.class, this, CloudPackage.CLOUD_SOFTWARE__RUNS_ON_RESOURCE_POOL);
		}
		return runsOnResourcePool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudPackage.CLOUD_SOFTWARE__DEPLOYED_ON_CLOUD_PLATFORM:
				return getDeployedOnCloudPlatform();
			case CloudPackage.CLOUD_SOFTWARE__RUNS_ON_CLOUD_RESOURCE:
				return getRunsOnCloudResource();
			case CloudPackage.CLOUD_SOFTWARE__SOFTWARE_TYPE:
				return getSoftwareType();
			case CloudPackage.CLOUD_SOFTWARE__RUNS_ON_RESOURCE_POOL:
				return getRunsOnResourcePool();
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
			case CloudPackage.CLOUD_SOFTWARE__DEPLOYED_ON_CLOUD_PLATFORM:
				getDeployedOnCloudPlatform().clear();
				getDeployedOnCloudPlatform().addAll((Collection<? extends CloudPlatform>)newValue);
				return;
			case CloudPackage.CLOUD_SOFTWARE__RUNS_ON_CLOUD_RESOURCE:
				getRunsOnCloudResource().clear();
				getRunsOnCloudResource().addAll((Collection<? extends CloudResource>)newValue);
				return;
			case CloudPackage.CLOUD_SOFTWARE__SOFTWARE_TYPE:
				setSoftwareType((CloudSoftwareType)newValue);
				return;
			case CloudPackage.CLOUD_SOFTWARE__RUNS_ON_RESOURCE_POOL:
				getRunsOnResourcePool().clear();
				getRunsOnResourcePool().addAll((Collection<? extends ResourcePool>)newValue);
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
			case CloudPackage.CLOUD_SOFTWARE__DEPLOYED_ON_CLOUD_PLATFORM:
				getDeployedOnCloudPlatform().clear();
				return;
			case CloudPackage.CLOUD_SOFTWARE__RUNS_ON_CLOUD_RESOURCE:
				getRunsOnCloudResource().clear();
				return;
			case CloudPackage.CLOUD_SOFTWARE__SOFTWARE_TYPE:
				setSoftwareType(SOFTWARE_TYPE_EDEFAULT);
				return;
			case CloudPackage.CLOUD_SOFTWARE__RUNS_ON_RESOURCE_POOL:
				getRunsOnResourcePool().clear();
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
			case CloudPackage.CLOUD_SOFTWARE__DEPLOYED_ON_CLOUD_PLATFORM:
				return deployedOnCloudPlatform != null && !deployedOnCloudPlatform.isEmpty();
			case CloudPackage.CLOUD_SOFTWARE__RUNS_ON_CLOUD_RESOURCE:
				return runsOnCloudResource != null && !runsOnCloudResource.isEmpty();
			case CloudPackage.CLOUD_SOFTWARE__SOFTWARE_TYPE:
				return softwareType != SOFTWARE_TYPE_EDEFAULT;
			case CloudPackage.CLOUD_SOFTWARE__RUNS_ON_RESOURCE_POOL:
				return runsOnResourcePool != null && !runsOnResourcePool.isEmpty();
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
		result.append(" (softwareType: ");
		result.append(softwareType);
		result.append(')');
		return result.toString();
	}

} //CloudSoftwareImpl
