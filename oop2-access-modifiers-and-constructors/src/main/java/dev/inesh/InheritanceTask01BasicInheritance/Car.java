package dev.inesh.InheritanceTask01BasicInheritance;

public class Car extends Vehicle {
    private int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    @Override
    public void move() {
        System.out.println(getBrand()+" is moving at "+getSpeed()+" km/h with "+getDoors()+" doors");
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                '}';
    }
}
