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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cost Unit Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCostUnitType()
 * @model
 * @generated
 */
public enum CostUnitType implements Enumerator {
	/**
	 * The '<em><b>Per hour</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PER_HOUR_VALUE
	 * @generated
	 * @ordered
	 */
	PER_HOUR(0, "per_hour", "per_hour"),

	/**
	 * The '<em><b>Per GBmonth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PER_GBMONTH_VALUE
	 * @generated
	 * @ordered
	 */
	PER_GBMONTH(1, "per_GBmonth", "per_GBmonth"),

	/**
	 * The '<em><b>Per million IO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PER_MILLION_IO_VALUE
	 * @generated
	 * @ordered
	 */
	PER_MILLION_IO(2, "per_million_I_O", "per_million_I_O");

	/**
	 * The '<em><b>Per hour</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Per hour</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PER_HOUR
	 * @model name="per_hour"
	 * @generated
	 * @ordered
	 */
	public static final int PER_HOUR_VALUE = 0;

	/**
	 * The '<em><b>Per GBmonth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Per GBmonth</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PER_GBMONTH
	 * @model name="per_GBmonth"
	 * @generated
	 * @ordered
	 */
	public static final int PER_GBMONTH_VALUE = 1;

	/**
	 * The '<em><b>Per million IO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Per million IO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PER_MILLION_IO
	 * @model name="per_million_I_O"
	 * @generated
	 * @ordered
	 */
	public static final int PER_MILLION_IO_VALUE = 2;

	/**
	 * An array of all the '<em><b>Cost Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CostUnitType[] VALUES_ARRAY =
		new CostUnitType[] {
			PER_HOUR,
			PER_GBMONTH,
			PER_MILLION_IO,
		};

	/**
	 * A public read-only list of all the '<em><b>Cost Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CostUnitType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cost Unit Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CostUnitType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CostUnitType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cost Unit Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CostUnitType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CostUnitType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cost Unit Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CostUnitType get(int value) {
		switch (value) {
			case PER_HOUR_VALUE: return PER_HOUR;
			case PER_GBMONTH_VALUE: return PER_GBMONTH;
			case PER_MILLION_IO_VALUE: return PER_MILLION_IO;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CostUnitType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CostUnitType
