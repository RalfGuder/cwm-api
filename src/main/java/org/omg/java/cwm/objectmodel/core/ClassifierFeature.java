package org.omg.java.cwm.objectmodel.core;

/**
 * The ClassifierFeature association provides a composite aggregation
 * containment relationship between Classifiers and the Features they own. The
 * feature end of the association is ordered allowing preservation of the
 * ordering of Features within their owning Classifier. A Feature can be owned
 * by at most one Classifier. The optional character of ownership is intended as
 * a convenience to tools, allowing them to create Features prior to linking
 * them to their owning Classifier
 */
public interface ClassifierFeature {

  /**
   * The operation returns true if and only if the supplied link is a member 
   * of the link set for this association object.
   *
   * @param owner is an {@linkplain Classifier} instance.
   * @param feature is an {@linkplain Feature} instance.
   * @return true if and only if the supplied link is a member 
   *         of the link set.
   */
  public boolean exists(Classifier owner, Feature feature);

  /**
   * Reads the 'feature' property value.
   *
   * <p>Identifies the Features owned by a Classifier instance and provides their ordering.
   *
   * @param owner is an {@linkplain Classifier} instance.
   * @return A ordered List of zero or more {@linkplain Feature} instances.
   */
  public java.util.List<? extends Feature> getFeature(Classifier owner);

  /**
   * Gets the 'owner' property value.
   * 
   * <p>Identifies the Classifier instance that owns the Feature.
   *
   * @param feature is an {@linkplain Feature} instance.
   * @return Zero or one {@linkplain Classifier} instances.
   */
  public Classifier getOwner(Feature feature);

  public boolean add(Classifier owner, Feature feature);

  public boolean remove(Classifier owner, Feature feature);

}
