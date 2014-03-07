/**
 */
package it.polimi.modaclouds.resourcemodel.cloud;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paa SService</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.PaaS_Service#getComposedOf <em>Composed Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getPaaS_Service()
 * @model
 * @generated
 */
public interface PaaS_Service extends CloudService {
	/**
	 * Returns the value of the '<em><b>Composed Of</b></em>' containment reference list.
	 * The list contents are of type {@link it.polimi.modaclouds.resourcemodel.cloud.CloudPlatform}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed Of</em>' containment reference list.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getPaaS_Service_ComposedOf()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CloudPlatform> getComposedOf();

} // PaaS_Service
