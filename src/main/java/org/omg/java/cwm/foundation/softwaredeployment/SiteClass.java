/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.softwaredeployment;



public interface SiteClass {

  public org.omg.java.cwm.foundation.softwaredeployment.Site createSite( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, java.lang.String _locationType, java.lang.String _address, java.lang.String _city, java.lang.String _postCode, java.lang.String _area, java.lang.String _country );

  public org.omg.java.cwm.foundation.softwaredeployment.Site createSite();

}
