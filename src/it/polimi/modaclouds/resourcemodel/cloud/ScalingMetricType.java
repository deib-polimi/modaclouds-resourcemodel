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
 * A representation of the literals of the enumeration '<em><b>Scaling Metric Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getScalingMetricType()
 * @model
 * @generated
 */
public enum ScalingMetricType implements Enumerator {
	/**
	 * The '<em><b>CPU utilization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CPU_UTILIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	CPU_UTILIZATION(0, "CPU_utilization", "CPU_utilization"),

	/**
	 * The '<em><b>Traffic Load</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAFFIC_LOAD_VALUE
	 * @generated
	 * @ordered
	 */
	TRAFFIC_LOAD(1, "TrafficLoad", "TrafficLoad"),

	/**
	 * The '<em><b>Memory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY_VALUE
	 * @generated
	 * @ordered
	 */
	MEMORY(2, "Memory", "Memory");

	/**
	 * The '<em><b>CPU utilization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CPU utilization</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CPU_UTILIZATION
	 * @model name="CPU_utilization"
	 * @generated
	 * @ordered
	 */
	public static final int CPU_UTILIZATION_VALUE = 0;

	/**
	 * The '<em><b>Traffic Load</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Traffic Load</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAFFIC_LOAD
	 * @model name="TrafficLoad"
	 * @generated
	 * @ordered
	 */
	public static final int TRAFFIC_LOAD_VALUE = 1;

	/**
	 * The '<em><b>Memory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Memory</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEMORY
	 * @model name="Memory"
	 * @generated
	 * @ordered
	 */
	public static final int MEMORY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Scaling Metric Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ScalingMetricType[] VALUES_ARRAY =
		new ScalingMetricType[] {
			CPU_UTILIZATION,
			TRAFFIC_LOAD,
			MEMORY,
		};

	/**
	 * A public read-only list of all the '<em><b>Scaling Metric Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ScalingMetricType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Scaling Metric Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScalingMetricType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScalingMetricType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scaling Metric Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScalingMetricType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScalingMetricType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scaling Metric Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScalingMetricType get(int value) {
		switch (value) {
			case CPU_UTILIZATION_VALUE: return CPU_UTILIZATION;
			case TRAFFIC_LOAD_VALUE: return TRAFFIC_LOAD;
			case MEMORY_VALUE: return MEMORY;
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
	private ScalingMetricType(int value, String name, String literal) {
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
	
} //ScalingMetricType
