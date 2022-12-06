/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.softwaredeployment;



public interface PackageUsageClass{

  public org.omg.java.cwm.foundation.softwaredeployment.PackageUsage createPackageUsage( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, java.lang.String _kind, java.lang.String _packageAlias );

  public org.omg.java.cwm.foundation.softwaredeployment.PackageUsage createPackageUsage();

}
