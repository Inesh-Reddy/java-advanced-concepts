package dev.inesh.Task01OverloadingWithCopyConstructor;

public class Book {
    private String title;
    private int pages;

    public Book() {
    }

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public Book(Book other) {
        this.title = other.title;
        this.pages = other.pages;
    }

    public Book(Book other, String newTitle){
        this.title = newTitle;
        this.pages = other.pages;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }
}
