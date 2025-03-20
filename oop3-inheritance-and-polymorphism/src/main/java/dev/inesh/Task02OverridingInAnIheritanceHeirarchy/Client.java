package dev.inesh.Task02OverridingInAnIheritanceHeirarchy;

public class Client {
    public static void main(String[] args) {
        String[] OriginalShapes = {"color=red"};
        Circle circle1 = new Circle(OriginalShapes);
        circle1.draw();

        Circle circle2 = new Circle(circle1);
        circle2.setShapes(new String[]{"color=blue"});
        circle2.draw();
        circle1.draw();


    }
}
