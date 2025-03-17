package dev.inesh.InheritanceTask01BasicInheritance;

public class Vehicle {
    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void move(){
        System.out.println(getBrand()+" is moving at "+getSpeed()+" km/h");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }
}
