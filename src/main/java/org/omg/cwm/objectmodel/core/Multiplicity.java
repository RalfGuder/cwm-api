package org.omg.cwm.objectmodel.core;

import java.util.Collection;

/**
 * In the metamodel a Multiplicity defines a non-empty set of non-negative integers. A set
 * that only contains zero ({0}) is not considered a valid Multiplicity. Every Multiplicity
 * has at least one corresponding String representation.
 *
 */
public interface Multiplicity extends Element {
  
  /**
   * References the set of MultiplicityRange instances that describe the cardinality of the
   * Multiplicity instance.
   * 
   * <ul>
   * <li>class: MultiplicityRange
   * <li>defined by: RangeMultiplicity
   * <li>multiplicity: one or more
   * <li>inverse: MultiplicityRange::multiplicity
   * </ul>
   *
   * @return collection
   */
  Collection<MultiplicityRange> getRange();
}
