package org.omg.java.cwm.objectmodel.core;


/**
 * In the metamodel changeable kind defines an enumeration that denotes how an 
 * attribute link may be modified. The default value is <i>ck_changeable</i>.
 *
 * @author Ralf Guder
 *
 */
public final class ChangeableKindEnum
    implements org.omg.java.cwm.objectmodel.core.ChangeableKind, java.io.Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * No restrictions on modification.
   */
  public static final org.omg.java.cwm.objectmodel.core.ChangeableKindEnum CK_CHANGEABLE =
      new ChangeableKindEnum("ck_changeable");
  /**
   * The value may not be changed from the source end after the creation and 
   * initialization of the source object. Operations on the other end may change a value.
   */
  public static final org.omg.java.cwm.objectmodel.core.ChangeableKindEnum CK_FROZEN =
      new ChangeableKindEnum("ck_frozen");

  /**
   * If the multiplicity is not fixed, values may be added at any time from the 
   * source object, but once created a value may not be removed from the source 
   * end. Operations on the other end may change a value.
   */
  public static final org.omg.java.cwm.objectmodel.core.ChangeableKindEnum CK_ADD_ONLY =
      new ChangeableKindEnum("ck_addOnly");

  private static final java.util.List<String> typeName = java.util.Collections
      .unmodifiableList(java.util.Arrays.asList(new String[] {"Core", "ChangeableKind"}));

  private final java.lang.String literalName;

  private ChangeableKindEnum(java.lang.String literalName) {
    this.literalName = literalName;
  }

  public java.util.List<String> refTypeName() {
    return typeName;
  }

  public java.lang.String toString() {
    return literalName;
  }

  public boolean equals(java.lang.Object other) {
    return (other instanceof org.omg.java.cwm.objectmodel.core.ChangeableKindEnum) ? other == this
        : false;
  }

  protected java.lang.Object readResolve() throws java.io.InvalidObjectException {
    try {
      return forName(literalName);
    } catch (java.lang.IllegalArgumentException iae) {
      throw new java.io.InvalidObjectException(iae.getMessage());
    }
  }


  public int hashCode() {
    return literalName.hashCode();
  }

  /**
   * Gets the changeable kind from name.
   *
   * @param value is a string.
   * @return The changeable kind
   */
  public static org.omg.java.cwm.objectmodel.core.ChangeableKind forName(java.lang.String value) {
    if (value.equals(CK_CHANGEABLE.literalName)) {
      return CK_CHANGEABLE;
    }
    if (value.equals(CK_FROZEN.literalName)) {
      return CK_FROZEN;
    }
    if (value.equals(CK_ADD_ONLY.literalName)) {
      return CK_ADD_ONLY;
    }
    throw new java.lang.IllegalArgumentException(
        "Unknown enumeration value '" + value + "' for type 'Core.ChangeableKind'");
  }

}
