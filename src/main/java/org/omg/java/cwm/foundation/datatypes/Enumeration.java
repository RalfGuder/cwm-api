/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.datatypes;



/**
 * The <tt>Enumeration</tt> class is intended as a starting point from which 
 * enumerated data types can be created. An enumerated data type is a collection 
 * of identifiers often used as the permitted states that some other attribute or 
 * property of the enumerated type may take.
 *
 * <p>The <i>isOrdered</i> attribute of an Enumeration instance is used to 
 * determine if the ordered constraint on the EnumerationLiterals association 
 * is relevant for the enumeration. The particular ordering of EnumerationLiteral 
 * instances is obtained from the ordered constraint on the association even if 
 * the <i>value</i> attributes of the EnumerationLiteral instances contain 
 * non-null values that might be used to determine ordering. This is done to 
 * provide more flexible ordering semantics.
 * 
 * <p>An instance of <tt>Enumeration</tt> is also required to create a range data type. 
 * Refer to the {@link EnumerationLiteral} class for details.
 */
public interface Enumeration
extends org.omg.java.cwm.objectmodel.core.DataType {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  /**
   * If True, the ordered constraint on the {@link EnumerationLiteral} association 
   * is relevant. Otherwise, the ordering of EnumerationLiteral instances is 
   * considered unspecified.
   * 
   * @return <tt>true</tt> or <tt>false</tt>
   */
  public boolean isOrdered();

  public void setOrdered( boolean value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  /**
   * Identifies the EnumerationLiteral instances relevant for a particular Enumeration 
   * instance. If the Enumeration’s isOrdered attribute is True, the ordering 
   * constraint on this reference end can be used to determine a logical ordering 
   * for the EnumerationLiteral instances. Otherwise, ordering is ignored.
   * @return Collection
   */
  public java.util.Collection<? extends org.omg.java.cwm.foundation.datatypes.EnumerationLiteral> getLiteral();

}
