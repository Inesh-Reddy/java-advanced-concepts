package dev.inesh.Task02OverridingInAnIheritanceHeirarchy;


import java.util.Arrays;

public class Circle extends Shape {
    public Circle(String[] shapes){
        super(shapes);
    }

    public Circle(Circle other){
        super(Arrays.copyOf(other.getShapes(), other.getShapes().length));
    }


    @Override
    public void draw() {
        System.out.println("Copied Circle: Drawing a circle with attributes"+Arrays.toString(getShapes()));
    }
}
