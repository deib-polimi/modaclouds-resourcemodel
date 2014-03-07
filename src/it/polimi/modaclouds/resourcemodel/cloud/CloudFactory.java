/**
 */
package it.polimi.modaclouds.resourcemodel.cloud;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage
 * @generated
 */
public interface CloudFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CloudFactory eINSTANCE = it.polimi.modaclouds.resourcemodel.cloud.impl.CloudFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provider</em>'.
	 * @generated
	 */
	CloudProvider createCloudProvider();

	/**
	 * Returns a new object of class '<em>Application Service Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Service Provider</em>'.
	 * @generated
	 */
	ApplicationServiceProvider createApplicationServiceProvider();

	/**
	 * Returns a new object of class '<em>Cost Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cost Profile</em>'.
	 * @generated
	 */
	CostProfile createCostProfile();

	/**
	 * Returns a new object of class '<em>Service Level Agreement Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Level Agreement Template</em>'.
	 * @generated
	 */
	ServiceLevelAgreementTemplate createServiceLevelAgreementTemplate();

	/**
	 * Returns a new object of class '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement</em>'.
	 * @generated
	 */
	Requirement createRequirement();

	/**
	 * Returns a new object of class '<em>Scaling Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scaling Policy</em>'.
	 * @generated
	 */
	ScalingPolicy createScalingPolicy();

	/**
	 * Returns a new object of class '<em>Resource Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Pool</em>'.
	 * @generated
	 */
	ResourcePool createResourcePool();

	/**
	 * Returns a new object of class '<em>Iaa SService</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iaa SService</em>'.
	 * @generated
	 */
	IaaS_Service createIaaS_Service();

	/**
	 * Returns a new object of class '<em>Paa SService</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paa SService</em>'.
	 * @generated
	 */
	PaaS_Service createPaaS_Service();

	/**
	 * Returns a new object of class '<em>Saa SService</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Saa SService</em>'.
	 * @generated
	 */
	SaaS_Service createSaaS_Service();

	/**
	 * Returns a new object of class '<em>Software</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software</em>'.
	 * @generated
	 */
	CloudSoftware createCloudSoftware();

	/**
	 * Returns a new object of class '<em>Backend</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Backend</em>'.
	 * @generated
	 */
	Backend createBackend();

	/**
	 * Returns a new object of class '<em>Middleware</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Middleware</em>'.
	 * @generated
	 */
	Middleware createMiddleware();

	/**
	 * Returns a new object of class '<em>Frontend</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Frontend</em>'.
	 * @generated
	 */
	Frontend createFrontend();

	/**
	 * Returns a new object of class '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region</em>'.
	 * @generated
	 */
	Region createRegion();

	/**
	 * Returns a new object of class '<em>Sub Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Region</em>'.
	 * @generated
	 */
	SubRegion createSubRegion();

	/**
	 * Returns a new object of class '<em>Virtual Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Area</em>'.
	 * @generated
	 */
	VirtualArea createVirtualArea();

	/**
	 * Returns a new object of class '<em>REST Software</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>REST Software</em>'.
	 * @generated
	 */
	REST_Software createREST_Software();

	/**
	 * Returns a new object of class '<em>SOAP Software</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SOAP Software</em>'.
	 * @generated
	 */
	SOAP_Software createSOAP_Software();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Allocation Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocation Profile</em>'.
	 * @generated
	 */
	AllocationProfile createAllocationProfile();

	/**
	 * Returns a new object of class '<em>VCPU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VCPU</em>'.
	 * @generated
	 */
	V_CPU createV_CPU();

	/**
	 * Returns a new object of class '<em>VMemory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VMemory</em>'.
	 * @generated
	 */
	V_Memory createV_Memory();

	/**
	 * Returns a new object of class '<em>VStorage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VStorage</em>'.
	 * @generated
	 */
	V_Storage createV_Storage();

	/**
	 * Returns a new object of class '<em>Efficiency Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Efficiency Profile</em>'.
	 * @generated
	 */
	EfficiencyProfile createEfficiencyProfile();

	/**
	 * Returns a new object of class '<em>Compute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compute</em>'.
	 * @generated
	 */
	Compute createCompute();

	/**
	 * Returns a new object of class '<em>Relational DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relational DB</em>'.
	 * @generated
	 */
	RelationalDB createRelationalDB();

	/**
	 * Returns a new object of class '<em>No SQL DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>No SQL DB</em>'.
	 * @generated
	 */
	NoSQL_DB createNoSQL_DB();

	/**
	 * Returns a new object of class '<em>Filesystem Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filesystem Storage</em>'.
	 * @generated
	 */
	FilesystemStorage createFilesystemStorage();

	/**
	 * Returns a new object of class '<em>Blob Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blob Storage</em>'.
	 * @generated
	 */
	BlobStorage createBlobStorage();

	/**
	 * Returns a new object of class '<em>Cost</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cost</em>'.
	 * @generated
	 */
	Cost createCost();

	/**
	 * Returns a new object of class '<em>Free Quota</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Free Quota</em>'.
	 * @generated
	 */
	FreeQuota createFreeQuota();

	/**
	 * Returns a new object of class '<em>Scaling Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scaling Rule</em>'.
	 * @generated
	 */
	ScalingRule createScalingRule();

	/**
	 * Returns a new object of class '<em>Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocation</em>'.
	 * @generated
	 */
	Allocation createAllocation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CloudPackage getCloudPackage();

} //CloudFactory
