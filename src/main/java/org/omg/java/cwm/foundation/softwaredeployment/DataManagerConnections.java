/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.softwaredeployment;



public interface DataManagerConnections {

	public boolean exists( org.omg.java.cwm.foundation.softwaredeployment.DataManager dataManager, org.omg.java.cwm.foundation.softwaredeployment.ProviderConnection clientConnection );

	public java.util.Collection<? extends org.omg.java.cwm.foundation.softwaredeployment.ProviderConnection> getClientConnection( org.omg.java.cwm.foundation.softwaredeployment.DataManager dataManager );

	public org.omg.java.cwm.foundation.softwaredeployment.DataManager getDataManager( org.omg.java.cwm.foundation.softwaredeployment.ProviderConnection clientConnection );

	public boolean add( org.omg.java.cwm.foundation.softwaredeployment.DataManager dataManager, org.omg.java.cwm.foundation.softwaredeployment.ProviderConnection clientConnection );

	public boolean remove( org.omg.java.cwm.foundation.softwaredeployment.DataManager dataManager, org.omg.java.cwm.foundation.softwaredeployment.ProviderConnection clientConnection );

}
