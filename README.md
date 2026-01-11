# Java Mastery

Welcome to **Java Mastery**, a curated collection of hands-on Java examples designed to build a **deep, practical understanding** of core and advanced Java concepts.

This repository focuses on **how Java actually works**—from language features to build tooling—through runnable code and clear explanations.

Each topic includes:
- 📄 Well-documented Java code examples
- 📘 Markdown files explaining concepts and decisions
- 🖥️ Output screenshots or logs (where relevant)

---

## Table of Contents

- [How to Run Examples](#how-to-run-examples)
- [Topics Covered](#topics-covered)
    - [Exception Handling](./ExceptionHandling/Exceptions.md)
    - [Generics](./Generics/README.md)
    - [Java 21 – Record Patterns](./Java21/RecordPatterns/Records.md)
    - [Java 21 – Sequenced Collections](./Java21/SequencedCollections/)
    - [Streams API](./Streams/Streams.md)
    - [JAR Files (Thin vs Fat)](./JAR/JAR.md)
- [Upcoming Topics](#upcoming-topics)
- [Motivation](#motivation)
- [License](#license)

---

## How to Run Examples

- **Java Version:** 21
- **Build Tools:**
    - `javac` / `java` for standalone, language-focused examples
    - **Maven** for topics involving build tooling (e.g., JAR packaging)

Each folder is self-contained.  
Instructions or assumptions specific to a topic are documented inside that folder.

---

## Topics Covered

### 1. Exception Handling
- `try-catch`, multi-catch, `finally`
- Try-with-resources
- Custom and chained exceptions
- Common pitfalls and best practices

### 2. Generics
- Type safety and invariance
- Generic classes and methods
- Wildcards (`? extends`, `? super`)
- Type erasure and its implications

### 3. Java 21 – Record Patterns
- Deconstructing immutable data
- Pattern matching in `switch` and `if`
- Cleaner, safer data access with records

### 4. Java 21 – Sequenced Collections
- Ordered access to first/last elements
- New APIs for lists, sets, and maps

### 5. Streams API
- Intermediate vs terminal operations

### 6. JAR Files (Thin vs Fat)
- What a JAR really is
- Thin JAR vs Fat (Uber) JAR
- Real troubleshooting from local builds

---

## Upcoming Topics

Planned additions with runnable examples and documentation:

- [ ] EAR and WAR

---

## Motivation

This repository documents my journey toward **true Java mastery**; not just using APIs, but understanding the runtime, tooling, and design trade-offs behind them.

The goal is clarity over abstraction, correctness over shortcuts, and learning by doing.

---

## License

This project is licensed under the [MIT License](LICENSE).
