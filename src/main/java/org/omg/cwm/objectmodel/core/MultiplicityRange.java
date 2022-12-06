package org.omg.cwm.objectmodel.core;


/**
 * In the metamodel a MultiplicityRange defines a range of integers. The upper bound of
 * the range cannot be below the lower bound. The lower bound must be a nonnegative
 * integer. The upper bound must be a nonnegative integer or the special value unlimited,
 * which indicates there is no upper bound on the range.
 *
 */
public interface MultiplicityRange extends Element {
  
  /**
   * Specifies the positive integer lower bound of the range.
   * 
   * <ul>
   * <li>type: Integer
   * <li>multiplicity: exactly one
   * </ul>
   *
   * @return Integer
   */
  Integer getLower();

  /**
   * Specifies the positive integer lower bound of the range.
   * 
   * <ul>
   * <li>type: Integer
   * <li>multiplicity: exactly one
   * </ul>
   *
   * @return lower an Integer
   */
  void setLower(Integer lower);
  
  /**
   * Specifies the upper bound of the range, which is a positive integer or the special value
   * ’unlimited’ indicating no upper bound is defined.
   * 
   * <ul>
   * <li>type: UnlimitedInteger
   * <li>multiplicity: exactly one
   * </ul>
   * 
   * @return a unlimited integer.
   */
  UnlimitedInteger getUpper();

  /**
   * Specifies the upper bound of the range, which is a positive integer or the special value
   * ’unlimited’ indicating no upper bound is defined.
   * 
   * <ul>
   * <li>type: UnlimitedInteger
   * <li>multiplicity: exactly one
   * </ul>
   * 
   * @param upper is a unlimited integer.
   */
  void setUpper(UnlimitedInteger upper);
  
  /**
   * References the Multiplicity instance that owns the MultiplicityRange.
   * 
   * <ul>
   * <li>class: Multiplicity
   * <li>defined by: RangeMultiplicity::multiplicity
   * <li>multiplicity: exactly one
   * <li>inverse: Multiplicity::range
   * </ul>
   *
   * @return Multiplicity
   */
  Multiplicity getMultiplicity();
}
