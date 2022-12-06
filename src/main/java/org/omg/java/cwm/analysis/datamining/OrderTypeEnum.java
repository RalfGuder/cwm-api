/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public final class OrderTypeEnum
implements org.omg.java.cwm.analysis.datamining.OrderType, java.io.Serializable {

  private static final long serialVersionUID = 1L;

  public static final org.omg.java.cwm.analysis.datamining.OrderTypeEnum ALPHABETIC = new OrderTypeEnum("alphabetic");

  public static final org.omg.java.cwm.analysis.datamining.OrderTypeEnum DATE = new OrderTypeEnum("date");

  public static final org.omg.java.cwm.analysis.datamining.OrderTypeEnum NUMERIC = new OrderTypeEnum("numeric");

  public static final org.omg.java.cwm.analysis.datamining.OrderTypeEnum IN_SEQUENCE = new OrderTypeEnum("inSequence");

  private static final java.util.List<String> typeName = java.util.Collections.unmodifiableList(java.util.Arrays.asList(new String[] {"DataMining","OrderType"}));

  private final java.lang.String literalName;

  private OrderTypeEnum( java.lang.String literalName ) {
    this.literalName = literalName;
  }

  public java.util.List<String> refTypeName() {
    return typeName;
  }

  public java.lang.String toString() {
    return literalName;
  }

  public boolean equals( java.lang.Object other ) {
    return (other instanceof org.omg.java.cwm.analysis.datamining.OrderTypeEnum) ? other == this: false;
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

  public static org.omg.java.cwm.analysis.datamining.OrderType forName( java.lang.String value ) {
    if ( value.equals(ALPHABETIC.literalName) ) return ALPHABETIC;
    if ( value.equals(DATE.literalName) ) return DATE;
    if ( value.equals(NUMERIC.literalName) ) return NUMERIC;
    if ( value.equals(IN_SEQUENCE.literalName) ) return IN_SEQUENCE;
    throw new java.lang.IllegalArgumentException("Unknown enumeration value '"+value+"' for type 'DataMining.OrderType'");
  }

}
