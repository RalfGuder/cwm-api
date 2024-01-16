package org.omg.java.cwm.objectmodel.core;

import java.util.Collection;

/**
 * The DependencyClient association links Dependency instances with
 * ModelElements that act as clients in the represented dependency relationship.
 */
public interface DependencyClient {

  public boolean exists(ModelElement client, Dependency clientDependency);

  /**
   * Identifies Dependency instances in which the ModelElement acts as a client.
   */
  public Collection<? extends Dependency> getClientDependency(ModelElement client);

  /**
   * Identifies the ModelElements that are clients of the Dependency instance.
   *
   * @param clientDependency is an {@linkplain Dependency} instance.
   * @return A Collection of one or more {@linkplain ModelElement} instances.
   */
  public Collection<? extends ModelElement> getClient(Dependency clientDependency);

  public boolean add(ModelElement client, Dependency clientDependency);

  public boolean remove(ModelElement client, Dependency clientDependency);

}
