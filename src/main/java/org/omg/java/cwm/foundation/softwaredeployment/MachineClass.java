/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.softwaredeployment;



public interface MachineClass {

  public org.omg.java.cwm.foundation.softwaredeployment.Machine createMachine( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, java.util.List<String> _ipAddress, java.util.List<String> _hostName, java.lang.String _machineId );

  public org.omg.java.cwm.foundation.softwaredeployment.Machine createMachine();

}
