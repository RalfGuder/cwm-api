package org.omg.cwm.objectmodel.core;

import java.util.Collection;

/**
 * A feature is a property, like attribute or operation that is encapsulated within a
 * Classifier.
 * 
 * <p>In the metamodel a Feature declares a structural or behavioral characteristic of an
 * instance of a Classifier or of the Classifier itself. Feature is an <b>abstract</b>
 * metaclass.
 *
 */
public interface Feature extends ModelElement {

  /**
   * Specifies whether the Feature appears in every instance of the Classifier or whether it appears
   * only once for the entire Classifier.
   * 
   * <ul>
   * <li>type: ScopeKind
   * <li>multiplicity: zero or one
   * </ul>
   *
   * @return a ScopeKind
   */
  ScopeKind getOwnerScope();

  /**
   * Specifies whether the Feature appears in every instance of the Classifier or whether it appears
   * only once for the entire Classifier.
   * 
   * <ul>
   * <li>type: ScopeKind
   * <li>multiplicity: zero or one
   * </ul>
   *
   * @param scopeKind is a ScopeKind
   */
  void setOwnerScope(ScopeKind scopeKind);

  /**
   * The Classifier declaring the Feature.
   * 
   * <ul>
   * <li>class: Classifier
   * <li>defined by: ClassifierFeature::owner
   * <li>multiplicity: zero or more
   * <li>inverse: Classifier::feature
   * </ul>
   *
   * @return a collection
   */
  Collection<Classifier> getOwner();
}
