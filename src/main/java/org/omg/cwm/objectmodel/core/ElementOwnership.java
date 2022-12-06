package org.omg.cwm.objectmodel.core;

import java.util.Collection;

/**
 * The <b>protected</b> ElementOwnership association identifies ModelElements owned 
 * by Namespaces. ModelElements may be owned by at most one Namespace. Refer to the above
 * discussion of the Namespace class for more information on the nature of the ownership
 * relationship between Namespaces and ModelElements.
 */
public interface ElementOwnership {
  
  boolean add(ModelElement ownedElement, Namespace namespace);
  
  boolean exists(ModelElement ownedElement, Namespace namespace);
  
  boolean remove(ModelElement ownedElement, Namespace namespace);
  
  /**
   * Identifies the ModelElements owned by a Namespace.
   *
   * @param namespace is a Namespace instance.
   * @return Zero or more ModelElements as a collection.
   */
  Collection<ModelElement> getOwnedElement(Namespace namespace);

  /**
   * Identifies the Namespace, if any, that owns the ModelElement.
   *
   * @param ownedElement as a ModelElement instance.
   * @return Zero or one instance of type Namespace.
   */
  Namespace getNamespace(ModelElement ownedElement);
}
