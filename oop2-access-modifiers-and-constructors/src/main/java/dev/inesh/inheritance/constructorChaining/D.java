package dev.inesh.inheritance.constructorChaining;

public class D extends C {
    D(){
        super(5);
        System.out.println("D is constructed");
    }
}
