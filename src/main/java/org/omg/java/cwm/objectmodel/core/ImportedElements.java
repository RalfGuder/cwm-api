package org.omg.java.cwm.objectmodel.core;


/**
 * The ImportedElements association identifies ModelElements that a Package instance 
 * imports from other Namespaces. Although any ModelElement may be imported by a 
 * Package, imported ModelElements are typically other Packages or aggregate
 * Classifiers, such as Class instances.
 */
public interface ImportedElements {

  public boolean exists(ModelElement importedElement, Package importer);

  /**
   * Identifies the Packages that import a ModelElement.
   * 
   * @param importedElement is a {@linkplain ModelElement} instance.
   * @return A Collection of zero ore more {@linkplain Package} instances.
   */
  public java.util.Collection<? extends Package> getImporter(ModelElement importedElement);

  /**
   * Identifies ModelElements imported by a Package.
   *
   * @param importer is {@linkplain Package} instance.
   * @return A Collection of zero ore more {@linkplain ModelElement} instances.
   */
  public java.util.Collection<? extends ModelElement> getImportedElement(Package importer);

  public boolean add(ModelElement importedElement, Package importer);

  public boolean remove(ModelElement importedElement, Package importer);

}
