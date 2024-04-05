- In Java, data types specify the size and type of values that can be stored in variables.
- Java provides two categories of data types: 
- primitive data types 
- reference data types

Primitive Data Types:

Integer Types:

- byte: 8-bit signed integer (-128 to 127)
- short: 16-bit signed integer (-32,768 to 32,767)
- int: 32-bit signed integer (-2^31 to 2^31 - 1)
- long: 64-bit signed integer (-2^63 to 2^63 - 1)

Floating-Point Types:

- float: 32-bit floating-point number
- double: 64-bit floating-point number

Boolean Type:

- boolean: Represents true or false values
- Character Type:

char: 16-bit Unicode character (0 to 65,535)

Reference Data Types:
- Reference data types in Java refer to objects that are created using classes or interfaces. 
- Unlike primitive data types, which store values directly, reference data types store references (memory addresses) to objects in memory
- These are used when we declare objects as a variable. Objects store references to the actual data rather than storing the data itself.
- They hold a value which is an address in memory where actual object resides. These data types have associated methods called as operators overloading.

Classes:

- User-defined data types created using the class keyword.

Arrays:

- Objects that store multiple values of the same type in a contiguous memory location.

Interfaces:

- Defines a set of abstract methods and constants. Implemented by classes.

Enumerations (Enums):

- Special data types that allow a variable to be a set of predefined constants.
- Enum constants are implicitly static and final, meaning they cannot be modified once they are created.

Strings:

- A sequence of characters represented as objects of the String class.
- Strings are immutable, meaning their values cannot be changed after they are created.


Default Values:

- Primitive data types have default values if not explicitly initialized:

- 0 for numeric types (e.g., 0 for int, 0.0 for double)
- false for boolean
- \u0000 (null character) for char
- Reference data types have a default value of null if not explicitly initialized.