/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.softwaredeployment;



public interface SoftwareSystemDeployments{

	public boolean exists( org.omg.java.cwm.foundation.softwaredeployment.DeployedSoftwareSystem deployment, org.omg.java.cwm.foundation.softwaredeployment.SoftwareSystem softwareSystem );

	public org.omg.java.cwm.foundation.softwaredeployment.SoftwareSystem getSoftwareSystem( org.omg.java.cwm.foundation.softwaredeployment.DeployedSoftwareSystem deployment );

	public java.util.Collection<? extends org.omg.java.cwm.foundation.softwaredeployment.DeployedSoftwareSystem> getDeployment( org.omg.java.cwm.foundation.softwaredeployment.SoftwareSystem softwareSystem );

	public boolean add( org.omg.java.cwm.foundation.softwaredeployment.DeployedSoftwareSystem deployment, org.omg.java.cwm.foundation.softwaredeployment.SoftwareSystem softwareSystem );

	public boolean remove( org.omg.java.cwm.foundation.softwaredeployment.DeployedSoftwareSystem deployment, org.omg.java.cwm.foundation.softwaredeployment.SoftwareSystem softwareSystem );

}
