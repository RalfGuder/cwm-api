## Core Metamodel

The Core metamodel depends on no other packages.

The ObjectModel Core metamodel contains basic metamodel classes and associations
used by all other CWM metamodel packages, including other ObjectModel packages.
The classes and associations that make up the Core metamodel are shown in Figure
4-2. Figure 4-3 on page 4-4 contains supporting classes within the Core metamodel
that are generally used as the types of attributes.

### Core Data Types

The ObjectModel metamodel contains the data types, listed below in alphabetical
order. Each of these data types is an instance of the DataType class.

Some of these data types have default values. These default values only apply for
**mandatory** attributes or parameters of the relevant data type where an explicit value is
not supplied.

####  Any
The Any data type is used to indicate that an attribute or parameter may take values
from any of the available data types. In CWM, the set of data types an Any attribute or
parameter may assume includes the data types and enumerations described in this
chapter plus any available instances of the Classifier class.

There is no default value for data type Any.

#### Boolean
Boolean defines an enumeration that denotes a logical condition. Its enumeration
literals are:
• __true__ - The Boolean condition is satisfied.
• false - The Boolean condition is not satisfied.
The default for data type Boolean is false.