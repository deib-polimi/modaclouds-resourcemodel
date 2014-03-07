/**
 */
package it.polimi.modaclouds.resourcemodel.cloud;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Free Quota</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.FreeQuota#getId <em>Id</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.FreeQuota#getUnit <em>Unit</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.FreeQuota#getAmount <em>Amount</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.FreeQuota#getAssociatedToCloudElement <em>Associated To Cloud Element</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.FreeQuota#getDefinedOn <em>Defined On</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getFreeQuota()
 * @model
 * @generated
 */
public interface FreeQuota extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getFreeQuota_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.FreeQuota#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link it.polimi.modaclouds.resourcemodel.cloud.CostUnitType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CostUnitType
	 * @see #setUnit(CostUnitType)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getFreeQuota_Unit()
	 * @model required="true"
	 * @generated
	 */
	CostUnitType getUnit();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.FreeQuota#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CostUnitType
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(CostUnitType value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(double)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getFreeQuota_Amount()
	 * @model required="true"
	 * @generated
	 */
	double getAmount();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.FreeQuota#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(double value);

	/**
	 * Returns the value of the '<em><b>Associated To Cloud Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getHasFreeQuota <em>Has Free Quota</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated To Cloud Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated To Cloud Element</em>' reference.
	 * @see #setAssociatedToCloudElement(CloudElement)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getFreeQuota_AssociatedToCloudElement()
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getHasFreeQuota
	 * @model opposite="hasFreeQuota" required="true"
	 * @generated
	 */
	CloudElement getAssociatedToCloudElement();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.FreeQuota#getAssociatedToCloudElement <em>Associated To Cloud Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated To Cloud Element</em>' reference.
	 * @see #getAssociatedToCloudElement()
	 * @generated
	 */
	void setAssociatedToCloudElement(CloudElement value);

	/**
	 * Returns the value of the '<em><b>Defined On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined On</em>' reference.
	 * @see #setDefinedOn(VirtualHWResource)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getFreeQuota_DefinedOn()
	 * @model
	 * @generated
	 */
	VirtualHWResource getDefinedOn();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.FreeQuota#getDefinedOn <em>Defined On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined On</em>' reference.
	 * @see #getDefinedOn()
	 * @generated
	 */
	void setDefinedOn(VirtualHWResource value);

} // FreeQuota
