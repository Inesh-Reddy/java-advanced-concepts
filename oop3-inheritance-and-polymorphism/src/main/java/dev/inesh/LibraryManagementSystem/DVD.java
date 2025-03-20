package dev.inesh.LibraryManagementSystem;

public class DVD extends LibraryItem {
    private int duration;

    public DVD(){}

    public DVD( String title, int id, boolean isBorrowed ,int duration) {
        super(title, id, isBorrowed);
        this.duration = duration;
    }
    public DVD(DVD other) {
        super(other);
        this.duration = other.duration;
    }

    @Override
    public String displayInfo() {
        System.out.println("DVD: "+ getTitle() +", Duration: "+duration+" , ID: "+ getId() +", Borrowed: "+isBorrowed());
        return null;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "duration=" + duration +
                '}';
    }
}
