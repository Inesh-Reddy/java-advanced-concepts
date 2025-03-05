package dev.inesh.CopyConstructor;

public class Client{
    public static void main(String[] args) {
        Car originalCar = new Car("Toyota", 2024);
        Car copyCar = new Car(originalCar);
        copyCar.setModel("Honda");

        System.out.println("Original Car : " + originalCar);
        System.out.println("Copy Car     : " + copyCar);
    }
}
