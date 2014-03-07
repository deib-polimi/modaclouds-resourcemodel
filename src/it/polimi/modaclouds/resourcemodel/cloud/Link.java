/**
 */
package it.polimi.modaclouds.resourcemodel.cloud;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.Link#getTo <em>To</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.Link#getId <em>Id</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.Link#getName <em>Name</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.Link#getLatency <em>Latency</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.Link#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.Link#getCost <em>Cost</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.Link#getReverseLinkToB <em>Reverse Link To B</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.Link#getReverseLinkToA <em>Reverse Link To A</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(CloudResource)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getLink_To()
	 * @model required="true"
	 * @generated
	 */
	CloudResource getTo();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.Link#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(CloudResource value);

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
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getLink_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.Link#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getLink_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.Link#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency</em>' attribute.
	 * @see #setLatency(double)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getLink_Latency()
	 * @model
	 * @generated
	 */
	double getLatency();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.Link#getLatency <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency</em>' attribute.
	 * @see #getLatency()
	 * @generated
	 */
	void setLatency(double value);

	/**
	 * Returns the value of the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throughput</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throughput</em>' attribute.
	 * @see #setThroughput(double)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getLink_Throughput()
	 * @model
	 * @generated
	 */
	double getThroughput();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.Link#getThroughput <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput</em>' attribute.
	 * @see #getThroughput()
	 * @generated
	 */
	void setThroughput(double value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getLink_Cost()
	 * @model
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.Link#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Reverse Link To B</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getCloudElementB <em>Cloud Element B</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reverse Link To B</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse Link To B</em>' reference.
	 * @see #setReverseLinkToB(CloudElement)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getLink_ReverseLinkToB()
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getCloudElementB
	 * @model opposite="CloudElementB" required="true"
	 * @generated
	 */
	CloudElement getReverseLinkToB();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.Link#getReverseLinkToB <em>Reverse Link To B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reverse Link To B</em>' reference.
	 * @see #getReverseLinkToB()
	 * @generated
	 */
	void setReverseLinkToB(CloudElement value);

	/**
	 * Returns the value of the '<em><b>Reverse Link To A</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getCloudElementA <em>Cloud Element A</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reverse Link To A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse Link To A</em>' reference.
	 * @see #setReverseLinkToA(CloudElement)
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getLink_ReverseLinkToA()
	 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudElement#getCloudElementA
	 * @model opposite="CloudElementA" required="true"
	 * @generated
	 */
	CloudElement getReverseLinkToA();

	/**
	 * Sets the value of the '{@link it.polimi.modaclouds.resourcemodel.cloud.Link#getReverseLinkToA <em>Reverse Link To A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reverse Link To A</em>' reference.
	 * @see #getReverseLinkToA()
	 * @generated
	 */
	void setReverseLinkToA(CloudElement value);

} // Link
