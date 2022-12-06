/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational;



public interface Trigger
extends org.omg.java.cwm.objectmodel.core.ModelElement {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.resource.relational.enumerations.EventManipulationType getEventManipulation();

  public void setEventManipulation( org.omg.java.cwm.resource.relational.enumerations.EventManipulationType value );

  public org.omg.java.cwm.objectmodel.core.BooleanExpression getActionCondition();

  public void setActionCondition( org.omg.java.cwm.objectmodel.core.BooleanExpression value );

  public org.omg.java.cwm.objectmodel.core.ProcedureExpression getActionStatement();

  public void setActionStatement( org.omg.java.cwm.objectmodel.core.ProcedureExpression value );

  public org.omg.java.cwm.resource.relational.enumerations.ActionOrientationType getActionOrientation();

  public void setActionOrientation( org.omg.java.cwm.resource.relational.enumerations.ActionOrientationType value );

  public org.omg.java.cwm.resource.relational.enumerations.ConditionTimingType getConditionTiming();

  public void setConditionTiming( org.omg.java.cwm.resource.relational.enumerations.ConditionTimingType value );

  public java.lang.String getConditionReferenceNewTable();

  public void setConditionReferenceNewTable( java.lang.String value );

  public java.lang.String getConditionReferenceOldTable();

  public void setConditionReferenceOldTable( java.lang.String value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.resource.relational.Table getTable();

  public void setTable( org.omg.java.cwm.resource.relational.Table value );

  public java.util.Collection getUsedColumnSet();

}
