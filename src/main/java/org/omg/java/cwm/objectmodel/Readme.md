## ObjectModel
### Overview

The CWM ObjectModel provides basic constructs for creating and describing
metamodel classes in all other CWM packages. The ObjectModel is a subset of UML
that includes only those features that are needed for creating and describing the CWM.
Defining a subset of UML containing only those things needed by CWM allows the
CWM to leverage UML’s concepts and modeling power without burdening
implementations with the full breadth of UML’s capabilities.

The specification defined in this chapter, where applicable, is based on and taken from
the UML specification

### Organization

The CWM uses packages to control complexity and create groupings of logically
interrelated classes. The ObjectModel is a collection of packages that are described
together because they all provide basic metamodel constructs to other CWM packages.
A subsection of this chapter is devoted to each of the ObjectModel packages. Because
it relies on no other package, the Core package is described first, followed by the
Behavioral, Instance, and Relationships packages. Each of the subsequent packages
depends only on the Core package; there are no other dependencies between the
ObjectModel packages. The relationship between the ObjectModel and each of its
constituent packages is shown diagrammatically in Figure 4-1.

Organizing the ObjectModel in this fashion allows the individual metamodel packages
to be understood and used independently of each other without sacrificing their
common purpose. For example, the CWM Record metamodel depends only on the
ObjectModel’s Core and Instance packages for its definition; other ObjectModel
packages are not needed for defining records
