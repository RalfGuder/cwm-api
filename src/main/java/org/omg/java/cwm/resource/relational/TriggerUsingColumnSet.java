/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational;



public interface TriggerUsingColumnSet {

  public boolean exists( org.omg.java.cwm.resource.relational.NamedColumnSet usedColumnSet, org.omg.java.cwm.resource.relational.Trigger usingTrigger );

  public java.util.Collection getUsingTrigger( org.omg.java.cwm.resource.relational.NamedColumnSet usedColumnSet );

  public java.util.Collection getUsedColumnSet( org.omg.java.cwm.resource.relational.Trigger usingTrigger );

  public boolean add( org.omg.java.cwm.resource.relational.NamedColumnSet usedColumnSet, org.omg.java.cwm.resource.relational.Trigger usingTrigger );

  public boolean remove( org.omg.java.cwm.resource.relational.NamedColumnSet usedColumnSet, org.omg.java.cwm.resource.relational.Trigger usingTrigger );

}
