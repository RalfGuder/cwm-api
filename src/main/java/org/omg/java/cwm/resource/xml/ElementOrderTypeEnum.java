/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.xml;



public final class ElementOrderTypeEnum
implements org.omg.java.cwm.resource.xml.ElementOrderType {

  public static final org.omg.java.cwm.resource.xml.ElementOrderTypeEnum XML_CHOICE = new ElementOrderTypeEnum("xml_choice");

  public static final org.omg.java.cwm.resource.xml.ElementOrderTypeEnum XML_SEQUENCE = new ElementOrderTypeEnum("xml_sequence");

  private static final java.util.List typeName = java.util.Collections.unmodifiableList(java.util.Arrays.asList(new String[] {"XML","ElementOrderType"}));

  private final java.lang.String literalName;

  private ElementOrderTypeEnum( java.lang.String literalName ) {
    this.literalName = literalName;
  }

  public java.util.List refTypeName() {
    return typeName;
  }

  public java.lang.String toString() {
    return literalName;
  }

  public boolean equals( java.lang.Object other ) {
    return (other instanceof org.omg.java.cwm.resource.xml.ElementOrderTypeEnum)?other == this:false;
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

  public static org.omg.java.cwm.resource.xml.ElementOrderType forName( java.lang.String value ) {
    if ( value.equals(XML_CHOICE.literalName) ) return XML_CHOICE;
    if ( value.equals(XML_SEQUENCE.literalName) ) return XML_SEQUENCE;
    throw new java.lang.IllegalArgumentException("Unknown enumeration value '"+value+"' for type 'XML.ElementOrderType'");
  }

}
