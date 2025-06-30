# Wrapper Classes

- Classes that encapsulate primitive data types within objects.
- byte -> Byte, short -> Short, int -> Integer, long -> Long, float -> Float, double -> Double, char -> Character, and boolean -> Boolean.

## Purposes

- Collections like `ArrayList` and `HashMap` can only store objects. Wrapper classes allow primitive values to be stored in these collections by wrapping them into objects.
- Generics do not support primitive types directly. Wrapper classes are necessary when using generics with primitive values (e.g., `List<Integer>` is valid, but List<int> is not).
- Wrapper classes offer useful methods for type conversions and manipulations, such as converting a string to a primitive type (e.g., `Integer.parseInt()`) or converting an object back to its primitive value (e.g., intValue()).
