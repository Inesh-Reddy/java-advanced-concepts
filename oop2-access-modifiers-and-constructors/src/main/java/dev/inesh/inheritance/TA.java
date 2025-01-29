package dev.inesh.inheritance;

public class TA extends User{
    private int id;

    public TA() {}

    public TA(String name, String email, String password) {
        //to use an all argument constructor we need to explicitly use super
        super(name, email, password);
        this.setName(name);
        this.setEmail(email);
        this.setPassword(password);
    }

    public void clearHR(){
        System.out.println("Clearing HR");
    }

}
