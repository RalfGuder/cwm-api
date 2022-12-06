/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.softwaredeployment;



public interface ComponentDeployments {

	public boolean exists( org.omg.java.cwm.foundation.softwaredeployment.Component component, org.omg.java.cwm.foundation.softwaredeployment.DeployedComponent deployment );

	public java.util.Collection<? extends org.omg.java.cwm.foundation.softwaredeployment.DeployedComponent> getDeployment( org.omg.java.cwm.foundation.softwaredeployment.Component component );

	public org.omg.java.cwm.foundation.softwaredeployment.Component getComponent( org.omg.java.cwm.foundation.softwaredeployment.DeployedComponent deployment );

	public boolean add( org.omg.java.cwm.foundation.softwaredeployment.Component component, org.omg.java.cwm.foundation.softwaredeployment.DeployedComponent deployment );

	public boolean remove( org.omg.java.cwm.foundation.softwaredeployment.Component component, org.omg.java.cwm.foundation.softwaredeployment.DeployedComponent deployment );

}
