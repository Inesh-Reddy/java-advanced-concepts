package dev.inesh.Task02OverridingInAnIheritanceHeirarchy;

import java.util.Arrays;

public class Shape {
    private String[] shapes;

    public Shape() {
        this.shapes = new String[10];
    };

    public Shape(String[] shapes) {
        this.shapes = shapes;
    }

    public void draw(){

    }

    public String[] getShapes() {
        return shapes;
    }

    public void setShapes(String[] shapes) {
        this.shapes = shapes;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "shapes='" + Arrays.toString(shapes) + '\'' +
                '}';
    }


}


