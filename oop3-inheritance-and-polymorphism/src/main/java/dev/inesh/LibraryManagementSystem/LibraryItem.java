package dev.inesh.LibraryManagementSystem;

public class LibraryItem {
    private String title;
    private int id;
    private boolean isBorrowed;

    public LibraryItem() {}

    public LibraryItem(String title, int id, boolean isBorrowed) {
        this.title = title;
        this.id = id;
        this.isBorrowed = isBorrowed;
    }

    public LibraryItem(LibraryItem other){
        this.title = other.title;
        this.id = other.id;
        this.isBorrowed = other.isBorrowed;
    }

    public String displayInfo(){
        System.out.println("Book: "+title+" , ID: "+id+", Borrowed: "+isBorrowed);

        return null;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}
