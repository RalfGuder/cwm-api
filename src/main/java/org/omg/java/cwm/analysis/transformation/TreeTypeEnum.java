/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.transformation;



public final class TreeTypeEnum
implements org.omg.java.cwm.analysis.transformation.TreeType, java.io.Serializable {

private static final long serialVersionUID = 1L;

public static final org.omg.java.cwm.analysis.transformation.TreeTypeEnum TFM_UNARY = new TreeTypeEnum("tfm_unary");

  public static final org.omg.java.cwm.analysis.transformation.TreeTypeEnum TFM_BINARY = new TreeTypeEnum("tfm_binary");

  private static final java.util.List<String> typeName = java.util.Collections.unmodifiableList(java.util.Arrays.asList(new String[] {"Transformation","TreeType"}));

  private final java.lang.String literalName;

  private TreeTypeEnum( java.lang.String literalName ) {
    this.literalName = literalName;
  }

  public java.util.List<String> refTypeName() {
    return typeName;
  }

  public java.lang.String toString() {
    return literalName;
  }

  public boolean equals( java.lang.Object other ) {
    return (other instanceof org.omg.java.cwm.analysis.transformation.TreeTypeEnum) ? other == this : false;
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

  public static org.omg.java.cwm.analysis.transformation.TreeType forName( java.lang.String value ) {
    if ( value.equals(TFM_UNARY.literalName) ) return TFM_UNARY;
    if ( value.equals(TFM_BINARY.literalName) ) return TFM_BINARY;
    throw new java.lang.IllegalArgumentException("Unknown enumeration value '"+value+"' for type 'Transformation.TreeType'");
  }

}
