/**
 */
package it.polimi.modaclouds.resourcemodel.cloud.impl;

import it.polimi.modaclouds.resourcemodel.cloud.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudFactoryImpl extends EFactoryImpl implements CloudFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CloudFactory init() {
		try {
			CloudFactory theCloudFactory = (CloudFactory)EPackage.Registry.INSTANCE.getEFactory(CloudPackage.eNS_URI);
			if (theCloudFactory != null) {
				return theCloudFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CloudFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CloudPackage.CLOUD_PROVIDER: return createCloudProvider();
			case CloudPackage.APPLICATION_SERVICE_PROVIDER: return createApplicationServiceProvider();
			case CloudPackage.COST_PROFILE: return createCostProfile();
			case CloudPackage.SERVICE_LEVEL_AGREEMENT_TEMPLATE: return createServiceLevelAgreementTemplate();
			case CloudPackage.REQUIREMENT: return createRequirement();
			case CloudPackage.SCALING_POLICY: return createScalingPolicy();
			case CloudPackage.RESOURCE_POOL: return createResourcePool();
			case CloudPackage.IAA_SSERVICE: return createIaaS_Service();
			case CloudPackage.PAA_SSERVICE: return createPaaS_Service();
			case CloudPackage.SAA_SSERVICE: return createSaaS_Service();
			case CloudPackage.CLOUD_SOFTWARE: return createCloudSoftware();
			case CloudPackage.BACKEND: return createBackend();
			case CloudPackage.MIDDLEWARE: return createMiddleware();
			case CloudPackage.FRONTEND: return createFrontend();
			case CloudPackage.REGION: return createRegion();
			case CloudPackage.SUB_REGION: return createSubRegion();
			case CloudPackage.VIRTUAL_AREA: return createVirtualArea();
			case CloudPackage.REST_SOFTWARE: return createREST_Software();
			case CloudPackage.SOAP_SOFTWARE: return createSOAP_Software();
			case CloudPackage.LINK: return createLink();
			case CloudPackage.ALLOCATION_PROFILE: return createAllocationProfile();
			case CloudPackage.VCPU: return createV_CPU();
			case CloudPackage.VMEMORY: return createV_Memory();
			case CloudPackage.VSTORAGE: return createV_Storage();
			case CloudPackage.EFFICIENCY_PROFILE: return createEfficiencyProfile();
			case CloudPackage.COMPUTE: return createCompute();
			case CloudPackage.RELATIONAL_DB: return createRelationalDB();
			case CloudPackage.NO_SQL_DB: return createNoSQL_DB();
			case CloudPackage.FILESYSTEM_STORAGE: return createFilesystemStorage();
			case CloudPackage.BLOB_STORAGE: return createBlobStorage();
			case CloudPackage.COST: return createCost();
			case CloudPackage.FREE_QUOTA: return createFreeQuota();
			case CloudPackage.SCALING_RULE: return createScalingRule();
			case CloudPackage.ALLOCATION: return createAllocation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CloudPackage.VIRTUAL_HW_RESOURCE_TYPE:
				return createVirtualHWResourceTypeFromString(eDataType, initialValue);
			case CloudPackage.CLOUD_RESOURCE_TYPE:
				return createCloudResourceTypeFromString(eDataType, initialValue);
			case CloudPackage.CLOUD_PLATFORM_TYPE:
				return createCloudPlatformTypeFromString(eDataType, initialValue);
			case CloudPackage.DATABASE_TYPE:
				return createDatabaseTypeFromString(eDataType, initialValue);
			case CloudPackage.CLOUD_STORAGE_TYPE:
				return createCloudStorageTypeFromString(eDataType, initialValue);
			case CloudPackage.OS_TYPE:
				return createOSTypeFromString(eDataType, initialValue);
			case CloudPackage.COST_UNIT_TYPE:
				return createCostUnitTypeFromString(eDataType, initialValue);
			case CloudPackage.SCALING_METRIC_TYPE:
				return createScalingMetricTypeFromString(eDataType, initialValue);
			case CloudPackage.SCALING_OPERATOR_TYPE:
				return createScalingOperatorTypeFromString(eDataType, initialValue);
			case CloudPackage.CLOUD_ELEMENT_TYPE:
				return createCloudElementTypeFromString(eDataType, initialValue);
			case CloudPackage.SCALING_TYPE:
				return createScalingTypeFromString(eDataType, initialValue);
			case CloudPackage.CLOUD_SOFTWARE_TYPE:
				return createCloudSoftwareTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CloudPackage.VIRTUAL_HW_RESOURCE_TYPE:
				return convertVirtualHWResourceTypeToString(eDataType, instanceValue);
			case CloudPackage.CLOUD_RESOURCE_TYPE:
				return convertCloudResourceTypeToString(eDataType, instanceValue);
			case CloudPackage.CLOUD_PLATFORM_TYPE:
				return convertCloudPlatformTypeToString(eDataType, instanceValue);
			case CloudPackage.DATABASE_TYPE:
				return convertDatabaseTypeToString(eDataType, instanceValue);
			case CloudPackage.CLOUD_STORAGE_TYPE:
				return convertCloudStorageTypeToString(eDataType, instanceValue);
			case CloudPackage.OS_TYPE:
				return convertOSTypeToString(eDataType, instanceValue);
			case CloudPackage.COST_UNIT_TYPE:
				return convertCostUnitTypeToString(eDataType, instanceValue);
			case CloudPackage.SCALING_METRIC_TYPE:
				return convertScalingMetricTypeToString(eDataType, instanceValue);
			case CloudPackage.SCALING_OPERATOR_TYPE:
				return convertScalingOperatorTypeToString(eDataType, instanceValue);
			case CloudPackage.CLOUD_ELEMENT_TYPE:
				return convertCloudElementTypeToString(eDataType, instanceValue);
			case CloudPackage.SCALING_TYPE:
				return convertScalingTypeToString(eDataType, instanceValue);
			case CloudPackage.CLOUD_SOFTWARE_TYPE:
				return convertCloudSoftwareTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudProvider createCloudProvider() {
		CloudProviderImpl cloudProvider = new CloudProviderImpl();
		return cloudProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationServiceProvider createApplicationServiceProvider() {
		ApplicationServiceProviderImpl applicationServiceProvider = new ApplicationServiceProviderImpl();
		return applicationServiceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostProfile createCostProfile() {
		CostProfileImpl costProfile = new CostProfileImpl();
		return costProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelAgreementTemplate createServiceLevelAgreementTemplate() {
		ServiceLevelAgreementTemplateImpl serviceLevelAgreementTemplate = new ServiceLevelAgreementTemplateImpl();
		return serviceLevelAgreementTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingPolicy createScalingPolicy() {
		ScalingPolicyImpl scalingPolicy = new ScalingPolicyImpl();
		return scalingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePool createResourcePool() {
		ResourcePoolImpl resourcePool = new ResourcePoolImpl();
		return resourcePool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IaaS_Service createIaaS_Service() {
		IaaS_ServiceImpl iaaS_Service = new IaaS_ServiceImpl();
		return iaaS_Service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaaS_Service createPaaS_Service() {
		PaaS_ServiceImpl paaS_Service = new PaaS_ServiceImpl();
		return paaS_Service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaaS_Service createSaaS_Service() {
		SaaS_ServiceImpl saaS_Service = new SaaS_ServiceImpl();
		return saaS_Service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudSoftware createCloudSoftware() {
		CloudSoftwareImpl cloudSoftware = new CloudSoftwareImpl();
		return cloudSoftware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Backend createBackend() {
		BackendImpl backend = new BackendImpl();
		return backend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Middleware createMiddleware() {
		MiddlewareImpl middleware = new MiddlewareImpl();
		return middleware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frontend createFrontend() {
		FrontendImpl frontend = new FrontendImpl();
		return frontend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubRegion createSubRegion() {
		SubRegionImpl subRegion = new SubRegionImpl();
		return subRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualArea createVirtualArea() {
		VirtualAreaImpl virtualArea = new VirtualAreaImpl();
		return virtualArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REST_Software createREST_Software() {
		REST_SoftwareImpl resT_Software = new REST_SoftwareImpl();
		return resT_Software;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SOAP_Software createSOAP_Software() {
		SOAP_SoftwareImpl soaP_Software = new SOAP_SoftwareImpl();
		return soaP_Software;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationProfile createAllocationProfile() {
		AllocationProfileImpl allocationProfile = new AllocationProfileImpl();
		return allocationProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V_CPU createV_CPU() {
		V_CPUImpl v_CPU = new V_CPUImpl();
		return v_CPU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V_Memory createV_Memory() {
		V_MemoryImpl v_Memory = new V_MemoryImpl();
		return v_Memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V_Storage createV_Storage() {
		V_StorageImpl v_Storage = new V_StorageImpl();
		return v_Storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EfficiencyProfile createEfficiencyProfile() {
		EfficiencyProfileImpl efficiencyProfile = new EfficiencyProfileImpl();
		return efficiencyProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compute createCompute() {
		ComputeImpl compute = new ComputeImpl();
		return compute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalDB createRelationalDB() {
		RelationalDBImpl relationalDB = new RelationalDBImpl();
		return relationalDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoSQL_DB createNoSQL_DB() {
		NoSQL_DBImpl noSQL_DB = new NoSQL_DBImpl();
		return noSQL_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilesystemStorage createFilesystemStorage() {
		FilesystemStorageImpl filesystemStorage = new FilesystemStorageImpl();
		return filesystemStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlobStorage createBlobStorage() {
		BlobStorageImpl blobStorage = new BlobStorageImpl();
		return blobStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cost createCost() {
		CostImpl cost = new CostImpl();
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreeQuota createFreeQuota() {
		FreeQuotaImpl freeQuota = new FreeQuotaImpl();
		return freeQuota;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingRule createScalingRule() {
		ScalingRuleImpl scalingRule = new ScalingRuleImpl();
		return scalingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Allocation createAllocation() {
		AllocationImpl allocation = new AllocationImpl();
		return allocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualHWResourceType createVirtualHWResourceTypeFromString(EDataType eDataType, String initialValue) {
		VirtualHWResourceType result = VirtualHWResourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVirtualHWResourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudResourceType createCloudResourceTypeFromString(EDataType eDataType, String initialValue) {
		CloudResourceType result = CloudResourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCloudResourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudPlatformType createCloudPlatformTypeFromString(EDataType eDataType, String initialValue) {
		CloudPlatformType result = CloudPlatformType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCloudPlatformTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseType createDatabaseTypeFromString(EDataType eDataType, String initialValue) {
		DatabaseType result = DatabaseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatabaseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudStorageType createCloudStorageTypeFromString(EDataType eDataType, String initialValue) {
		CloudStorageType result = CloudStorageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCloudStorageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSType createOSTypeFromString(EDataType eDataType, String initialValue) {
		OSType result = OSType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOSTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostUnitType createCostUnitTypeFromString(EDataType eDataType, String initialValue) {
		CostUnitType result = CostUnitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCostUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingMetricType createScalingMetricTypeFromString(EDataType eDataType, String initialValue) {
		ScalingMetricType result = ScalingMetricType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScalingMetricTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingOperatorType createScalingOperatorTypeFromString(EDataType eDataType, String initialValue) {
		ScalingOperatorType result = ScalingOperatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScalingOperatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudElementType createCloudElementTypeFromString(EDataType eDataType, String initialValue) {
		CloudElementType result = CloudElementType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCloudElementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingType createScalingTypeFromString(EDataType eDataType, String initialValue) {
		ScalingType result = ScalingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScalingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudSoftwareType createCloudSoftwareTypeFromString(EDataType eDataType, String initialValue) {
		CloudSoftwareType result = CloudSoftwareType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCloudSoftwareTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudPackage getCloudPackage() {
		return (CloudPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CloudPackage getPackage() {
		return CloudPackage.eINSTANCE;
	}

} //CloudFactoryImpl
