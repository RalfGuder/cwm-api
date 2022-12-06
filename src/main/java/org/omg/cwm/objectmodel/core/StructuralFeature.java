package org.omg.cwm.objectmodel.core;


/**
 * A structural feature refers to a static feature of a model element.
 *
 * <p>In the metamodel, a StructuralFeature declares a structural aspect of a Classifier that is
 * typed, such as an attribute. For example, it specifies the multiplicity and changeability
 * of the StructuralFeature. StructuralFeature is an <b>abstract</b> metaclass.
 *
 */
public interface StructuralFeature extends Feature {
  
  /**
   * Specifies whether the value may be modified after the object is created.
   * 
   * <ul>
   * <li>type: ChangeabilityKind
   * <li>multiplicity: exactly one
   * </ul>
   *
   * @return ChangeabilityKind
   */
  ChangeabilityKind getChangeability();

  /**
   * Specifies whether the value may be modified after the object is created.
   * 
   * <ul>
   * <li>type: ChangeabilityKind
   * <li>multiplicity: exactly one
   * </ul>
   *
   * @param changeability is type of ChangeabilityKind
   */
  void getChangeability(ChangeabilityKind changeability);
  
  
  /**
   * The possible number of data values for the feature that may be held by an instance. 
   * The cardinality of the set of values is an implicit part of the feature. In the 
   * common case in which the multiplicity is 1..1, then the feature is a scalar; 
   * that is, it holds exactly one value.
   * 
   * <ul>
   * <li>type: Multiplicity
   * <li>multiplicity: zero or one
   * </ul>
   *
   * @return Multiplicity
   */
  Multiplicity getMultiplicity();

  /**
   * The possible number of data values for the feature that may be held by an instance. 
   * The cardinality of the set of values is an implicit part of the feature. In the 
   * common case in which the multiplicity is 1..1, then the feature is a scalar; 
   * that is, it holds exactly one value.
   * 
   * <ul>
   * <li>type: Multiplicity
   * <li>multiplicity: zero or one
   * </ul>
   *
   * @param multiplicity is type of Multiplicity
   */
  void setMultiplicity(Multiplicity multiplicity);
  
  
  /**
   * Specifies whether the set of instances is ordered. The ordering must be determined and
   * maintained by Operations that add values to the feature. This property is only 
   * relevant if the multiplicity is greater than one.
   * 
   * <ul>
   * <li>type: OrderingKind
   * <li>multiplicity: zero or one
   * </ul>
   *
   * @return OrderingKind
   */
  OrderingKind getOrdering();

  /**
   * Specifies whether the set of instances is ordered. The ordering must be determined and
   * maintained by Operations that add values to the feature. This property is only 
   * relevant if the multiplicity is greater than one.
   * 
   * <ul>
   * <li>type: OrderingKind
   * <li>multiplicity: zero or one
   * </ul>
   *
   * @param ordering OrderingKind
   */
  void setOrdering(OrderingKind ordering);
  
  /**
   * Specifies whether the targets are ordinary Instances or are Classifiers.
   * 
   * <ul>
   * <li>type: ScopeKind
   * <li>multiplicity: zero or one
   * </ul>
   *
   * @return ScopeKind
   */
  ScopeKind getTargetScope();

  /**
   * Specifies whether the targets are ordinary Instances or are Classifiers.
   * 
   * <ul>
   * <li>type: ScopeKind
   * <li>multiplicity: zero or one
   * </ul>
   *
   * @param targetScope ScopeKind
   */
  void setTargetScope(ScopeKind targetScope);
  
  
  /**
   * Designates the Classifier whose instances are values of the feature. It must be a Class,
   * DataType, or Interface.
   * 
   * <ul>
   * <li>class: Classifier
   * <li>defined by: StructuralFeatureType::type
   * <li>multiplicity: exactly one
   * </ul>
   *
   * @return Classifier
   */
  Classifier getType();

}
