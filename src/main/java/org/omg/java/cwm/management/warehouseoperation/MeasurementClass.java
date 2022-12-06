/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseoperation;



public interface MeasurementClass {

  public org.omg.java.cwm.management.warehouseoperation.Measurement createMeasurement( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, float _value, java.lang.String _unit, java.lang.String _type, java.lang.String _creationDate, java.lang.String _effectiveDate );

  public org.omg.java.cwm.management.warehouseoperation.Measurement createMeasurement();

}
