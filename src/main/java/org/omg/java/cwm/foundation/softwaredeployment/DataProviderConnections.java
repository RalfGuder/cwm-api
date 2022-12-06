/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.softwaredeployment;



public interface DataProviderConnections{

  public boolean exists( org.omg.java.cwm.foundation.softwaredeployment.DataProvider dataProvider, org.omg.java.cwm.foundation.softwaredeployment.ProviderConnection resourceConnection );

  public java.util.Collection<? extends org.omg.java.cwm.foundation.softwaredeployment.ProviderConnection> getResourceConnection( org.omg.java.cwm.foundation.softwaredeployment.DataProvider dataProvider );

  public org.omg.java.cwm.foundation.softwaredeployment.DataProvider getDataProvider( org.omg.java.cwm.foundation.softwaredeployment.ProviderConnection resourceConnection );

  public boolean add( org.omg.java.cwm.foundation.softwaredeployment.DataProvider dataProvider, org.omg.java.cwm.foundation.softwaredeployment.ProviderConnection resourceConnection );

  public boolean remove( org.omg.java.cwm.foundation.softwaredeployment.DataProvider dataProvider, org.omg.java.cwm.foundation.softwaredeployment.ProviderConnection resourceConnection );

}
