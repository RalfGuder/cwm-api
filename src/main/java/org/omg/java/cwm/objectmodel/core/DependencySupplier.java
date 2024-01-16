package org.omg.java.cwm.objectmodel.core;

import java.util.Collection;

/**
 * The DependencySupplier association links Dependency instances with ModelElements 
 * that act as suppliers in the represented dependency relationship.
 */
public interface DependencySupplier {

  public boolean exists(ModelElement supplier, Dependency supplierDependency);

  public Collection<? extends Dependency> getSupplierDependency(ModelElement supplier);

  public Collection<? extends ModelElement> getSupplier(Dependency supplierDependency);

  public boolean add(ModelElement supplier, Dependency supplierDependency);

  public boolean remove(ModelElement supplier, Dependency supplierDependency);

}
