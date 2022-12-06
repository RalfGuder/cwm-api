/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface DimensionClass {

  public org.omg.java.cwm.analysis.olap.Dimension createDimension( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, boolean _isAbstract, boolean _isTime, boolean _isMeasure );

  public org.omg.java.cwm.analysis.olap.Dimension createDimension();

}
