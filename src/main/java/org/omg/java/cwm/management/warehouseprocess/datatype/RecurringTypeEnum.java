/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseprocess.datatype;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.List;

public final class RecurringTypeEnum implements RecurringType, Serializable {

	private static final long serialVersionUID = 1L;

	public static final RecurringTypeEnum EVERY_YEAR = new RecurringTypeEnum("everyYear");

	public static final RecurringTypeEnum EVERY_MONTH = new RecurringTypeEnum("everyMonth");

	public static final RecurringTypeEnum EVERY_WEEK = new RecurringTypeEnum("everyWeek");

	public static final RecurringTypeEnum EVERY_DAY = new RecurringTypeEnum("everyDay");

	public static final RecurringTypeEnum EVERY_HOUR = new RecurringTypeEnum("everyHour");

	public static final RecurringTypeEnum EVERY_MINUTE = new RecurringTypeEnum("everyMinute");

	private static final List<String> typeName = unmodifiableList(
			asList(new String[] { "WarehouseProcess", "DataType", "RecurringType" }));

	private final String literalName;

	private RecurringTypeEnum(String literalName) {
		this.literalName = literalName;
	}

	public List<String> refTypeName() {
		return typeName;
	}

	public String toString() {
		return literalName;
	}

	public boolean equals(Object other) {
		return (other instanceof RecurringTypeEnum) ? other == this : false;
	}

	protected Object readResolve() throws InvalidObjectException {
		try {
			return forName(literalName);
		} catch (IllegalArgumentException iae) {
			throw new InvalidObjectException(iae.getMessage());
		}
	}

	public int hashCode() {
		return literalName.hashCode();
	}

	public static RecurringType forName(java.lang.String value) {
		if (value.equals(EVERY_YEAR.literalName))
			return EVERY_YEAR;
		if (value.equals(EVERY_MONTH.literalName))
			return EVERY_MONTH;
		if (value.equals(EVERY_WEEK.literalName))
			return EVERY_WEEK;
		if (value.equals(EVERY_DAY.literalName))
			return EVERY_DAY;
		if (value.equals(EVERY_HOUR.literalName))
			return EVERY_HOUR;
		if (value.equals(EVERY_MINUTE.literalName))
			return EVERY_MINUTE;
		throw new IllegalArgumentException(
				"Unknown enumeration value '" + value + "' for type 'WarehouseProcess.DataType.RecurringType'");
	}

}
