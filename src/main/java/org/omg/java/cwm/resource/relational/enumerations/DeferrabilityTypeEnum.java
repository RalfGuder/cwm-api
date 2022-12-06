/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational.enumerations;



public final class DeferrabilityTypeEnum
implements org.omg.java.cwm.resource.relational.enumerations.DeferrabilityType {

  public static final org.omg.java.cwm.resource.relational.enumerations.DeferrabilityTypeEnum INITIALLY_DEFERRED = new DeferrabilityTypeEnum("initiallyDeferred");

  public static final org.omg.java.cwm.resource.relational.enumerations.DeferrabilityTypeEnum INITIALLY_IMMEDIATE = new DeferrabilityTypeEnum("initiallyImmediate");

  public static final org.omg.java.cwm.resource.relational.enumerations.DeferrabilityTypeEnum NOT_DEFERRABLE = new DeferrabilityTypeEnum("notDeferrable");

  private static final java.util.List typeName = java.util.Collections.unmodifiableList(java.util.Arrays.asList(new String[] {"Relational","Enumerations","DeferrabilityType"}));

  private final java.lang.String literalName;

  private DeferrabilityTypeEnum( java.lang.String literalName ) {
    this.literalName = literalName;
  }

  public java.util.List refTypeName() {
    return typeName;
  }

  public java.lang.String toString() {
    return literalName;
  }

  public boolean equals( java.lang.Object other ) {
    return (other instanceof org.omg.java.cwm.resource.relational.enumerations.DeferrabilityTypeEnum)?other == this:false;
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

  public static org.omg.java.cwm.resource.relational.enumerations.DeferrabilityType forName( java.lang.String value ) {
    if ( value.equals(INITIALLY_DEFERRED.literalName) ) return INITIALLY_DEFERRED;
    if ( value.equals(INITIALLY_IMMEDIATE.literalName) ) return INITIALLY_IMMEDIATE;
    if ( value.equals(NOT_DEFERRABLE.literalName) ) return NOT_DEFERRABLE;
    throw new java.lang.IllegalArgumentException("Unknown enumeration value '"+value+"' for type 'Relational.Enumerations.DeferrabilityType'");
  }

}
