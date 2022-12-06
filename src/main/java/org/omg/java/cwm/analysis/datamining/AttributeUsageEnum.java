/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public final class AttributeUsageEnum
implements org.omg.java.cwm.analysis.datamining.AttributeUsage {

  public static final org.omg.java.cwm.analysis.datamining.AttributeUsageEnum ACTIVE = new AttributeUsageEnum("active");

  public static final org.omg.java.cwm.analysis.datamining.AttributeUsageEnum INACTIVE = new AttributeUsageEnum("inactive");

  public static final org.omg.java.cwm.analysis.datamining.AttributeUsageEnum SUPPLEMENTARY = new AttributeUsageEnum("supplementary");

  private static final java.util.List<String> typeName = java.util.Collections.unmodifiableList(java.util.Arrays.asList(new String[] {"DataMining","AttributeUsage"}));

  private final java.lang.String literalName;

  private AttributeUsageEnum( java.lang.String literalName ) {
    this.literalName = literalName;
  }

  public java.util.List<String> refTypeName() {
    return typeName;
  }

  public java.lang.String toString() {
    return literalName;
  }

  public boolean equals( java.lang.Object other ) {
    return (other instanceof org.omg.java.cwm.analysis.datamining.AttributeUsageEnum)?other == this:false;
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

  public static org.omg.java.cwm.analysis.datamining.AttributeUsage forName( java.lang.String value ) {
    if ( value.equals(ACTIVE.literalName) ) return ACTIVE;
    if ( value.equals(INACTIVE.literalName) ) return INACTIVE;
    if ( value.equals(SUPPLEMENTARY.literalName) ) return SUPPLEMENTARY;
    throw new java.lang.IllegalArgumentException("Unknown enumeration value '"+value+"' for type 'DataMining.AttributeUsage'");
  }

}
