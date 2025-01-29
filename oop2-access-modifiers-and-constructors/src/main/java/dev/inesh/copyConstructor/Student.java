package dev.inesh.copyConstructor;

public class Student {
    private int id;
    private int age;
    private double psp;
    private int gradYear;

    public Student() {}
    public Student(int id, int age, double psp, int gradYear) {
        this.id = id;
        this.age = age;
        this.psp = psp;
        this.gradYear = gradYear;
    }

    Student(Student other) {
        this.id = other.id;
        this.age = other.age;
        this.psp = other.psp;
        this.gradYear = other.gradYear;
    }
}
