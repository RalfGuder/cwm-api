/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface OrdinalAttribute
extends org.omg.java.cwm.analysis.datamining.CategoricalAttribute {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public boolean isCyclic();

  public void setCyclic( boolean value );

  public org.omg.java.cwm.analysis.datamining.OrderType getOrderingType();

  public void setOrderingType( org.omg.java.cwm.analysis.datamining.OrderType value );

}
