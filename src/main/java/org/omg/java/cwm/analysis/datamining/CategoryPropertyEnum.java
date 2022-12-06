/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public final class CategoryPropertyEnum
implements org.omg.java.cwm.analysis.datamining.CategoryProperty {

  public static final org.omg.java.cwm.analysis.datamining.CategoryPropertyEnum MISSING = new CategoryPropertyEnum("missing");

  public static final org.omg.java.cwm.analysis.datamining.CategoryPropertyEnum INVALID = new CategoryPropertyEnum("invalid");

  public static final org.omg.java.cwm.analysis.datamining.CategoryPropertyEnum VALID = new CategoryPropertyEnum("valid");

  public static final org.omg.java.cwm.analysis.datamining.CategoryPropertyEnum POSITIVE = new CategoryPropertyEnum("positive");

  public static final org.omg.java.cwm.analysis.datamining.CategoryPropertyEnum NEGATIVE = new CategoryPropertyEnum("negative");

  private static final java.util.List<String> typeName = java.util.Collections.unmodifiableList(java.util.Arrays.asList(new String[] {"DataMining","CategoryProperty"}));

  private final java.lang.String literalName;

  private CategoryPropertyEnum( java.lang.String literalName ) {
    this.literalName = literalName;
  }

  public java.util.List<String> refTypeName() {
    return typeName;
  }

  public java.lang.String toString() {
    return literalName;
  }

  public boolean equals( java.lang.Object other ) {
    return (other instanceof org.omg.java.cwm.analysis.datamining.CategoryPropertyEnum) ? other == this : false;
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

  public static org.omg.java.cwm.analysis.datamining.CategoryProperty forName( java.lang.String value ) {
    if ( value.equals(MISSING.literalName) ) return MISSING;
    if ( value.equals(INVALID.literalName) ) return INVALID;
    if ( value.equals(VALID.literalName) ) return VALID;
    if ( value.equals(POSITIVE.literalName) ) return POSITIVE;
    if ( value.equals(NEGATIVE.literalName) ) return NEGATIVE;
    throw new java.lang.IllegalArgumentException("Unknown enumeration value '"+value+"' for type 'DataMining.CategoryProperty'");
  }

}
