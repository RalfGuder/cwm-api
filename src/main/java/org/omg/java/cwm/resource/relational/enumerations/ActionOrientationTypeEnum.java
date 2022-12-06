/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational.enumerations;



public final class ActionOrientationTypeEnum
implements org.omg.java.cwm.resource.relational.enumerations.ActionOrientationType {

  public static final org.omg.java.cwm.resource.relational.enumerations.ActionOrientationTypeEnum ROW = new ActionOrientationTypeEnum("row");

  public static final org.omg.java.cwm.resource.relational.enumerations.ActionOrientationTypeEnum STATEMENT = new ActionOrientationTypeEnum("statement");

  private static final java.util.List typeName = java.util.Collections.unmodifiableList(java.util.Arrays.asList(new String[] {"Relational","Enumerations","ActionOrientationType"}));

  private final java.lang.String literalName;

  private ActionOrientationTypeEnum( java.lang.String literalName ) {
    this.literalName = literalName;
  }

  public java.util.List refTypeName() {
    return typeName;
  }

  public java.lang.String toString() {
    return literalName;
  }

  public boolean equals( java.lang.Object other ) {
    return (other instanceof org.omg.java.cwm.resource.relational.enumerations.ActionOrientationTypeEnum)?other == this:false;
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

  public static org.omg.java.cwm.resource.relational.enumerations.ActionOrientationType forName( java.lang.String value ) {
    if ( value.equals(ROW.literalName) ) return ROW;
    if ( value.equals(STATEMENT.literalName) ) return STATEMENT;
    throw new java.lang.IllegalArgumentException("Unknown enumeration value '"+value+"' for type 'Relational.Enumerations.ActionOrientationType'");
  }

}
