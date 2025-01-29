package dev.inesh.copyConstructor;

public class Client {
    public static void main(String[] args) {
        Student st = new Student(1,26,80.0,2020);

        Student st1 = st;
        System.out.println("");

        Student st2 = new Student(st);
        System.out.println("");
    }


}
