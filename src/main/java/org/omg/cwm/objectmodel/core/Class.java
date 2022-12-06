package org.omg.cwm.objectmodel.core;

/**
 * A class is a description of a set of objects that share the same attributes, operations,
 * methods, relationships, and semantics. A class may use a set of interfaces to specify
 * collections of operations it provides to its environment. In the metamodel, a Class
 * describes a set of objects sharing a collection of Features that are common to the set of
 * objects. 
 *
 * <p>The purpose of a Class is to declare a collection of Features that fully describe the
 * structure and behavior of objects. Some Classes may not be directly instantiated. These
 * Classes are said to be abstract and exist only for other Classes to inherit and reuse the
 * Features declared by them. No object may be a direct instance of an abstract Class,
 * although an object may be an indirect instance of one through a subclass that is nonabstract.
 * 
 * <p>A Class acts as the namespace for various kinds of contained elements defined within
 * its scope, including classes, interfaces, and associations (note that this is purely a
 * scoping construction and does not imply anything about aggregation). The contained
 * classes can be used as ordinary classes in the container class. If a class inherits another
 * class, the contents of the ancestor are available to its descendents if the visibility of an
 * element is public or protected. If the visibility is private, then the element is not visible
 * and therefore not available in the descendant.
 */
public interface Class extends Classifier{

}
