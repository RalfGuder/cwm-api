/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.record;



public interface RecordToFile {

  public boolean exists( org.omg.java.cwm.resource.record.RecordFile file, org.omg.java.cwm.resource.record.RecordDef record );

  public java.util.List getRecord( org.omg.java.cwm.resource.record.RecordFile file );

  public java.util.Collection getFile( org.omg.java.cwm.resource.record.RecordDef record );

  public boolean add( org.omg.java.cwm.resource.record.RecordFile file, org.omg.java.cwm.resource.record.RecordDef record );

  public boolean remove( org.omg.java.cwm.resource.record.RecordFile file, org.omg.java.cwm.resource.record.RecordDef record );

}
