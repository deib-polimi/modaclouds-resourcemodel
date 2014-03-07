/**
 */
package it.polimi.modaclouds.resourcemodel.cloud;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getId <em>Id</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getDescription <em>Description</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getValue <em>Value</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getUnit <em>Unit</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getPeriod <em>Period</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getAssociatedToCloudElement <em>Associated To Cloud Element</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getDefinedOn <em>Defined On</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getRegion <em>Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCost()
 * @model
 * @generated
 */
public interface Cost extends EObject {
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
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCost_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCost_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCost_Value()
	 * @model required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

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
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCost_Unit()
	 * @model required="true"
	 * @generated
	 */
	CostUnitType getUnit();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CostUnitType
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(CostUnitType value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(int)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCost_Period()
	 * @model
	 * @generated
	 */
	int getPeriod();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(int value);

	/**
	 * Returns the value of the '<em><b>Associated To Cloud Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getHasCost <em>Has Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated To Cloud Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated To Cloud Element</em>' reference.
	 * @see #setAssociatedToCloudElement(CloudElement)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCost_AssociatedToCloudElement()
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getHasCost
	 * @model opposite="hasCost" required="true"
	 * @generated
	 */
	CloudElement getAssociatedToCloudElement();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getAssociatedToCloudElement <em>Associated To Cloud Element</em>}' reference.
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
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCost_DefinedOn()
	 * @model
	 * @generated
	 */
	VirtualHWResource getDefinedOn();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getDefinedOn <em>Defined On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined On</em>' reference.
	 * @see #getDefinedOn()
	 * @generated
	 */
	void setDefinedOn(VirtualHWResource value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCost_LowerBound()
	 * @model
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCost_UpperBound()
	 * @model
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCost_Region()
	 * @model
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.Cost#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

} // Cost
