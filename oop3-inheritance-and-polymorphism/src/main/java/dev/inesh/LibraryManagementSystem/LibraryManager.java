package dev.inesh.LibraryManagementSystem;

import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<LibraryItem> items;

    public LibraryManager() {
        items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println("Added generic library item: " + item.getTitle());
    }

    public void addItem(Book book) {
        items.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    public void addItem(DVD dvd) {
        items.add(dvd);
        System.out.println("Added DVD: " + dvd.getTitle());
    }

    public void displayAllItems() {
        for (LibraryItem item : items) {
            item.displayInfo();
        }
    }

}
