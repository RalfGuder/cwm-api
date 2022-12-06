/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.core;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

import java.io.Serializable;
import java.util.List;

public final class OrderingKindEnum implements OrderingKind, Serializable{

	private static final long serialVersionUID = 1L;

	public static final OrderingKindEnum OK_UNORDERED = new OrderingKindEnum("ok_unordered");

	public static final OrderingKindEnum OK_ORDERED = new OrderingKindEnum("ok_ordered");

	private static final List<String> typeName = unmodifiableList(asList(new String[] { "Core",	"OrderingKind" }));

	private final String literalName;

	private OrderingKindEnum(java.lang.String literalName) {
		this.literalName = literalName;
	}

	public List<String> refTypeName() {
		return typeName;
	}

	public String toString() {
		return literalName;
	}

	public boolean equals(java.lang.Object other) {
		return (other instanceof org.omg.java.cwm.objectmodel.core.OrderingKindEnum) ? other == this
				: false;
	}

	protected java.lang.Object readResolve()
			throws java.io.InvalidObjectException {
		try {
			return forName(literalName);
		} catch (java.lang.IllegalArgumentException iae) {
			throw new java.io.InvalidObjectException(iae.getMessage());
		}
	}

	public int hashCode() {
		return literalName.hashCode();
	}

	public static org.omg.java.cwm.objectmodel.core.OrderingKind forName(
			java.lang.String value) {
		if (value.equals(OK_UNORDERED.literalName))
			return OK_UNORDERED;
		if (value.equals(OK_ORDERED.literalName))
			return OK_ORDERED;
		throw new java.lang.IllegalArgumentException(
				"Unknown enumeration value '" + value
						+ "' for type 'Core.OrderingKind'");
	}

}
