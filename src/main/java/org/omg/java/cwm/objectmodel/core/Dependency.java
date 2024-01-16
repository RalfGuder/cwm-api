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



  public java.lang.String getKind();

  public void setKind( java.lang.String value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.ModelElement> getClient();

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.ModelElement> getSupplier();

}
