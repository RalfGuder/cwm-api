/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.core;

import javax.jmi.reflect.RefAssociation;

public interface DependencySupplier extends RefAssociation{

  public boolean exists( org.omg.java.cwm.objectmodel.core.ModelElement supplier, org.omg.java.cwm.objectmodel.core.Dependency supplierDependency );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.Dependency> getSupplierDependency( org.omg.java.cwm.objectmodel.core.ModelElement supplier );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.ModelElement> getSupplier( org.omg.java.cwm.objectmodel.core.Dependency supplierDependency );

  public boolean add( org.omg.java.cwm.objectmodel.core.ModelElement supplier, org.omg.java.cwm.objectmodel.core.Dependency supplierDependency );

  public boolean remove( org.omg.java.cwm.objectmodel.core.ModelElement supplier, org.omg.java.cwm.objectmodel.core.Dependency supplierDependency );

}
