/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.record;



public interface RecordFileClass {

  public org.omg.java.cwm.resource.record.RecordFile createRecordFile( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, boolean _isSelfDescribing, java.lang.Integer _recordDelimiter, java.lang.Integer _skipRecords );

  public org.omg.java.cwm.resource.record.RecordFile createRecordFile();

}
