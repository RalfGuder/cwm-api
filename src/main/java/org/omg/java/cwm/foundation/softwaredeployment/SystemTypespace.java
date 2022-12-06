/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.softwaredeployment;



public interface SystemTypespace {

  public boolean exists( org.omg.java.cwm.foundation.typemapping.TypeSystem typespace, org.omg.java.cwm.foundation.softwaredeployment.SoftwareSystem supportingSystem );

  public java.util.Collection<? extends org.omg.java.cwm.foundation.softwaredeployment.SoftwareSystem> getSupportingSystem( org.omg.java.cwm.foundation.typemapping.TypeSystem typespace );

  public java.util.Collection<? extends org.omg.java.cwm.foundation.typemapping.TypeSystem> getTypespace( org.omg.java.cwm.foundation.softwaredeployment.SoftwareSystem supportingSystem );

  public boolean add( org.omg.java.cwm.foundation.typemapping.TypeSystem typespace, org.omg.java.cwm.foundation.softwaredeployment.SoftwareSystem supportingSystem );

  public boolean remove( org.omg.java.cwm.foundation.typemapping.TypeSystem typespace, org.omg.java.cwm.foundation.softwaredeployment.SoftwareSystem supportingSystem );

}
