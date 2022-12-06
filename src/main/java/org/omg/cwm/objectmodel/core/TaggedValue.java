package org.omg.cwm.objectmodel.core;

/**
 * A tagged value allows information to be attached to any model element in the form 
 * of a "tagged value" pair; that is, name = value. The interpretation of tagged value
 * semantics is intentionally beyond the scope of CWM. It must be determined by user or
 * tool conventions. It is expected that tools will define tags to supply information 
 * needed for their operations beyond the basic semantics of CWM. Such information 
 * could include code generation options, model management information, or user-specified
 * semantics.
 * 
 * <p>Even though TaggedValues are a simple and straightforward extension technique, 
 * their use restricts semantic interchange of metadata to only those tools that 
 * share a common understanding of the specific tagged value names.
 */
public interface TaggedValue extends Element {
  
  /**
   * Contains the name of the TaggedValue. This name determines the semantics that 
   * are applicable to the contents of the value attribute.
   * 
   * <ul>
   * <li>type: Name
   * <li>multiplicity: exactly one
   * </ul>
   *
   * @return Name
   */
  Name getTag();

  /**
   * Contains the name of the TaggedValue. This name determines the semantics that 
   * are applicable to the contents of the value attribute.
   * 
   * <ul>
   * <li>type: Name
   * <li>multiplicity: exactly one
   * </ul>
   *
   * @param tag Name
   */
  void setTag(Name tag);
  
  /**
   * Contains the current value of the TaggedValue.
   * 
   * <ul>
   * <li>type: String
   * <li>multiplicity: exactly one
   * </ul>
   *
   * @return String
   */
  java.lang.String getValue();

  /**
   * Contains the current value of the TaggedValue.
   * 
   * <ul>
   * <li>type: String
   * <li>multiplicity: exactly one
   * </ul>
   *
   * @param value String
   */
  void setValue(java.lang.String value);
  
  /**
   * References the ModelElement to which the TaggedValue pertains.
   * 
   * <ul>
   * <li>class: ModelElement
   * <li>defined by: TaggedElement::modelElement
   * <li>multiplicity: zero or one
   * <li>inverse: ModelElement::taggedValue
   * </ul>
   *
   * @return ModelElement
   */
  ModelElement getModelElement();
  
  
  /**
   * References a Stereotype that uses the TaggedValue.
   * 
   * <ul>
   * <li>class: Stereotype
   * <li>defined by: StereotypeTaggedValues
   * <li>multiplicity: zero or one
   * <li>inverse: Stereotype::requiredTag
   * </ul>
   *
   * @return Stereotype
   */
  Stereotype getStereotype();
}
