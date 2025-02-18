package dev.inesh.Ecommerce_App;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        Inventory<Item> inventory = new Inventory<>();
        Item item1 = new Item(1, "JP", 2.0, 5);
        Item item2 = new Item(2, "Phone", 1.5, 10);
        Item item3 = new Item(3, "Pant", 3.0, 7);

        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.addItem(item3);
        System.out.println("Get Item 2: " + inventory.getItem(2));

        inventory.removeItem(1);
        System.out.println("After removing Item 1: " + inventory.getItem(1));

        System.out.println("All Items: " + inventory.getAllItems());

        items.add(new Book(1,"Java Programming", 50.0, 99, "Inesh-Reddy" ));
        items.add(new Electronics (2,"IPhone", 164999.0, 99, "2-Years" ));
        items.add(new Clothing (3,"T-Shirt", 5999.0, 99, "XL" ));

        System.out.println("----------------------");
        System.out.println("UnSorted items: ");
        System.out.println("----------------------");
        for(Item item : items) {
            System.out.println(item.getName());
        }


        Collections.sort(items);
        System.out.println("----------------------");
        System.out.println("Sorted items: ");
        System.out.println("----------------------");
        for(Item item : items) {
            System.out.println(item.getName());
        }
    }
}
