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
package it.polimi.modaclouds.resourcemodel.cloud;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudFactory
 * @model kind="package"
 * @generated
 */
public interface CloudPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cloud";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cloud/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cloud";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CloudPackage eINSTANCE = it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.ProviderImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudProviderImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCloudProvider()
	 * @generated
	 */
	int CLOUD_PROVIDER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER__ID = PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER__NAME = PROVIDER__NAME;

	/**
	 * The feature id for the '<em><b>Provides Cloud Service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER__PROVIDES_CLOUD_SERVICE = PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER_FEATURE_COUNT = PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudServiceImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCloudService()
	 * @generated
	 */
	int CLOUD_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Has SLA</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SERVICE__HAS_SLA = 0;

	/**
	 * The feature id for the '<em><b>Has Scaling Policy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SERVICE__HAS_SCALING_POLICY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SERVICE__ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SERVICE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SERVICE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.ApplicationServiceProviderImpl <em>Application Service Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.ApplicationServiceProviderImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getApplicationServiceProvider()
	 * @generated
	 */
	int APPLICATION_SERVICE_PROVIDER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SERVICE_PROVIDER__ID = PROVIDER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SERVICE_PROVIDER__NAME = PROVIDER__NAME;

	/**
	 * The feature id for the '<em><b>Provides Cloud Software</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SERVICE_PROVIDER__PROVIDES_CLOUD_SOFTWARE = PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Application Service Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SERVICE_PROVIDER_FEATURE_COUNT = PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CostProfileImpl <em>Cost Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CostProfileImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCostProfile()
	 * @generated
	 */
	int COST_PROFILE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PROFILE__ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PROFILE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PROFILE__COMPOSED_OF = 2;

	/**
	 * The feature id for the '<em><b>Associated To Cloud Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PROFILE__ASSOCIATED_TO_CLOUD_ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>Cost Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_PROFILE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.ServiceLevelAgreementTemplateImpl <em>Service Level Agreement Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.ServiceLevelAgreementTemplateImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getServiceLevelAgreementTemplate()
	 * @generated
	 */
	int SERVICE_LEVEL_AGREEMENT_TEMPLATE = 5;

	/**
	 * The feature id for the '<em><b>Defined By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT_TEMPLATE__DEFINED_BY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT_TEMPLATE__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT_TEMPLATE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Service Level Agreement Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_AGREEMENT_TEMPLATE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.RequirementImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.ScalingPolicyImpl <em>Scaling Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.ScalingPolicyImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getScalingPolicy()
	 * @generated
	 */
	int SCALING_POLICY = 7;

	/**
	 * The feature id for the '<em><b>Defined On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY__DEFINED_ON = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY__NAME = 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY__ACTION = 3;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY__COMPOSED_OF = 4;

	/**
	 * The number of structural features of the '<em>Scaling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.ResourcePoolImpl <em>Resource Pool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.ResourcePoolImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getResourcePool()
	 * @generated
	 */
	int RESOURCE_POOL = 8;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_POOL__COMPOSED_OF = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_POOL__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_POOL__NAME = 2;

	/**
	 * The feature id for the '<em><b>Has Allocation Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_POOL__HAS_ALLOCATION_PROFILE = 3;

	/**
	 * The number of structural features of the '<em>Resource Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_POOL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.IaaS_ServiceImpl <em>Iaa SService</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.IaaS_ServiceImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getIaaS_Service()
	 * @generated
	 */
	int IAA_SSERVICE = 9;

	/**
	 * The feature id for the '<em><b>Has SLA</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAA_SSERVICE__HAS_SLA = CLOUD_SERVICE__HAS_SLA;

	/**
	 * The feature id for the '<em><b>Has Scaling Policy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAA_SSERVICE__HAS_SCALING_POLICY = CLOUD_SERVICE__HAS_SCALING_POLICY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAA_SSERVICE__ID = CLOUD_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAA_SSERVICE__NAME = CLOUD_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAA_SSERVICE__COMPOSED_OF = CLOUD_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iaa SService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAA_SSERVICE_FEATURE_COUNT = CLOUD_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.PaaS_ServiceImpl <em>Paa SService</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.PaaS_ServiceImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getPaaS_Service()
	 * @generated
	 */
	int PAA_SSERVICE = 10;

	/**
	 * The feature id for the '<em><b>Has SLA</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAA_SSERVICE__HAS_SLA = CLOUD_SERVICE__HAS_SLA;

	/**
	 * The feature id for the '<em><b>Has Scaling Policy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAA_SSERVICE__HAS_SCALING_POLICY = CLOUD_SERVICE__HAS_SCALING_POLICY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAA_SSERVICE__ID = CLOUD_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAA_SSERVICE__NAME = CLOUD_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAA_SSERVICE__COMPOSED_OF = CLOUD_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Paa SService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAA_SSERVICE_FEATURE_COUNT = CLOUD_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.SaaS_ServiceImpl <em>Saa SService</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.SaaS_ServiceImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getSaaS_Service()
	 * @generated
	 */
	int SAA_SSERVICE = 11;

	/**
	 * The feature id for the '<em><b>Has SLA</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAA_SSERVICE__HAS_SLA = CLOUD_SERVICE__HAS_SLA;

	/**
	 * The feature id for the '<em><b>Has Scaling Policy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAA_SSERVICE__HAS_SCALING_POLICY = CLOUD_SERVICE__HAS_SCALING_POLICY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAA_SSERVICE__ID = CLOUD_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAA_SSERVICE__NAME = CLOUD_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAA_SSERVICE__COMPOSED_OF = CLOUD_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Saa SService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAA_SSERVICE_FEATURE_COUNT = CLOUD_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudElementImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCloudElement()
	 * @generated
	 */
	int CLOUD_ELEMENT = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ELEMENT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Cloud Element A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ELEMENT__CLOUD_ELEMENT_A = 3;

	/**
	 * The feature id for the '<em><b>Cloud Element B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ELEMENT__CLOUD_ELEMENT_B = 4;

	/**
	 * The feature id for the '<em><b>Has Cost Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ELEMENT__HAS_COST_PROFILE = 5;

	/**
	 * The feature id for the '<em><b>Has Cost</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ELEMENT__HAS_COST = 6;

	/**
	 * The feature id for the '<em><b>Has Free Quota</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ELEMENT__HAS_FREE_QUOTA = 7;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ELEMENT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudResourceImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCloudResource()
	 * @generated
	 */
	int CLOUD_RESOURCE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE__ID = CLOUD_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE__NAME = CLOUD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE__TYPE = CLOUD_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Cloud Element A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE__CLOUD_ELEMENT_A = CLOUD_ELEMENT__CLOUD_ELEMENT_A;

	/**
	 * The feature id for the '<em><b>Cloud Element B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE__CLOUD_ELEMENT_B = CLOUD_ELEMENT__CLOUD_ELEMENT_B;

	/**
	 * The feature id for the '<em><b>Has Cost Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE__HAS_COST_PROFILE = CLOUD_ELEMENT__HAS_COST_PROFILE;

	/**
	 * The feature id for the '<em><b>Has Cost</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE__HAS_COST = CLOUD_ELEMENT__HAS_COST;

	/**
	 * The feature id for the '<em><b>Has Free Quota</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE__HAS_FREE_QUOTA = CLOUD_ELEMENT__HAS_FREE_QUOTA;

	/**
	 * The feature id for the '<em><b>In Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE__IN_LOCATION = CLOUD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE__FROM = CLOUD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE__COMPOSED_OF = CLOUD_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE__RESOURCE_TYPE = CLOUD_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCE_FEATURE_COUNT = CLOUD_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPlatformImpl <em>Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPlatformImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCloudPlatform()
	 * @generated
	 */
	int CLOUD_PLATFORM = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PLATFORM__ID = CLOUD_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PLATFORM__NAME = CLOUD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PLATFORM__TYPE = CLOUD_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Cloud Element A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PLATFORM__CLOUD_ELEMENT_A = CLOUD_ELEMENT__CLOUD_ELEMENT_A;

	/**
	 * The feature id for the '<em><b>Cloud Element B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PLATFORM__CLOUD_ELEMENT_B = CLOUD_ELEMENT__CLOUD_ELEMENT_B;

	/**
	 * The feature id for the '<em><b>Has Cost Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PLATFORM__HAS_COST_PROFILE = CLOUD_ELEMENT__HAS_COST_PROFILE;

	/**
	 * The feature id for the '<em><b>Has Cost</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PLATFORM__HAS_COST = CLOUD_ELEMENT__HAS_COST;

	/**
	 * The feature id for the '<em><b>Has Free Quota</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PLATFORM__HAS_FREE_QUOTA = CLOUD_ELEMENT__HAS_FREE_QUOTA;

	/**
	 * The feature id for the '<em><b>Runs On Cloud Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PLATFORM__RUNS_ON_CLOUD_RESOURCE = CLOUD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Platform Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PLATFORM__PLATFORM_TYPE = CLOUD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PLATFORM__LANGUAGE = CLOUD_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PLATFORM__TECHNOLOGY = CLOUD_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Runs On Resource Pool</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PLATFORM__RUNS_ON_RESOURCE_POOL = CLOUD_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PLATFORM_FEATURE_COUNT = CLOUD_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudSoftwareImpl <em>Software</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudSoftwareImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCloudSoftware()
	 * @generated
	 */
	int CLOUD_SOFTWARE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOFTWARE__ID = CLOUD_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOFTWARE__NAME = CLOUD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOFTWARE__TYPE = CLOUD_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Cloud Element A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOFTWARE__CLOUD_ELEMENT_A = CLOUD_ELEMENT__CLOUD_ELEMENT_A;

	/**
	 * The feature id for the '<em><b>Cloud Element B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOFTWARE__CLOUD_ELEMENT_B = CLOUD_ELEMENT__CLOUD_ELEMENT_B;

	/**
	 * The feature id for the '<em><b>Has Cost Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOFTWARE__HAS_COST_PROFILE = CLOUD_ELEMENT__HAS_COST_PROFILE;

	/**
	 * The feature id for the '<em><b>Has Cost</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOFTWARE__HAS_COST = CLOUD_ELEMENT__HAS_COST;

	/**
	 * The feature id for the '<em><b>Has Free Quota</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOFTWARE__HAS_FREE_QUOTA = CLOUD_ELEMENT__HAS_FREE_QUOTA;

	/**
	 * The feature id for the '<em><b>Deployed On Cloud Platform</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOFTWARE__DEPLOYED_ON_CLOUD_PLATFORM = CLOUD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Runs On Cloud Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOFTWARE__RUNS_ON_CLOUD_RESOURCE = CLOUD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Software Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOFTWARE__SOFTWARE_TYPE = CLOUD_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Runs On Resource Pool</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOFTWARE__RUNS_ON_RESOURCE_POOL = CLOUD_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOFTWARE_FEATURE_COUNT = CLOUD_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.BackendImpl <em>Backend</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.BackendImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getBackend()
	 * @generated
	 */
	int BACKEND = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND__ID = CLOUD_PLATFORM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND__NAME = CLOUD_PLATFORM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND__TYPE = CLOUD_PLATFORM__TYPE;

	/**
	 * The feature id for the '<em><b>Cloud Element A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND__CLOUD_ELEMENT_A = CLOUD_PLATFORM__CLOUD_ELEMENT_A;

	/**
	 * The feature id for the '<em><b>Cloud Element B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND__CLOUD_ELEMENT_B = CLOUD_PLATFORM__CLOUD_ELEMENT_B;

	/**
	 * The feature id for the '<em><b>Has Cost Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND__HAS_COST_PROFILE = CLOUD_PLATFORM__HAS_COST_PROFILE;

	/**
	 * The feature id for the '<em><b>Has Cost</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND__HAS_COST = CLOUD_PLATFORM__HAS_COST;

	/**
	 * The feature id for the '<em><b>Has Free Quota</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND__HAS_FREE_QUOTA = CLOUD_PLATFORM__HAS_FREE_QUOTA;

	/**
	 * The feature id for the '<em><b>Runs On Cloud Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND__RUNS_ON_CLOUD_RESOURCE = CLOUD_PLATFORM__RUNS_ON_CLOUD_RESOURCE;

	/**
	 * The feature id for the '<em><b>Platform Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND__PLATFORM_TYPE = CLOUD_PLATFORM__PLATFORM_TYPE;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND__LANGUAGE = CLOUD_PLATFORM__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND__TECHNOLOGY = CLOUD_PLATFORM__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Runs On Resource Pool</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND__RUNS_ON_RESOURCE_POOL = CLOUD_PLATFORM__RUNS_ON_RESOURCE_POOL;

	/**
	 * The number of structural features of the '<em>Backend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKEND_FEATURE_COUNT = CLOUD_PLATFORM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.MiddlewareImpl <em>Middleware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.MiddlewareImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getMiddleware()
	 * @generated
	 */
	int MIDDLEWARE = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__ID = CLOUD_PLATFORM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__NAME = CLOUD_PLATFORM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__TYPE = CLOUD_PLATFORM__TYPE;

	/**
	 * The feature id for the '<em><b>Cloud Element A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__CLOUD_ELEMENT_A = CLOUD_PLATFORM__CLOUD_ELEMENT_A;

	/**
	 * The feature id for the '<em><b>Cloud Element B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__CLOUD_ELEMENT_B = CLOUD_PLATFORM__CLOUD_ELEMENT_B;

	/**
	 * The feature id for the '<em><b>Has Cost Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__HAS_COST_PROFILE = CLOUD_PLATFORM__HAS_COST_PROFILE;

	/**
	 * The feature id for the '<em><b>Has Cost</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__HAS_COST = CLOUD_PLATFORM__HAS_COST;

	/**
	 * The feature id for the '<em><b>Has Free Quota</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__HAS_FREE_QUOTA = CLOUD_PLATFORM__HAS_FREE_QUOTA;

	/**
	 * The feature id for the '<em><b>Runs On Cloud Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__RUNS_ON_CLOUD_RESOURCE = CLOUD_PLATFORM__RUNS_ON_CLOUD_RESOURCE;

	/**
	 * The feature id for the '<em><b>Platform Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__PLATFORM_TYPE = CLOUD_PLATFORM__PLATFORM_TYPE;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__LANGUAGE = CLOUD_PLATFORM__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__TECHNOLOGY = CLOUD_PLATFORM__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Runs On Resource Pool</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__RUNS_ON_RESOURCE_POOL = CLOUD_PLATFORM__RUNS_ON_RESOURCE_POOL;

	/**
	 * The number of structural features of the '<em>Middleware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE_FEATURE_COUNT = CLOUD_PLATFORM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.FrontendImpl <em>Frontend</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.FrontendImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getFrontend()
	 * @generated
	 */
	int FRONTEND = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONTEND__ID = CLOUD_PLATFORM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONTEND__NAME = CLOUD_PLATFORM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONTEND__TYPE = CLOUD_PLATFORM__TYPE;

	/**
	 * The feature id for the '<em><b>Cloud Element A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONTEND__CLOUD_ELEMENT_A = CLOUD_PLATFORM__CLOUD_ELEMENT_A;

	/**
	 * The feature id for the '<em><b>Cloud Element B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONTEND__CLOUD_ELEMENT_B = CLOUD_PLATFORM__CLOUD_ELEMENT_B;

	/**
	 * The feature id for the '<em><b>Has Cost Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONTEND__HAS_COST_PROFILE = CLOUD_PLATFORM__HAS_COST_PROFILE;

	/**
	 * The feature id for the '<em><b>Has Cost</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONTEND__HAS_COST = CLOUD_PLATFORM__HAS_COST;

	/**
	 * The feature id for the '<em><b>Has Free Quota</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONTEND__HAS_FREE_QUOTA = CLOUD_PLATFORM__HAS_FREE_QUOTA;

	/**
	 * The feature id for the '<em><b>Runs On Cloud Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONTEND__RUNS_ON_CLOUD_RESOURCE = CLOUD_PLATFORM__RUNS_ON_CLOUD_RESOURCE;

	/**
	 * The feature id for the '<em><b>Platform Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONTEND__PLATFORM_TYPE = CLOUD_PLATFORM__PLATFORM_TYPE;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONTEND__LANGUAGE = CLOUD_PLATFORM__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONTEND__TECHNOLOGY = CLOUD_PLATFORM__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Runs On Resource Pool</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONTEND__RUNS_ON_RESOURCE_POOL = CLOUD_PLATFORM__RUNS_ON_RESOURCE_POOL;

	/**
	 * The number of structural features of the '<em>Frontend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRONTEND_FEATURE_COUNT = CLOUD_PLATFORM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.LocationImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.RegionImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__ID = LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NAME = LOCATION__NAME;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.SubRegionImpl <em>Sub Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.SubRegionImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getSubRegion()
	 * @generated
	 */
	int SUB_REGION = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_REGION__ID = LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_REGION__NAME = LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>In Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_REGION__IN_REGION = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_REGION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.VirtualAreaImpl <em>Virtual Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.VirtualAreaImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getVirtualArea()
	 * @generated
	 */
	int VIRTUAL_AREA = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_AREA__ID = SUB_REGION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_AREA__NAME = SUB_REGION__NAME;

	/**
	 * The feature id for the '<em><b>In Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_AREA__IN_REGION = SUB_REGION__IN_REGION;

	/**
	 * The number of structural features of the '<em>Virtual Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_AREA_FEATURE_COUNT = SUB_REGION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.REST_SoftwareImpl <em>REST Software</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.REST_SoftwareImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getREST_Software()
	 * @generated
	 */
	int REST_SOFTWARE = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SOFTWARE__ID = CLOUD_SOFTWARE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SOFTWARE__NAME = CLOUD_SOFTWARE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SOFTWARE__TYPE = CLOUD_SOFTWARE__TYPE;

	/**
	 * The feature id for the '<em><b>Cloud Element A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SOFTWARE__CLOUD_ELEMENT_A = CLOUD_SOFTWARE__CLOUD_ELEMENT_A;

	/**
	 * The feature id for the '<em><b>Cloud Element B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SOFTWARE__CLOUD_ELEMENT_B = CLOUD_SOFTWARE__CLOUD_ELEMENT_B;

	/**
	 * The feature id for the '<em><b>Has Cost Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SOFTWARE__HAS_COST_PROFILE = CLOUD_SOFTWARE__HAS_COST_PROFILE;

	/**
	 * The feature id for the '<em><b>Has Cost</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SOFTWARE__HAS_COST = CLOUD_SOFTWARE__HAS_COST;

	/**
	 * The feature id for the '<em><b>Has Free Quota</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SOFTWARE__HAS_FREE_QUOTA = CLOUD_SOFTWARE__HAS_FREE_QUOTA;

	/**
	 * The feature id for the '<em><b>Deployed On Cloud Platform</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SOFTWARE__DEPLOYED_ON_CLOUD_PLATFORM = CLOUD_SOFTWARE__DEPLOYED_ON_CLOUD_PLATFORM;

	/**
	 * The feature id for the '<em><b>Runs On Cloud Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SOFTWARE__RUNS_ON_CLOUD_RESOURCE = CLOUD_SOFTWARE__RUNS_ON_CLOUD_RESOURCE;

	/**
	 * The feature id for the '<em><b>Software Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SOFTWARE__SOFTWARE_TYPE = CLOUD_SOFTWARE__SOFTWARE_TYPE;

	/**
	 * The feature id for the '<em><b>Runs On Resource Pool</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SOFTWARE__RUNS_ON_RESOURCE_POOL = CLOUD_SOFTWARE__RUNS_ON_RESOURCE_POOL;

	/**
	 * The number of structural features of the '<em>REST Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SOFTWARE_FEATURE_COUNT = CLOUD_SOFTWARE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.SOAP_SoftwareImpl <em>SOAP Software</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.SOAP_SoftwareImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getSOAP_Software()
	 * @generated
	 */
	int SOAP_SOFTWARE = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_SOFTWARE__ID = CLOUD_SOFTWARE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_SOFTWARE__NAME = CLOUD_SOFTWARE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_SOFTWARE__TYPE = CLOUD_SOFTWARE__TYPE;

	/**
	 * The feature id for the '<em><b>Cloud Element A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_SOFTWARE__CLOUD_ELEMENT_A = CLOUD_SOFTWARE__CLOUD_ELEMENT_A;

	/**
	 * The feature id for the '<em><b>Cloud Element B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_SOFTWARE__CLOUD_ELEMENT_B = CLOUD_SOFTWARE__CLOUD_ELEMENT_B;

	/**
	 * The feature id for the '<em><b>Has Cost Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_SOFTWARE__HAS_COST_PROFILE = CLOUD_SOFTWARE__HAS_COST_PROFILE;

	/**
	 * The feature id for the '<em><b>Has Cost</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_SOFTWARE__HAS_COST = CLOUD_SOFTWARE__HAS_COST;

	/**
	 * The feature id for the '<em><b>Has Free Quota</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_SOFTWARE__HAS_FREE_QUOTA = CLOUD_SOFTWARE__HAS_FREE_QUOTA;

	/**
	 * The feature id for the '<em><b>Deployed On Cloud Platform</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_SOFTWARE__DEPLOYED_ON_CLOUD_PLATFORM = CLOUD_SOFTWARE__DEPLOYED_ON_CLOUD_PLATFORM;

	/**
	 * The feature id for the '<em><b>Runs On Cloud Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_SOFTWARE__RUNS_ON_CLOUD_RESOURCE = CLOUD_SOFTWARE__RUNS_ON_CLOUD_RESOURCE;

	/**
	 * The feature id for the '<em><b>Software Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_SOFTWARE__SOFTWARE_TYPE = CLOUD_SOFTWARE__SOFTWARE_TYPE;

	/**
	 * The feature id for the '<em><b>Runs On Resource Pool</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_SOFTWARE__RUNS_ON_RESOURCE_POOL = CLOUD_SOFTWARE__RUNS_ON_RESOURCE_POOL;

	/**
	 * The number of structural features of the '<em>SOAP Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAP_SOFTWARE_FEATURE_COUNT = CLOUD_SOFTWARE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.LinkImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 24;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TO = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = 2;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LATENCY = 3;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__THROUGHPUT = 4;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__COST = 5;

	/**
	 * The feature id for the '<em><b>Reverse Link To B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__REVERSE_LINK_TO_B = 6;

	/**
	 * The feature id for the '<em><b>Reverse Link To A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__REVERSE_LINK_TO_A = 7;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.AllocationProfileImpl <em>Allocation Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.AllocationProfileImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getAllocationProfile()
	 * @generated
	 */
	int ALLOCATION_PROFILE = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_PROFILE__ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_PROFILE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_PROFILE__COMPOSED_OF = 2;

	/**
	 * The feature id for the '<em><b>Related To Resource Pool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_PROFILE__RELATED_TO_RESOURCE_POOL = 3;

	/**
	 * The number of structural features of the '<em>Allocation Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_PROFILE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.VirtualHWResourceImpl <em>Virtual HW Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.VirtualHWResourceImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getVirtualHWResource()
	 * @generated
	 */
	int VIRTUAL_HW_RESOURCE = 26;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_HW_RESOURCE__HAS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_HW_RESOURCE__ID = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_HW_RESOURCE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Processing Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_HW_RESOURCE__PROCESSING_RATE = 3;

	/**
	 * The feature id for the '<em><b>Number Of Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_HW_RESOURCE__NUMBER_OF_REPLICAS = 4;

	/**
	 * The number of structural features of the '<em>Virtual HW Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_HW_RESOURCE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.V_CPUImpl <em>VCPU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.V_CPUImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getV_CPU()
	 * @generated
	 */
	int VCPU = 27;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCPU__HAS = VIRTUAL_HW_RESOURCE__HAS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCPU__ID = VIRTUAL_HW_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCPU__TYPE = VIRTUAL_HW_RESOURCE__TYPE;

	/**
	 * The feature id for the '<em><b>Processing Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCPU__PROCESSING_RATE = VIRTUAL_HW_RESOURCE__PROCESSING_RATE;

	/**
	 * The feature id for the '<em><b>Number Of Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCPU__NUMBER_OF_REPLICAS = VIRTUAL_HW_RESOURCE__NUMBER_OF_REPLICAS;

	/**
	 * The number of structural features of the '<em>VCPU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCPU_FEATURE_COUNT = VIRTUAL_HW_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.V_MemoryImpl <em>VMemory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.V_MemoryImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getV_Memory()
	 * @generated
	 */
	int VMEMORY = 28;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMEMORY__HAS = VIRTUAL_HW_RESOURCE__HAS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMEMORY__ID = VIRTUAL_HW_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMEMORY__TYPE = VIRTUAL_HW_RESOURCE__TYPE;

	/**
	 * The feature id for the '<em><b>Processing Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMEMORY__PROCESSING_RATE = VIRTUAL_HW_RESOURCE__PROCESSING_RATE;

	/**
	 * The feature id for the '<em><b>Number Of Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMEMORY__NUMBER_OF_REPLICAS = VIRTUAL_HW_RESOURCE__NUMBER_OF_REPLICAS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMEMORY__SIZE = VIRTUAL_HW_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VMemory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VMEMORY_FEATURE_COUNT = VIRTUAL_HW_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.V_StorageImpl <em>VStorage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.V_StorageImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getV_Storage()
	 * @generated
	 */
	int VSTORAGE = 29;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSTORAGE__HAS = VIRTUAL_HW_RESOURCE__HAS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSTORAGE__ID = VIRTUAL_HW_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSTORAGE__TYPE = VIRTUAL_HW_RESOURCE__TYPE;

	/**
	 * The feature id for the '<em><b>Processing Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSTORAGE__PROCESSING_RATE = VIRTUAL_HW_RESOURCE__PROCESSING_RATE;

	/**
	 * The feature id for the '<em><b>Number Of Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSTORAGE__NUMBER_OF_REPLICAS = VIRTUAL_HW_RESOURCE__NUMBER_OF_REPLICAS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSTORAGE__SIZE = VIRTUAL_HW_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VStorage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSTORAGE_FEATURE_COUNT = VIRTUAL_HW_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.EfficiencyProfileImpl <em>Efficiency Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.EfficiencyProfileImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getEfficiencyProfile()
	 * @generated
	 */
	int EFFICIENCY_PROFILE = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFICIENCY_PROFILE__ID = 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFICIENCY_PROFILE__PERIOD = 1;

	/**
	 * The feature id for the '<em><b>Efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFICIENCY_PROFILE__EFFICIENCY = 2;

	/**
	 * The number of structural features of the '<em>Efficiency Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFICIENCY_PROFILE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.ComputeImpl <em>Compute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.ComputeImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCompute()
	 * @generated
	 */
	int COMPUTE = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__ID = CLOUD_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__NAME = CLOUD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__TYPE = CLOUD_RESOURCE__TYPE;

	/**
	 * The feature id for the '<em><b>Cloud Element A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__CLOUD_ELEMENT_A = CLOUD_RESOURCE__CLOUD_ELEMENT_A;

	/**
	 * The feature id for the '<em><b>Cloud Element B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__CLOUD_ELEMENT_B = CLOUD_RESOURCE__CLOUD_ELEMENT_B;

	/**
	 * The feature id for the '<em><b>Has Cost Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__HAS_COST_PROFILE = CLOUD_RESOURCE__HAS_COST_PROFILE;

	/**
	 * The feature id for the '<em><b>Has Cost</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__HAS_COST = CLOUD_RESOURCE__HAS_COST;

	/**
	 * The feature id for the '<em><b>Has Free Quota</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__HAS_FREE_QUOTA = CLOUD_RESOURCE__HAS_FREE_QUOTA;

	/**
	 * The feature id for the '<em><b>In Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__IN_LOCATION = CLOUD_RESOURCE__IN_LOCATION;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__FROM = CLOUD_RESOURCE__FROM;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__COMPOSED_OF = CLOUD_RESOURCE__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__RESOURCE_TYPE = CLOUD_RESOURCE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Uses Cloud Storage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__USES_CLOUD_STORAGE = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>OS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__OS = CLOUD_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudStorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudStorageImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCloudStorage()
	 * @generated
	 */
	int CLOUD_STORAGE = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STORAGE__ID = CLOUD_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STORAGE__NAME = CLOUD_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STORAGE__TYPE = CLOUD_RESOURCE__TYPE;

	/**
	 * The feature id for the '<em><b>Cloud Element A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STORAGE__CLOUD_ELEMENT_A = CLOUD_RESOURCE__CLOUD_ELEMENT_A;

	/**
	 * The feature id for the '<em><b>Cloud Element B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STORAGE__CLOUD_ELEMENT_B = CLOUD_RESOURCE__CLOUD_ELEMENT_B;

	/**
	 * The feature id for the '<em><b>Has Cost Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STORAGE__HAS_COST_PROFILE = CLOUD_RESOURCE__HAS_COST_PROFILE;

	/**
	 * The feature id for the '<em><b>Has Cost</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STORAGE__HAS_COST = CLOUD_RESOURCE__HAS_COST;

	/**
	 * The feature id for the '<em><b>Has Free Quota</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STORAGE__HAS_FREE_QUOTA = CLOUD_RESOURCE__HAS_FREE_QUOTA;

	/**
	 * The feature id for the '<em><b>In Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STORAGE__IN_LOCATION = CLOUD_RESOURCE__IN_LOCATION;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STORAGE__FROM = CLOUD_RESOURCE__FROM;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STORAGE__COMPOSED_OF = CLOUD_RESOURCE__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STORAGE__RESOURCE_TYPE = CLOUD_RESOURCE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Storage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STORAGE__STORAGE_TYPE = CLOUD_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STORAGE_FEATURE_COUNT = CLOUD_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.DatabaseImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__ID = CLOUD_PLATFORM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__NAME = CLOUD_PLATFORM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__TYPE = CLOUD_PLATFORM__TYPE;

	/**
	 * The feature id for the '<em><b>Cloud Element A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__CLOUD_ELEMENT_A = CLOUD_PLATFORM__CLOUD_ELEMENT_A;

	/**
	 * The feature id for the '<em><b>Cloud Element B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__CLOUD_ELEMENT_B = CLOUD_PLATFORM__CLOUD_ELEMENT_B;

	/**
	 * The feature id for the '<em><b>Has Cost Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__HAS_COST_PROFILE = CLOUD_PLATFORM__HAS_COST_PROFILE;

	/**
	 * The feature id for the '<em><b>Has Cost</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__HAS_COST = CLOUD_PLATFORM__HAS_COST;

	/**
	 * The feature id for the '<em><b>Has Free Quota</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__HAS_FREE_QUOTA = CLOUD_PLATFORM__HAS_FREE_QUOTA;

	/**
	 * The feature id for the '<em><b>Runs On Cloud Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__RUNS_ON_CLOUD_RESOURCE = CLOUD_PLATFORM__RUNS_ON_CLOUD_RESOURCE;

	/**
	 * The feature id for the '<em><b>Platform Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__PLATFORM_TYPE = CLOUD_PLATFORM__PLATFORM_TYPE;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__LANGUAGE = CLOUD_PLATFORM__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__TECHNOLOGY = CLOUD_PLATFORM__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Runs On Resource Pool</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__RUNS_ON_RESOURCE_POOL = CLOUD_PLATFORM__RUNS_ON_RESOURCE_POOL;

	/**
	 * The feature id for the '<em><b>Uses Cloud Storage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__USES_CLOUD_STORAGE = CLOUD_PLATFORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>DB Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__DB_TYPE = CLOUD_PLATFORM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = CLOUD_PLATFORM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.RelationalDBImpl <em>Relational DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.RelationalDBImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getRelationalDB()
	 * @generated
	 */
	int RELATIONAL_DB = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__ID = DATABASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__NAME = DATABASE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__TYPE = DATABASE__TYPE;

	/**
	 * The feature id for the '<em><b>Cloud Element A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__CLOUD_ELEMENT_A = DATABASE__CLOUD_ELEMENT_A;

	/**
	 * The feature id for the '<em><b>Cloud Element B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__CLOUD_ELEMENT_B = DATABASE__CLOUD_ELEMENT_B;

	/**
	 * The feature id for the '<em><b>Has Cost Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__HAS_COST_PROFILE = DATABASE__HAS_COST_PROFILE;

	/**
	 * The feature id for the '<em><b>Has Cost</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__HAS_COST = DATABASE__HAS_COST;

	/**
	 * The feature id for the '<em><b>Has Free Quota</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__HAS_FREE_QUOTA = DATABASE__HAS_FREE_QUOTA;

	/**
	 * The feature id for the '<em><b>Runs On Cloud Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__RUNS_ON_CLOUD_RESOURCE = DATABASE__RUNS_ON_CLOUD_RESOURCE;

	/**
	 * The feature id for the '<em><b>Platform Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__PLATFORM_TYPE = DATABASE__PLATFORM_TYPE;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__LANGUAGE = DATABASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__TECHNOLOGY = DATABASE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Runs On Resource Pool</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__RUNS_ON_RESOURCE_POOL = DATABASE__RUNS_ON_RESOURCE_POOL;

	/**
	 * The feature id for the '<em><b>Uses Cloud Storage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__USES_CLOUD_STORAGE = DATABASE__USES_CLOUD_STORAGE;

	/**
	 * The feature id for the '<em><b>DB Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__DB_TYPE = DATABASE__DB_TYPE;

	/**
	 * The number of structural features of the '<em>Relational DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB_FEATURE_COUNT = DATABASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.NoSQL_DBImpl <em>No SQL DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.NoSQL_DBImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getNoSQL_DB()
	 * @generated
	 */
	int NO_SQL_DB = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DB__ID = DATABASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DB__NAME = DATABASE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DB__TYPE = DATABASE__TYPE;

	/**
	 * The feature id for the '<em><b>Cloud Element A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DB__CLOUD_ELEMENT_A = DATABASE__CLOUD_ELEMENT_A;

	/**
	 * The feature id for the '<em><b>Cloud Element B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DB__CLOUD_ELEMENT_B = DATABASE__CLOUD_ELEMENT_B;

	/**
	 * The feature id for the '<em><b>Has Cost Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DB__HAS_COST_PROFILE = DATABASE__HAS_COST_PROFILE;

	/**
	 * The feature id for the '<em><b>Has Cost</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DB__HAS_COST = DATABASE__HAS_COST;

	/**
	 * The feature id for the '<em><b>Has Free Quota</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DB__HAS_FREE_QUOTA = DATABASE__HAS_FREE_QUOTA;

	/**
	 * The feature id for the '<em><b>Runs On Cloud Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DB__RUNS_ON_CLOUD_RESOURCE = DATABASE__RUNS_ON_CLOUD_RESOURCE;

	/**
	 * The feature id for the '<em><b>Platform Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DB__PLATFORM_TYPE = DATABASE__PLATFORM_TYPE;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DB__LANGUAGE = DATABASE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DB__TECHNOLOGY = DATABASE__TECHNOLOGY;

	/**
	 * The feature id for the '<em><b>Runs On Resource Pool</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DB__RUNS_ON_RESOURCE_POOL = DATABASE__RUNS_ON_RESOURCE_POOL;

	/**
	 * The feature id for the '<em><b>Uses Cloud Storage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DB__USES_CLOUD_STORAGE = DATABASE__USES_CLOUD_STORAGE;

	/**
	 * The feature id for the '<em><b>DB Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DB__DB_TYPE = DATABASE__DB_TYPE;

	/**
	 * The number of structural features of the '<em>No SQL DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_DB_FEATURE_COUNT = DATABASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.FilesystemStorageImpl <em>Filesystem Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.FilesystemStorageImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getFilesystemStorage()
	 * @generated
	 */
	int FILESYSTEM_STORAGE = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM_STORAGE__ID = CLOUD_STORAGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM_STORAGE__NAME = CLOUD_STORAGE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM_STORAGE__TYPE = CLOUD_STORAGE__TYPE;

	/**
	 * The feature id for the '<em><b>Cloud Element A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM_STORAGE__CLOUD_ELEMENT_A = CLOUD_STORAGE__CLOUD_ELEMENT_A;

	/**
	 * The feature id for the '<em><b>Cloud Element B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM_STORAGE__CLOUD_ELEMENT_B = CLOUD_STORAGE__CLOUD_ELEMENT_B;

	/**
	 * The feature id for the '<em><b>Has Cost Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM_STORAGE__HAS_COST_PROFILE = CLOUD_STORAGE__HAS_COST_PROFILE;

	/**
	 * The feature id for the '<em><b>Has Cost</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM_STORAGE__HAS_COST = CLOUD_STORAGE__HAS_COST;

	/**
	 * The feature id for the '<em><b>Has Free Quota</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM_STORAGE__HAS_FREE_QUOTA = CLOUD_STORAGE__HAS_FREE_QUOTA;

	/**
	 * The feature id for the '<em><b>In Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM_STORAGE__IN_LOCATION = CLOUD_STORAGE__IN_LOCATION;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM_STORAGE__FROM = CLOUD_STORAGE__FROM;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM_STORAGE__COMPOSED_OF = CLOUD_STORAGE__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM_STORAGE__RESOURCE_TYPE = CLOUD_STORAGE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Storage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM_STORAGE__STORAGE_TYPE = CLOUD_STORAGE__STORAGE_TYPE;

	/**
	 * The number of structural features of the '<em>Filesystem Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM_STORAGE_FEATURE_COUNT = CLOUD_STORAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.BlobStorageImpl <em>Blob Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.BlobStorageImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getBlobStorage()
	 * @generated
	 */
	int BLOB_STORAGE = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__ID = CLOUD_STORAGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__NAME = CLOUD_STORAGE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__TYPE = CLOUD_STORAGE__TYPE;

	/**
	 * The feature id for the '<em><b>Cloud Element A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__CLOUD_ELEMENT_A = CLOUD_STORAGE__CLOUD_ELEMENT_A;

	/**
	 * The feature id for the '<em><b>Cloud Element B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__CLOUD_ELEMENT_B = CLOUD_STORAGE__CLOUD_ELEMENT_B;

	/**
	 * The feature id for the '<em><b>Has Cost Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__HAS_COST_PROFILE = CLOUD_STORAGE__HAS_COST_PROFILE;

	/**
	 * The feature id for the '<em><b>Has Cost</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__HAS_COST = CLOUD_STORAGE__HAS_COST;

	/**
	 * The feature id for the '<em><b>Has Free Quota</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__HAS_FREE_QUOTA = CLOUD_STORAGE__HAS_FREE_QUOTA;

	/**
	 * The feature id for the '<em><b>In Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__IN_LOCATION = CLOUD_STORAGE__IN_LOCATION;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__FROM = CLOUD_STORAGE__FROM;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__COMPOSED_OF = CLOUD_STORAGE__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__RESOURCE_TYPE = CLOUD_STORAGE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Storage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE__STORAGE_TYPE = CLOUD_STORAGE__STORAGE_TYPE;

	/**
	 * The number of structural features of the '<em>Blob Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE_FEATURE_COUNT = CLOUD_STORAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CostImpl <em>Cost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CostImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCost()
	 * @generated
	 */
	int COST = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__UNIT = 3;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__PERIOD = 4;

	/**
	 * The feature id for the '<em><b>Associated To Cloud Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__ASSOCIATED_TO_CLOUD_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Defined On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__DEFINED_ON = 6;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__LOWER_BOUND = 7;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__UPPER_BOUND = 8;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__REGION = 9;

	/**
	 * The number of structural features of the '<em>Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.FreeQuotaImpl <em>Free Quota</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.FreeQuotaImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getFreeQuota()
	 * @generated
	 */
	int FREE_QUOTA = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_QUOTA__ID = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_QUOTA__UNIT = 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_QUOTA__AMOUNT = 2;

	/**
	 * The feature id for the '<em><b>Associated To Cloud Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_QUOTA__ASSOCIATED_TO_CLOUD_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Defined On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_QUOTA__DEFINED_ON = 4;

	/**
	 * The number of structural features of the '<em>Free Quota</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_QUOTA_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.ScalingRuleImpl <em>Scaling Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.ScalingRuleImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getScalingRule()
	 * @generated
	 */
	int SCALING_RULE = 41;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_RULE__ID = 0;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_RULE__METRIC = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_RULE__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_RULE__OPERATOR = 3;

	/**
	 * The number of structural features of the '<em>Scaling Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_RULE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.AllocationImpl <em>Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.AllocationImpl
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getAllocation()
	 * @generated
	 */
	int ALLOCATION = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__PERIOD = 1;

	/**
	 * The feature id for the '<em><b>Number Of Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__NUMBER_OF_INSTANCES = 2;

	/**
	 * The number of structural features of the '<em>Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResourceType <em>Virtual HW Resource Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResourceType
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getVirtualHWResourceType()
	 * @generated
	 */
	int VIRTUAL_HW_RESOURCE_TYPE = 43;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudResourceType <em>Resource Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudResourceType
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCloudResourceType()
	 * @generated
	 */
	int CLOUD_RESOURCE_TYPE = 44;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudPlatformType <em>Platform Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPlatformType
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCloudPlatformType()
	 * @generated
	 */
	int CLOUD_PLATFORM_TYPE = 45;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.DatabaseType <em>Database Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.DatabaseType
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getDatabaseType()
	 * @generated
	 */
	int DATABASE_TYPE = 46;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudStorageType <em>Storage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudStorageType
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCloudStorageType()
	 * @generated
	 */
	int CLOUD_STORAGE_TYPE = 47;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.OSType <em>OS Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.OSType
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getOSType()
	 * @generated
	 */
	int OS_TYPE = 48;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.CostUnitType <em>Cost Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CostUnitType
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCostUnitType()
	 * @generated
	 */
	int COST_UNIT_TYPE = 49;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingMetricType <em>Scaling Metric Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ScalingMetricType
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getScalingMetricType()
	 * @generated
	 */
	int SCALING_METRIC_TYPE = 50;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingOperatorType <em>Scaling Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ScalingOperatorType
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getScalingOperatorType()
	 * @generated
	 */
	int SCALING_OPERATOR_TYPE = 51;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElementType <em>Element Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudElementType
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCloudElementType()
	 * @generated
	 */
	int CLOUD_ELEMENT_TYPE = 52;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingType <em>Scaling Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ScalingType
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getScalingType()
	 * @generated
	 */
	int SCALING_TYPE = 53;

	/**
	 * The meta object id for the '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudSoftwareType <em>Software Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudSoftwareType
	 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCloudSoftwareType()
	 * @generated
	 */
	int CLOUD_SOFTWARE_TYPE = 54;


	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Provider
	 * @generated
	 */
	EClass getProvider();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.Provider#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Provider#getId()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.Provider#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Provider#getName()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_Name();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudProvider
	 * @generated
	 */
	EClass getCloudProvider();

	/**
	 * Returns the meta object for the reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudProvider#getProvidesCloudService <em>Provides Cloud Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provides Cloud Service</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudProvider#getProvidesCloudService()
	 * @see #getCloudProvider()
	 * @generated
	 */
	EReference getCloudProvider_ProvidesCloudService();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudService
	 * @generated
	 */
	EClass getCloudService();

	/**
	 * Returns the meta object for the reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudService#getHasSLA <em>Has SLA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has SLA</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudService#getHasSLA()
	 * @see #getCloudService()
	 * @generated
	 */
	EReference getCloudService_HasSLA();

	/**
	 * Returns the meta object for the reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudService#getHasScalingPolicy <em>Has Scaling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Scaling Policy</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudService#getHasScalingPolicy()
	 * @see #getCloudService()
	 * @generated
	 */
	EReference getCloudService_HasScalingPolicy();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudService#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudService#getId()
	 * @see #getCloudService()
	 * @generated
	 */
	EAttribute getCloudService_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudService#getName()
	 * @see #getCloudService()
	 * @generated
	 */
	EAttribute getCloudService_Name();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.ApplicationServiceProvider <em>Application Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Service Provider</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ApplicationServiceProvider
	 * @generated
	 */
	EClass getApplicationServiceProvider();

	/**
	 * Returns the meta object for the reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.ApplicationServiceProvider#getProvidesCloudSoftware <em>Provides Cloud Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provides Cloud Software</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ApplicationServiceProvider#getProvidesCloudSoftware()
	 * @see #getApplicationServiceProvider()
	 * @generated
	 */
	EReference getApplicationServiceProvider_ProvidesCloudSoftware();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.CostProfile <em>Cost Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cost Profile</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CostProfile
	 * @generated
	 */
	EClass getCostProfile();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.CostProfile#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CostProfile#getId()
	 * @see #getCostProfile()
	 * @generated
	 */
	EAttribute getCostProfile_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.CostProfile#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CostProfile#getDescription()
	 * @see #getCostProfile()
	 * @generated
	 */
	EAttribute getCostProfile_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.CostProfile#getComposedOf <em>Composed Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composed Of</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CostProfile#getComposedOf()
	 * @see #getCostProfile()
	 * @generated
	 */
	EReference getCostProfile_ComposedOf();

	/**
	 * Returns the meta object for the reference '{@link it.polimi.modaclouds.resourcemodel.cloud.CostProfile#getAssociatedToCloudElement <em>Associated To Cloud Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Associated To Cloud Element</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CostProfile#getAssociatedToCloudElement()
	 * @see #getCostProfile()
	 * @generated
	 */
	EReference getCostProfile_AssociatedToCloudElement();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.ServiceLevelAgreementTemplate <em>Service Level Agreement Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Agreement Template</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ServiceLevelAgreementTemplate
	 * @generated
	 */
	EClass getServiceLevelAgreementTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.ServiceLevelAgreementTemplate#getDefinedBy <em>Defined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defined By</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ServiceLevelAgreementTemplate#getDefinedBy()
	 * @see #getServiceLevelAgreementTemplate()
	 * @generated
	 */
	EReference getServiceLevelAgreementTemplate_DefinedBy();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.ServiceLevelAgreementTemplate#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ServiceLevelAgreementTemplate#getId()
	 * @see #getServiceLevelAgreementTemplate()
	 * @generated
	 */
	EAttribute getServiceLevelAgreementTemplate_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.ServiceLevelAgreementTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ServiceLevelAgreementTemplate#getName()
	 * @see #getServiceLevelAgreementTemplate()
	 * @generated
	 */
	EAttribute getServiceLevelAgreementTemplate_Name();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.Requirement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Requirement#getId()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.Requirement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Requirement#getName()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.Requirement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Requirement#getDescription()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Description();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingPolicy <em>Scaling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scaling Policy</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ScalingPolicy
	 * @generated
	 */
	EClass getScalingPolicy();

	/**
	 * Returns the meta object for the reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingPolicy#getDefinedOn <em>Defined On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Defined On</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ScalingPolicy#getDefinedOn()
	 * @see #getScalingPolicy()
	 * @generated
	 */
	EReference getScalingPolicy_DefinedOn();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingPolicy#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ScalingPolicy#getId()
	 * @see #getScalingPolicy()
	 * @generated
	 */
	EAttribute getScalingPolicy_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingPolicy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ScalingPolicy#getName()
	 * @see #getScalingPolicy()
	 * @generated
	 */
	EAttribute getScalingPolicy_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingPolicy#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ScalingPolicy#getAction()
	 * @see #getScalingPolicy()
	 * @generated
	 */
	EAttribute getScalingPolicy_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingPolicy#getComposedOf <em>Composed Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composed Of</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ScalingPolicy#getComposedOf()
	 * @see #getScalingPolicy()
	 * @generated
	 */
	EReference getScalingPolicy_ComposedOf();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.ResourcePool <em>Resource Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Pool</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ResourcePool
	 * @generated
	 */
	EClass getResourcePool();

	/**
	 * Returns the meta object for the containment reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.ResourcePool#getComposedOf <em>Composed Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composed Of</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ResourcePool#getComposedOf()
	 * @see #getResourcePool()
	 * @generated
	 */
	EReference getResourcePool_ComposedOf();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.ResourcePool#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ResourcePool#getId()
	 * @see #getResourcePool()
	 * @generated
	 */
	EAttribute getResourcePool_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.ResourcePool#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ResourcePool#getName()
	 * @see #getResourcePool()
	 * @generated
	 */
	EAttribute getResourcePool_Name();

	/**
	 * Returns the meta object for the reference '{@link it.polimi.modaclouds.resourcemodel.cloud.ResourcePool#getHasAllocationProfile <em>Has Allocation Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Allocation Profile</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ResourcePool#getHasAllocationProfile()
	 * @see #getResourcePool()
	 * @generated
	 */
	EReference getResourcePool_HasAllocationProfile();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.IaaS_Service <em>Iaa SService</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iaa SService</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.IaaS_Service
	 * @generated
	 */
	EClass getIaaS_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.IaaS_Service#getComposedOf <em>Composed Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composed Of</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.IaaS_Service#getComposedOf()
	 * @see #getIaaS_Service()
	 * @generated
	 */
	EReference getIaaS_Service_ComposedOf();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.PaaS_Service <em>Paa SService</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paa SService</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.PaaS_Service
	 * @generated
	 */
	EClass getPaaS_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.PaaS_Service#getComposedOf <em>Composed Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composed Of</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.PaaS_Service#getComposedOf()
	 * @see #getPaaS_Service()
	 * @generated
	 */
	EReference getPaaS_Service_ComposedOf();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.SaaS_Service <em>Saa SService</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Saa SService</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.SaaS_Service
	 * @generated
	 */
	EClass getSaaS_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.SaaS_Service#getComposedOf <em>Composed Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composed Of</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.SaaS_Service#getComposedOf()
	 * @see #getSaaS_Service()
	 * @generated
	 */
	EReference getSaaS_Service_ComposedOf();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudResource
	 * @generated
	 */
	EClass getCloudResource();

	/**
	 * Returns the meta object for the reference '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudResource#getInLocation <em>In Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Location</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudResource#getInLocation()
	 * @see #getCloudResource()
	 * @generated
	 */
	EReference getCloudResource_InLocation();

	/**
	 * Returns the meta object for the reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudResource#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudResource#getFrom()
	 * @see #getCloudResource()
	 * @generated
	 */
	EReference getCloudResource_From();

	/**
	 * Returns the meta object for the containment reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudResource#getComposedOf <em>Composed Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composed Of</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudResource#getComposedOf()
	 * @see #getCloudResource()
	 * @generated
	 */
	EReference getCloudResource_ComposedOf();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudResource#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Type</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudResource#getResourceType()
	 * @see #getCloudResource()
	 * @generated
	 */
	EAttribute getCloudResource_ResourceType();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform
	 * @generated
	 */
	EClass getCloudPlatform();

	/**
	 * Returns the meta object for the reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform#getRunsOnCloudResource <em>Runs On Cloud Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Runs On Cloud Resource</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform#getRunsOnCloudResource()
	 * @see #getCloudPlatform()
	 * @generated
	 */
	EReference getCloudPlatform_RunsOnCloudResource();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform#getPlatformType <em>Platform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform Type</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform#getPlatformType()
	 * @see #getCloudPlatform()
	 * @generated
	 */
	EAttribute getCloudPlatform_PlatformType();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform#getLanguage()
	 * @see #getCloudPlatform()
	 * @generated
	 */
	EAttribute getCloudPlatform_Language();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technology</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform#getTechnology()
	 * @see #getCloudPlatform()
	 * @generated
	 */
	EAttribute getCloudPlatform_Technology();

	/**
	 * Returns the meta object for the reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform#getRunsOnResourcePool <em>Runs On Resource Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Runs On Resource Pool</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform#getRunsOnResourcePool()
	 * @see #getCloudPlatform()
	 * @generated
	 */
	EReference getCloudPlatform_RunsOnResourcePool();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudSoftware <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudSoftware
	 * @generated
	 */
	EClass getCloudSoftware();

	/**
	 * Returns the meta object for the reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudSoftware#getDeployedOnCloudPlatform <em>Deployed On Cloud Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deployed On Cloud Platform</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudSoftware#getDeployedOnCloudPlatform()
	 * @see #getCloudSoftware()
	 * @generated
	 */
	EReference getCloudSoftware_DeployedOnCloudPlatform();

	/**
	 * Returns the meta object for the reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudSoftware#getRunsOnCloudResource <em>Runs On Cloud Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Runs On Cloud Resource</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudSoftware#getRunsOnCloudResource()
	 * @see #getCloudSoftware()
	 * @generated
	 */
	EReference getCloudSoftware_RunsOnCloudResource();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudSoftware#getSoftwareType <em>Software Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Software Type</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudSoftware#getSoftwareType()
	 * @see #getCloudSoftware()
	 * @generated
	 */
	EAttribute getCloudSoftware_SoftwareType();

	/**
	 * Returns the meta object for the reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudSoftware#getRunsOnResourcePool <em>Runs On Resource Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Runs On Resource Pool</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudSoftware#getRunsOnResourcePool()
	 * @see #getCloudSoftware()
	 * @generated
	 */
	EReference getCloudSoftware_RunsOnResourcePool();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.Backend <em>Backend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Backend</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Backend
	 * @generated
	 */
	EClass getBackend();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.Middleware <em>Middleware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Middleware</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Middleware
	 * @generated
	 */
	EClass getMiddleware();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.Frontend <em>Frontend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frontend</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Frontend
	 * @generated
	 */
	EClass getFrontend();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.Location#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Location#getId()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.Location#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Location#getName()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Name();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.SubRegion <em>Sub Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Region</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.SubRegion
	 * @generated
	 */
	EClass getSubRegion();

	/**
	 * Returns the meta object for the reference '{@link it.polimi.modaclouds.resourcemodel.cloud.SubRegion#getInRegion <em>In Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Region</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.SubRegion#getInRegion()
	 * @see #getSubRegion()
	 * @generated
	 */
	EReference getSubRegion_InRegion();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.VirtualArea <em>Virtual Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Area</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.VirtualArea
	 * @generated
	 */
	EClass getVirtualArea();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.REST_Software <em>REST Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REST Software</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.REST_Software
	 * @generated
	 */
	EClass getREST_Software();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.SOAP_Software <em>SOAP Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SOAP Software</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.SOAP_Software
	 * @generated
	 */
	EClass getSOAP_Software();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link it.polimi.modaclouds.resourcemodel.cloud.Link#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Link#getTo()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_To();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.Link#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Link#getId()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.Link#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Link#getName()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.Link#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latency</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Link#getLatency()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Latency();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.Link#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Link#getThroughput()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Throughput();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.Link#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Link#getCost()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Cost();

	/**
	 * Returns the meta object for the reference '{@link it.polimi.modaclouds.resourcemodel.cloud.Link#getReverseLinkToB <em>Reverse Link To B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reverse Link To B</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Link#getReverseLinkToB()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_ReverseLinkToB();

	/**
	 * Returns the meta object for the reference '{@link it.polimi.modaclouds.resourcemodel.cloud.Link#getReverseLinkToA <em>Reverse Link To A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reverse Link To A</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Link#getReverseLinkToA()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_ReverseLinkToA();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.AllocationProfile <em>Allocation Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation Profile</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.AllocationProfile
	 * @generated
	 */
	EClass getAllocationProfile();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.AllocationProfile#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.AllocationProfile#getId()
	 * @see #getAllocationProfile()
	 * @generated
	 */
	EAttribute getAllocationProfile_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.AllocationProfile#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.AllocationProfile#getDescription()
	 * @see #getAllocationProfile()
	 * @generated
	 */
	EAttribute getAllocationProfile_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.AllocationProfile#getComposedOf <em>Composed Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composed Of</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.AllocationProfile#getComposedOf()
	 * @see #getAllocationProfile()
	 * @generated
	 */
	EReference getAllocationProfile_ComposedOf();

	/**
	 * Returns the meta object for the reference '{@link it.polimi.modaclouds.resourcemodel.cloud.AllocationProfile#getRelatedToResourcePool <em>Related To Resource Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related To Resource Pool</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.AllocationProfile#getRelatedToResourcePool()
	 * @see #getAllocationProfile()
	 * @generated
	 */
	EReference getAllocationProfile_RelatedToResourcePool();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource <em>Virtual HW Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual HW Resource</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource
	 * @generated
	 */
	EClass getVirtualHWResource();

	/**
	 * Returns the meta object for the reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource#getHas()
	 * @see #getVirtualHWResource()
	 * @generated
	 */
	EReference getVirtualHWResource_Has();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource#getId()
	 * @see #getVirtualHWResource()
	 * @generated
	 */
	EAttribute getVirtualHWResource_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource#getType()
	 * @see #getVirtualHWResource()
	 * @generated
	 */
	EAttribute getVirtualHWResource_Type();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource#getProcessingRate <em>Processing Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processing Rate</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource#getProcessingRate()
	 * @see #getVirtualHWResource()
	 * @generated
	 */
	EAttribute getVirtualHWResource_ProcessingRate();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource#getNumberOfReplicas <em>Number Of Replicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Replicas</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource#getNumberOfReplicas()
	 * @see #getVirtualHWResource()
	 * @generated
	 */
	EAttribute getVirtualHWResource_NumberOfReplicas();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.V_CPU <em>VCPU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VCPU</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.V_CPU
	 * @generated
	 */
	EClass getV_CPU();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.V_Memory <em>VMemory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VMemory</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.V_Memory
	 * @generated
	 */
	EClass getV_Memory();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.V_Memory#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.V_Memory#getSize()
	 * @see #getV_Memory()
	 * @generated
	 */
	EAttribute getV_Memory_Size();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.V_Storage <em>VStorage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VStorage</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.V_Storage
	 * @generated
	 */
	EClass getV_Storage();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.V_Storage#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.V_Storage#getSize()
	 * @see #getV_Storage()
	 * @generated
	 */
	EAttribute getV_Storage_Size();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.EfficiencyProfile <em>Efficiency Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Efficiency Profile</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.EfficiencyProfile
	 * @generated
	 */
	EClass getEfficiencyProfile();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.EfficiencyProfile#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.EfficiencyProfile#getId()
	 * @see #getEfficiencyProfile()
	 * @generated
	 */
	EAttribute getEfficiencyProfile_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.EfficiencyProfile#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.EfficiencyProfile#getPeriod()
	 * @see #getEfficiencyProfile()
	 * @generated
	 */
	EAttribute getEfficiencyProfile_Period();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.EfficiencyProfile#getEfficiency <em>Efficiency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Efficiency</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.EfficiencyProfile#getEfficiency()
	 * @see #getEfficiencyProfile()
	 * @generated
	 */
	EAttribute getEfficiencyProfile_Efficiency();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.Compute <em>Compute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compute</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Compute
	 * @generated
	 */
	EClass getCompute();

	/**
	 * Returns the meta object for the reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.Compute#getUsesCloudStorage <em>Uses Cloud Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Cloud Storage</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Compute#getUsesCloudStorage()
	 * @see #getCompute()
	 * @generated
	 */
	EReference getCompute_UsesCloudStorage();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.Compute#getOS <em>OS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OS</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Compute#getOS()
	 * @see #getCompute()
	 * @generated
	 */
	EAttribute getCompute_OS();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudStorage
	 * @generated
	 */
	EClass getCloudStorage();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudStorage#getStorageType <em>Storage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Type</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudStorage#getStorageType()
	 * @see #getCloudStorage()
	 * @generated
	 */
	EAttribute getCloudStorage_StorageType();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.Database#getUsesCloudStorage <em>Uses Cloud Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses Cloud Storage</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Database#getUsesCloudStorage()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_UsesCloudStorage();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.Database#getDBType <em>DB Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DB Type</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Database#getDBType()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_DBType();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.RelationalDB <em>Relational DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational DB</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.RelationalDB
	 * @generated
	 */
	EClass getRelationalDB();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.NoSQL_DB <em>No SQL DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No SQL DB</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.NoSQL_DB
	 * @generated
	 */
	EClass getNoSQL_DB();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.FilesystemStorage <em>Filesystem Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filesystem Storage</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.FilesystemStorage
	 * @generated
	 */
	EClass getFilesystemStorage();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.BlobStorage <em>Blob Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blob Storage</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.BlobStorage
	 * @generated
	 */
	EClass getBlobStorage();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.Cost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cost</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Cost
	 * @generated
	 */
	EClass getCost();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Cost#getId()
	 * @see #getCost()
	 * @generated
	 */
	EAttribute getCost_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Cost#getDescription()
	 * @see #getCost()
	 * @generated
	 */
	EAttribute getCost_Description();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Cost#getValue()
	 * @see #getCost()
	 * @generated
	 */
	EAttribute getCost_Value();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Cost#getUnit()
	 * @see #getCost()
	 * @generated
	 */
	EAttribute getCost_Unit();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Cost#getPeriod()
	 * @see #getCost()
	 * @generated
	 */
	EAttribute getCost_Period();

	/**
	 * Returns the meta object for the reference '{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getAssociatedToCloudElement <em>Associated To Cloud Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Associated To Cloud Element</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Cost#getAssociatedToCloudElement()
	 * @see #getCost()
	 * @generated
	 */
	EReference getCost_AssociatedToCloudElement();

	/**
	 * Returns the meta object for the reference '{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getDefinedOn <em>Defined On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Defined On</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Cost#getDefinedOn()
	 * @see #getCost()
	 * @generated
	 */
	EReference getCost_DefinedOn();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Cost#getLowerBound()
	 * @see #getCost()
	 * @generated
	 */
	EAttribute getCost_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Cost#getUpperBound()
	 * @see #getCost()
	 * @generated
	 */
	EAttribute getCost_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Cost#getRegion()
	 * @see #getCost()
	 * @generated
	 */
	EAttribute getCost_Region();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.FreeQuota <em>Free Quota</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Free Quota</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.FreeQuota
	 * @generated
	 */
	EClass getFreeQuota();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.FreeQuota#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.FreeQuota#getId()
	 * @see #getFreeQuota()
	 * @generated
	 */
	EAttribute getFreeQuota_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.FreeQuota#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.FreeQuota#getUnit()
	 * @see #getFreeQuota()
	 * @generated
	 */
	EAttribute getFreeQuota_Unit();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.FreeQuota#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.FreeQuota#getAmount()
	 * @see #getFreeQuota()
	 * @generated
	 */
	EAttribute getFreeQuota_Amount();

	/**
	 * Returns the meta object for the reference '{@link it.polimi.modaclouds.resourcemodel.cloud.FreeQuota#getAssociatedToCloudElement <em>Associated To Cloud Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Associated To Cloud Element</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.FreeQuota#getAssociatedToCloudElement()
	 * @see #getFreeQuota()
	 * @generated
	 */
	EReference getFreeQuota_AssociatedToCloudElement();

	/**
	 * Returns the meta object for the reference '{@link it.polimi.modaclouds.resourcemodel.cloud.FreeQuota#getDefinedOn <em>Defined On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Defined On</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.FreeQuota#getDefinedOn()
	 * @see #getFreeQuota()
	 * @generated
	 */
	EReference getFreeQuota_DefinedOn();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudElement
	 * @generated
	 */
	EClass getCloudElement();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getId()
	 * @see #getCloudElement()
	 * @generated
	 */
	EAttribute getCloudElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getName()
	 * @see #getCloudElement()
	 * @generated
	 */
	EAttribute getCloudElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getType()
	 * @see #getCloudElement()
	 * @generated
	 */
	EAttribute getCloudElement_Type();

	/**
	 * Returns the meta object for the reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getCloudElementA <em>Cloud Element A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cloud Element A</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getCloudElementA()
	 * @see #getCloudElement()
	 * @generated
	 */
	EReference getCloudElement_CloudElementA();

	/**
	 * Returns the meta object for the reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getCloudElementB <em>Cloud Element B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cloud Element B</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getCloudElementB()
	 * @see #getCloudElement()
	 * @generated
	 */
	EReference getCloudElement_CloudElementB();

	/**
	 * Returns the meta object for the reference '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getHasCostProfile <em>Has Cost Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Cost Profile</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getHasCostProfile()
	 * @see #getCloudElement()
	 * @generated
	 */
	EReference getCloudElement_HasCostProfile();

	/**
	 * Returns the meta object for the reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getHasCost <em>Has Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Cost</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getHasCost()
	 * @see #getCloudElement()
	 * @generated
	 */
	EReference getCloudElement_HasCost();

	/**
	 * Returns the meta object for the reference list '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getHasFreeQuota <em>Has Free Quota</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Free Quota</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getHasFreeQuota()
	 * @see #getCloudElement()
	 * @generated
	 */
	EReference getCloudElement_HasFreeQuota();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingRule <em>Scaling Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scaling Rule</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ScalingRule
	 * @generated
	 */
	EClass getScalingRule();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingRule#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ScalingRule#getId()
	 * @see #getScalingRule()
	 * @generated
	 */
	EAttribute getScalingRule_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingRule#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ScalingRule#getMetric()
	 * @see #getScalingRule()
	 * @generated
	 */
	EAttribute getScalingRule_Metric();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingRule#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ScalingRule#getValue()
	 * @see #getScalingRule()
	 * @generated
	 */
	EAttribute getScalingRule_Value();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingRule#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ScalingRule#getOperator()
	 * @see #getScalingRule()
	 * @generated
	 */
	EAttribute getScalingRule_Operator();

	/**
	 * Returns the meta object for class '{@link it.polimi.modaclouds.resourcemodel.cloud.Allocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Allocation
	 * @generated
	 */
	EClass getAllocation();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.Allocation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Allocation#getId()
	 * @see #getAllocation()
	 * @generated
	 */
	EAttribute getAllocation_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.Allocation#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Allocation#getPeriod()
	 * @see #getAllocation()
	 * @generated
	 */
	EAttribute getAllocation_Period();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.modaclouds.resourcemodel.cloud.Allocation#getNumberOfInstances <em>Number Of Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Instances</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.Allocation#getNumberOfInstances()
	 * @see #getAllocation()
	 * @generated
	 */
	EAttribute getAllocation_NumberOfInstances();

	/**
	 * Returns the meta object for enum '{@link it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResourceType <em>Virtual HW Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Virtual HW Resource Type</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResourceType
	 * @generated
	 */
	EEnum getVirtualHWResourceType();

	/**
	 * Returns the meta object for enum '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Type</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudResourceType
	 * @generated
	 */
	EEnum getCloudResourceType();

	/**
	 * Returns the meta object for enum '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudPlatformType <em>Platform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Platform Type</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPlatformType
	 * @generated
	 */
	EEnum getCloudPlatformType();

	/**
	 * Returns the meta object for enum '{@link it.polimi.modaclouds.resourcemodel.cloud.DatabaseType <em>Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Database Type</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.DatabaseType
	 * @generated
	 */
	EEnum getDatabaseType();

	/**
	 * Returns the meta object for enum '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudStorageType <em>Storage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Storage Type</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudStorageType
	 * @generated
	 */
	EEnum getCloudStorageType();

	/**
	 * Returns the meta object for enum '{@link it.polimi.modaclouds.resourcemodel.cloud.OSType <em>OS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OS Type</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.OSType
	 * @generated
	 */
	EEnum getOSType();

	/**
	 * Returns the meta object for enum '{@link it.polimi.modaclouds.resourcemodel.cloud.CostUnitType <em>Cost Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cost Unit Type</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CostUnitType
	 * @generated
	 */
	EEnum getCostUnitType();

	/**
	 * Returns the meta object for enum '{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingMetricType <em>Scaling Metric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scaling Metric Type</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ScalingMetricType
	 * @generated
	 */
	EEnum getScalingMetricType();

	/**
	 * Returns the meta object for enum '{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingOperatorType <em>Scaling Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scaling Operator Type</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ScalingOperatorType
	 * @generated
	 */
	EEnum getScalingOperatorType();

	/**
	 * Returns the meta object for enum '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Type</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudElementType
	 * @generated
	 */
	EEnum getCloudElementType();

	/**
	 * Returns the meta object for enum '{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingType <em>Scaling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scaling Type</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ScalingType
	 * @generated
	 */
	EEnum getScalingType();

	/**
	 * Returns the meta object for enum '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudSoftwareType <em>Software Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Software Type</em>'.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudSoftwareType
	 * @generated
	 */
	EEnum getCloudSoftwareType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CloudFactory getCloudFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.ProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.ProviderImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getProvider()
		 * @generated
		 */
		EClass PROVIDER = eINSTANCE.getProvider();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__ID = eINSTANCE.getProvider_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__NAME = eINSTANCE.getProvider_Name();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudProviderImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCloudProvider()
		 * @generated
		 */
		EClass CLOUD_PROVIDER = eINSTANCE.getCloudProvider();

		/**
		 * The meta object literal for the '<em><b>Provides Cloud Service</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_PROVIDER__PROVIDES_CLOUD_SERVICE = eINSTANCE.getCloudProvider_ProvidesCloudService();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudServiceImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCloudService()
		 * @generated
		 */
		EClass CLOUD_SERVICE = eINSTANCE.getCloudService();

		/**
		 * The meta object literal for the '<em><b>Has SLA</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_SERVICE__HAS_SLA = eINSTANCE.getCloudService_HasSLA();

		/**
		 * The meta object literal for the '<em><b>Has Scaling Policy</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_SERVICE__HAS_SCALING_POLICY = eINSTANCE.getCloudService_HasScalingPolicy();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_SERVICE__ID = eINSTANCE.getCloudService_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_SERVICE__NAME = eINSTANCE.getCloudService_Name();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.ApplicationServiceProviderImpl <em>Application Service Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.ApplicationServiceProviderImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getApplicationServiceProvider()
		 * @generated
		 */
		EClass APPLICATION_SERVICE_PROVIDER = eINSTANCE.getApplicationServiceProvider();

		/**
		 * The meta object literal for the '<em><b>Provides Cloud Software</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_SERVICE_PROVIDER__PROVIDES_CLOUD_SOFTWARE = eINSTANCE.getApplicationServiceProvider_ProvidesCloudSoftware();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CostProfileImpl <em>Cost Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CostProfileImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCostProfile()
		 * @generated
		 */
		EClass COST_PROFILE = eINSTANCE.getCostProfile();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_PROFILE__ID = eINSTANCE.getCostProfile_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST_PROFILE__DESCRIPTION = eINSTANCE.getCostProfile_Description();

		/**
		 * The meta object literal for the '<em><b>Composed Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_PROFILE__COMPOSED_OF = eINSTANCE.getCostProfile_ComposedOf();

		/**
		 * The meta object literal for the '<em><b>Associated To Cloud Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST_PROFILE__ASSOCIATED_TO_CLOUD_ELEMENT = eINSTANCE.getCostProfile_AssociatedToCloudElement();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.ServiceLevelAgreementTemplateImpl <em>Service Level Agreement Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.ServiceLevelAgreementTemplateImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getServiceLevelAgreementTemplate()
		 * @generated
		 */
		EClass SERVICE_LEVEL_AGREEMENT_TEMPLATE = eINSTANCE.getServiceLevelAgreementTemplate();

		/**
		 * The meta object literal for the '<em><b>Defined By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_AGREEMENT_TEMPLATE__DEFINED_BY = eINSTANCE.getServiceLevelAgreementTemplate_DefinedBy();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_AGREEMENT_TEMPLATE__ID = eINSTANCE.getServiceLevelAgreementTemplate_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_AGREEMENT_TEMPLATE__NAME = eINSTANCE.getServiceLevelAgreementTemplate_Name();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.RequirementImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ID = eINSTANCE.getRequirement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__NAME = eINSTANCE.getRequirement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__DESCRIPTION = eINSTANCE.getRequirement_Description();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.ScalingPolicyImpl <em>Scaling Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.ScalingPolicyImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getScalingPolicy()
		 * @generated
		 */
		EClass SCALING_POLICY = eINSTANCE.getScalingPolicy();

		/**
		 * The meta object literal for the '<em><b>Defined On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALING_POLICY__DEFINED_ON = eINSTANCE.getScalingPolicy_DefinedOn();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALING_POLICY__ID = eINSTANCE.getScalingPolicy_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALING_POLICY__NAME = eINSTANCE.getScalingPolicy_Name();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALING_POLICY__ACTION = eINSTANCE.getScalingPolicy_Action();

		/**
		 * The meta object literal for the '<em><b>Composed Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALING_POLICY__COMPOSED_OF = eINSTANCE.getScalingPolicy_ComposedOf();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.ResourcePoolImpl <em>Resource Pool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.ResourcePoolImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getResourcePool()
		 * @generated
		 */
		EClass RESOURCE_POOL = eINSTANCE.getResourcePool();

		/**
		 * The meta object literal for the '<em><b>Composed Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_POOL__COMPOSED_OF = eINSTANCE.getResourcePool_ComposedOf();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_POOL__ID = eINSTANCE.getResourcePool_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_POOL__NAME = eINSTANCE.getResourcePool_Name();

		/**
		 * The meta object literal for the '<em><b>Has Allocation Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_POOL__HAS_ALLOCATION_PROFILE = eINSTANCE.getResourcePool_HasAllocationProfile();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.IaaS_ServiceImpl <em>Iaa SService</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.IaaS_ServiceImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getIaaS_Service()
		 * @generated
		 */
		EClass IAA_SSERVICE = eINSTANCE.getIaaS_Service();

		/**
		 * The meta object literal for the '<em><b>Composed Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IAA_SSERVICE__COMPOSED_OF = eINSTANCE.getIaaS_Service_ComposedOf();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.PaaS_ServiceImpl <em>Paa SService</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.PaaS_ServiceImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getPaaS_Service()
		 * @generated
		 */
		EClass PAA_SSERVICE = eINSTANCE.getPaaS_Service();

		/**
		 * The meta object literal for the '<em><b>Composed Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAA_SSERVICE__COMPOSED_OF = eINSTANCE.getPaaS_Service_ComposedOf();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.SaaS_ServiceImpl <em>Saa SService</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.SaaS_ServiceImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getSaaS_Service()
		 * @generated
		 */
		EClass SAA_SSERVICE = eINSTANCE.getSaaS_Service();

		/**
		 * The meta object literal for the '<em><b>Composed Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAA_SSERVICE__COMPOSED_OF = eINSTANCE.getSaaS_Service_ComposedOf();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudResourceImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCloudResource()
		 * @generated
		 */
		EClass CLOUD_RESOURCE = eINSTANCE.getCloudResource();

		/**
		 * The meta object literal for the '<em><b>In Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_RESOURCE__IN_LOCATION = eINSTANCE.getCloudResource_InLocation();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_RESOURCE__FROM = eINSTANCE.getCloudResource_From();

		/**
		 * The meta object literal for the '<em><b>Composed Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_RESOURCE__COMPOSED_OF = eINSTANCE.getCloudResource_ComposedOf();

		/**
		 * The meta object literal for the '<em><b>Resource Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_RESOURCE__RESOURCE_TYPE = eINSTANCE.getCloudResource_ResourceType();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPlatformImpl <em>Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPlatformImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCloudPlatform()
		 * @generated
		 */
		EClass CLOUD_PLATFORM = eINSTANCE.getCloudPlatform();

		/**
		 * The meta object literal for the '<em><b>Runs On Cloud Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_PLATFORM__RUNS_ON_CLOUD_RESOURCE = eINSTANCE.getCloudPlatform_RunsOnCloudResource();

		/**
		 * The meta object literal for the '<em><b>Platform Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_PLATFORM__PLATFORM_TYPE = eINSTANCE.getCloudPlatform_PlatformType();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_PLATFORM__LANGUAGE = eINSTANCE.getCloudPlatform_Language();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_PLATFORM__TECHNOLOGY = eINSTANCE.getCloudPlatform_Technology();

		/**
		 * The meta object literal for the '<em><b>Runs On Resource Pool</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_PLATFORM__RUNS_ON_RESOURCE_POOL = eINSTANCE.getCloudPlatform_RunsOnResourcePool();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudSoftwareImpl <em>Software</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudSoftwareImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCloudSoftware()
		 * @generated
		 */
		EClass CLOUD_SOFTWARE = eINSTANCE.getCloudSoftware();

		/**
		 * The meta object literal for the '<em><b>Deployed On Cloud Platform</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_SOFTWARE__DEPLOYED_ON_CLOUD_PLATFORM = eINSTANCE.getCloudSoftware_DeployedOnCloudPlatform();

		/**
		 * The meta object literal for the '<em><b>Runs On Cloud Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_SOFTWARE__RUNS_ON_CLOUD_RESOURCE = eINSTANCE.getCloudSoftware_RunsOnCloudResource();

		/**
		 * The meta object literal for the '<em><b>Software Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_SOFTWARE__SOFTWARE_TYPE = eINSTANCE.getCloudSoftware_SoftwareType();

		/**
		 * The meta object literal for the '<em><b>Runs On Resource Pool</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_SOFTWARE__RUNS_ON_RESOURCE_POOL = eINSTANCE.getCloudSoftware_RunsOnResourcePool();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.BackendImpl <em>Backend</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.BackendImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getBackend()
		 * @generated
		 */
		EClass BACKEND = eINSTANCE.getBackend();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.MiddlewareImpl <em>Middleware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.MiddlewareImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getMiddleware()
		 * @generated
		 */
		EClass MIDDLEWARE = eINSTANCE.getMiddleware();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.FrontendImpl <em>Frontend</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.FrontendImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getFrontend()
		 * @generated
		 */
		EClass FRONTEND = eINSTANCE.getFrontend();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.LocationImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__ID = eINSTANCE.getLocation_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__NAME = eINSTANCE.getLocation_Name();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.RegionImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.SubRegionImpl <em>Sub Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.SubRegionImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getSubRegion()
		 * @generated
		 */
		EClass SUB_REGION = eINSTANCE.getSubRegion();

		/**
		 * The meta object literal for the '<em><b>In Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_REGION__IN_REGION = eINSTANCE.getSubRegion_InRegion();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.VirtualAreaImpl <em>Virtual Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.VirtualAreaImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getVirtualArea()
		 * @generated
		 */
		EClass VIRTUAL_AREA = eINSTANCE.getVirtualArea();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.REST_SoftwareImpl <em>REST Software</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.REST_SoftwareImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getREST_Software()
		 * @generated
		 */
		EClass REST_SOFTWARE = eINSTANCE.getREST_Software();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.SOAP_SoftwareImpl <em>SOAP Software</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.SOAP_SoftwareImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getSOAP_Software()
		 * @generated
		 */
		EClass SOAP_SOFTWARE = eINSTANCE.getSOAP_Software();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.LinkImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TO = eINSTANCE.getLink_To();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__ID = eINSTANCE.getLink_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__NAME = eINSTANCE.getLink_Name();

		/**
		 * The meta object literal for the '<em><b>Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__LATENCY = eINSTANCE.getLink_Latency();

		/**
		 * The meta object literal for the '<em><b>Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__THROUGHPUT = eINSTANCE.getLink_Throughput();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__COST = eINSTANCE.getLink_Cost();

		/**
		 * The meta object literal for the '<em><b>Reverse Link To B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__REVERSE_LINK_TO_B = eINSTANCE.getLink_ReverseLinkToB();

		/**
		 * The meta object literal for the '<em><b>Reverse Link To A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__REVERSE_LINK_TO_A = eINSTANCE.getLink_ReverseLinkToA();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.AllocationProfileImpl <em>Allocation Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.AllocationProfileImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getAllocationProfile()
		 * @generated
		 */
		EClass ALLOCATION_PROFILE = eINSTANCE.getAllocationProfile();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOCATION_PROFILE__ID = eINSTANCE.getAllocationProfile_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOCATION_PROFILE__DESCRIPTION = eINSTANCE.getAllocationProfile_Description();

		/**
		 * The meta object literal for the '<em><b>Composed Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_PROFILE__COMPOSED_OF = eINSTANCE.getAllocationProfile_ComposedOf();

		/**
		 * The meta object literal for the '<em><b>Related To Resource Pool</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_PROFILE__RELATED_TO_RESOURCE_POOL = eINSTANCE.getAllocationProfile_RelatedToResourcePool();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.VirtualHWResourceImpl <em>Virtual HW Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.VirtualHWResourceImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getVirtualHWResource()
		 * @generated
		 */
		EClass VIRTUAL_HW_RESOURCE = eINSTANCE.getVirtualHWResource();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_HW_RESOURCE__HAS = eINSTANCE.getVirtualHWResource_Has();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_HW_RESOURCE__ID = eINSTANCE.getVirtualHWResource_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_HW_RESOURCE__TYPE = eINSTANCE.getVirtualHWResource_Type();

		/**
		 * The meta object literal for the '<em><b>Processing Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_HW_RESOURCE__PROCESSING_RATE = eINSTANCE.getVirtualHWResource_ProcessingRate();

		/**
		 * The meta object literal for the '<em><b>Number Of Replicas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_HW_RESOURCE__NUMBER_OF_REPLICAS = eINSTANCE.getVirtualHWResource_NumberOfReplicas();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.V_CPUImpl <em>VCPU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.V_CPUImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getV_CPU()
		 * @generated
		 */
		EClass VCPU = eINSTANCE.getV_CPU();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.V_MemoryImpl <em>VMemory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.V_MemoryImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getV_Memory()
		 * @generated
		 */
		EClass VMEMORY = eINSTANCE.getV_Memory();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VMEMORY__SIZE = eINSTANCE.getV_Memory_Size();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.V_StorageImpl <em>VStorage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.V_StorageImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getV_Storage()
		 * @generated
		 */
		EClass VSTORAGE = eINSTANCE.getV_Storage();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSTORAGE__SIZE = eINSTANCE.getV_Storage_Size();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.EfficiencyProfileImpl <em>Efficiency Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.EfficiencyProfileImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getEfficiencyProfile()
		 * @generated
		 */
		EClass EFFICIENCY_PROFILE = eINSTANCE.getEfficiencyProfile();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFICIENCY_PROFILE__ID = eINSTANCE.getEfficiencyProfile_Id();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFICIENCY_PROFILE__PERIOD = eINSTANCE.getEfficiencyProfile_Period();

		/**
		 * The meta object literal for the '<em><b>Efficiency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFICIENCY_PROFILE__EFFICIENCY = eINSTANCE.getEfficiencyProfile_Efficiency();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.ComputeImpl <em>Compute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.ComputeImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCompute()
		 * @generated
		 */
		EClass COMPUTE = eINSTANCE.getCompute();

		/**
		 * The meta object literal for the '<em><b>Uses Cloud Storage</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTE__USES_CLOUD_STORAGE = eINSTANCE.getCompute_UsesCloudStorage();

		/**
		 * The meta object literal for the '<em><b>OS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTE__OS = eINSTANCE.getCompute_OS();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudStorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudStorageImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCloudStorage()
		 * @generated
		 */
		EClass CLOUD_STORAGE = eINSTANCE.getCloudStorage();

		/**
		 * The meta object literal for the '<em><b>Storage Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_STORAGE__STORAGE_TYPE = eINSTANCE.getCloudStorage_StorageType();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.DatabaseImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Uses Cloud Storage</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__USES_CLOUD_STORAGE = eINSTANCE.getDatabase_UsesCloudStorage();

		/**
		 * The meta object literal for the '<em><b>DB Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__DB_TYPE = eINSTANCE.getDatabase_DBType();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.RelationalDBImpl <em>Relational DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.RelationalDBImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getRelationalDB()
		 * @generated
		 */
		EClass RELATIONAL_DB = eINSTANCE.getRelationalDB();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.NoSQL_DBImpl <em>No SQL DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.NoSQL_DBImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getNoSQL_DB()
		 * @generated
		 */
		EClass NO_SQL_DB = eINSTANCE.getNoSQL_DB();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.FilesystemStorageImpl <em>Filesystem Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.FilesystemStorageImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getFilesystemStorage()
		 * @generated
		 */
		EClass FILESYSTEM_STORAGE = eINSTANCE.getFilesystemStorage();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.BlobStorageImpl <em>Blob Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.BlobStorageImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getBlobStorage()
		 * @generated
		 */
		EClass BLOB_STORAGE = eINSTANCE.getBlobStorage();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CostImpl <em>Cost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CostImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCost()
		 * @generated
		 */
		EClass COST = eINSTANCE.getCost();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST__ID = eINSTANCE.getCost_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST__DESCRIPTION = eINSTANCE.getCost_Description();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST__VALUE = eINSTANCE.getCost_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST__UNIT = eINSTANCE.getCost_Unit();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST__PERIOD = eINSTANCE.getCost_Period();

		/**
		 * The meta object literal for the '<em><b>Associated To Cloud Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST__ASSOCIATED_TO_CLOUD_ELEMENT = eINSTANCE.getCost_AssociatedToCloudElement();

		/**
		 * The meta object literal for the '<em><b>Defined On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COST__DEFINED_ON = eINSTANCE.getCost_DefinedOn();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST__LOWER_BOUND = eINSTANCE.getCost_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST__UPPER_BOUND = eINSTANCE.getCost_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST__REGION = eINSTANCE.getCost_Region();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.FreeQuotaImpl <em>Free Quota</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.FreeQuotaImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getFreeQuota()
		 * @generated
		 */
		EClass FREE_QUOTA = eINSTANCE.getFreeQuota();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREE_QUOTA__ID = eINSTANCE.getFreeQuota_Id();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREE_QUOTA__UNIT = eINSTANCE.getFreeQuota_Unit();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREE_QUOTA__AMOUNT = eINSTANCE.getFreeQuota_Amount();

		/**
		 * The meta object literal for the '<em><b>Associated To Cloud Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREE_QUOTA__ASSOCIATED_TO_CLOUD_ELEMENT = eINSTANCE.getFreeQuota_AssociatedToCloudElement();

		/**
		 * The meta object literal for the '<em><b>Defined On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREE_QUOTA__DEFINED_ON = eINSTANCE.getFreeQuota_DefinedOn();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CloudElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudElementImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCloudElement()
		 * @generated
		 */
		EClass CLOUD_ELEMENT = eINSTANCE.getCloudElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_ELEMENT__ID = eINSTANCE.getCloudElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_ELEMENT__NAME = eINSTANCE.getCloudElement_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_ELEMENT__TYPE = eINSTANCE.getCloudElement_Type();

		/**
		 * The meta object literal for the '<em><b>Cloud Element A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_ELEMENT__CLOUD_ELEMENT_A = eINSTANCE.getCloudElement_CloudElementA();

		/**
		 * The meta object literal for the '<em><b>Cloud Element B</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_ELEMENT__CLOUD_ELEMENT_B = eINSTANCE.getCloudElement_CloudElementB();

		/**
		 * The meta object literal for the '<em><b>Has Cost Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_ELEMENT__HAS_COST_PROFILE = eINSTANCE.getCloudElement_HasCostProfile();

		/**
		 * The meta object literal for the '<em><b>Has Cost</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_ELEMENT__HAS_COST = eINSTANCE.getCloudElement_HasCost();

		/**
		 * The meta object literal for the '<em><b>Has Free Quota</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_ELEMENT__HAS_FREE_QUOTA = eINSTANCE.getCloudElement_HasFreeQuota();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.ScalingRuleImpl <em>Scaling Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.ScalingRuleImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getScalingRule()
		 * @generated
		 */
		EClass SCALING_RULE = eINSTANCE.getScalingRule();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALING_RULE__ID = eINSTANCE.getScalingRule_Id();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALING_RULE__METRIC = eINSTANCE.getScalingRule_Metric();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALING_RULE__VALUE = eINSTANCE.getScalingRule_Value();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALING_RULE__OPERATOR = eINSTANCE.getScalingRule_Operator();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.impl.AllocationImpl <em>Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.AllocationImpl
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getAllocation()
		 * @generated
		 */
		EClass ALLOCATION = eINSTANCE.getAllocation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOCATION__ID = eINSTANCE.getAllocation_Id();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOCATION__PERIOD = eINSTANCE.getAllocation_Period();

		/**
		 * The meta object literal for the '<em><b>Number Of Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOCATION__NUMBER_OF_INSTANCES = eINSTANCE.getAllocation_NumberOfInstances();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResourceType <em>Virtual HW Resource Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResourceType
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getVirtualHWResourceType()
		 * @generated
		 */
		EEnum VIRTUAL_HW_RESOURCE_TYPE = eINSTANCE.getVirtualHWResourceType();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudResourceType <em>Resource Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudResourceType
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCloudResourceType()
		 * @generated
		 */
		EEnum CLOUD_RESOURCE_TYPE = eINSTANCE.getCloudResourceType();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudPlatformType <em>Platform Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPlatformType
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCloudPlatformType()
		 * @generated
		 */
		EEnum CLOUD_PLATFORM_TYPE = eINSTANCE.getCloudPlatformType();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.DatabaseType <em>Database Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.DatabaseType
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getDatabaseType()
		 * @generated
		 */
		EEnum DATABASE_TYPE = eINSTANCE.getDatabaseType();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudStorageType <em>Storage Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudStorageType
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCloudStorageType()
		 * @generated
		 */
		EEnum CLOUD_STORAGE_TYPE = eINSTANCE.getCloudStorageType();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.OSType <em>OS Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.OSType
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getOSType()
		 * @generated
		 */
		EEnum OS_TYPE = eINSTANCE.getOSType();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.CostUnitType <em>Cost Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.CostUnitType
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCostUnitType()
		 * @generated
		 */
		EEnum COST_UNIT_TYPE = eINSTANCE.getCostUnitType();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingMetricType <em>Scaling Metric Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.ScalingMetricType
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getScalingMetricType()
		 * @generated
		 */
		EEnum SCALING_METRIC_TYPE = eINSTANCE.getScalingMetricType();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingOperatorType <em>Scaling Operator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.ScalingOperatorType
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getScalingOperatorType()
		 * @generated
		 */
		EEnum SCALING_OPERATOR_TYPE = eINSTANCE.getScalingOperatorType();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElementType <em>Element Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudElementType
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCloudElementType()
		 * @generated
		 */
		EEnum CLOUD_ELEMENT_TYPE = eINSTANCE.getCloudElementType();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingType <em>Scaling Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.ScalingType
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getScalingType()
		 * @generated
		 */
		EEnum SCALING_TYPE = eINSTANCE.getScalingType();

		/**
		 * The meta object literal for the '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudSoftwareType <em>Software Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudSoftwareType
		 * @see it.polimi.modaclouds.resourcemodel.cloud.impl.CloudPackageImpl#getCloudSoftwareType()
		 * @generated
		 */
		EEnum CLOUD_SOFTWARE_TYPE = eINSTANCE.getCloudSoftwareType();

	}

} //CloudPackage
