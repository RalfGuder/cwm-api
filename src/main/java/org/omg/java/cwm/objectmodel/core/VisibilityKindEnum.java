package org.omg.java.cwm.objectmodel.core;


/**
 * In the metamodel visibility kind defines an enumeration that denotes how the 
 * element to which it refers is seen outside the enclosing name space. The 
 * default value is <i>vk_public</i>.
 *
 * @author Ralf Guder
 *
 */
public final class VisibilityKindEnum implements VisibilityKind, java.io.Serializable {

  private static final long serialVersionUID = 1L;

  public static final VisibilityKindEnum VK_PUBLIC = new VisibilityKindEnum("vk_public");

  public static final VisibilityKindEnum VK_PROTECTED = new VisibilityKindEnum("vk_protected");

  public static final VisibilityKindEnum VK_PRIVATE = new VisibilityKindEnum("vk_private");

  public static final VisibilityKindEnum VK_PACKAGE = new VisibilityKindEnum("vk_package");

  public static final VisibilityKindEnum VK_NOTAPPLICABLE =
      new VisibilityKindEnum("vk_notapplicable");

  private static final java.util.List<String> typeName = java.util.Collections
      .unmodifiableList(java.util.Arrays.asList(new String[] {"Core", "VisibilityKind"}));

  private final java.lang.String literalName;

  private VisibilityKindEnum(java.lang.String literalName) {
    this.literalName = literalName;
  }

  public java.util.List<String> refTypeName() {
    return typeName;
  }

  public java.lang.String toString() {
    return literalName;
  }

  public boolean equals(java.lang.Object other) {
    return (other instanceof org.omg.java.cwm.objectmodel.core.VisibilityKindEnum) ? other == this
        : false;
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
   * Gets the visibility kind from name.
   *
   * @param value is a string.
   * @return The visibility kind.
   */
  public static VisibilityKind forName(java.lang.String value) {
    if (value.equals(VK_PUBLIC.literalName)) {
      return VK_PUBLIC;
    }
    if (value.equals(VK_PROTECTED.literalName)) {
      return VK_PROTECTED;
    }
    if (value.equals(VK_PRIVATE.literalName)) {
      return VK_PRIVATE;
    }
    if (value.equals(VK_PACKAGE.literalName)) {
      return VK_PACKAGE;
    }
    if (value.equals(VK_NOTAPPLICABLE.literalName)) {
      return VK_NOTAPPLICABLE;
    }
    throw new java.lang.IllegalArgumentException(
        "Unknown enumeration value '" + value + "' for type 'Core.VisibilityKind'");
  }

}
