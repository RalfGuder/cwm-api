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
- _true_ - The Boolean condition is satisfied.
- _false_ - The Boolean condition is not satisfied.

The default for data type Boolean is false.

#### Float
The Float data type is used to indicate that an attribute or parameter may take on
floating point numeric values. The number of significant digits and other
representational details are implementation defined.

The default for the Float data type is the value 0.0.

#### Integer
Integer represents the predefined type of integers. An instance of Integer is an element
in the (infinite) set of integers (...-2, -1, 0, 1, 2...).

The default for Integer is 0.

#### Name
Name defines a token that is used for naming ModelElements and similar usages. Each
Name has a corresponding String representation. For purposes of exchange a name
should be represented as a String.

The default for the Name data type is an empty string.

#### String
String defines a piece of text. Strings do not normally have a defined length; rather,
they are considered to be arbitrarily long (practical limits on the length of Strings exist,
but are implementation dependent). When String is used as the type of an Attribute,
string length sometimes can be specified (see the Relational and Record packages for
examples).

The default for the String data type is an empty string.

#### Time
Time defines a statement that will define the time of occurrence of an event. The
specific format of time expressions is not specified here and is subject to
implementation considerations.

There is no default for the Time data type.

#### UnlimitedInteger
UnlimitedInteger defines a data type whose range is the nonnegative integers
augmented by the special value "unlimited". It is used for the upper bound of
multiplicities.

The default for an UnlimitedInteger is the special value "unlimited".

The ObjectModel metamodel contains the enumerated data types shown below in
alphabetical order. Enumeration literals defined for each enumerated type are described
as well.

#### ChangeableKind
In the metamodel ChangeableKind defines an enumeration that denotes how an
attribute link may be modified. Its values are:
* _ck_changeable_ - No restrictions on modification.
* _ck_frozen_ - The value may not be changed from the source end after the creation
and initialization of the source object. Operations on the other end may change a
value.
* _ck_addOnly_ - If the multiplicity is not fixed, values may be added at any time
from the source object, but once created a value may not be removed from the
source end. Operations on the other end may change a value.

The default value is _ck_changeable_.

#### OrderingKind
In the metamodel OrderingKind defines an enumeration that specifies how the
elements of a set are arranged. Used in conjunction with elements that have a
multiplicity in cases when the multiplicity value is greater than one. The ordering must
be determined and maintained by operations that modify the set. Its values are:
* _ok_unordered_ - The elements of the set have no inherent ordering.
* _ok_ordered_ - The elements of the set have a sequential ordering.

The default value is _ok_unordered_.

#### ScopeKind
In the metamodel ScopeKind defines an enumeration that denotes whether a feature
belongs to individual instances or an entire classifier. Its values are:
* _sk_instance_ - The feature pertains to instances of a Classifier. For example, it is a
distinct attribute in each instance or an operation that works on an instance.
* _sk_classifier_ - The feature pertains to an entire Classifier. For example, it is an
attribute shared by the entire Classifier or an operation that works on the
Classifier, such as a creation operation.

The default value is _sk_instance_.

#### VisibilityKind
In the metamodel VisibilityKind defines an enumeration that denotes how the element
to which it refers is seen outside the enclosing name space. Its values are:
* _vk_public_ - Other elements may see and use the target element.
* _vk_protected_ - Descendants of the source element may see and use the target
element.
* _vk_private_ - Only the source element may see and use the target element.
* _vk_package_ - Elements declared in the same package as the target element may
see and use the target element.
* _vk_notapplicable_ - May be used where namespaces do not support the concept of
visibility.

The default value is _vk_public_.