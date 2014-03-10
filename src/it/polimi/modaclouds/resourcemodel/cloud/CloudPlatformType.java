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
 * A representation of the literals of the enumeration '<em><b>Platform Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.polimi.modaclouds.resourcemodel.cloud.CloudPackage#getCloudPlatformType()
 * @model
 * @generated
 */
public enum CloudPlatformType implements Enumerator {
	/**
	 * The '<em><b>Frontend</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRONTEND_VALUE
	 * @generated
	 * @ordered
	 */
	FRONTEND(0, "frontend", "frontend"),

	/**
	 * The '<em><b>Middleware</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDDLEWARE_VALUE
	 * @generated
	 * @ordered
	 */
	MIDDLEWARE(1, "middleware", "middleware"),

	/**
	 * The '<em><b>Backend</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKEND_VALUE
	 * @generated
	 * @ordered
	 */
	BACKEND(2, "backend", "backend"),

	/**
	 * The '<em><b>Database</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATABASE_VALUE
	 * @generated
	 * @ordered
	 */
	DATABASE(3, "database", "database");

	/**
	 * The '<em><b>Frontend</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Frontend</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRONTEND
	 * @model name="frontend"
	 * @generated
	 * @ordered
	 */
	public static final int FRONTEND_VALUE = 0;

	/**
	 * The '<em><b>Middleware</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Middleware</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIDDLEWARE
	 * @model name="middleware"
	 * @generated
	 * @ordered
	 */
	public static final int MIDDLEWARE_VALUE = 1;

	/**
	 * The '<em><b>Backend</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Backend</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BACKEND
	 * @model name="backend"
	 * @generated
	 * @ordered
	 */
	public static final int BACKEND_VALUE = 2;

	/**
	 * The '<em><b>Database</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Database</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATABASE
	 * @model name="database"
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Platform Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CloudPlatformType[] VALUES_ARRAY =
		new CloudPlatformType[] {
			FRONTEND,
			MIDDLEWARE,
			BACKEND,
			DATABASE,
		};

	/**
	 * A public read-only list of all the '<em><b>Platform Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CloudPlatformType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Platform Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CloudPlatformType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CloudPlatformType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Platform Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CloudPlatformType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CloudPlatformType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Platform Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CloudPlatformType get(int value) {
		switch (value) {
			case FRONTEND_VALUE: return FRONTEND;
			case MIDDLEWARE_VALUE: return MIDDLEWARE;
			case BACKEND_VALUE: return BACKEND;
			case DATABASE_VALUE: return DATABASE;
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
	private CloudPlatformType(int value, String name, String literal) {
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
	
} //CloudPlatformType
