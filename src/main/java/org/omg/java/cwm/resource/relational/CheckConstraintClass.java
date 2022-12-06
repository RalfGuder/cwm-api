/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational;



public interface CheckConstraintClass{

  public org.omg.java.cwm.resource.relational.CheckConstraint createCheckConstraint( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, org.omg.java.cwm.objectmodel.core.BooleanExpression _body, org.omg.java.cwm.resource.relational.enumerations.DeferrabilityType _deferrability );

  public org.omg.java.cwm.resource.relational.CheckConstraint createCheckConstraint();

}
