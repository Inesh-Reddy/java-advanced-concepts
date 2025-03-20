package dev.inesh.LibraryManagementSystem;

public class Client {
    public static void main(String[] args) {
        Book book = new Book("Java", 1, false, 777);
        DVD dvd = new DVD("JavaScript", 2, false, 77);

        Book bookCopy = new Book(book);
        DVD dvdCopy = new DVD(dvd);

        bookCopy.setBorrowed(true);
        dvdCopy.setTitle("JavaScript-2");

        LibraryManager manager = new LibraryManager();
        LibraryItem[] items = new LibraryItem[4];
        items[0] = book;
        items[1] = dvd;
        items[2] = bookCopy;
        items[3] = dvdCopy;


        manager.addItem(book);
        manager.addItem(dvd);
        manager.addItem(bookCopy);
        manager.addItem(dvdCopy);

        System.out.println("\nDisplaying all items:");
        manager.displayAllItems();
    }
}
