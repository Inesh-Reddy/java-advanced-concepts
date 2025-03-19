package dev.inesh.Task01OverloadingWithCopyConstructor;

public class Client {
    public static void main(String[] args) {
        Book book1 = new Book("Java Basics",300);
        Book book2 = new Book(book1);
        Book book3 = new Book(book1, "Java");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

    }
}
