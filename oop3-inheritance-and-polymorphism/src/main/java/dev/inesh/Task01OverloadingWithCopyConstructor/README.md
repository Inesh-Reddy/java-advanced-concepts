# Book Class with Overloaded Copy Constructors

## Overview

This project demonstrates the concept of **overloading copy constructors** in Java. The primary goal is to create a `Book` class that includes:

- A **default constructor**.
- A **parameterized constructor** that initializes the `title` and `pages` fields.
- Two **overloaded copy constructors**:
    - One that performs a **shallow copy** of another `Book`.
    - Another that performs a **shallow copy** of a `Book` but also allows the `title` to be overridden.

### Class Details

1. **Book Class**
    - Fields:
        - `String title`: The title of the book.
        - `int pages`: The number of pages in the book.
    - Constructors:
        - **Default constructor**: Initializes the `title` as "Untitled" and `pages` as 0.
        - **Parameterized constructor**: Initializes the `title` and `pages` based on passed arguments.
        - **Copy constructor (shallow copy)**: Creates a new `Book` that is a shallow copy of another `Book` (same `title` and `pages`).
        - **Copy constructor with title override**: Creates a shallow copy of another `Book`, but the `title` is replaced by a new title provided as an argument.

2. **Main Class**
    - The `Main` class creates:
        - An **original book** with a specific title and number of pages.
        - A **shallow copy** of the original book.
        - A **copy with a new title**, keeping the same number of pages as the original book but changing the title.

### Expected Output

The expected output when running the program is:

```
Original: Book{title='Java Basics', pages=300}
Shallow Copy: Book{title='Java Basics', pages=300}
Shallow Copy with New Title: Book{title='Java Advanced', pages=300}
```

