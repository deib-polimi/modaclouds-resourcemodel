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
package it.polimi.modaclouds.resourcemodel.cloud.util;

import it.polimi.modaclouds.resourcemodel.cloud.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage
 * @generated
 */
public class CloudAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CloudPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CloudPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudSwitch<Adapter> modelSwitch =
		new CloudSwitch<Adapter>() {
			@Override
			public Adapter caseProvider(Provider object) {
				return createProviderAdapter();
			}
			@Override
			public Adapter caseCloudProvider(CloudProvider object) {
				return createCloudProviderAdapter();
			}
			@Override
			public Adapter caseCloudService(CloudService object) {
				return createCloudServiceAdapter();
			}
			@Override
			public Adapter caseApplicationServiceProvider(ApplicationServiceProvider object) {
				return createApplicationServiceProviderAdapter();
			}
			@Override
			public Adapter caseCostProfile(CostProfile object) {
				return createCostProfileAdapter();
			}
			@Override
			public Adapter caseServiceLevelAgreementTemplate(ServiceLevelAgreementTemplate object) {
				return createServiceLevelAgreementTemplateAdapter();
			}
			@Override
			public Adapter caseRequirement(Requirement object) {
				return createRequirementAdapter();
			}
			@Override
			public Adapter caseScalingPolicy(ScalingPolicy object) {
				return createScalingPolicyAdapter();
			}
			@Override
			public Adapter caseResourcePool(ResourcePool object) {
				return createResourcePoolAdapter();
			}
			@Override
			public Adapter caseIaaS_Service(IaaS_Service object) {
				return createIaaS_ServiceAdapter();
			}
			@Override
			public Adapter casePaaS_Service(PaaS_Service object) {
				return createPaaS_ServiceAdapter();
			}
			@Override
			public Adapter caseSaaS_Service(SaaS_Service object) {
				return createSaaS_ServiceAdapter();
			}
			@Override
			public Adapter caseCloudResource(CloudResource object) {
				return createCloudResourceAdapter();
			}
			@Override
			public Adapter caseCloudPlatform(CloudPlatform object) {
				return createCloudPlatformAdapter();
			}
			@Override
			public Adapter caseCloudSoftware(CloudSoftware object) {
				return createCloudSoftwareAdapter();
			}
			@Override
			public Adapter caseBackend(Backend object) {
				return createBackendAdapter();
			}
			@Override
			public Adapter caseMiddleware(Middleware object) {
				return createMiddlewareAdapter();
			}
			@Override
			public Adapter caseFrontend(Frontend object) {
				return createFrontendAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseRegion(Region object) {
				return createRegionAdapter();
			}
			@Override
			public Adapter caseSubRegion(SubRegion object) {
				return createSubRegionAdapter();
			}
			@Override
			public Adapter caseVirtualArea(VirtualArea object) {
				return createVirtualAreaAdapter();
			}
			@Override
			public Adapter caseREST_Software(REST_Software object) {
				return createREST_SoftwareAdapter();
			}
			@Override
			public Adapter caseSOAP_Software(SOAP_Software object) {
				return createSOAP_SoftwareAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseAllocationProfile(AllocationProfile object) {
				return createAllocationProfileAdapter();
			}
			@Override
			public Adapter caseVirtualHWResource(VirtualHWResource object) {
				return createVirtualHWResourceAdapter();
			}
			@Override
			public Adapter caseV_CPU(V_CPU object) {
				return createV_CPUAdapter();
			}
			@Override
			public Adapter caseV_Memory(V_Memory object) {
				return createV_MemoryAdapter();
			}
			@Override
			public Adapter caseV_Storage(V_Storage object) {
				return createV_StorageAdapter();
			}
			@Override
			public Adapter caseEfficiencyProfile(EfficiencyProfile object) {
				return createEfficiencyProfileAdapter();
			}
			@Override
			public Adapter caseCompute(Compute object) {
				return createComputeAdapter();
			}
			@Override
			public Adapter caseCloudStorage(CloudStorage object) {
				return createCloudStorageAdapter();
			}
			@Override
			public Adapter caseDatabase(Database object) {
				return createDatabaseAdapter();
			}
			@Override
			public Adapter caseRelationalDB(RelationalDB object) {
				return createRelationalDBAdapter();
			}
			@Override
			public Adapter caseNoSQL_DB(NoSQL_DB object) {
				return createNoSQL_DBAdapter();
			}
			@Override
			public Adapter caseFilesystemStorage(FilesystemStorage object) {
				return createFilesystemStorageAdapter();
			}
			@Override
			public Adapter caseBlobStorage(BlobStorage object) {
				return createBlobStorageAdapter();
			}
			@Override
			public Adapter caseCost(Cost object) {
				return createCostAdapter();
			}
			@Override
			public Adapter caseFreeQuota(FreeQuota object) {
				return createFreeQuotaAdapter();
			}
			@Override
			public Adapter caseCloudElement(CloudElement object) {
				return createCloudElementAdapter();
			}
			@Override
			public Adapter caseScalingRule(ScalingRule object) {
				return createScalingRuleAdapter();
			}
			@Override
			public Adapter caseAllocation(Allocation object) {
				return createAllocationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Provider
	 * @generated
	 */
	public Adapter createProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudProvider
	 * @generated
	 */
	public Adapter createCloudProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudService
	 * @generated
	 */
	public Adapter createCloudServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.ApplicationServiceProvider <em>Application Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ApplicationServiceProvider
	 * @generated
	 */
	public Adapter createApplicationServiceProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.CostProfile <em>Cost Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CostProfile
	 * @generated
	 */
	public Adapter createCostProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.ServiceLevelAgreementTemplate <em>Service Level Agreement Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ServiceLevelAgreementTemplate
	 * @generated
	 */
	public Adapter createServiceLevelAgreementTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingPolicy <em>Scaling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ScalingPolicy
	 * @generated
	 */
	public Adapter createScalingPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.ResourcePool <em>Resource Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ResourcePool
	 * @generated
	 */
	public Adapter createResourcePoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.IaaS_Service <em>Iaa SService</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.IaaS_Service
	 * @generated
	 */
	public Adapter createIaaS_ServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.PaaS_Service <em>Paa SService</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.PaaS_Service
	 * @generated
	 */
	public Adapter createPaaS_ServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.SaaS_Service <em>Saa SService</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.SaaS_Service
	 * @generated
	 */
	public Adapter createSaaS_ServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudResource
	 * @generated
	 */
	public Adapter createCloudResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform
	 * @generated
	 */
	public Adapter createCloudPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudSoftware <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudSoftware
	 * @generated
	 */
	public Adapter createCloudSoftwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.Backend <em>Backend</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Backend
	 * @generated
	 */
	public Adapter createBackendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.Middleware <em>Middleware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Middleware
	 * @generated
	 */
	public Adapter createMiddlewareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.Frontend <em>Frontend</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Frontend
	 * @generated
	 */
	public Adapter createFrontendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Region
	 * @generated
	 */
	public Adapter createRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.SubRegion <em>Sub Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.SubRegion
	 * @generated
	 */
	public Adapter createSubRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.VirtualArea <em>Virtual Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.VirtualArea
	 * @generated
	 */
	public Adapter createVirtualAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.REST_Software <em>REST Software</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.REST_Software
	 * @generated
	 */
	public Adapter createREST_SoftwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.SOAP_Software <em>SOAP Software</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.SOAP_Software
	 * @generated
	 */
	public Adapter createSOAP_SoftwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.AllocationProfile <em>Allocation Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.AllocationProfile
	 * @generated
	 */
	public Adapter createAllocationProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource <em>Virtual HW Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource
	 * @generated
	 */
	public Adapter createVirtualHWResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.V_CPU <em>VCPU</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.V_CPU
	 * @generated
	 */
	public Adapter createV_CPUAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.V_Memory <em>VMemory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.V_Memory
	 * @generated
	 */
	public Adapter createV_MemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.V_Storage <em>VStorage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.V_Storage
	 * @generated
	 */
	public Adapter createV_StorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.EfficiencyProfile <em>Efficiency Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.EfficiencyProfile
	 * @generated
	 */
	public Adapter createEfficiencyProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.Compute <em>Compute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Compute
	 * @generated
	 */
	public Adapter createComputeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudStorage
	 * @generated
	 */
	public Adapter createCloudStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Database
	 * @generated
	 */
	public Adapter createDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.RelationalDB <em>Relational DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.RelationalDB
	 * @generated
	 */
	public Adapter createRelationalDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.NoSQL_DB <em>No SQL DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.NoSQL_DB
	 * @generated
	 */
	public Adapter createNoSQL_DBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.FilesystemStorage <em>Filesystem Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.FilesystemStorage
	 * @generated
	 */
	public Adapter createFilesystemStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.BlobStorage <em>Blob Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.BlobStorage
	 * @generated
	 */
	public Adapter createBlobStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.Cost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Cost
	 * @generated
	 */
	public Adapter createCostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.FreeQuota <em>Free Quota</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.FreeQuota
	 * @generated
	 */
	public Adapter createFreeQuotaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudElement
	 * @generated
	 */
	public Adapter createCloudElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingRule <em>Scaling Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ScalingRule
	 * @generated
	 */
	public Adapter createScalingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.modaclouds.resourcemodel.cloud.Allocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Allocation
	 * @generated
	 */
	public Adapter createAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CloudAdapterFactory
