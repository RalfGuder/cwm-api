/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface AttributeUsageRelationClass{

  public org.omg.java.cwm.analysis.datamining.AttributeUsageRelation createAttributeUsageRelation( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, org.omg.java.cwm.analysis.datamining.AttributeUsage _usageType, boolean _includeInApplyResult, float _weight, boolean _suppressNormalization );

  public org.omg.java.cwm.analysis.datamining.AttributeUsageRelation createAttributeUsageRelation();

}
