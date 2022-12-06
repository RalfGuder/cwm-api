/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseprocess.datatype;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.List;

public final class WaitRuleTypeEnum implements WaitRuleType, Serializable {

	private static final long serialVersionUID = 1L;

	public static final WaitRuleTypeEnum WAIT_FOR_ALL = new WaitRuleTypeEnum("waitForAll");

	public static final WaitRuleTypeEnum WAIT_FOR_ANY = new WaitRuleTypeEnum("waitForAny");

	private static final List<String> typeName = unmodifiableList(
			asList(new String[] { "WarehouseProcess", "DataType", "WaitRuleType" }));

	private final String literalName;

	private WaitRuleTypeEnum(String literalName) {
		this.literalName = literalName;
	}

	public List<String> refTypeName() {
		return typeName;
	}

	public String toString() {
		return literalName;
	}

	public boolean equals(Object other) {
		return (other instanceof WaitRuleTypeEnum) ? other == this : false;
	}

	protected Object readResolve() throws InvalidObjectException {
		try {
			return forName(literalName);
		} catch (java.lang.IllegalArgumentException iae) {
			throw new InvalidObjectException(iae.getMessage());
		}
	}

	public int hashCode() {
		return literalName.hashCode();
	}

	public static WaitRuleType forName(String value) {
		if (value.equals(WAIT_FOR_ALL.literalName))
			return WAIT_FOR_ALL;
		if (value.equals(WAIT_FOR_ANY.literalName))
			return WAIT_FOR_ANY;
		throw new IllegalArgumentException(
				"Unknown enumeration value '" + value + "' for type 'WarehouseProcess.DataType.WaitRuleType'");
	}

}
