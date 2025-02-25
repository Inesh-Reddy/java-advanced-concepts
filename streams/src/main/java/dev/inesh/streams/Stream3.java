package dev.inesh.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Item3 {
    private int id;
    private String name;
    private int price;
    private int quantity;

    public Item3(int id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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
}

public class Stream3 {
    public static void main(String[] args) {
        List<Item3> inventory = Arrays.asList(
                new Item3(101, "Laptop", 1500, 5),
                new Item3(102, "Keyboard", 500, 10),
                new Item3(103, "Mouse", 300, 0),
                new Item3(104, "Monitor", 2000, 3),
                new Item3(105, "Headphones", 1200, 7),
                new Item3(106, "Laptop Stand", 1800, 4),
                new Item3(107, "Monitor", 2500, 2), // Duplicate name
                new Item3(108, "Smartphone", 3000, 8),
                new Item3(109, "Tablet", 2200, 6),
                new Item3(110, "Desk Lamp", 1300, 1)
        );


        List<String> top5Items = inventory.stream()
                .filter(item -> item.getPrice() > 1000 && item.getQuantity() > 0)
                .map(Item3::getName)
                .distinct()
                .sorted()
                .limit(5)
                .collect(Collectors.toList());

        System.out.println("Top 5 searched Items: " + top5Items);
    }
}
