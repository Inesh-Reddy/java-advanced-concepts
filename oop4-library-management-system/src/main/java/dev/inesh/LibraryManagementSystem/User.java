package dev.inesh.LibraryManagementSystem;

import java.util.UUID;

public abstract class User {
    private String userId;
    private String name;
    private String contactInfo;
    public static int totalusers = 0;

    private static int getTotalUsers(){
        totalusers++;
        return totalusers;
    }

    public final String generateUniqueId(){
        return UUID.randomUUID().toString();
    }

    public User(){
    }

    public User(String name, String contactInfo) {
        userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;

    }

    public User(User otherUser) {
        this.userId = generateUniqueId();
        this.name = otherUser.name;
        this.contactInfo = otherUser.contactInfo;
    }


    public abstract void displayDashboard();

    public abstract boolean canBorrowBooks();




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
