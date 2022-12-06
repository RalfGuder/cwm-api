/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface CubeRegionClass {

  public org.omg.java.cwm.analysis.olap.CubeRegion createCubeRegion( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, boolean _isAbstract, boolean _isReadOnly, boolean _isFullyRealized );

  public org.omg.java.cwm.analysis.olap.CubeRegion createCubeRegion();

}
