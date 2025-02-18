package dev.inesh.Ecommerce_App;

public class Clothing extends Item {
    private String size;

    public Clothing() {
    }

    public Clothing(int id, String name, double price, int quantity, String size) {
        super(id, name, price, quantity);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
