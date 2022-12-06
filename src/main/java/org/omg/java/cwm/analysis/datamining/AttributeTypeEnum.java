/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public final class AttributeTypeEnum
implements org.omg.java.cwm.analysis.datamining.AttributeType {

  public static final org.omg.java.cwm.analysis.datamining.AttributeTypeEnum CATEGORICAL = new AttributeTypeEnum("categorical");

  public static final org.omg.java.cwm.analysis.datamining.AttributeTypeEnum NUMERICAL = new AttributeTypeEnum("numerical");

  private static final java.util.List<String> typeName = java.util.Collections.unmodifiableList(java.util.Arrays.asList(new String[] {"DataMining","AttributeType"}));

  private final java.lang.String literalName;

  private AttributeTypeEnum( java.lang.String literalName ) {
    this.literalName = literalName;
  }

  public java.util.List<String> refTypeName() {
    return typeName;
  }

  public java.lang.String toString() {
    return literalName;
  }

  public boolean equals( java.lang.Object other ) {
    return (other instanceof org.omg.java.cwm.analysis.datamining.AttributeTypeEnum)?other == this : false;
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

  public static org.omg.java.cwm.analysis.datamining.AttributeType forName( java.lang.String value ) {
    if ( value.equals(CATEGORICAL.literalName) ) return CATEGORICAL;
    if ( value.equals(NUMERICAL.literalName) ) return NUMERICAL;
    throw new java.lang.IllegalArgumentException("Unknown enumeration value '"+value+"' for type 'DataMining.AttributeType'");
  }

}
