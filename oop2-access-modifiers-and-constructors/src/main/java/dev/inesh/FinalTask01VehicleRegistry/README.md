# Problem: Vehicle Registry
### Challenge:
- Create a Vehicle class with String brand and String[] features (e.g., {"AC", "GPS"}).

- Create a Car subclass that inherits from Vehicle, adding int seats.

### Implement:
- A shallow copy constructor in Vehicle.

- A deep copy constructor in Car that duplicates features.

    #### In a Main class:
- Create an original Car with brand "Honda", features {"AC", "Sunroof"}, and 5 seats.

- Make a shallow copy and a deep copy.

- Modify the features array in the shallow copy (e.g., change "AC" to "Bluetooth").

- Print all three objects to compare.

### Goal: 
- Combine inheritance with shallow/deep copying, observing how features behaves.

### Expected Output:
```
Original: Vehicle{brand=Honda, features=[AC, Sunroof]}, seats=5
Shallow Copy: Vehicle{brand=Honda, features=[Bluetooth, Sunroof]}, seats=5
Deep Copy: Vehicle{brand=Honda, features=[AC, Sunroof]}, seats=5
```
### Key Insight: 
- Shallow copy shares features (original changes), deep copy doesn’t.

