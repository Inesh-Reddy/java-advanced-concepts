package dev.inesh.LibraryManagementSystem;

import java.awt.print.Book;

public class Librarian extends User {
    private String employeeNumber;
    Librarian() {}

    Librarian(String employeeNumber, String name, String contactInfo) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("Employee Number: "+ employeeNumber + "Librarian Name: " + getName());
//        System.out.println("Employee Number: "+ employeeNumber);

    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    public void addNewBook(Book book) {
        System.out.println("New Book Added");
    }
    public void removeBook(Book book) {
        System.out.println("Book Removed");

    }
}
