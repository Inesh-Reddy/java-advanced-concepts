package dev.inesh.Task03PolymorphismWithArrays;

public class Vehicle {
    private String brand;
    public Vehicle() {}
    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void start(){
        System.out.println("Vehicle started");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
