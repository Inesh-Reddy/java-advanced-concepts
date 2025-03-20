package dev.inesh.Task03PolymorphismWithArrays;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Toyota");
        vehicles[1] = new Bike("KTM");

        for (int v = 0; v<vehicles.length; v++) {
            vehicles[v].start();
        }

        Car original = new Car("Toyota");
        Car shallowCopy = new Car(original);

        System.out.println("Original Car: " + original);
        System.out.println("Shallow Copy: " + shallowCopy);
    }
}
