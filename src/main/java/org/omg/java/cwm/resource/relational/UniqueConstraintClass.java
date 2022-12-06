/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational;



public interface UniqueConstraintClass{

  public org.omg.java.cwm.resource.relational.UniqueConstraint createUniqueConstraint( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, org.omg.java.cwm.resource.relational.enumerations.DeferrabilityType _deferrability );

  public org.omg.java.cwm.resource.relational.UniqueConstraint createUniqueConstraint();

}
