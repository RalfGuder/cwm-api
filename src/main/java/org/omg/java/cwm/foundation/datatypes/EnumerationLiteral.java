/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.datatypes;


/**
 * EnumerationLiteral instances describe the enumeration identifiers, and 
 * possibly the values, associated with an enumerated data type. Enumeration 
 * identifiers are contained in the name attribute derived from the 
 * EnumerationLiteral instance’s ModelElement superclass.
 *
 * <p>EnumerationLiteral instances may also be used to define expression-based 
 * values such as ranges. To do so, simply state the membership expression in 
 * the instance’s value. For example, a range literal can be created by setting 
 * the value attribute to "m..n", where m represents the lower bound of the 
 * range, and n, the upper bound. In this way, ranges and other more complicated 
 * expressions can be intermixed with simple enumeration literals. For example, 
 * an enumeration might contain the literals "1", "2", "4..7", and "> 10".
 * 
 * <p>Consequently, a simple range data type can be created with an Enumeration 
 * instance that owns a single EnumerationLiteral instance. For example, a data 
 * type for positive integers could be created as shown in Figure 5-6. A model 
 * attribute of this data type might then be declared as "posInt : PositiveInteger".
 */
public interface EnumerationLiteral
extends org.omg.java.cwm.objectmodel.core.ModelElement {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  /**
   * The value associated with an enumeration identifier can be stored here. The 
   * attribute is optional because enumeration literals are not required to have 
   * a specific, displayable value. This is indicated by either an empty value 
   * attribute or a value attribute value whose expression body attribute is a 
   * zero-length string.
   * 
   * @return Expression
   */
  public org.omg.java.cwm.objectmodel.core.Expression getValue();

  public void setValue( org.omg.java.cwm.objectmodel.core.Expression value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  /**
   * Identifies the Enumeration instance for which this enumeration literal is 
   * relevant.
   * 
   * @return Enumeration
   */
  public org.omg.java.cwm.foundation.datatypes.Enumeration getEnumeration();

  public void setEnumeration( org.omg.java.cwm.foundation.datatypes.Enumeration value );

}
