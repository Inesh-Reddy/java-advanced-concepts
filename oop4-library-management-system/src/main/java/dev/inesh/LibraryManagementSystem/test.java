package dev.inesh.LibraryManagementSystem;

public class test {

    public static void main(String[] args) {
        User u = new User() {
            @Override
            public void displayDashboard() {

            }

            @Override
            public boolean canBorrowBooks() {
                return false;
            }
        };
    }
}
