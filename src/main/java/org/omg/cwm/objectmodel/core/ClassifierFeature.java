package org.omg.cwm.objectmodel.core;

import java.util.Collection;

/**
 * The <b>protected</b> ClassifierFeature association provides a composite aggregation containment
 * relationship between Classifiers and the Features they own. The feature end of the
 * association is ordered allowing preservation of the ordering of Features within their
 * owning Classifier. A Feature can be owned by at most one Classifier. The optional
 * character of ownership is intended as a convenience to tools, allowing them to create
 * Features prior to linking them to their owning Classifier. 
 *
 */
interface ClassifierFeature {
  
  boolean add(Classifier owner, Feature feature);
  
  boolean exists(Classifier owner, Feature feature);
  
  boolean remove(Classifier owner, Feature feature);
  
  /**
   * Identifies the Classifier instance that owns the Feature.
   *
   * @return an Classifier
   */
  Classifier getOwner(Feature feaure);
  
  /**
   * Identifies the Features owned by a Classifier instance and provides their ordering.
   *
   * @param owner as Classifier
   * @return an Collection
   */
  Collection<Feature> getFeature(Classifier owner);
}
