/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.softwaredeployment;



public interface SiteMachines{

  public boolean exists( org.omg.java.cwm.foundation.softwaredeployment.Site site, org.omg.java.cwm.foundation.softwaredeployment.Machine machine );

  public java.util.Collection<? extends org.omg.java.cwm.foundation.softwaredeployment.Machine> getMachine( org.omg.java.cwm.foundation.softwaredeployment.Site site );

  public org.omg.java.cwm.foundation.softwaredeployment.Site getSite( org.omg.java.cwm.foundation.softwaredeployment.Machine machine );

  public boolean add( org.omg.java.cwm.foundation.softwaredeployment.Site site, org.omg.java.cwm.foundation.softwaredeployment.Machine machine );

  public boolean remove( org.omg.java.cwm.foundation.softwaredeployment.Site site, org.omg.java.cwm.foundation.softwaredeployment.Machine machine );

}
