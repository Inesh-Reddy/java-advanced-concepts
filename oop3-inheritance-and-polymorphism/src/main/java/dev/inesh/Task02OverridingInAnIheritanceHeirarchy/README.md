# Inheritance and Overriding in Java with Deep Copy Example

## Overview

This project demonstrates the concept of inheritance, method overriding, and deep copying in Java. It features a `Shape` class, with two subclasses: `Circle` and `Rectangle`. The goal of the project is to showcase how to:

1. Use inheritance to create specialized classes (`Circle` and `Rectangle`) that extend a base class (`Shape`).
2. Override methods in subclasses to provide specific functionality (e.g., overriding the `draw()` method).
3. Implement a deep copy constructor to demonstrate how to create a new instance that is a copy of an existing object but independent of it.

## Key Concepts Covered

- **Inheritance**: The `Circle` and `Rectangle` classes inherit from the `Shape` class, allowing them to share common properties and behaviors, while adding their own specific features.
- **Method Overriding**: The `Circle` and `Rectangle` classes override the `draw()` method from the `Shape` class to provide their own specific implementation of how they are drawn.
- **Deep Copying**: A deep copy constructor is implemented for the `Circle` class. This allows a new `Circle` object to be created as a copy of an existing `Circle` object, with independent attributes. Modifications to the copied object do not affect the original.

## Classes and Functionality

### `Shape` Class
- The `Shape` class serves as the base class for all shape objects.
- It contains an array of strings representing the attributes (e.g., color) of the shape.
- It provides a `draw()` method that can be overridden by subclasses.

### `Circle` Class
- Inherits from the `Shape` class.
- Overrides the `draw()` method to display specific information about the circle (e.g., drawing a circle with color).
- Implements a deep copy constructor to create a new `Circle` object with the same attributes but independent from the original object.

### `Rectangle` Class
- Inherits from the `Shape` class.
- Overrides the `draw()` method to display specific information about the rectangle.

## Testing and Expected Output

The project includes a test case where:
1. A `Circle` object is created and its attributes are set (e.g., color = red).
2. A deep copy of the `Circle` is made, and the copy's attributes are modified (e.g., color = blue).
3. Both the original and the copied `Circle` are drawn, showing the differences in their attributes.

### Expected Output:

```
Original Circle: Drawing a circle with attributes [color=red]
Copied Circle: Drawing a circle with attributes [color=blue]
```

---