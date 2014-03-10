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

import it.polimi.modaclouds.resourcemodel.cloud.Allocation;
import it.polimi.modaclouds.resourcemodel.cloud.AllocationProfile;
import it.polimi.modaclouds.resourcemodel.cloud.ApplicationServiceProvider;
import it.polimi.modaclouds.resourcemodel.cloud.Backend;
import it.polimi.modaclouds.resourcemodel.cloud.BlobStorage;
import it.polimi.modaclouds.resourcemodel.cloud.CloudElement;
import it.polimi.modaclouds.resourcemodel.cloud.CloudElementType;
import it.polimi.modaclouds.resourcemodel.cloud.CloudFactory;
import it.polimi.modaclouds.resourcemodel.cloud.CloudPackage;
import it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform;
import it.polimi.modaclouds.resourcemodel.cloud.CloudPlatformType;
import it.polimi.modaclouds.resourcemodel.cloud.CloudProvider;
import it.polimi.modaclouds.resourcemodel.cloud.CloudResource;
import it.polimi.modaclouds.resourcemodel.cloud.CloudResourceType;
import it.polimi.modaclouds.resourcemodel.cloud.CloudService;
import it.polimi.modaclouds.resourcemodel.cloud.CloudSoftware;
import it.polimi.modaclouds.resourcemodel.cloud.CloudSoftwareType;
import it.polimi.modaclouds.resourcemodel.cloud.CloudStorage;
import it.polimi.modaclouds.resourcemodel.cloud.CloudStorageType;
import it.polimi.modaclouds.resourcemodel.cloud.Compute;
import it.polimi.modaclouds.resourcemodel.cloud.Cost;
import it.polimi.modaclouds.resourcemodel.cloud.CostProfile;
import it.polimi.modaclouds.resourcemodel.cloud.CostUnitType;
import it.polimi.modaclouds.resourcemodel.cloud.Database;
import it.polimi.modaclouds.resourcemodel.cloud.DatabaseType;
import it.polimi.modaclouds.resourcemodel.cloud.EfficiencyProfile;
import it.polimi.modaclouds.resourcemodel.cloud.FilesystemStorage;
import it.polimi.modaclouds.resourcemodel.cloud.FreeQuota;
import it.polimi.modaclouds.resourcemodel.cloud.Frontend;
import it.polimi.modaclouds.resourcemodel.cloud.IaaS_Service;
import it.polimi.modaclouds.resourcemodel.cloud.Link;
import it.polimi.modaclouds.resourcemodel.cloud.Location;
import it.polimi.modaclouds.resourcemodel.cloud.Middleware;
import it.polimi.modaclouds.resourcemodel.cloud.NoSQL_DB;
import it.polimi.modaclouds.resourcemodel.cloud.OSType;
import it.polimi.modaclouds.resourcemodel.cloud.PaaS_Service;
import it.polimi.modaclouds.resourcemodel.cloud.Provider;
import it.polimi.modaclouds.resourcemodel.cloud.REST_Software;
import it.polimi.modaclouds.resourcemodel.cloud.Region;
import it.polimi.modaclouds.resourcemodel.cloud.RelationalDB;
import it.polimi.modaclouds.resourcemodel.cloud.Requirement;
import it.polimi.modaclouds.resourcemodel.cloud.ResourcePool;
import it.polimi.modaclouds.resourcemodel.cloud.SOAP_Software;
import it.polimi.modaclouds.resourcemodel.cloud.SaaS_Service;
import it.polimi.modaclouds.resourcemodel.cloud.ScalingMetricType;
import it.polimi.modaclouds.resourcemodel.cloud.ScalingOperatorType;
import it.polimi.modaclouds.resourcemodel.cloud.ScalingPolicy;
import it.polimi.modaclouds.resourcemodel.cloud.ScalingRule;
import it.polimi.modaclouds.resourcemodel.cloud.ScalingType;
import it.polimi.modaclouds.resourcemodel.cloud.ServiceLevelAgreementTemplate;
import it.polimi.modaclouds.resourcemodel.cloud.SubRegion;
import it.polimi.modaclouds.resourcemodel.cloud.V_CPU;
import it.polimi.modaclouds.resourcemodel.cloud.V_Memory;
import it.polimi.modaclouds.resourcemodel.cloud.V_Storage;
import it.polimi.modaclouds.resourcemodel.cloud.VirtualArea;
import it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource;
import it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResourceType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudPackageImpl extends EPackageImpl implements CloudPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationServiceProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass costProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelAgreementTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalingPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcePoolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iaaS_ServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paaS_ServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass saaS_ServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudPlatformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudSoftwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass middlewareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frontendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resT_SoftwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soaP_SoftwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualHWResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass v_CPUEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass v_MemoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass v_StorageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass efficiencyProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudStorageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalDBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noSQL_DBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filesystemStorageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blobStorageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass costEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freeQuotaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum virtualHWResourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cloudResourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cloudPlatformTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum databaseTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cloudStorageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum osTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum costUnitTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scalingMetricTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scalingOperatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cloudElementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scalingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cloudSoftwareTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CloudPackageImpl() {
		super(eNS_URI, CloudFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CloudPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CloudPackage init() {
		if (isInited) return (CloudPackage)EPackage.Registry.INSTANCE.getEPackage(CloudPackage.eNS_URI);

		// Obtain or create and register package
		CloudPackageImpl theCloudPackage = (CloudPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CloudPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CloudPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCloudPackage.createPackageContents();

		// Initialize created meta-data
		theCloudPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCloudPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CloudPackage.eNS_URI, theCloudPackage);
		return theCloudPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvider() {
		return providerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvider_Id() {
		return (EAttribute)providerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvider_Name() {
		return (EAttribute)providerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudProvider() {
		return cloudProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudProvider_ProvidesCloudService() {
		return (EReference)cloudProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudService() {
		return cloudServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudService_HasSLA() {
		return (EReference)cloudServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudService_HasScalingPolicy() {
		return (EReference)cloudServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudService_Id() {
		return (EAttribute)cloudServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudService_Name() {
		return (EAttribute)cloudServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationServiceProvider() {
		return applicationServiceProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationServiceProvider_ProvidesCloudSoftware() {
		return (EReference)applicationServiceProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCostProfile() {
		return costProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCostProfile_Id() {
		return (EAttribute)costProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCostProfile_Description() {
		return (EAttribute)costProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCostProfile_ComposedOf() {
		return (EReference)costProfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCostProfile_AssociatedToCloudElement() {
		return (EReference)costProfileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLevelAgreementTemplate() {
		return serviceLevelAgreementTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLevelAgreementTemplate_DefinedBy() {
		return (EReference)serviceLevelAgreementTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevelAgreementTemplate_Id() {
		return (EAttribute)serviceLevelAgreementTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLevelAgreementTemplate_Name() {
		return (EAttribute)serviceLevelAgreementTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Id() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Name() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Description() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScalingPolicy() {
		return scalingPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalingPolicy_DefinedOn() {
		return (EReference)scalingPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScalingPolicy_Id() {
		return (EAttribute)scalingPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScalingPolicy_Name() {
		return (EAttribute)scalingPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScalingPolicy_Action() {
		return (EAttribute)scalingPolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalingPolicy_ComposedOf() {
		return (EReference)scalingPolicyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcePool() {
		return resourcePoolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourcePool_ComposedOf() {
		return (EReference)resourcePoolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourcePool_Id() {
		return (EAttribute)resourcePoolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourcePool_Name() {
		return (EAttribute)resourcePoolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourcePool_HasAllocationProfile() {
		return (EReference)resourcePoolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIaaS_Service() {
		return iaaS_ServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIaaS_Service_ComposedOf() {
		return (EReference)iaaS_ServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaaS_Service() {
		return paaS_ServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaaS_Service_ComposedOf() {
		return (EReference)paaS_ServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSaaS_Service() {
		return saaS_ServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSaaS_Service_ComposedOf() {
		return (EReference)saaS_ServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudResource() {
		return cloudResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudResource_InLocation() {
		return (EReference)cloudResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudResource_From() {
		return (EReference)cloudResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudResource_ComposedOf() {
		return (EReference)cloudResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudResource_ResourceType() {
		return (EAttribute)cloudResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudPlatform() {
		return cloudPlatformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudPlatform_RunsOnCloudResource() {
		return (EReference)cloudPlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudPlatform_PlatformType() {
		return (EAttribute)cloudPlatformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudPlatform_Language() {
		return (EAttribute)cloudPlatformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudPlatform_Technology() {
		return (EAttribute)cloudPlatformEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudPlatform_RunsOnResourcePool() {
		return (EReference)cloudPlatformEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudSoftware() {
		return cloudSoftwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudSoftware_DeployedOnCloudPlatform() {
		return (EReference)cloudSoftwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudSoftware_RunsOnCloudResource() {
		return (EReference)cloudSoftwareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudSoftware_SoftwareType() {
		return (EAttribute)cloudSoftwareEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudSoftware_RunsOnResourcePool() {
		return (EReference)cloudSoftwareEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBackend() {
		return backendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMiddleware() {
		return middlewareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrontend() {
		return frontendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Id() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Name() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegion() {
		return regionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubRegion() {
		return subRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubRegion_InRegion() {
		return (EReference)subRegionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualArea() {
		return virtualAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREST_Software() {
		return resT_SoftwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSOAP_Software() {
		return soaP_SoftwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_To() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Id() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Name() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Latency() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Throughput() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Cost() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_ReverseLinkToB() {
		return (EReference)linkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_ReverseLinkToA() {
		return (EReference)linkEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocationProfile() {
		return allocationProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllocationProfile_Id() {
		return (EAttribute)allocationProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllocationProfile_Description() {
		return (EAttribute)allocationProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationProfile_ComposedOf() {
		return (EReference)allocationProfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationProfile_RelatedToResourcePool() {
		return (EReference)allocationProfileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualHWResource() {
		return virtualHWResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualHWResource_Has() {
		return (EReference)virtualHWResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualHWResource_Id() {
		return (EAttribute)virtualHWResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualHWResource_Type() {
		return (EAttribute)virtualHWResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualHWResource_ProcessingRate() {
		return (EAttribute)virtualHWResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualHWResource_NumberOfReplicas() {
		return (EAttribute)virtualHWResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getV_CPU() {
		return v_CPUEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getV_Memory() {
		return v_MemoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getV_Memory_Size() {
		return (EAttribute)v_MemoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getV_Storage() {
		return v_StorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getV_Storage_Size() {
		return (EAttribute)v_StorageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEfficiencyProfile() {
		return efficiencyProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEfficiencyProfile_Id() {
		return (EAttribute)efficiencyProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEfficiencyProfile_Period() {
		return (EAttribute)efficiencyProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEfficiencyProfile_Efficiency() {
		return (EAttribute)efficiencyProfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompute() {
		return computeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompute_UsesCloudStorage() {
		return (EReference)computeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompute_OS() {
		return (EAttribute)computeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudStorage() {
		return cloudStorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudStorage_StorageType() {
		return (EAttribute)cloudStorageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabase_UsesCloudStorage() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_DBType() {
		return (EAttribute)databaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationalDB() {
		return relationalDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoSQL_DB() {
		return noSQL_DBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilesystemStorage() {
		return filesystemStorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlobStorage() {
		return blobStorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCost() {
		return costEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCost_Id() {
		return (EAttribute)costEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCost_Description() {
		return (EAttribute)costEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCost_Value() {
		return (EAttribute)costEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCost_Unit() {
		return (EAttribute)costEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCost_Period() {
		return (EAttribute)costEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCost_AssociatedToCloudElement() {
		return (EReference)costEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCost_DefinedOn() {
		return (EReference)costEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCost_LowerBound() {
		return (EAttribute)costEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCost_UpperBound() {
		return (EAttribute)costEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCost_Region() {
		return (EAttribute)costEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFreeQuota() {
		return freeQuotaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreeQuota_Id() {
		return (EAttribute)freeQuotaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreeQuota_Unit() {
		return (EAttribute)freeQuotaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreeQuota_Amount() {
		return (EAttribute)freeQuotaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFreeQuota_AssociatedToCloudElement() {
		return (EReference)freeQuotaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFreeQuota_DefinedOn() {
		return (EReference)freeQuotaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudElement() {
		return cloudElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudElement_Id() {
		return (EAttribute)cloudElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudElement_Name() {
		return (EAttribute)cloudElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudElement_Type() {
		return (EAttribute)cloudElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudElement_CloudElementA() {
		return (EReference)cloudElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudElement_CloudElementB() {
		return (EReference)cloudElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudElement_HasCostProfile() {
		return (EReference)cloudElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudElement_HasCost() {
		return (EReference)cloudElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudElement_HasFreeQuota() {
		return (EReference)cloudElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScalingRule() {
		return scalingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScalingRule_Id() {
		return (EAttribute)scalingRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScalingRule_Metric() {
		return (EAttribute)scalingRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScalingRule_Value() {
		return (EAttribute)scalingRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScalingRule_Operator() {
		return (EAttribute)scalingRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocation() {
		return allocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllocation_Id() {
		return (EAttribute)allocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllocation_Period() {
		return (EAttribute)allocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllocation_NumberOfInstances() {
		return (EAttribute)allocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVirtualHWResourceType() {
		return virtualHWResourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCloudResourceType() {
		return cloudResourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCloudPlatformType() {
		return cloudPlatformTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatabaseType() {
		return databaseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCloudStorageType() {
		return cloudStorageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOSType() {
		return osTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCostUnitType() {
		return costUnitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScalingMetricType() {
		return scalingMetricTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScalingOperatorType() {
		return scalingOperatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCloudElementType() {
		return cloudElementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScalingType() {
		return scalingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCloudSoftwareType() {
		return cloudSoftwareTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudFactory getCloudFactory() {
		return (CloudFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		providerEClass = createEClass(PROVIDER);
		createEAttribute(providerEClass, PROVIDER__ID);
		createEAttribute(providerEClass, PROVIDER__NAME);

		cloudProviderEClass = createEClass(CLOUD_PROVIDER);
		createEReference(cloudProviderEClass, CLOUD_PROVIDER__PROVIDES_CLOUD_SERVICE);

		cloudServiceEClass = createEClass(CLOUD_SERVICE);
		createEReference(cloudServiceEClass, CLOUD_SERVICE__HAS_SLA);
		createEReference(cloudServiceEClass, CLOUD_SERVICE__HAS_SCALING_POLICY);
		createEAttribute(cloudServiceEClass, CLOUD_SERVICE__ID);
		createEAttribute(cloudServiceEClass, CLOUD_SERVICE__NAME);

		applicationServiceProviderEClass = createEClass(APPLICATION_SERVICE_PROVIDER);
		createEReference(applicationServiceProviderEClass, APPLICATION_SERVICE_PROVIDER__PROVIDES_CLOUD_SOFTWARE);

		costProfileEClass = createEClass(COST_PROFILE);
		createEAttribute(costProfileEClass, COST_PROFILE__ID);
		createEAttribute(costProfileEClass, COST_PROFILE__DESCRIPTION);
		createEReference(costProfileEClass, COST_PROFILE__COMPOSED_OF);
		createEReference(costProfileEClass, COST_PROFILE__ASSOCIATED_TO_CLOUD_ELEMENT);

		serviceLevelAgreementTemplateEClass = createEClass(SERVICE_LEVEL_AGREEMENT_TEMPLATE);
		createEReference(serviceLevelAgreementTemplateEClass, SERVICE_LEVEL_AGREEMENT_TEMPLATE__DEFINED_BY);
		createEAttribute(serviceLevelAgreementTemplateEClass, SERVICE_LEVEL_AGREEMENT_TEMPLATE__ID);
		createEAttribute(serviceLevelAgreementTemplateEClass, SERVICE_LEVEL_AGREEMENT_TEMPLATE__NAME);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__ID);
		createEAttribute(requirementEClass, REQUIREMENT__NAME);
		createEAttribute(requirementEClass, REQUIREMENT__DESCRIPTION);

		scalingPolicyEClass = createEClass(SCALING_POLICY);
		createEReference(scalingPolicyEClass, SCALING_POLICY__DEFINED_ON);
		createEAttribute(scalingPolicyEClass, SCALING_POLICY__ID);
		createEAttribute(scalingPolicyEClass, SCALING_POLICY__NAME);
		createEAttribute(scalingPolicyEClass, SCALING_POLICY__ACTION);
		createEReference(scalingPolicyEClass, SCALING_POLICY__COMPOSED_OF);

		resourcePoolEClass = createEClass(RESOURCE_POOL);
		createEReference(resourcePoolEClass, RESOURCE_POOL__COMPOSED_OF);
		createEAttribute(resourcePoolEClass, RESOURCE_POOL__ID);
		createEAttribute(resourcePoolEClass, RESOURCE_POOL__NAME);
		createEReference(resourcePoolEClass, RESOURCE_POOL__HAS_ALLOCATION_PROFILE);

		iaaS_ServiceEClass = createEClass(IAA_SSERVICE);
		createEReference(iaaS_ServiceEClass, IAA_SSERVICE__COMPOSED_OF);

		paaS_ServiceEClass = createEClass(PAA_SSERVICE);
		createEReference(paaS_ServiceEClass, PAA_SSERVICE__COMPOSED_OF);

		saaS_ServiceEClass = createEClass(SAA_SSERVICE);
		createEReference(saaS_ServiceEClass, SAA_SSERVICE__COMPOSED_OF);

		cloudResourceEClass = createEClass(CLOUD_RESOURCE);
		createEReference(cloudResourceEClass, CLOUD_RESOURCE__IN_LOCATION);
		createEReference(cloudResourceEClass, CLOUD_RESOURCE__FROM);
		createEReference(cloudResourceEClass, CLOUD_RESOURCE__COMPOSED_OF);
		createEAttribute(cloudResourceEClass, CLOUD_RESOURCE__RESOURCE_TYPE);

		cloudPlatformEClass = createEClass(CLOUD_PLATFORM);
		createEReference(cloudPlatformEClass, CLOUD_PLATFORM__RUNS_ON_CLOUD_RESOURCE);
		createEAttribute(cloudPlatformEClass, CLOUD_PLATFORM__PLATFORM_TYPE);
		createEAttribute(cloudPlatformEClass, CLOUD_PLATFORM__LANGUAGE);
		createEAttribute(cloudPlatformEClass, CLOUD_PLATFORM__TECHNOLOGY);
		createEReference(cloudPlatformEClass, CLOUD_PLATFORM__RUNS_ON_RESOURCE_POOL);

		cloudSoftwareEClass = createEClass(CLOUD_SOFTWARE);
		createEReference(cloudSoftwareEClass, CLOUD_SOFTWARE__DEPLOYED_ON_CLOUD_PLATFORM);
		createEReference(cloudSoftwareEClass, CLOUD_SOFTWARE__RUNS_ON_CLOUD_RESOURCE);
		createEAttribute(cloudSoftwareEClass, CLOUD_SOFTWARE__SOFTWARE_TYPE);
		createEReference(cloudSoftwareEClass, CLOUD_SOFTWARE__RUNS_ON_RESOURCE_POOL);

		backendEClass = createEClass(BACKEND);

		middlewareEClass = createEClass(MIDDLEWARE);

		frontendEClass = createEClass(FRONTEND);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__ID);
		createEAttribute(locationEClass, LOCATION__NAME);

		regionEClass = createEClass(REGION);

		subRegionEClass = createEClass(SUB_REGION);
		createEReference(subRegionEClass, SUB_REGION__IN_REGION);

		virtualAreaEClass = createEClass(VIRTUAL_AREA);

		resT_SoftwareEClass = createEClass(REST_SOFTWARE);

		soaP_SoftwareEClass = createEClass(SOAP_SOFTWARE);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__TO);
		createEAttribute(linkEClass, LINK__ID);
		createEAttribute(linkEClass, LINK__NAME);
		createEAttribute(linkEClass, LINK__LATENCY);
		createEAttribute(linkEClass, LINK__THROUGHPUT);
		createEAttribute(linkEClass, LINK__COST);
		createEReference(linkEClass, LINK__REVERSE_LINK_TO_B);
		createEReference(linkEClass, LINK__REVERSE_LINK_TO_A);

		allocationProfileEClass = createEClass(ALLOCATION_PROFILE);
		createEAttribute(allocationProfileEClass, ALLOCATION_PROFILE__ID);
		createEAttribute(allocationProfileEClass, ALLOCATION_PROFILE__DESCRIPTION);
		createEReference(allocationProfileEClass, ALLOCATION_PROFILE__COMPOSED_OF);
		createEReference(allocationProfileEClass, ALLOCATION_PROFILE__RELATED_TO_RESOURCE_POOL);

		virtualHWResourceEClass = createEClass(VIRTUAL_HW_RESOURCE);
		createEReference(virtualHWResourceEClass, VIRTUAL_HW_RESOURCE__HAS);
		createEAttribute(virtualHWResourceEClass, VIRTUAL_HW_RESOURCE__ID);
		createEAttribute(virtualHWResourceEClass, VIRTUAL_HW_RESOURCE__TYPE);
		createEAttribute(virtualHWResourceEClass, VIRTUAL_HW_RESOURCE__PROCESSING_RATE);
		createEAttribute(virtualHWResourceEClass, VIRTUAL_HW_RESOURCE__NUMBER_OF_REPLICAS);

		v_CPUEClass = createEClass(VCPU);

		v_MemoryEClass = createEClass(VMEMORY);
		createEAttribute(v_MemoryEClass, VMEMORY__SIZE);

		v_StorageEClass = createEClass(VSTORAGE);
		createEAttribute(v_StorageEClass, VSTORAGE__SIZE);

		efficiencyProfileEClass = createEClass(EFFICIENCY_PROFILE);
		createEAttribute(efficiencyProfileEClass, EFFICIENCY_PROFILE__ID);
		createEAttribute(efficiencyProfileEClass, EFFICIENCY_PROFILE__PERIOD);
		createEAttribute(efficiencyProfileEClass, EFFICIENCY_PROFILE__EFFICIENCY);

		computeEClass = createEClass(COMPUTE);
		createEReference(computeEClass, COMPUTE__USES_CLOUD_STORAGE);
		createEAttribute(computeEClass, COMPUTE__OS);

		cloudStorageEClass = createEClass(CLOUD_STORAGE);
		createEAttribute(cloudStorageEClass, CLOUD_STORAGE__STORAGE_TYPE);

		databaseEClass = createEClass(DATABASE);
		createEReference(databaseEClass, DATABASE__USES_CLOUD_STORAGE);
		createEAttribute(databaseEClass, DATABASE__DB_TYPE);

		relationalDBEClass = createEClass(RELATIONAL_DB);

		noSQL_DBEClass = createEClass(NO_SQL_DB);

		filesystemStorageEClass = createEClass(FILESYSTEM_STORAGE);

		blobStorageEClass = createEClass(BLOB_STORAGE);

		costEClass = createEClass(COST);
		createEAttribute(costEClass, COST__ID);
		createEAttribute(costEClass, COST__DESCRIPTION);
		createEAttribute(costEClass, COST__VALUE);
		createEAttribute(costEClass, COST__UNIT);
		createEAttribute(costEClass, COST__PERIOD);
		createEReference(costEClass, COST__ASSOCIATED_TO_CLOUD_ELEMENT);
		createEReference(costEClass, COST__DEFINED_ON);
		createEAttribute(costEClass, COST__LOWER_BOUND);
		createEAttribute(costEClass, COST__UPPER_BOUND);
		createEAttribute(costEClass, COST__REGION);

		freeQuotaEClass = createEClass(FREE_QUOTA);
		createEAttribute(freeQuotaEClass, FREE_QUOTA__ID);
		createEAttribute(freeQuotaEClass, FREE_QUOTA__UNIT);
		createEAttribute(freeQuotaEClass, FREE_QUOTA__AMOUNT);
		createEReference(freeQuotaEClass, FREE_QUOTA__ASSOCIATED_TO_CLOUD_ELEMENT);
		createEReference(freeQuotaEClass, FREE_QUOTA__DEFINED_ON);

		cloudElementEClass = createEClass(CLOUD_ELEMENT);
		createEAttribute(cloudElementEClass, CLOUD_ELEMENT__ID);
		createEAttribute(cloudElementEClass, CLOUD_ELEMENT__NAME);
		createEAttribute(cloudElementEClass, CLOUD_ELEMENT__TYPE);
		createEReference(cloudElementEClass, CLOUD_ELEMENT__CLOUD_ELEMENT_A);
		createEReference(cloudElementEClass, CLOUD_ELEMENT__CLOUD_ELEMENT_B);
		createEReference(cloudElementEClass, CLOUD_ELEMENT__HAS_COST_PROFILE);
		createEReference(cloudElementEClass, CLOUD_ELEMENT__HAS_COST);
		createEReference(cloudElementEClass, CLOUD_ELEMENT__HAS_FREE_QUOTA);

		scalingRuleEClass = createEClass(SCALING_RULE);
		createEAttribute(scalingRuleEClass, SCALING_RULE__ID);
		createEAttribute(scalingRuleEClass, SCALING_RULE__METRIC);
		createEAttribute(scalingRuleEClass, SCALING_RULE__VALUE);
		createEAttribute(scalingRuleEClass, SCALING_RULE__OPERATOR);

		allocationEClass = createEClass(ALLOCATION);
		createEAttribute(allocationEClass, ALLOCATION__ID);
		createEAttribute(allocationEClass, ALLOCATION__PERIOD);
		createEAttribute(allocationEClass, ALLOCATION__NUMBER_OF_INSTANCES);

		// Create enums
		virtualHWResourceTypeEEnum = createEEnum(VIRTUAL_HW_RESOURCE_TYPE);
		cloudResourceTypeEEnum = createEEnum(CLOUD_RESOURCE_TYPE);
		cloudPlatformTypeEEnum = createEEnum(CLOUD_PLATFORM_TYPE);
		databaseTypeEEnum = createEEnum(DATABASE_TYPE);
		cloudStorageTypeEEnum = createEEnum(CLOUD_STORAGE_TYPE);
		osTypeEEnum = createEEnum(OS_TYPE);
		costUnitTypeEEnum = createEEnum(COST_UNIT_TYPE);
		scalingMetricTypeEEnum = createEEnum(SCALING_METRIC_TYPE);
		scalingOperatorTypeEEnum = createEEnum(SCALING_OPERATOR_TYPE);
		cloudElementTypeEEnum = createEEnum(CLOUD_ELEMENT_TYPE);
		scalingTypeEEnum = createEEnum(SCALING_TYPE);
		cloudSoftwareTypeEEnum = createEEnum(CLOUD_SOFTWARE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cloudProviderEClass.getESuperTypes().add(this.getProvider());
		applicationServiceProviderEClass.getESuperTypes().add(this.getProvider());
		iaaS_ServiceEClass.getESuperTypes().add(this.getCloudService());
		paaS_ServiceEClass.getESuperTypes().add(this.getCloudService());
		saaS_ServiceEClass.getESuperTypes().add(this.getCloudService());
		cloudResourceEClass.getESuperTypes().add(this.getCloudElement());
		cloudPlatformEClass.getESuperTypes().add(this.getCloudElement());
		cloudSoftwareEClass.getESuperTypes().add(this.getCloudElement());
		backendEClass.getESuperTypes().add(this.getCloudPlatform());
		middlewareEClass.getESuperTypes().add(this.getCloudPlatform());
		frontendEClass.getESuperTypes().add(this.getCloudPlatform());
		regionEClass.getESuperTypes().add(this.getLocation());
		subRegionEClass.getESuperTypes().add(this.getLocation());
		virtualAreaEClass.getESuperTypes().add(this.getSubRegion());
		resT_SoftwareEClass.getESuperTypes().add(this.getCloudSoftware());
		soaP_SoftwareEClass.getESuperTypes().add(this.getCloudSoftware());
		v_CPUEClass.getESuperTypes().add(this.getVirtualHWResource());
		v_MemoryEClass.getESuperTypes().add(this.getVirtualHWResource());
		v_StorageEClass.getESuperTypes().add(this.getVirtualHWResource());
		computeEClass.getESuperTypes().add(this.getCloudResource());
		cloudStorageEClass.getESuperTypes().add(this.getCloudResource());
		databaseEClass.getESuperTypes().add(this.getCloudPlatform());
		relationalDBEClass.getESuperTypes().add(this.getDatabase());
		noSQL_DBEClass.getESuperTypes().add(this.getDatabase());
		filesystemStorageEClass.getESuperTypes().add(this.getCloudStorage());
		blobStorageEClass.getESuperTypes().add(this.getCloudStorage());

		// Initialize classes and features; add operations and parameters
		initEClass(providerEClass, Provider.class, "Provider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProvider_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvider_Name(), ecorePackage.getEString(), "name", null, 1, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudProviderEClass, CloudProvider.class, "CloudProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCloudProvider_ProvidesCloudService(), this.getCloudService(), null, "providesCloudService", null, 1, -1, CloudProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudServiceEClass, CloudService.class, "CloudService", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCloudService_HasSLA(), this.getServiceLevelAgreementTemplate(), null, "hasSLA", null, 0, -1, CloudService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudService_HasScalingPolicy(), this.getScalingPolicy(), null, "hasScalingPolicy", null, 0, -1, CloudService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudService_Id(), ecorePackage.getEInt(), "id", null, 1, 1, CloudService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudService_Name(), ecorePackage.getEString(), "name", null, 1, 1, CloudService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationServiceProviderEClass, ApplicationServiceProvider.class, "ApplicationServiceProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationServiceProvider_ProvidesCloudSoftware(), this.getCloudSoftware(), null, "providesCloudSoftware", null, 1, -1, ApplicationServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(costProfileEClass, CostProfile.class, "CostProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCostProfile_Id(), ecorePackage.getEInt(), "id", null, 1, 1, CostProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCostProfile_Description(), ecorePackage.getEString(), "description", null, 0, 1, CostProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCostProfile_ComposedOf(), this.getCost(), null, "composedOf", null, 1, -1, CostProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCostProfile_AssociatedToCloudElement(), this.getCloudElement(), this.getCloudElement_HasCostProfile(), "associatedToCloudElement", null, 1, 1, CostProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceLevelAgreementTemplateEClass, ServiceLevelAgreementTemplate.class, "ServiceLevelAgreementTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceLevelAgreementTemplate_DefinedBy(), this.getRequirement(), null, "definedBy", null, 1, -1, ServiceLevelAgreementTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceLevelAgreementTemplate_Id(), ecorePackage.getEInt(), "id", null, 1, 1, ServiceLevelAgreementTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceLevelAgreementTemplate_Name(), ecorePackage.getEString(), "name", null, 1, 1, ServiceLevelAgreementTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Name(), ecorePackage.getEString(), "name", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Description(), ecorePackage.getEString(), "description", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scalingPolicyEClass, ScalingPolicy.class, "ScalingPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScalingPolicy_DefinedOn(), this.getResourcePool(), null, "definedOn", null, 1, -1, ScalingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScalingPolicy_Id(), ecorePackage.getEInt(), "id", null, 1, 1, ScalingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScalingPolicy_Name(), ecorePackage.getEString(), "name", null, 1, 1, ScalingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScalingPolicy_Action(), this.getScalingType(), "action", null, 1, 1, ScalingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScalingPolicy_ComposedOf(), this.getScalingRule(), null, "composedOf", null, 1, -1, ScalingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourcePoolEClass, ResourcePool.class, "ResourcePool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourcePool_ComposedOf(), this.getCompute(), null, "composedOf", null, 1, -1, ResourcePool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourcePool_Id(), ecorePackage.getEInt(), "id", null, 1, 1, ResourcePool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourcePool_Name(), ecorePackage.getEString(), "name", null, 1, 1, ResourcePool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourcePool_HasAllocationProfile(), this.getAllocationProfile(), this.getAllocationProfile_RelatedToResourcePool(), "hasAllocationProfile", null, 1, 1, ResourcePool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iaaS_ServiceEClass, IaaS_Service.class, "IaaS_Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIaaS_Service_ComposedOf(), this.getCloudResource(), null, "composedOf", null, 1, -1, IaaS_Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paaS_ServiceEClass, PaaS_Service.class, "PaaS_Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPaaS_Service_ComposedOf(), this.getCloudPlatform(), null, "composedOf", null, 1, -1, PaaS_Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(saaS_ServiceEClass, SaaS_Service.class, "SaaS_Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSaaS_Service_ComposedOf(), this.getCloudSoftware(), null, "composedOf", null, 1, -1, SaaS_Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudResourceEClass, CloudResource.class, "CloudResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCloudResource_InLocation(), this.getLocation(), null, "inLocation", null, 0, 1, CloudResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudResource_From(), this.getLink(), null, "from", null, 0, -1, CloudResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudResource_ComposedOf(), this.getVirtualHWResource(), null, "composedOf", null, 0, -1, CloudResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudResource_ResourceType(), this.getCloudResourceType(), "resourceType", null, 1, 1, CloudResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudPlatformEClass, CloudPlatform.class, "CloudPlatform", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCloudPlatform_RunsOnCloudResource(), this.getCloudResource(), null, "runsOnCloudResource", null, 0, -1, CloudPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudPlatform_PlatformType(), this.getCloudPlatformType(), "platformType", null, 1, 1, CloudPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudPlatform_Language(), ecorePackage.getEString(), "language", null, 0, 1, CloudPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudPlatform_Technology(), ecorePackage.getEString(), "technology", null, 0, 1, CloudPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudPlatform_RunsOnResourcePool(), this.getResourcePool(), null, "runsOnResourcePool", null, 0, -1, CloudPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudSoftwareEClass, CloudSoftware.class, "CloudSoftware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCloudSoftware_DeployedOnCloudPlatform(), this.getCloudPlatform(), null, "deployedOnCloudPlatform", null, 0, -1, CloudSoftware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudSoftware_RunsOnCloudResource(), this.getCloudResource(), null, "runsOnCloudResource", null, 0, -1, CloudSoftware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudSoftware_SoftwareType(), this.getCloudSoftwareType(), "softwareType", null, 1, 1, CloudSoftware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudSoftware_RunsOnResourcePool(), this.getResourcePool(), null, "runsOnResourcePool", null, 0, -1, CloudSoftware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(backendEClass, Backend.class, "Backend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(middlewareEClass, Middleware.class, "Middleware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(frontendEClass, Frontend.class, "Frontend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locationEClass, Location.class, "Location", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Name(), ecorePackage.getEString(), "name", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subRegionEClass, SubRegion.class, "SubRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubRegion_InRegion(), this.getRegion(), null, "inRegion", null, 1, 1, SubRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualAreaEClass, VirtualArea.class, "VirtualArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resT_SoftwareEClass, REST_Software.class, "REST_Software", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(soaP_SoftwareEClass, SOAP_Software.class, "SOAP_Software", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_To(), this.getCloudResource(), null, "to", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Name(), ecorePackage.getEString(), "name", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Latency(), ecorePackage.getEDouble(), "latency", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Throughput(), ecorePackage.getEDouble(), "throughput", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Cost(), ecorePackage.getEDouble(), "cost", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_ReverseLinkToB(), this.getCloudElement(), this.getCloudElement_CloudElementB(), "reverseLinkToB", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_ReverseLinkToA(), this.getCloudElement(), this.getCloudElement_CloudElementA(), "reverseLinkToA", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allocationProfileEClass, AllocationProfile.class, "AllocationProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAllocationProfile_Id(), ecorePackage.getEInt(), "id", null, 1, 1, AllocationProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllocationProfile_Description(), ecorePackage.getEString(), "description", null, 0, 1, AllocationProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationProfile_ComposedOf(), this.getAllocation(), null, "composedOf", null, 1, -1, AllocationProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationProfile_RelatedToResourcePool(), this.getResourcePool(), this.getResourcePool_HasAllocationProfile(), "relatedToResourcePool", null, 1, 1, AllocationProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualHWResourceEClass, VirtualHWResource.class, "VirtualHWResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualHWResource_Has(), this.getEfficiencyProfile(), null, "has", null, 0, -1, VirtualHWResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualHWResource_Id(), ecorePackage.getEInt(), "id", null, 1, 1, VirtualHWResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualHWResource_Type(), this.getVirtualHWResourceType(), "type", null, 1, 1, VirtualHWResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualHWResource_ProcessingRate(), ecorePackage.getEDouble(), "processingRate", null, 1, 1, VirtualHWResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualHWResource_NumberOfReplicas(), ecorePackage.getEInt(), "numberOfReplicas", null, 1, 1, VirtualHWResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(v_CPUEClass, V_CPU.class, "V_CPU", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(v_MemoryEClass, V_Memory.class, "V_Memory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getV_Memory_Size(), ecorePackage.getEInt(), "size", null, 1, 1, V_Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(v_StorageEClass, V_Storage.class, "V_Storage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getV_Storage_Size(), ecorePackage.getEInt(), "size", null, 1, 1, V_Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(efficiencyProfileEClass, EfficiencyProfile.class, "EfficiencyProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEfficiencyProfile_Id(), ecorePackage.getEString(), "id", null, 0, 1, EfficiencyProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEfficiencyProfile_Period(), ecorePackage.getEInt(), "period", null, 0, 1, EfficiencyProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEfficiencyProfile_Efficiency(), ecorePackage.getEDouble(), "efficiency", null, 0, 1, EfficiencyProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computeEClass, Compute.class, "Compute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompute_UsesCloudStorage(), this.getCloudStorage(), null, "usesCloudStorage", null, 0, -1, Compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompute_OS(), this.getOSType(), "OS", null, 0, 1, Compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudStorageEClass, CloudStorage.class, "CloudStorage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudStorage_StorageType(), this.getCloudStorageType(), "storageType", null, 1, 1, CloudStorage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseEClass, Database.class, "Database", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabase_UsesCloudStorage(), this.getCloudStorage(), null, "usesCloudStorage", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_DBType(), this.getDatabaseType(), "DBType", null, 1, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalDBEClass, RelationalDB.class, "RelationalDB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noSQL_DBEClass, NoSQL_DB.class, "NoSQL_DB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(filesystemStorageEClass, FilesystemStorage.class, "FilesystemStorage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blobStorageEClass, BlobStorage.class, "BlobStorage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(costEClass, Cost.class, "Cost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCost_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Cost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCost_Description(), ecorePackage.getEString(), "description", null, 0, 1, Cost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCost_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, Cost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCost_Unit(), this.getCostUnitType(), "unit", null, 1, 1, Cost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCost_Period(), ecorePackage.getEInt(), "period", null, 0, 1, Cost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCost_AssociatedToCloudElement(), this.getCloudElement(), this.getCloudElement_HasCost(), "associatedToCloudElement", null, 1, 1, Cost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCost_DefinedOn(), this.getVirtualHWResource(), null, "definedOn", null, 0, 1, Cost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCost_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 0, 1, Cost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCost_UpperBound(), ecorePackage.getEInt(), "upperBound", null, 0, 1, Cost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCost_Region(), ecorePackage.getEString(), "region", null, 0, 1, Cost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(freeQuotaEClass, FreeQuota.class, "FreeQuota", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFreeQuota_Id(), ecorePackage.getEInt(), "id", null, 1, 1, FreeQuota.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreeQuota_Unit(), this.getCostUnitType(), "unit", null, 1, 1, FreeQuota.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreeQuota_Amount(), ecorePackage.getEDouble(), "amount", null, 1, 1, FreeQuota.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFreeQuota_AssociatedToCloudElement(), this.getCloudElement(), this.getCloudElement_HasFreeQuota(), "associatedToCloudElement", null, 1, 1, FreeQuota.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFreeQuota_DefinedOn(), this.getVirtualHWResource(), null, "definedOn", null, 0, 1, FreeQuota.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudElementEClass, CloudElement.class, "CloudElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudElement_Id(), ecorePackage.getEInt(), "id", null, 1, 1, CloudElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, CloudElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudElement_Type(), this.getCloudElementType(), "type", null, 1, 1, CloudElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudElement_CloudElementA(), this.getLink(), this.getLink_ReverseLinkToA(), "CloudElementA", null, 0, -1, CloudElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudElement_CloudElementB(), this.getLink(), this.getLink_ReverseLinkToB(), "CloudElementB", null, 0, -1, CloudElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudElement_HasCostProfile(), this.getCostProfile(), this.getCostProfile_AssociatedToCloudElement(), "hasCostProfile", null, 0, 1, CloudElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudElement_HasCost(), this.getCost(), this.getCost_AssociatedToCloudElement(), "hasCost", null, 0, -1, CloudElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudElement_HasFreeQuota(), this.getFreeQuota(), this.getFreeQuota_AssociatedToCloudElement(), "hasFreeQuota", null, 0, -1, CloudElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scalingRuleEClass, ScalingRule.class, "ScalingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScalingRule_Id(), ecorePackage.getEInt(), "id", null, 1, 1, ScalingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScalingRule_Metric(), this.getScalingMetricType(), "metric", null, 1, 1, ScalingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScalingRule_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, ScalingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScalingRule_Operator(), this.getScalingOperatorType(), "operator", null, 1, 1, ScalingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allocationEClass, Allocation.class, "Allocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAllocation_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Allocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllocation_Period(), ecorePackage.getEInt(), "period", null, 0, 1, Allocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllocation_NumberOfInstances(), ecorePackage.getEInt(), "numberOfInstances", null, 1, 1, Allocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(virtualHWResourceTypeEEnum, VirtualHWResourceType.class, "VirtualHWResourceType");
		addEEnumLiteral(virtualHWResourceTypeEEnum, VirtualHWResourceType.CPU);
		addEEnumLiteral(virtualHWResourceTypeEEnum, VirtualHWResourceType.MEMORY);
		addEEnumLiteral(virtualHWResourceTypeEEnum, VirtualHWResourceType.STORAGE);

		initEEnum(cloudResourceTypeEEnum, CloudResourceType.class, "CloudResourceType");
		addEEnumLiteral(cloudResourceTypeEEnum, CloudResourceType.COMPUTE);
		addEEnumLiteral(cloudResourceTypeEEnum, CloudResourceType.CLOUDSTORAGE);

		initEEnum(cloudPlatformTypeEEnum, CloudPlatformType.class, "CloudPlatformType");
		addEEnumLiteral(cloudPlatformTypeEEnum, CloudPlatformType.FRONTEND);
		addEEnumLiteral(cloudPlatformTypeEEnum, CloudPlatformType.MIDDLEWARE);
		addEEnumLiteral(cloudPlatformTypeEEnum, CloudPlatformType.BACKEND);
		addEEnumLiteral(cloudPlatformTypeEEnum, CloudPlatformType.DATABASE);

		initEEnum(databaseTypeEEnum, DatabaseType.class, "DatabaseType");
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.RELATIONAL);
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.NOSQL);

		initEEnum(cloudStorageTypeEEnum, CloudStorageType.class, "CloudStorageType");
		addEEnumLiteral(cloudStorageTypeEEnum, CloudStorageType.BLOBSTORAGE);
		addEEnumLiteral(cloudStorageTypeEEnum, CloudStorageType.FILESYSTEM);

		initEEnum(osTypeEEnum, OSType.class, "OSType");
		addEEnumLiteral(osTypeEEnum, OSType.LINUX);
		addEEnumLiteral(osTypeEEnum, OSType.WINDOWS);
		addEEnumLiteral(osTypeEEnum, OSType.MAC);
		addEEnumLiteral(osTypeEEnum, OSType.UNDEFINED);

		initEEnum(costUnitTypeEEnum, CostUnitType.class, "CostUnitType");
		addEEnumLiteral(costUnitTypeEEnum, CostUnitType.PER_HOUR);
		addEEnumLiteral(costUnitTypeEEnum, CostUnitType.PER_GBMONTH);
		addEEnumLiteral(costUnitTypeEEnum, CostUnitType.PER_MILLION_IO);

		initEEnum(scalingMetricTypeEEnum, ScalingMetricType.class, "ScalingMetricType");
		addEEnumLiteral(scalingMetricTypeEEnum, ScalingMetricType.CPU_UTILIZATION);
		addEEnumLiteral(scalingMetricTypeEEnum, ScalingMetricType.TRAFFIC_LOAD);
		addEEnumLiteral(scalingMetricTypeEEnum, ScalingMetricType.MEMORY);

		initEEnum(scalingOperatorTypeEEnum, ScalingOperatorType.class, "ScalingOperatorType");
		addEEnumLiteral(scalingOperatorTypeEEnum, ScalingOperatorType.GREATER_THAN);
		addEEnumLiteral(scalingOperatorTypeEEnum, ScalingOperatorType.LOWER_THAN);
		addEEnumLiteral(scalingOperatorTypeEEnum, ScalingOperatorType.GREATER_OR_EQUALS);
		addEEnumLiteral(scalingOperatorTypeEEnum, ScalingOperatorType.LOWER_OR_EQUALS);
		addEEnumLiteral(scalingOperatorTypeEEnum, ScalingOperatorType.EQUALS_TO);

		initEEnum(cloudElementTypeEEnum, CloudElementType.class, "CloudElementType");
		addEEnumLiteral(cloudElementTypeEEnum, CloudElementType.PLATFORM);
		addEEnumLiteral(cloudElementTypeEEnum, CloudElementType.RESOURCE);
		addEEnumLiteral(cloudElementTypeEEnum, CloudElementType.SOFTWARE);

		initEEnum(scalingTypeEEnum, ScalingType.class, "ScalingType");
		addEEnumLiteral(scalingTypeEEnum, ScalingType.SCALE_IN);
		addEEnumLiteral(scalingTypeEEnum, ScalingType.SCALE_OUT);

		initEEnum(cloudSoftwareTypeEEnum, CloudSoftwareType.class, "CloudSoftwareType");
		addEEnumLiteral(cloudSoftwareTypeEEnum, CloudSoftwareType.REST);
		addEEnumLiteral(cloudSoftwareTypeEEnum, CloudSoftwareType.SOAP);

		// Create resource
		createResource(eNS_URI);
	}

} //CloudPackageImpl
