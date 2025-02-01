package dev.inesh.LibraryManagementSystem;

public class Member extends User {
    private int borrowedBooksCount;
    private int MAX_BORROW_LIMIT = 5;

    Member(){
        super();
        borrowedBooksCount = 0;
    }
    Member(String name, String contactInfo) {
        super(name, contactInfo);
        borrowedBooksCount = 0;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Name: " + getName());
        System.out.println("Books Borrowed : " + borrowedBooksCount);

    }

    @Override
    public boolean canBorrowBooks() {
        if(borrowedBooksCount < MAX_BORROW_LIMIT){
            borrowedBooksCount++;
            return true;
        }else {
            return false;
        }
    }
}
