package dev.inesh.Task03PolymorphismWithArrays;

public class Car extends Vehicle {
    public Car(){}
    public Car(String brand){
        super(brand);
    }
    public Car(Car other){
        super(other.getBrand());
    }
    @Override
    public void start() {
        System.out.println("Car is starting: Vroom!");
    }
}
