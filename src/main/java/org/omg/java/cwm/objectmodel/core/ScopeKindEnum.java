package org.omg.java.cwm.objectmodel.core;


/**
 * In the metamodel scope kind defines an enumeration that denotes whether a 
 * feature belongs to individual instances or an entire classifier. The default 
 * value is <i>sk_instance</i>.
 *
 * @author Ralf Guder
 *
 */
public final class ScopeKindEnum implements ScopeKind, java.io.Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * The feature pertains to instances of a Classifier. For example, it is a 
   * distinct attribute in each instance or an operation that works on an instance.
   */
  public static final ScopeKindEnum SK_INSTANCE = new ScopeKindEnum("sk_instance");

  /**
   * The feature pertains to an entire Classifier. For example, it is an 
   * attribute shared by the entire Classifier or an operation that works on the 
   * Classifier, such as a creation operation.
   */
  public static final ScopeKindEnum SK_CLASSIFIER = new ScopeKindEnum("sk_classifier");

  private static final java.util.List<String> typeName = java.util.Collections
      .unmodifiableList(java.util.Arrays.asList(new String[] {"Core", "ScopeKind"}));

  private final java.lang.String literalName;

  private ScopeKindEnum(java.lang.String literalName) {
    this.literalName = literalName;
  }

  public java.util.List<String> refTypeName() {
    return typeName;
  }

  public java.lang.String toString() {
    return literalName;
  }

  public boolean equals(java.lang.Object other) {
    return (other instanceof ScopeKindEnum) ? other == this : false;
  }

  protected java.lang.Object readResolve() throws java.io.InvalidObjectException {
    try {
      return forName(literalName);
    } catch (java.lang.IllegalArgumentException iae) {
      throw new java.io.InvalidObjectException(iae.getMessage());
    }
  }

  public int hashCode() {
    return literalName.hashCode();
  }

  /**
   * Gets the scope kind from Name.
   *
   * @param value is a string
   * @return the scope kind
   */
  public static ScopeKind forName(java.lang.String value) {
    if (value.equals(SK_INSTANCE.literalName)) {
      return SK_INSTANCE;
    }
    if (value.equals(SK_CLASSIFIER.literalName)) {
      return SK_CLASSIFIER;
    }
    throw new java.lang.IllegalArgumentException(
        "Unknown enumeration value '" + value + "' for type 'Core.ScopeKind'");
  }

}
