/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational.enumerations;

import java.io.Serializable;

public final class ProcedureTypeEnum
implements org.omg.java.cwm.resource.relational.enumerations.ProcedureType,Serializable {

	private static final long serialVersionUID = 1L;

	public static final org.omg.java.cwm.resource.relational.enumerations.ProcedureTypeEnum PROCEDURE = new ProcedureTypeEnum("procedure");

  public static final org.omg.java.cwm.resource.relational.enumerations.ProcedureTypeEnum FUNCTION = new ProcedureTypeEnum("function");

  private static final java.util.List<String> typeName = java.util.Collections.unmodifiableList(java.util.Arrays.asList(new String[] {"Relational","Enumerations","ProcedureType"}));

  private final java.lang.String literalName;

  private ProcedureTypeEnum( java.lang.String literalName ) {
    this.literalName = literalName;
  }

  public java.util.List<String> refTypeName() {
    return typeName;
  }

  public java.lang.String toString() {
    return literalName;
  }

  public boolean equals( java.lang.Object other ) {
    return (other instanceof org.omg.java.cwm.resource.relational.enumerations.ProcedureTypeEnum)?other == this:false;
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

  public static org.omg.java.cwm.resource.relational.enumerations.ProcedureType forName( java.lang.String value ) {
    if ( value.equals(PROCEDURE.literalName) ) return PROCEDURE;
    if ( value.equals(FUNCTION.literalName) ) return FUNCTION;
    throw new java.lang.IllegalArgumentException("Unknown enumeration value '"+value+"' for type 'Relational.Enumerations.ProcedureType'");
  }

}
