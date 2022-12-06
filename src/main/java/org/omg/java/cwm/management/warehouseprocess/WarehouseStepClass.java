/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseprocess;



public interface WarehouseStepClass{

  public org.omg.java.cwm.management.warehouseprocess.WarehouseStep createWarehouseStep( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, boolean _staticDefinition, boolean _isSequential );

  public org.omg.java.cwm.management.warehouseprocess.WarehouseStep createWarehouseStep();

}
