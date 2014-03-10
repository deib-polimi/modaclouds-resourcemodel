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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage
 * @generated
 */
public class CloudSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CloudPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudSwitch() {
		if (modelPackage == null) {
			modelPackage = CloudPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CloudPackage.PROVIDER: {
				Provider provider = (Provider)theEObject;
				T result = caseProvider(provider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.CLOUD_PROVIDER: {
				CloudProvider cloudProvider = (CloudProvider)theEObject;
				T result = caseCloudProvider(cloudProvider);
				if (result == null) result = caseProvider(cloudProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.CLOUD_SERVICE: {
				CloudService cloudService = (CloudService)theEObject;
				T result = caseCloudService(cloudService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.APPLICATION_SERVICE_PROVIDER: {
				ApplicationServiceProvider applicationServiceProvider = (ApplicationServiceProvider)theEObject;
				T result = caseApplicationServiceProvider(applicationServiceProvider);
				if (result == null) result = caseProvider(applicationServiceProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.COST_PROFILE: {
				CostProfile costProfile = (CostProfile)theEObject;
				T result = caseCostProfile(costProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.SERVICE_LEVEL_AGREEMENT_TEMPLATE: {
				ServiceLevelAgreementTemplate serviceLevelAgreementTemplate = (ServiceLevelAgreementTemplate)theEObject;
				T result = caseServiceLevelAgreementTemplate(serviceLevelAgreementTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.SCALING_POLICY: {
				ScalingPolicy scalingPolicy = (ScalingPolicy)theEObject;
				T result = caseScalingPolicy(scalingPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.RESOURCE_POOL: {
				ResourcePool resourcePool = (ResourcePool)theEObject;
				T result = caseResourcePool(resourcePool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.IAA_SSERVICE: {
				IaaS_Service iaaS_Service = (IaaS_Service)theEObject;
				T result = caseIaaS_Service(iaaS_Service);
				if (result == null) result = caseCloudService(iaaS_Service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.PAA_SSERVICE: {
				PaaS_Service paaS_Service = (PaaS_Service)theEObject;
				T result = casePaaS_Service(paaS_Service);
				if (result == null) result = caseCloudService(paaS_Service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.SAA_SSERVICE: {
				SaaS_Service saaS_Service = (SaaS_Service)theEObject;
				T result = caseSaaS_Service(saaS_Service);
				if (result == null) result = caseCloudService(saaS_Service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.CLOUD_RESOURCE: {
				CloudResource cloudResource = (CloudResource)theEObject;
				T result = caseCloudResource(cloudResource);
				if (result == null) result = caseCloudElement(cloudResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.CLOUD_PLATFORM: {
				CloudPlatform cloudPlatform = (CloudPlatform)theEObject;
				T result = caseCloudPlatform(cloudPlatform);
				if (result == null) result = caseCloudElement(cloudPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.CLOUD_SOFTWARE: {
				CloudSoftware cloudSoftware = (CloudSoftware)theEObject;
				T result = caseCloudSoftware(cloudSoftware);
				if (result == null) result = caseCloudElement(cloudSoftware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.BACKEND: {
				Backend backend = (Backend)theEObject;
				T result = caseBackend(backend);
				if (result == null) result = caseCloudPlatform(backend);
				if (result == null) result = caseCloudElement(backend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.MIDDLEWARE: {
				Middleware middleware = (Middleware)theEObject;
				T result = caseMiddleware(middleware);
				if (result == null) result = caseCloudPlatform(middleware);
				if (result == null) result = caseCloudElement(middleware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.FRONTEND: {
				Frontend frontend = (Frontend)theEObject;
				T result = caseFrontend(frontend);
				if (result == null) result = caseCloudPlatform(frontend);
				if (result == null) result = caseCloudElement(frontend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.REGION: {
				Region region = (Region)theEObject;
				T result = caseRegion(region);
				if (result == null) result = caseLocation(region);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.SUB_REGION: {
				SubRegion subRegion = (SubRegion)theEObject;
				T result = caseSubRegion(subRegion);
				if (result == null) result = caseLocation(subRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.VIRTUAL_AREA: {
				VirtualArea virtualArea = (VirtualArea)theEObject;
				T result = caseVirtualArea(virtualArea);
				if (result == null) result = caseSubRegion(virtualArea);
				if (result == null) result = caseLocation(virtualArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.REST_SOFTWARE: {
				REST_Software resT_Software = (REST_Software)theEObject;
				T result = caseREST_Software(resT_Software);
				if (result == null) result = caseCloudSoftware(resT_Software);
				if (result == null) result = caseCloudElement(resT_Software);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.SOAP_SOFTWARE: {
				SOAP_Software soaP_Software = (SOAP_Software)theEObject;
				T result = caseSOAP_Software(soaP_Software);
				if (result == null) result = caseCloudSoftware(soaP_Software);
				if (result == null) result = caseCloudElement(soaP_Software);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.ALLOCATION_PROFILE: {
				AllocationProfile allocationProfile = (AllocationProfile)theEObject;
				T result = caseAllocationProfile(allocationProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.VIRTUAL_HW_RESOURCE: {
				VirtualHWResource virtualHWResource = (VirtualHWResource)theEObject;
				T result = caseVirtualHWResource(virtualHWResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.VCPU: {
				V_CPU v_CPU = (V_CPU)theEObject;
				T result = caseV_CPU(v_CPU);
				if (result == null) result = caseVirtualHWResource(v_CPU);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.VMEMORY: {
				V_Memory v_Memory = (V_Memory)theEObject;
				T result = caseV_Memory(v_Memory);
				if (result == null) result = caseVirtualHWResource(v_Memory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.VSTORAGE: {
				V_Storage v_Storage = (V_Storage)theEObject;
				T result = caseV_Storage(v_Storage);
				if (result == null) result = caseVirtualHWResource(v_Storage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.EFFICIENCY_PROFILE: {
				EfficiencyProfile efficiencyProfile = (EfficiencyProfile)theEObject;
				T result = caseEfficiencyProfile(efficiencyProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.COMPUTE: {
				Compute compute = (Compute)theEObject;
				T result = caseCompute(compute);
				if (result == null) result = caseCloudResource(compute);
				if (result == null) result = caseCloudElement(compute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.CLOUD_STORAGE: {
				CloudStorage cloudStorage = (CloudStorage)theEObject;
				T result = caseCloudStorage(cloudStorage);
				if (result == null) result = caseCloudResource(cloudStorage);
				if (result == null) result = caseCloudElement(cloudStorage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.DATABASE: {
				Database database = (Database)theEObject;
				T result = caseDatabase(database);
				if (result == null) result = caseCloudPlatform(database);
				if (result == null) result = caseCloudElement(database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.RELATIONAL_DB: {
				RelationalDB relationalDB = (RelationalDB)theEObject;
				T result = caseRelationalDB(relationalDB);
				if (result == null) result = caseDatabase(relationalDB);
				if (result == null) result = caseCloudPlatform(relationalDB);
				if (result == null) result = caseCloudElement(relationalDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.NO_SQL_DB: {
				NoSQL_DB noSQL_DB = (NoSQL_DB)theEObject;
				T result = caseNoSQL_DB(noSQL_DB);
				if (result == null) result = caseDatabase(noSQL_DB);
				if (result == null) result = caseCloudPlatform(noSQL_DB);
				if (result == null) result = caseCloudElement(noSQL_DB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.FILESYSTEM_STORAGE: {
				FilesystemStorage filesystemStorage = (FilesystemStorage)theEObject;
				T result = caseFilesystemStorage(filesystemStorage);
				if (result == null) result = caseCloudStorage(filesystemStorage);
				if (result == null) result = caseCloudResource(filesystemStorage);
				if (result == null) result = caseCloudElement(filesystemStorage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.BLOB_STORAGE: {
				BlobStorage blobStorage = (BlobStorage)theEObject;
				T result = caseBlobStorage(blobStorage);
				if (result == null) result = caseCloudStorage(blobStorage);
				if (result == null) result = caseCloudResource(blobStorage);
				if (result == null) result = caseCloudElement(blobStorage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.COST: {
				Cost cost = (Cost)theEObject;
				T result = caseCost(cost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.FREE_QUOTA: {
				FreeQuota freeQuota = (FreeQuota)theEObject;
				T result = caseFreeQuota(freeQuota);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.CLOUD_ELEMENT: {
				CloudElement cloudElement = (CloudElement)theEObject;
				T result = caseCloudElement(cloudElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.SCALING_RULE: {
				ScalingRule scalingRule = (ScalingRule)theEObject;
				T result = caseScalingRule(scalingRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.ALLOCATION: {
				Allocation allocation = (Allocation)theEObject;
				T result = caseAllocation(allocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvider(Provider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudProvider(CloudProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudService(CloudService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Service Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Service Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationServiceProvider(ApplicationServiceProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostProfile(CostProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level Agreement Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level Agreement Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevelAgreementTemplate(ServiceLevelAgreementTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scaling Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scaling Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalingPolicy(ScalingPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Pool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Pool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourcePool(ResourcePool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iaa SService</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iaa SService</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIaaS_Service(IaaS_Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paa SService</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paa SService</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaaS_Service(PaaS_Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Saa SService</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Saa SService</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSaaS_Service(SaaS_Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudResource(CloudResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudPlatform(CloudPlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudSoftware(CloudSoftware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Backend</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Backend</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackend(Backend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Middleware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Middleware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiddleware(Middleware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frontend</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frontend</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrontend(Frontend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegion(Region object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubRegion(SubRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualArea(VirtualArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REST Software</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REST Software</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREST_Software(REST_Software object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SOAP Software</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SOAP Software</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSOAP_Software(SOAP_Software object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocation Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocation Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocationProfile(AllocationProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual HW Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual HW Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualHWResource(VirtualHWResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VCPU</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VCPU</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseV_CPU(V_CPU object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VMemory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VMemory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseV_Memory(V_Memory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VStorage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VStorage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseV_Storage(V_Storage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Efficiency Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Efficiency Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEfficiencyProfile(EfficiencyProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompute(Compute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudStorage(CloudStorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase(Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationalDB(RelationalDB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No SQL DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No SQL DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoSQL_DB(NoSQL_DB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filesystem Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filesystem Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilesystemStorage(FilesystemStorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blob Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blob Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlobStorage(BlobStorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCost(Cost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Free Quota</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Free Quota</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFreeQuota(FreeQuota object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudElement(CloudElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scaling Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scaling Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalingRule(ScalingRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocation(Allocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CloudSwitch
