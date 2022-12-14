/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.core;



public final class ScopeKindEnum
implements org.omg.java.cwm.objectmodel.core.ScopeKind, java.io.Serializable {

private static final long serialVersionUID = 1L;

public static final org.omg.java.cwm.objectmodel.core.ScopeKindEnum SK_INSTANCE = new ScopeKindEnum("sk_instance");

  public static final org.omg.java.cwm.objectmodel.core.ScopeKindEnum SK_CLASSIFIER = new ScopeKindEnum("sk_classifier");

  private static final java.util.List<String> typeName = java.util.Collections.unmodifiableList(java.util.Arrays.asList(new String[] {"Core","ScopeKind"}));

  private final java.lang.String literalName;

  private ScopeKindEnum( java.lang.String literalName ) {
    this.literalName = literalName;
  }

  public java.util.List<String> refTypeName() {
    return typeName;
  }

  public java.lang.String toString() {
    return literalName;
  }

  public boolean equals( java.lang.Object other ) {
    return (other instanceof org.omg.java.cwm.objectmodel.core.ScopeKindEnum) ? other == this : false;
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

  public static org.omg.java.cwm.objectmodel.core.ScopeKind forName( java.lang.String value ) {
    if ( value.equals(SK_INSTANCE.literalName) ) return SK_INSTANCE;
    if ( value.equals(SK_CLASSIFIER.literalName) ) return SK_CLASSIFIER;
    throw new java.lang.IllegalArgumentException("Unknown enumeration value '"+value+"' for type 'Core.ScopeKind'");
  }

}
