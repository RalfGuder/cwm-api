package org.omg.java.cwm.objectmodel.core;

/**
 * A dependency states that the implementation or functioning of one or more elements
 * requires the presence of one or more other elements.
 *
 * <p>In the metamodel a Dependency is a directed relationship from a client (or clients) to a
 * supplier (or suppliers) stating that the client is dependent on the supplier; that is, the
 * client element requires the presence and knowledge of the supplier element.
 *
 * <p>A dependency specifies that the semantics of a set of model elements requires the
 * presence of another set of model elements. This implies that if the source is somehow
 * modified, the dependents probably must be modified. The reason for the dependency
 * can be specified in several different ways (for example, using natural language or an
 * algorithm) but is often implicit.
 * 
 * <p>Whenever the supplier element of a dependency changes, the client element is
 * potentially invalidated. After such invalidation, a check should be performed followed
 * by possible changes to the derived client element. Such a check should be performed
 * after which action can be taken to change the derived element to validate it again.
 */
public interface Dependency extends ModelElement {


  /**
   * Gets the 'kind' property value.
   *
   * <p>Contains a description of the nature of the dependency relationship between the client and
   * supplier. The list of possible values is open-ended. However, CWM predefines the values
   * "Abstraction" and "Usage".
	 *
	 * @return A String instance or <tt>null<tt>.
   */
  public String getKind();


  /**
   * Sets the 'kind' property value.
   *
   * <p>Contains a description of the nature of the dependency relationship between the client and
   * supplier. The list of possible values is open-ended. However, CWM predefines the values
   * "Abstraction" and "Usage".
	 *
	 * 
   */
  public void setKind( String value );

  /**
   * Gets the 'client' property value.
   *
   * <p>The element that is affected by the supplier element. In some cases the direction is
   * unimportant and serves only to distinguish the two elements.
	 *
	 * @return A Collection of one or more {@linkplain ModelElement} instances.
   */
  public Collection<? extends ModelElement> getClient();

  /**
	 * Gets the 'supplier' property value.
	 *
	 * <p>Inverse of client. Designates the element that is unaffected by a change. In a two-way
   * relationship this would be the more general element. In an undirected situation the choice of
   * client and supplier may be irrelevant.	 
	 *
	 * @return A Collection of one or more {@linkplain ModelElement} instances.
	 */
  public Collection<? extends ModelElement> getSupplier();

}
