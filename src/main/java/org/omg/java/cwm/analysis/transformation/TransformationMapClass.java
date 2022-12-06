/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.transformation;



public interface TransformationMapClass{

  public org.omg.java.cwm.analysis.transformation.TransformationMap createTransformationMap( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, org.omg.java.cwm.objectmodel.core.ProcedureExpression _function, java.lang.String _functionDescription, boolean _isPrimary );

  public org.omg.java.cwm.analysis.transformation.TransformationMap createTransformationMap();

}
