package dev.inesh.polymorphism;

public class AnimalUtility {
    private AnimalUtility() {}
    public static void doSomething(Animal animal) {
        animal.walk();
    }
}
