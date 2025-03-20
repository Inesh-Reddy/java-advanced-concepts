package dev.inesh.Task03PolymorphismWithArrays;

public class Bike extends Vehicle {
    public Bike(){}

    public Bike(String brand){
        super(brand);
    }

    public Bike(Bike other){
        super(other.getBrand());
    }

    @Override
    public void start() {
        System.out.println("Bike is starting: Beeeeep!!");
    }
}
