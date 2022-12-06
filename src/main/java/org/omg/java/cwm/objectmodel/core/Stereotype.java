/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.core;



public interface Stereotype
extends org.omg.java.cwm.objectmodel.core.ModelElement {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public java.lang.String getBaseClass();

  public void setBaseClass( java.lang.String value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.ModelElement> getExtendedElement();
  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.TaggedValue> getRequiredTag();
  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.Constraint> getStereotypeConstraint();

}
