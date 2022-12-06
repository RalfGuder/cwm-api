/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.transformation;



public interface PrecedenceConstraintClass{

  public org.omg.java.cwm.analysis.transformation.PrecedenceConstraint createPrecedenceConstraint( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, org.omg.java.cwm.objectmodel.core.BooleanExpression _body );

  public org.omg.java.cwm.analysis.transformation.PrecedenceConstraint createPrecedenceConstraint();

}
