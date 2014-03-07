/**
 */
package it.polimi.modaclouds.resourcemodel.cloud;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scaling Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingRule#getId <em>Id</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingRule#getMetric <em>Metric</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingRule#getValue <em>Value</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingRule#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getScalingRule()
 * @model
 * @generated
 */
public interface ScalingRule extends EObject {
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
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getScalingRule_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingRule#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute.
	 * The literals are from the enumeration {@link it.polimi.modaclouds.resourcemodel.cloud.ScalingMetricType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' attribute.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ScalingMetricType
	 * @see #setMetric(ScalingMetricType)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getScalingRule_Metric()
	 * @model required="true"
	 * @generated
	 */
	ScalingMetricType getMetric();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingRule#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' attribute.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ScalingMetricType
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(ScalingMetricType value);

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
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getScalingRule_Value()
	 * @model required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingRule#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link it.polimi.modaclouds.resourcemodel.cloud.ScalingOperatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ScalingOperatorType
	 * @see #setOperator(ScalingOperatorType)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getScalingRule_Operator()
	 * @model required="true"
	 * @generated
	 */
	ScalingOperatorType getOperator();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.ScalingRule#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see it.polimi.modaclouds.resourcemodel.cloud.ScalingOperatorType
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ScalingOperatorType value);

} // ScalingRule
