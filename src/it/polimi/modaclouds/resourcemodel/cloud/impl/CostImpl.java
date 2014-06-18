/**
 */
package it.polimi.modaclouds.resourcemodel.cloud.impl;

import it.polimi.modaclouds.resourcemodel.cloud.CloudElement;
import it.polimi.modaclouds.resourcemodel.cloud.CloudPackage;
import it.polimi.modaclouds.resourcemodel.cloud.Cost;
import it.polimi.modaclouds.resourcemodel.cloud.CostUnitType;
import it.polimi.modaclouds.resourcemodel.cloud.VirtualHWResource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cost</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CostImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CostImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CostImpl#getValue <em>Value</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CostImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CostImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CostImpl#getAssociatedToCloudElement <em>Associated To Cloud Element</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CostImpl#getDefinedOn <em>Defined On</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CostImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CostImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link it.polimi.modaclouds.resourcemodel.cloud.impl.CostImpl#getRegion <em>Region</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CostImpl extends EObjectImpl implements Cost {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final CostUnitType UNIT_EDEFAULT = CostUnitType.PER_HOUR;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected CostUnitType unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int PERIOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected int period = PERIOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssociatedToCloudElement() <em>Associated To Cloud Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedToCloudElement()
	 * @generated
	 * @ordered
	 */
	protected CloudElement associatedToCloudElement;

	/**
	 * The cached value of the '{@link #getDefinedOn() <em>Defined On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedOn()
	 * @generated
	 * @ordered
	 */
	protected VirtualHWResource definedOn;

	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected int lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected int upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected String region = REGION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudPackage.Literals.COST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.COST__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.COST__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.COST__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostUnitType getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(CostUnitType newUnit) {
		CostUnitType oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.COST__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(int newPeriod) {
		int oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.COST__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudElement getAssociatedToCloudElement() {
		if (associatedToCloudElement != null && associatedToCloudElement.eIsProxy()) {
			InternalEObject oldAssociatedToCloudElement = (InternalEObject)associatedToCloudElement;
			associatedToCloudElement = (CloudElement)eResolveProxy(oldAssociatedToCloudElement);
			if (associatedToCloudElement != oldAssociatedToCloudElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CloudPackage.COST__ASSOCIATED_TO_CLOUD_ELEMENT, oldAssociatedToCloudElement, associatedToCloudElement));
			}
		}
		return associatedToCloudElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudElement basicGetAssociatedToCloudElement() {
		return associatedToCloudElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociatedToCloudElement(CloudElement newAssociatedToCloudElement, NotificationChain msgs) {
		CloudElement oldAssociatedToCloudElement = associatedToCloudElement;
		associatedToCloudElement = newAssociatedToCloudElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CloudPackage.COST__ASSOCIATED_TO_CLOUD_ELEMENT, oldAssociatedToCloudElement, newAssociatedToCloudElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatedToCloudElement(CloudElement newAssociatedToCloudElement) {
		if (newAssociatedToCloudElement != associatedToCloudElement) {
			NotificationChain msgs = null;
			if (associatedToCloudElement != null)
				msgs = ((InternalEObject)associatedToCloudElement).eInverseRemove(this, CloudPackage.CLOUD_ELEMENT__HAS_COST, CloudElement.class, msgs);
			if (newAssociatedToCloudElement != null)
				msgs = ((InternalEObject)newAssociatedToCloudElement).eInverseAdd(this, CloudPackage.CLOUD_ELEMENT__HAS_COST, CloudElement.class, msgs);
			msgs = basicSetAssociatedToCloudElement(newAssociatedToCloudElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.COST__ASSOCIATED_TO_CLOUD_ELEMENT, newAssociatedToCloudElement, newAssociatedToCloudElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualHWResource getDefinedOn() {
		if (definedOn != null && definedOn.eIsProxy()) {
			InternalEObject oldDefinedOn = (InternalEObject)definedOn;
			definedOn = (VirtualHWResource)eResolveProxy(oldDefinedOn);
			if (definedOn != oldDefinedOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CloudPackage.COST__DEFINED_ON, oldDefinedOn, definedOn));
			}
		}
		return definedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualHWResource basicGetDefinedOn() {
		return definedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinedOn(VirtualHWResource newDefinedOn) {
		VirtualHWResource oldDefinedOn = definedOn;
		definedOn = newDefinedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.COST__DEFINED_ON, oldDefinedOn, definedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(int newLowerBound) {
		int oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.COST__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(int newUpperBound) {
		int oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.COST__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(String newRegion) {
		String oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.COST__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CloudPackage.COST__ASSOCIATED_TO_CLOUD_ELEMENT:
				if (associatedToCloudElement != null)
					msgs = ((InternalEObject)associatedToCloudElement).eInverseRemove(this, CloudPackage.CLOUD_ELEMENT__HAS_COST, CloudElement.class, msgs);
				return basicSetAssociatedToCloudElement((CloudElement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CloudPackage.COST__ASSOCIATED_TO_CLOUD_ELEMENT:
				return basicSetAssociatedToCloudElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudPackage.COST__ID:
				return getId();
			case CloudPackage.COST__DESCRIPTION:
				return getDescription();
			case CloudPackage.COST__VALUE:
				return getValue();
			case CloudPackage.COST__UNIT:
				return getUnit();
			case CloudPackage.COST__PERIOD:
				return getPeriod();
			case CloudPackage.COST__ASSOCIATED_TO_CLOUD_ELEMENT:
				if (resolve) return getAssociatedToCloudElement();
				return basicGetAssociatedToCloudElement();
			case CloudPackage.COST__DEFINED_ON:
				if (resolve) return getDefinedOn();
				return basicGetDefinedOn();
			case CloudPackage.COST__LOWER_BOUND:
				return getLowerBound();
			case CloudPackage.COST__UPPER_BOUND:
				return getUpperBound();
			case CloudPackage.COST__REGION:
				return getRegion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CloudPackage.COST__ID:
				setId((Integer)newValue);
				return;
			case CloudPackage.COST__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CloudPackage.COST__VALUE:
				setValue((Double)newValue);
				return;
			case CloudPackage.COST__UNIT:
				setUnit((CostUnitType)newValue);
				return;
			case CloudPackage.COST__PERIOD:
				setPeriod((Integer)newValue);
				return;
			case CloudPackage.COST__ASSOCIATED_TO_CLOUD_ELEMENT:
				setAssociatedToCloudElement((CloudElement)newValue);
				return;
			case CloudPackage.COST__DEFINED_ON:
				setDefinedOn((VirtualHWResource)newValue);
				return;
			case CloudPackage.COST__LOWER_BOUND:
				setLowerBound((Integer)newValue);
				return;
			case CloudPackage.COST__UPPER_BOUND:
				setUpperBound((Integer)newValue);
				return;
			case CloudPackage.COST__REGION:
				setRegion((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CloudPackage.COST__ID:
				setId(ID_EDEFAULT);
				return;
			case CloudPackage.COST__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CloudPackage.COST__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case CloudPackage.COST__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case CloudPackage.COST__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case CloudPackage.COST__ASSOCIATED_TO_CLOUD_ELEMENT:
				setAssociatedToCloudElement((CloudElement)null);
				return;
			case CloudPackage.COST__DEFINED_ON:
				setDefinedOn((VirtualHWResource)null);
				return;
			case CloudPackage.COST__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case CloudPackage.COST__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case CloudPackage.COST__REGION:
				setRegion(REGION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CloudPackage.COST__ID:
				return id != ID_EDEFAULT;
			case CloudPackage.COST__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CloudPackage.COST__VALUE:
				return value != VALUE_EDEFAULT;
			case CloudPackage.COST__UNIT:
				return unit != UNIT_EDEFAULT;
			case CloudPackage.COST__PERIOD:
				return period != PERIOD_EDEFAULT;
			case CloudPackage.COST__ASSOCIATED_TO_CLOUD_ELEMENT:
				return associatedToCloudElement != null;
			case CloudPackage.COST__DEFINED_ON:
				return definedOn != null;
			case CloudPackage.COST__LOWER_BOUND:
				return lowerBound != LOWER_BOUND_EDEFAULT;
			case CloudPackage.COST__UPPER_BOUND:
				return upperBound != UPPER_BOUND_EDEFAULT;
			case CloudPackage.COST__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", description: ");
		result.append(description);
		result.append(", value: ");
		result.append(value);
		result.append(", unit: ");
		result.append(unit);
		result.append(", period: ");
		result.append(period);
		result.append(", lowerBound: ");
		result.append(lowerBound);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(", region: ");
		result.append(region);
		result.append(')');
		return result.toString();
	}

} //CostImpl
