package org.omg.cwm.objectmodel.core;


/**
 * A model captures a view of a physical system. It is an abstraction of the physical
 * system, with a certain purpose. The model completely describes those aspects of the
 * physical system that are relevant to the purpose of the model, at the appropriate level
 * of detail.
 * 
 * <p>In the metamodel Model is a subclass of Package. It contains a containment hierarchy
 * of ModelElements that together describe the physical system. A Model also contains a
 * set of ModelElements that represents the environment of the system.
 * 
 * <p>Different Models can be defined for the same physical system, where each model
 * represents a view of the physical system defined by its purpose and abstraction level;
 * for example, an analysis model, a design model, an implementation model. Typically
 * different models are complementary and defined from the perspectives (viewpoints) of
 * different system stakeholders.
 *
 */
public interface Model extends org.omg.cwm.objectmodel.core.Package {

}
