/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.relationships;



public interface AssociationEnd
extends org.omg.java.cwm.objectmodel.core.StructuralFeature {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.objectmodel.relationships.AggregationKind getAggregation();

  public void setAggregation( org.omg.java.cwm.objectmodel.relationships.AggregationKind value );

  public boolean isNavigable();

  public void setNavigable( boolean value );

}
