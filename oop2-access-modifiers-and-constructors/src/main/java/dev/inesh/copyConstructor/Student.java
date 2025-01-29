package dev.inesh.copyConstructor;

public class Student {
    private int id;
    private int age;
    private double psp;
    private int gradYear;
    private Exam enrollmentExam;

    public Student() {}

    public Student(int id, int age, double psp, int gradYear) {
        this.id = id;
        this.age = age;
        this.psp = psp;
        this.gradYear = gradYear;
        this.enrollmentExam = new Exam(1,90);
    }

    Student(Student other) {
        this.id = other.id;
        this.age = other.age;
        this.psp = other.psp;
        this.gradYear = other.gradYear;
        this.enrollmentExam = new Exam(other.enrollmentExam);
    }
}
