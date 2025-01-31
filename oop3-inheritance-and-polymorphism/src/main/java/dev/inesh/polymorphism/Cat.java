package dev.inesh.polymorphism;

public class Cat extends Animal {
    private String type;

    public void hiss(){
        System.out.println("cat is hissed");
    }
    @Override
    public void walk(){
        System.out.println(" /\\_/\\  ");
        System.out.println("( o.o ) ");
        System.out.println(" > ^ <  ");
    }
}
