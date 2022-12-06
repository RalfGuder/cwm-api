package org.omg.cwm.objectmodel.core;

import java.util.Collection;

/**
 * The stereotype concept provides a way of branding (classifying) model elements so
 * that they behave as if they were instances of new virtual metamodel constructs. These
 * model elements have the same structure (attributes, associations, operations) as similar
 * non-stereotyped model elements of the same kind. The stereotype may specify
 * additional constraints and required tagged values that apply to model elements. In
 * addition, a stereotype may be used to indicate a difference in meaning or usage
 * between two model elements with identical structure.
 * 
 * <p>In the metamodel the Stereotype metaclass is a subclass of ModelElement. Tagged
 * Values and Constraints attached to a Stereotype apply to all ModelElements branded
 * by that Stereotype.
 * 
 * <p>A stereotype keeps track of the base class to which it may be applied. The base class
 * is a class in the metamodel (not a user-level modeling element) such as Class,
 * Association, etc. If a model element is branded by an attached stereotype, then the
 * CWM base class of the model element must be the base class specified by the
 * stereotype or one of the subclasses of that base class.
 *
 * <p><b>Constraints</b>
 * 
 * <ul>
 * <li>The base class name must be provided. [C-3-6]</li>
 * </ul>
 */
public interface Stereotype extends ModelElement {
  
  /**
   * Specifies the name of a modeling element to which the stereotype applies, such as Class,
   * Association, Constraint, etc. This is the name of a metaclass; that is, a class from the
   * metamodel itself rather than a user model class.
   * 
   * <ul>
   * <li>type: Name
   * <li>multiplicity: exactly one
   * </ul>
   *
   * @return a Name
   */
  Name getBaseClass();

  /**
   * Specifies the name of a modeling element to which the stereotype applies, such as Class,
   * Association, Constraint, etc. This is the name of a metaclass; that is, a class from the
   * metamodel itself rather than a user model class.
   * 
   * <ul>
   * <li>type: Name
   * <li>multiplicity: exactly one
   * </ul>
   *
   * @param baseClass is a Name
   */
  void setBaseClass(Name baseClass);
  
  
  /**
   * Designates the model elements affected by the stereotype. Each one must be a model element
   * of the kind specified by the baseClass attribute.
   * 
   * <ul>
   * <li>class: ModelElement
   * <li>defined by: StereotypedElement::extendedElement
   * <li>multiplicity: zero or more
   * <li>inverse: ModelElement::stereotype
   * </ul>
   *
   * @return a collection
   */
  Collection<ModelElement> getExtendedElement();
  
  /**
   * Specifies a set of TaggedValues, each of which specifies a tag that an element 
   * classified by the Stereotype is required to have. The value part indicates the 
   * default value for the tagged value, that is, the tagged value that an element 
   * will be presumed to have if it is not overridden by an explicit tagged value on 
   * the element bearing the stereotype. If the value is unspecified, then
   * the element must explicitly specify a tagged value with the given tag.
   * 
   * <ul>
   * <li>class: TaggedValue
   * <li>defined by: StereotypeTaggedValues::requiredTag
   * <li>multiplicity: zero or more
   * <li>inverse: TaggedValue::stereotype
   * </ul>
   *
   * @return a collection
   */
  Collection<TaggedValue> getRequiredTag();
  
  /**
   * Designates constraints that apply to all model elements branded by this stereotype. These
   * constraints are defined in the scope of the full metamodel.
   * 
   * <ul>
   * <li>class: Constraint
   * <li>defined by: StereotypeConstraints::stereotypeConstraint
   * <li>multiplicity: zero or more
   * <li>inverse: Constraint::constrainedStereotype
   * </ul>
   *
   * @return a collection
   */
  Collection<Constraint> getStereotypeConstraint();

}
