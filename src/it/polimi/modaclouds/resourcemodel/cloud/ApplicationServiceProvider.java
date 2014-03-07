/**
 */
package it.polimi.modaclouds.resourcemodel.cloud;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Service Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.ApplicationServiceProvider#getProvidesCloudSoftware <em>Provides Cloud Software</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getApplicationServiceProvider()
 * @model
 * @generated
 */
public interface ApplicationServiceProvider extends Provider {
	/**
	 * Returns the value of the '<em><b>Provides Cloud Software</b></em>' reference list.
	 * The list contents are of type {@link it.polimi.modaclouds.resourcemodel.cloud.CloudSoftware}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides Cloud Software</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides Cloud Software</em>' reference list.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getApplicationServiceProvider_ProvidesCloudSoftware()
	 * @model required="true"
	 * @generated
	 */
	EList<CloudSoftware> getProvidesCloudSoftware();

} // ApplicationServiceProvider
