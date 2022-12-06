package org.omg.cwm.objectmodel.core;

import java.util.Collection;

/**
 * The <b>protected</b> DependencyClient association links Dependency instances 
 * with ModelElements that act as clients in the represented dependency relationship.
 *
 */
public interface DependencyClient {
  boolean add(ModelElement client, Dependency clientDependency);
  
  boolean exists(ModelElement client, Dependency clientDependency);
  
  boolean remove(ModelElement client, Dependency clientDependency);
  
  /**
   * Identifies the ModelElements that are clients of the Dependency instance.
   * 
   * <ul>
   * <li>class: ModelElement
   * <li>multiplicity: one or more
   * </ul>
   *
   * @param clientDependency Dependency
   * @return Collection
   */
  Collection<ModelElement> getClient(Dependency clientDependency);
  
  /**
   * Identifies Dependency instances in which the ModelElement acts as a client.
   * 
   * <ul>
   * <li>class: Dependency
   * <li>multiplicity: zero or more
   * </ul>
   * 
   *
   * @param client ModelElement
   * @return Collection
   */
  Collection<Dependency> getClientDependency(ModelElement client);
}
