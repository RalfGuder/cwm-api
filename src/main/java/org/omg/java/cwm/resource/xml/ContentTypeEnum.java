/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.xml;



public final class ContentTypeEnum
implements org.omg.java.cwm.resource.xml.ContentType {

  public static final org.omg.java.cwm.resource.xml.ContentTypeEnum XML_EMPTY = new ContentTypeEnum("xml_empty");

  public static final org.omg.java.cwm.resource.xml.ContentTypeEnum XML_ANY = new ContentTypeEnum("xml_any");

  public static final org.omg.java.cwm.resource.xml.ContentTypeEnum XML_MIXED = new ContentTypeEnum("xml_mixed");

  public static final org.omg.java.cwm.resource.xml.ContentTypeEnum XML_ELEMENT = new ContentTypeEnum("xml_element");

  private static final java.util.List typeName = java.util.Collections.unmodifiableList(java.util.Arrays.asList(new String[] {"XML","ContentType"}));

  private final java.lang.String literalName;

  private ContentTypeEnum( java.lang.String literalName ) {
    this.literalName = literalName;
  }

  public java.util.List refTypeName() {
    return typeName;
  }

  public java.lang.String toString() {
    return literalName;
  }

  public boolean equals( java.lang.Object other ) {
    return (other instanceof org.omg.java.cwm.resource.xml.ContentTypeEnum)?other == this: false;
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

  public static org.omg.java.cwm.resource.xml.ContentType forName( java.lang.String value ) {
    if ( value.equals(XML_EMPTY.literalName) ) return XML_EMPTY;
    if ( value.equals(XML_ANY.literalName) ) return XML_ANY;
    if ( value.equals(XML_MIXED.literalName) ) return XML_MIXED;
    if ( value.equals(XML_ELEMENT.literalName) ) return XML_ELEMENT;
    throw new java.lang.IllegalArgumentException("Unknown enumeration value '"+value+"' for type 'XML.ContentType'");
  }

}
