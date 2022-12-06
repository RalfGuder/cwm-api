/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.softwaredeployment;



public interface RelatedSites{

  public boolean exists( org.omg.java.cwm.foundation.softwaredeployment.Site containingSite, org.omg.java.cwm.foundation.softwaredeployment.Site containedSite );

  public java.util.Collection<? extends org.omg.java.cwm.foundation.softwaredeployment.Site> getContainedSite( org.omg.java.cwm.foundation.softwaredeployment.Site containingSite );

  public java.util.Collection<? extends org.omg.java.cwm.foundation.softwaredeployment.Site> getContainingSite( org.omg.java.cwm.foundation.softwaredeployment.Site containedSite );

  public boolean add( org.omg.java.cwm.foundation.softwaredeployment.Site containingSite, org.omg.java.cwm.foundation.softwaredeployment.Site containedSite );

  public boolean remove( org.omg.java.cwm.foundation.softwaredeployment.Site containingSite, org.omg.java.cwm.foundation.softwaredeployment.Site containedSite );

}
