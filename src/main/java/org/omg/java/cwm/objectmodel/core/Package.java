package org.omg.java.cwm.objectmodel.core;


/**
 * A package is a grouping of model elements. 
 * 
 * <p>In the metamodel Package is a subclass of Namespace. A Package contains ModelElements 
 * such as Packages and Classifiers. A Package may also contain Constraints and 
 * Dependencies between ModelElements of the Package.
 * 
 * <p>The purpose of the package construct is to provide a general grouping mechanism. 
 * In fact, its only semantics is to define a namespace for its contents. The package 
 * construct can be used for organizing elements for any purpose; the criteria to 
 * use for grouping elements together into one package are not defined.
 * 
 * <p>A package owns a set of model elements, with the implication that if the package 
 * is removed from the model, so are the elements owned by the package. Elements 
 * with names, such as classifiers, that are owned by the same package must have 
 * unique names within the package, although elements in different packages may 
 * have the same name.
 * 
 * <p>There may be relationships between elements contained in the same package, 
 * and between an element in one package and an element in a surrounding package 
 * at any level. In other words, elements “see” all the way out through nested levels 
 * of packages. Elements in peer packages, however, are encapsulated and are not 
 * a priori visible to each other. The same goes for elements in contained 
 * packages; that is, packages do not see 'inwards'.
 * 
 * <p>Elements owned by a Package can be made available to other Packages by importing 
 * them. Although any ModelElement may be imported by a Package, imported ModelElements 
 * are typically other Packages. When an element is imported by a package it extends 
 * the namespace of that package. Thus the elements available in a Package consists 
 * of its owned and imported ModelElements.
 *
 */
public interface Package extends Namespace {

  // ------------------------------------------------
  // ----- Reference-Generated -----
  // ------------------------------------------------

  /**
   * Gets the '' property value.
   * 
   * <p>The namespace defined by the package is extended by model elements imported 
   * from other packages.
   *
   * @return A Collection of zero or more ModelElement instances.
   */
  public java.util.Collection<? extends ModelElement> getImportedElement();

}
