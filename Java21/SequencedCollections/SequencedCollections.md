**Sequenced Collections (Java 21)**

The new "sequenced" collection interfaces introduced in Java 21 and demonstrates their use with the examples included in this folder.

The examples show how `SequencedCollection`, `SequencedSet`, and `SequencedMap` make it easier to access and manipulate first/last elements in an ordered collection.

**Why sequenced?**
: Sequenced collections expose operations that naturally target the first and last elements (e.g., `addFirst`, `addLast`, `getFirst`, `getLast`, `removeFirst`, `removeLast`). These operations remove common boilerplate previously required to access or mutate the ends of ordered collections such as `LinkedHashSet` and `LinkedHashMap`.

**Files in this folder**:

- `LRUCache.java`: simple LRU-style cache example using `SequencedMap`.
- `SequencedCollectionExample.java`: demonstrates `SequencedCollection` usage.
- `SequencedMapExample.java`: demonstrates `SequencedMap` usage and contrasts pre-/post-Java-21 approaches.
- `SequencedSetExample.java`: demonstrates `SequencedSet` usage and contrasts pre-/post-Java-21 approaches.

**SequencedCollection (example)**

The `SequencedCollectionExample` shows how a `SequencedCollection` lets you add or retrieve elements at either end and access first/last directly:

```java
SequencedCollection<String> cities = new ArrayList<>();
cities.addLast("Karachi");
cities.addFirst("Sukkur");

System.out.println(cities); // prints the sequence

// Before Java 21: manual indexing
System.out.println(((ArrayList<String>) cities).get(0));
System.out.println(((ArrayList<String>) cities).get(cities.size() - 1));

// After Java 21: direct access
System.out.println(cities.getFirst());
System.out.println(cities.getLast());
```

This reduces casting, manual index calculations and makes intent clearer.

**SequencedSet (example)**

`SequencedSetExample` uses a `LinkedHashSet` as a `SequencedSet` implementation. You can fetch first/last or remove last directly:

```java
SequencedSet<Integer> set = new LinkedHashSet<>();
set.add(10);
set.add(20);
set.add(30);

System.out.println(set.getFirst()); // 10
System.out.println(set.getLast());  // 30

// Before Java 21: iterate to find/remove last element
Iterator<Integer> it = set.iterator();
Integer last = null;
while (it.hasNext()) last = it.next();
set.remove(last);

// After Java 21: direct removeLast()
set.removeLast();
```

**SequencedMap (example)**

`SequencedMapExample` uses `LinkedHashMap` as a `SequencedMap`. New methods make it trivial to add entries at the front or end and fetch first/last entries:

```java
SequencedMap<String, Integer> map = new LinkedHashMap<>();
map.putLast("Ali", 100);
map.putLast("Sara", 200);
map.putFirst("Admin", 999);

System.out.println(map.firstEntry()); // first entry
System.out.println(map.lastEntry());  // last entry
System.out.println(map); // preserves insertion order with Admin at front
```

The example also shows the more verbose pre-Java-21 approach: iterating to find the first/last entry and rebuilding maps to insert at the beginning.

**LRUCache example**

`LRUCache.java` demonstrates a very small LRU-like pattern using `SequencedMap` operations:

```java
SequencedMap<Integer, String> cache = new LinkedHashMap<>();
cache.putLast(1, "Page1");
cache.putLast(2, "Page2");
cache.putLast(3, "Page3");

cache.pollFirstEntry(); // removes the oldest entry

System.out.println(cache);
```

This illustrates how easy it is to pop the least-recently-added (or least-recently-used, with a slight adaptation) entry.

**When to use sequenced collections**

- Use when you care about the ordered ends of a collection and want concise, intention-revealing operations.
- They are ideal for caches, deques implemented on top of collections, or any data structure where head/tail access is common.


---
