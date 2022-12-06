package org.omg.cwm.objectmodel.core;

/**
 * A subsystem is a grouping of model elements that represents a behavioral unit in a
 * physical system. A subsystem offers interfaces and has operations.
 * 
 * <p>In the metamodel, Subsystem is a subclass of both Package and Classifier. As such it
 * may have a set of Features.
 * 
 * <p>The purpose of the subsystem construct is to provide a grouping mechanism for
 * specifying a behavioral unit of a physical system. Apart from defining a namespace for
 * its contents, a subsystem serves as a specification unit for the behavior of its contained
 * model elements.
 * 
 * <p>The contents of a subsystem is defined in the same way as for a package, thus it
 * consists of owned elements and imported elements, with unique names within the
 * subsystem.
 */
public interface Subsystem extends Classifier, Package {

}
