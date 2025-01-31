package dev.inesh.polymorphism;

public class Dog  extends Animal {
    private String color;

    public void bark(){
        System.out.println("Bark");
    }
    @Override
    public void walk(){
        System.out.println(" / \\__");
        System.out.println("(    @\\____");
        System.out.println(" /         O");
        System.out.println("/   (_____/");
        System.out.println("\\__/");
    }
}
