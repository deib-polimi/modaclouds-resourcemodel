/**
 */
package it.polimi.modaclouds.resourcemodel.cloud;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.Database#getUsesCloudStorage <em>Uses Cloud Storage</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.Database#getDBType <em>DB Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getDatabase()
 * @model abstract="true"
 * @generated
 */
public interface Database extends CloudPlatform {
	/**
	 * Returns the value of the '<em><b>Uses Cloud Storage</b></em>' reference list.
	 * The list contents are of type {@link it.polimi.modaclouds.resourcemodel.cloud.CloudStorage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Cloud Storage</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Cloud Storage</em>' reference list.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getDatabase_UsesCloudStorage()
	 * @model
	 * @generated
	 */
	EList<CloudStorage> getUsesCloudStorage();

	/**
	 * Returns the value of the '<em><b>DB Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.polimi.modaclouds.resourcemodel.cloud.DatabaseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DB Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DB Type</em>' attribute.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.DatabaseType
	 * @see #setDBType(DatabaseType)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getDatabase_DBType()
	 * @model required="true"
	 * @generated
	 */
	DatabaseType getDBType();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.Database#getDBType <em>DB Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DB Type</em>' attribute.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.DatabaseType
	 * @see #getDBType()
	 * @generated
	 */
	void setDBType(DatabaseType value);

} // Database
