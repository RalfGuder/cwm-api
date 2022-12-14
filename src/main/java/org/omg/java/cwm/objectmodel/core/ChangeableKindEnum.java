/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.core;



public final class ChangeableKindEnum
implements org.omg.java.cwm.objectmodel.core.ChangeableKind, java.io.Serializable {

private static final long serialVersionUID = 1L;

public static final org.omg.java.cwm.objectmodel.core.ChangeableKindEnum CK_CHANGEABLE = new ChangeableKindEnum("ck_changeable");

  public static final org.omg.java.cwm.objectmodel.core.ChangeableKindEnum CK_FROZEN = new ChangeableKindEnum("ck_frozen");

  public static final org.omg.java.cwm.objectmodel.core.ChangeableKindEnum CK_ADD_ONLY = new ChangeableKindEnum("ck_addOnly");

  private static final java.util.List<String> typeName = java.util.Collections.unmodifiableList(java.util.Arrays.asList(new String[] {"Core","ChangeableKind"}));

  private final java.lang.String literalName;

  private ChangeableKindEnum( java.lang.String literalName ) {
    this.literalName = literalName;
  }

  public java.util.List<String> refTypeName() {
    return typeName;
  }

  public java.lang.String toString() {
    return literalName;
  }

  public boolean equals( java.lang.Object other ) {
    return (other instanceof org.omg.java.cwm.objectmodel.core.ChangeableKindEnum) ? other == this : false;
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

  public static org.omg.java.cwm.objectmodel.core.ChangeableKind forName( java.lang.String value ) {
    if ( value.equals(CK_CHANGEABLE.literalName) ) return CK_CHANGEABLE;
    if ( value.equals(CK_FROZEN.literalName) ) return CK_FROZEN;
    if ( value.equals(CK_ADD_ONLY.literalName) ) return CK_ADD_ONLY;
    throw new java.lang.IllegalArgumentException("Unknown enumeration value '"+value+"' for type 'Core.ChangeableKind'");
  }

}
