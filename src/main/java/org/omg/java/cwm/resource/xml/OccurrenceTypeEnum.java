/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.xml;



public final class OccurrenceTypeEnum
implements org.omg.java.cwm.resource.xml.OccurrenceType {



public static final org.omg.java.cwm.resource.xml.OccurrenceTypeEnum XML_ONE = new OccurrenceTypeEnum("xml_one");

  public static final org.omg.java.cwm.resource.xml.OccurrenceTypeEnum XML_ZERO_OR_ONE = new OccurrenceTypeEnum("xml_zeroOrOne");

  public static final org.omg.java.cwm.resource.xml.OccurrenceTypeEnum XML_ZERO_OR_MORE = new OccurrenceTypeEnum("xml_zeroOrMore");

  public static final org.omg.java.cwm.resource.xml.OccurrenceTypeEnum XML_ONE_OR_MORE = new OccurrenceTypeEnum("xml_oneOrMore");

  private static final java.util.List<String> typeName = java.util.Collections.unmodifiableList(java.util.Arrays.asList(new String[] {"XML","OccurrenceType"}));

  private final java.lang.String literalName;

  public static final org.omg.java.cwm.resource.xml.OccurrenceTypeEnum XML_CHOICE = new OccurrenceTypeEnum("xml_choice");

  public static final org.omg.java.cwm.resource.xml.OccurrenceTypeEnum XML_SEQUENCE = new OccurrenceTypeEnum("xml_sequence");

  private OccurrenceTypeEnum( java.lang.String literalName ) {
    this.literalName = literalName;
  }

  public java.util.List<String> refTypeName() {
    return typeName;
  }

  public java.lang.String toString() {
    return literalName;
  }

  public boolean equals( java.lang.Object other ) {
    return (other instanceof org.omg.java.cwm.resource.xml.OccurrenceTypeEnum)?other == this:false;
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

  public static org.omg.java.cwm.resource.xml.OccurrenceType forName( java.lang.String value ) {
    if ( value.equals(XML_ONE.literalName) ) return XML_ONE;
    if ( value.equals(XML_ZERO_OR_ONE.literalName) ) return XML_ZERO_OR_ONE;
    if ( value.equals(XML_ZERO_OR_MORE.literalName) ) return XML_ZERO_OR_MORE;
    if ( value.equals(XML_ONE_OR_MORE.literalName) ) return XML_ONE_OR_MORE;
    throw new java.lang.IllegalArgumentException("Unknown enumeration value '"+value+"' for type 'XML.OccurrenceType'");
  }

}
