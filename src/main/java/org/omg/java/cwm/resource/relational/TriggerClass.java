/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational;



public interface TriggerClass {

  public org.omg.java.cwm.resource.relational.Trigger createTrigger( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, org.omg.java.cwm.resource.relational.enumerations.EventManipulationType _eventManipulation, org.omg.java.cwm.objectmodel.core.BooleanExpression _actionCondition, org.omg.java.cwm.objectmodel.core.ProcedureExpression _actionStatement, org.omg.java.cwm.resource.relational.enumerations.ActionOrientationType _actionOrientation, org.omg.java.cwm.resource.relational.enumerations.ConditionTimingType _conditionTiming, java.lang.String _conditionReferenceNewTable, java.lang.String _conditionReferenceOldTable );

  public org.omg.java.cwm.resource.relational.Trigger createTrigger();

}
