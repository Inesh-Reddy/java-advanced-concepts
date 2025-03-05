# Copy Constructor, Shallow Copy & Deep Copy
##

#### Here are five practical exercises to test and reinforce your understanding of copy constructors, shallow copy, and deep copy in Java. Each builds on the last.
#### Task 1: Basic Copy Constructor
#### Challenge: 
Write a Car class with fields String model and int year. Implement a copy constructor and test it by creating an original Car and a copy, then modifying the copy’s model. Print both to confirm they’re independent.

#### Goal: 
Understand how a basic copy constructor duplicates primitive and immutable fields.

#### Task 2: Shallow Copy with References
#### Challenge: 
Create a Person class with String name and int[] scores. Implement a shallow copy constructor. Test it by modifying the scores array in the copy and checking if the original changes.

#### Goal: 
Observe the shared reference behavior of shallow copy.

#### Task 3: Deep Copy Implementation
#### Challenge: 
Modify the Person class from Task 2 to use a deep copy constructor. Duplicate the scores array manually. Test it by modifying the copy’s scores and verifying the original remains unchanged.

#### Goal: 
Master creating independent copies of reference types.

#### Task 4: Nested Objects
#### Challenge: 
Design a Department class with String name and a List<Employee> (where Employee has String name and int id). Implement both shallow and deep copy constructors. Test both by adding an Employee to the copy’s list and checking the original.

#### Goal: 
Handle complex nested structures and compare shallow vs. deep outcomes.

#### Task 5: Clone Method Exploration
#### Challenge: 
Implement the Cloneable interface in the Car class from Task 1. Override clone() to perform a shallow copy. Then, extend it to a deep copy by adding a String[] features field and duplicating it. Test both versions.

#### Goal: 
Compare copy constructors to clone() and practice deep copying with Java’s built-in mechanism.

