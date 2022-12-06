package org.omg.cwm.objectmodel.core;


/**
 * The DependencySupplier association links Dependency instances with ModelElements
 * that act as suppliers in the represented dependency relationship.
 */
public interface DependencySupplier {
  boolean add(ModelElement supplier, Dependency supplierDependency);
  
  boolean exists(ModelElement supplier, Dependency supplierDependency);

  boolean remove(ModelElement supplier, Dependency supplierDependency);
  
  /**
   * Identifies the ModelElements that are suppliers of the Dependency instance.
   * 
   * <ul>
   * <li>class: ModelElement
   * <li>multiplicity: one or more
   * </ul>
   *
   * @param supplierDependency Dependency
   * @return Collection
   */
  java.util.Collection<ModelElement> getSupplier(Dependency supplierDependency);
  
  /**
   * The DependencySupplier association links Dependency instances with ModelElements that
   * act as suppliers in the represented dependency relationship.
   * 
   * <ul>
   * <li>class: Dependency
   * <li>multiplicity: zero or more
   * </ul>
   *
   * @param supplier ModelElement
   * @return Collection
   */
  java.util.Collection<Dependency> getSupplierDependency(ModelElement supplier);
  
}
