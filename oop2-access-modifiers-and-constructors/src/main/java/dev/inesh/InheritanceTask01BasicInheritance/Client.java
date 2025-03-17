package dev.inesh.InheritanceTask01BasicInheritance;

public class Client {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota", 100,4);
        toyota.move();
        Car benz = new Car("Benz", 150,5);
        benz.move();
    }
}
