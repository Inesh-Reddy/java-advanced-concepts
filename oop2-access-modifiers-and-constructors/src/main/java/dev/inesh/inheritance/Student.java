package dev.inesh.inheritance;


public class Student extends User {
    private int id;

    public Student() {}

    public Student(String name, String email, String password) {
        this.setName(name);
        this.setEmail(email);
        this.setPassword(password);
    }

    public void attendClass(){
        System.out.println("Attending class");
    }

}
