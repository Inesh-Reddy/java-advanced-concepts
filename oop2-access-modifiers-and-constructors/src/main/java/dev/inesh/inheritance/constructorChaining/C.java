package dev.inesh.inheritance.constructorChaining;

public class C extends B {

    C(){
        System.out.println("C is constructed");
    }
    C(int x ){
        this();
        System.out.println("parameterised Constructor is constructed, taking "+x+" parameters");
    }
}
