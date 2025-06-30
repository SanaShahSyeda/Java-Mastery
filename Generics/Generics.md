## Generics

- Generics allow classes, interfaces, and methods to operate on objects of various types while providing **compile-time type safety**.
- With generics, you can write code that works with different data types without specifying the exact type in advance.
- The compiler ensures type correctness, reducing the risk of runtime errors like `ClassCastException`.

> `ClassCastException` is a runtime exception thrown when an object is cast to a subclass it is not an instance of.

### Without Generics – Unsafe Example

```java
public static void main(String[] args) {
    var list = new List(); // Raw type using Object internally

    list.add(Integer.valueOf(1));
    list.add("3");                // String added to an Object array
    list.add(new User());         // Custom class added

    int number = (int) list.get(0); // OK
    int temp = (int) list.get(1);   // ❗ClassCastException
}
```

> ❗ `int temp = (int) list.get(1);`
> This line throws a `ClassCastException` at runtime because the object being cast is not an `Integer` but a `String`.
> See error: ![Image](./screenshots/ClassCastException.png)
