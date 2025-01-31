package dev.inesh.polymorphism;

import java.util.Scanner;

public class Client {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println("Tell me which animal you want ? [Dog/Cat]");
        String animalName = scanner.nextLine();
        Animal animal2 = null;
        if (animalName.equalsIgnoreCase("Dog")) {
            animal2 = new Dog();
        } else if (animalName.equalsIgnoreCase("Cat")) {
            animal2 = new Cat();
        }
        assert animal2 != null;
        AnimalUtility.doSomething(animal2);
    }
}
