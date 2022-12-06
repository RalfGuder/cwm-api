/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.softwaredeployment;



public interface DataManagerDataPackage {

	public boolean exists( org.omg.java.cwm.objectmodel.core.Package dataPackage, org.omg.java.cwm.foundation.softwaredeployment.DataManager dataManager );

	public java.util.Collection<? extends org.omg.java.cwm.foundation.softwaredeployment.DataManager> getDataManager( org.omg.java.cwm.objectmodel.core.Package dataPackage );

	public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.Package> getDataPackage( org.omg.java.cwm.foundation.softwaredeployment.DataManager dataManager );

	public boolean add( org.omg.java.cwm.objectmodel.core.Package dataPackage, org.omg.java.cwm.foundation.softwaredeployment.DataManager dataManager );

	public boolean remove( org.omg.java.cwm.objectmodel.core.Package dataPackage, org.omg.java.cwm.foundation.softwaredeployment.DataManager dataManager );

}
