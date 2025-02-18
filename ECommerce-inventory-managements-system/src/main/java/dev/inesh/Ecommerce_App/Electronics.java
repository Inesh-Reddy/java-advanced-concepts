package dev.inesh.Ecommerce_App;

public class Electronics extends Item {
    private String Warranty;

     public Electronics() {

     }

    public Electronics(int id, String name, double price, int quantity, String warranty) {
        super(id, name, price, quantity);
        Warranty = warranty;
    }

    public String getWarranty() {
        return Warranty;
    }

    public void setWarranty(String warranty) {
        Warranty = warranty;
    }
}
