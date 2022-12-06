/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational.enumerations;



public final class EventManipulationTypeEnum
implements org.omg.java.cwm.resource.relational.enumerations.EventManipulationType {

  public static final org.omg.java.cwm.resource.relational.enumerations.EventManipulationTypeEnum INSERT = new EventManipulationTypeEnum("insert");

  public static final org.omg.java.cwm.resource.relational.enumerations.EventManipulationTypeEnum DELETE_IMMEDIATE = new EventManipulationTypeEnum("deleteImmediate");

  public static final org.omg.java.cwm.resource.relational.enumerations.EventManipulationTypeEnum UPDATE = new EventManipulationTypeEnum("update");

  private static final java.util.List typeName = java.util.Collections.unmodifiableList(java.util.Arrays.asList(new String[] {"Relational","Enumerations","EventManipulationType"}));

  private final java.lang.String literalName;

  private EventManipulationTypeEnum( java.lang.String literalName ) {
    this.literalName = literalName;
  }

  public java.util.List refTypeName() {
    return typeName;
  }

  public java.lang.String toString() {
    return literalName;
  }

  public boolean equals( java.lang.Object other ) {
    return (other instanceof org.omg.java.cwm.resource.relational.enumerations.EventManipulationTypeEnum)?other == this: false;
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

  public static org.omg.java.cwm.resource.relational.enumerations.EventManipulationType forName( java.lang.String value ) {
    if ( value.equals(INSERT.literalName) ) return INSERT;
    if ( value.equals(DELETE_IMMEDIATE.literalName) ) return DELETE_IMMEDIATE;
    if ( value.equals(UPDATE.literalName) ) return UPDATE;
    throw new java.lang.IllegalArgumentException("Unknown enumeration value '"+value+"' for type 'Relational.Enumerations.EventManipulationType'");
  }

}
