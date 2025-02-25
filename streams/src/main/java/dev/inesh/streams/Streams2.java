package dev.inesh.streams;

import java.util.Arrays;
import java.util.List;

class Item2 {
    private int id;
    private String name;
    private int price;
    private int quantity;

    public Item2(int id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Item2{id=" + id + ", name='" + name + "', price=" + price + ", quantity=" + quantity + "}";
    }
}

public class Streams2 {
    public static void main(String[] args) {
        List<Item2> inventory = Arrays.asList(
                new Item2(101, "Laptop", 1500, 5),
                new Item2(102, "Keyboard", 500, 10),
                new Item2(103, "Mouse", 300, 0),
                new Item2(104, "Monitor", 2000, 3),
                new Item2(105, "Headphones", 1200, 7)
        );

        System.out.println("Items priced above 1000:");
        inventory.stream()
                .filter(item -> item.getPrice() > 1000)
                .forEach(System.out::println);

        boolean hasZeroQuantity = inventory.stream()
                .anyMatch(item -> item.getQuantity() == 0);
        System.out.println("\nAny item with quantity 0? " + hasZeroQuantity);

        boolean allItemsHavePrice = inventory.stream()
                .allMatch(item -> item.getPrice() > 0);
        System.out.println("\nAll items have price greater than 0? " + allItemsHavePrice);

        boolean noNegativeQuantity = inventory.stream()
                .noneMatch(item -> item.getQuantity() < 0);
        System.out.println("\nNo item has negative quantity? " + noNegativeQuantity);
    }
}
