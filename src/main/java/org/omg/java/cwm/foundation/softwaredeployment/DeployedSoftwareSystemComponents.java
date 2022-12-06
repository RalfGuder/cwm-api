/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.softwaredeployment;



public interface DeployedSoftwareSystemComponents{

  public boolean exists( org.omg.java.cwm.foundation.softwaredeployment.DeployedSoftwareSystem deployedSoftwareSystem, org.omg.java.cwm.foundation.softwaredeployment.DeployedComponent deployedComponent );

  public java.util.Collection<? extends org.omg.java.cwm.foundation.softwaredeployment.DeployedComponent> getDeployedComponent( org.omg.java.cwm.foundation.softwaredeployment.DeployedSoftwareSystem deployedSoftwareSystem );

  public java.util.Collection<? extends org.omg.java.cwm.foundation.softwaredeployment.DeployedSoftwareSystem> getDeployedSoftwareSystem( org.omg.java.cwm.foundation.softwaredeployment.DeployedComponent deployedComponent );

  public boolean add( org.omg.java.cwm.foundation.softwaredeployment.DeployedSoftwareSystem deployedSoftwareSystem, org.omg.java.cwm.foundation.softwaredeployment.DeployedComponent deployedComponent );

  public boolean remove( org.omg.java.cwm.foundation.softwaredeployment.DeployedSoftwareSystem deployedSoftwareSystem, org.omg.java.cwm.foundation.softwaredeployment.DeployedComponent deployedComponent );

}
