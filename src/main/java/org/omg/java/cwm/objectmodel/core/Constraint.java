/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.core;



public interface Constraint
extends org.omg.java.cwm.objectmodel.core.ModelElement {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.objectmodel.core.BooleanExpression getBody();

  public void setBody( org.omg.java.cwm.objectmodel.core.BooleanExpression value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public java.util.List<? extends org.omg.java.cwm.objectmodel.core.ModelElement> getConstrainedElement();

}
