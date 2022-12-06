/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational;



public interface TableOwningTrigger {

  public boolean exists( org.omg.java.cwm.resource.relational.Table table, org.omg.java.cwm.resource.relational.Trigger trigger );

  public java.util.List getTrigger( org.omg.java.cwm.resource.relational.Table table );

  public org.omg.java.cwm.resource.relational.Table getTable( org.omg.java.cwm.resource.relational.Trigger trigger );

  public boolean add( org.omg.java.cwm.resource.relational.Table table, org.omg.java.cwm.resource.relational.Trigger trigger );

  public boolean remove( org.omg.java.cwm.resource.relational.Table table, org.omg.java.cwm.resource.relational.Trigger trigger );

}
