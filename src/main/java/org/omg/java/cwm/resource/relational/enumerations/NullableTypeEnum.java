/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational.enumerations;

import java.io.Serializable;

public final class NullableTypeEnum
implements org.omg.java.cwm.resource.relational.enumerations.NullableType, Serializable {

  private static final long serialVersionUID = 1L;

  public static final org.omg.java.cwm.resource.relational.enumerations.NullableTypeEnum COLUMN_NO_NULLS = new NullableTypeEnum("columnNoNulls");

  public static final org.omg.java.cwm.resource.relational.enumerations.NullableTypeEnum COLUMN_NULLABLE = new NullableTypeEnum("columnNullable");

  public static final org.omg.java.cwm.resource.relational.enumerations.NullableTypeEnum COLUMN_NULLABLE_UNKNOWN = new NullableTypeEnum("columnNullableUnknown");

  private static final java.util.List<String> typeName = java.util.Collections.unmodifiableList(java.util.Arrays.asList(new String[] {"Relational","Enumerations","NullableType"}));

  private final java.lang.String literalName;

  private NullableTypeEnum( java.lang.String literalName ) {
    this.literalName = literalName;
  }

  public java.util.List<String> refTypeName() {
    return typeName;
  }

  public java.lang.String toString() {
    return literalName;
  }

  public boolean equals( java.lang.Object other ) {
    return (other instanceof org.omg.java.cwm.resource.relational.enumerations.NullableTypeEnum)?other == this:false;
  }

  protected java.lang.Object readResolve()
    throws java.io.InvalidObjectException {
    try {
      return forName(literalName);
    } catch ( java.lang.IllegalArgumentException iae ) {
      throw new java.io.InvalidObjectException(iae.getMessage());
    }
  }

  public int hashCode() {
    return literalName.hashCode();
  }

  public static org.omg.java.cwm.resource.relational.enumerations.NullableType forName( java.lang.String value ) {
    if ( value.equals(COLUMN_NO_NULLS.literalName) ) return COLUMN_NO_NULLS;
    if ( value.equals(COLUMN_NULLABLE.literalName) ) return COLUMN_NULLABLE;
    if ( value.equals(COLUMN_NULLABLE_UNKNOWN.literalName) ) return COLUMN_NULLABLE_UNKNOWN;
    throw new java.lang.IllegalArgumentException("Unknown enumeration value '"+value+"' for type 'Relational.Enumerations.NullableType'");
  }

}
