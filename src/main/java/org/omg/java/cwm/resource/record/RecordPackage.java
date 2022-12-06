/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.record;



public interface RecordPackage {

  public org.omg.java.cwm.objectmodel.core.CorePackage getCore();

  public org.omg.java.cwm.objectmodel.instance.InstancePackage getInstance();

  public org.omg.java.cwm.resource.record.FieldClass getField();

  public org.omg.java.cwm.resource.record.RecordDefClass getRecordDef();

  public org.omg.java.cwm.resource.record.FixedOffsetFieldClass getFixedOffsetField();

  public org.omg.java.cwm.resource.record.RecordFileClass getRecordFile();

  public org.omg.java.cwm.resource.record.FieldValueClass getFieldValue();

  public org.omg.java.cwm.resource.record.RecordClass getRecord();

  public org.omg.java.cwm.resource.record.RecordSetClass getRecordSet();

  public org.omg.java.cwm.resource.record.GroupClass getGroup();

  public org.omg.java.cwm.resource.record.RecordToFile getRecordToFile();

}
