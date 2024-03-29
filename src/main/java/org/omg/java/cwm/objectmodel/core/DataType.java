package org.omg.java.cwm.objectmodel.core;

/**
 * A data type is a type whose values have no identity; that is, they are pure
 * values. Data types include primitive built-in types (such as integer and
 * string) as well as definable enumeration types.
 * 
 * <p>In the metamodel a DataType defines a special kind of Classifier in which
 * operations are all pure functions; that is, they can return data values but
 * they cannot change data values, because they have no identity. For example,
 * an "add" operation on a number with another number as an argument yields a
 * third number as a result; the target and argument are unchanged.
 * 
 * <p>A DataType is a special kind of Classifier whose instances are primitive
 * values, not objects. For example, integers and strings are usually treated as
 * primitive values. A primitive value does not have an identity, so two
 * occurrences of the same value cannot be differentiated. Usually, DataTypes
 * are used for specification of the type of an attribute or parameter.
 * 
 * <p>A DataType cannot contain any other ModelElements. [C-3-2]
 */
public interface DataType extends Classifier {

}
