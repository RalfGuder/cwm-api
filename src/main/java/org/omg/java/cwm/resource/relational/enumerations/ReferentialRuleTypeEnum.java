/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational.enumerations;

import java.io.Serializable;

public final class ReferentialRuleTypeEnum
implements org.omg.java.cwm.resource.relational.enumerations.ReferentialRuleType, Serializable {

	private static final long serialVersionUID = 1L;

	public static final org.omg.java.cwm.resource.relational.enumerations.ReferentialRuleTypeEnum IMPORTED_KEY_NO_ACTION = new ReferentialRuleTypeEnum("importedKeyNoAction");

  public static final org.omg.java.cwm.resource.relational.enumerations.ReferentialRuleTypeEnum IMPORTED_KEY_CASCADE = new ReferentialRuleTypeEnum("importedKeyCascade");

  public static final org.omg.java.cwm.resource.relational.enumerations.ReferentialRuleTypeEnum IMPORTED_KEY_SET_NULL = new ReferentialRuleTypeEnum("importedKeySetNull");

  public static final org.omg.java.cwm.resource.relational.enumerations.ReferentialRuleTypeEnum IMPORTED_KEY_RESTRICT = new ReferentialRuleTypeEnum("importedKeyRestrict");

  public static final org.omg.java.cwm.resource.relational.enumerations.ReferentialRuleTypeEnum IMPORTED_KEY_SET_DEFAULT = new ReferentialRuleTypeEnum("importedKeySetDefault");

  private static final java.util.List<String> typeName = java.util.Collections.unmodifiableList(java.util.Arrays.asList(new String[] {"Relational","Enumerations","ReferentialRuleType"}));

  private final java.lang.String literalName;

  private ReferentialRuleTypeEnum( java.lang.String literalName ) {
    this.literalName = literalName;
  }

  public java.util.List<String> refTypeName() {
    return typeName;
  }

  public java.lang.String toString() {
    return literalName;
  }

  public boolean equals( java.lang.Object other ) {
    return (other instanceof org.omg.java.cwm.resource.relational.enumerations.ReferentialRuleTypeEnum)?other == this: false;
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

  public static org.omg.java.cwm.resource.relational.enumerations.ReferentialRuleType forName( java.lang.String value ) {
    if ( value.equals(IMPORTED_KEY_NO_ACTION.literalName) ) return IMPORTED_KEY_NO_ACTION;
    if ( value.equals(IMPORTED_KEY_CASCADE.literalName) ) return IMPORTED_KEY_CASCADE;
    if ( value.equals(IMPORTED_KEY_SET_NULL.literalName) ) return IMPORTED_KEY_SET_NULL;
    if ( value.equals(IMPORTED_KEY_RESTRICT.literalName) ) return IMPORTED_KEY_RESTRICT;
    if ( value.equals(IMPORTED_KEY_SET_DEFAULT.literalName) ) return IMPORTED_KEY_SET_DEFAULT;
    throw new java.lang.IllegalArgumentException("Unknown enumeration value '"+value+"' for type 'Relational.Enumerations.ReferentialRuleType'");
  }

}
