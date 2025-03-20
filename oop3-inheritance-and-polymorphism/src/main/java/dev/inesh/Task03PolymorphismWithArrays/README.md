# Polymorphism with Arrays and Shallow Copying in Java

## Overview

This project demonstrates the use of **polymorphism**, **method overriding**, and **shallow copying** in Java. It includes a base class `Vehicle` with subclasses `Car` and `Bike`, and explores how to work with arrays of polymorphic objects. Additionally, a shallow copy constructor is implemented for the `Car` class to show how to create a copy of an object while retaining references to shared fields.

The project is designed to help understand how polymorphism allows you to use a common method across different types of objects and how shallow copying works by copying object references.

## Key Concepts Covered

- **Polymorphism**: This project shows runtime polymorphism where objects of different subclasses (`Car` and `Bike`) are treated as instances of their common superclass (`Vehicle`). The `start()` method is called on each object, and due to method overriding, the correct version of `start()` is invoked based on the actual object type.
- **Method Overriding**: Both `Car` and `Bike` override the `start()` method of the `Vehicle` class to provide their own specific implementation (e.g., `Vroom!` for cars and `Beep!` for bikes).
- **Shallow Copying**: A shallow copy constructor is implemented for the `Car` class. This creates a new `Car` object that shares references to some fields (like `brand`) with the original object. Changes made to the shallow copy will reflect in shared fields, but not in newly created fields.

## Classes and Functionality

### `Vehicle` Class
- The base class for all vehicle objects, with a `String` field for the brand of the vehicle and an abstract `start()` method that can be overridden by subclasses.

### `Car` Class
- Inherits from the `Vehicle` class.
- Overrides the `start()` method to provide the specific implementation for a car's start sound ("Vroom!").
- Implements a shallow copy constructor to create a new `Car` object that shares references to fields (like `brand`) with the original `Car`.

### `Bike` Class
- Inherits from the `Vehicle` class.
- Overrides the `start()` method to provide the specific implementation for a bike's start sound ("Beep!").

### `Main` Class
- Contains the main method where an array of `Vehicle` objects (holding a `Car` and a `Bike`) is created.
- Demonstrates runtime polymorphism by calling `start()` on each vehicle in the array, which triggers the appropriate version of the `start()` method based on the object type.
- Creates a shallow copy of a `Car` object and demonstrates the relationship between the original and the shallow copy.

## Testing and Expected Output

The project includes a test case where:
1. A `Vehicle` array contains both a `Car` and a `Bike`.
2. The `start()` method is called on each element in the array, showing polymorphic behavior.
3. A shallow copy of the `Car` object is created and printed to show the effects of shallow copying.

### Expected Output:

```
Car starting: Vroom!
Bike starting: Beep!
Original Car: Car{brand='Toyota'}
Shallow Copy: Car{brand='Toyota'}
```
---