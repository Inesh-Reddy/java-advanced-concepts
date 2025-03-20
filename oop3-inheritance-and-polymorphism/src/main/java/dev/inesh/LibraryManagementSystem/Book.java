package dev.inesh.LibraryManagementSystem;

public class Book extends LibraryItem {
    private int pages;

    public Book(){};

    public Book(String title, int id, boolean isBorrowed,int pages) {
        super(title, id, isBorrowed);
        this.pages = pages;
    }
    public Book(Book other){
        super(other.getTitle(), other.getId(), other.isBorrowed());
        this.pages = other.pages;
    }

    @Override
    public String displayInfo() {
        System.out.println("Book: "+ getTitle() +", Pages: "+pages+" , ID: "+ getId() +", Borrowed: "+isBorrowed());
        return null;
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
                "pages=" + pages +
                '}';
    }
}
