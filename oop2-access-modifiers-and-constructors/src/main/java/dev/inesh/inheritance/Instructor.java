package dev.inesh.inheritance;

public class Instructor extends User{
    private int id;

    public Instructor() {}
    public Instructor(String name, String email, String password) {
        this.setEmail(email);
        this.setPassword(password);
        this.setName(name);
    }

    public void takeClass(){
        System.out.println("Taking class");
    }
}
