package dev.inesh.streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Item {
    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class Stream {
    public static void main(String[] args) {
        List<Item> inventory = Arrays.asList(
                new Item(101, "Laptop"),
                new Item(102, "Keyboard"),
                new Item(103, "Mouse"),
                new Item(104, "Monitor")
        );

        System.out.println("---------------");
        inventory.stream()
                .map(Item::getId)
                .forEach(System.out::println);

        System.out.println("---------------");
        List<String> lowerCaseNames = inventory.stream()
                .map(item -> item.getName().toLowerCase())
                .collect(Collectors.toList());
        lowerCaseNames.forEach(System.out::println);

        System.out.println("---------------");
        List<Integer> nameLengths = inventory.stream()
                .map(item -> item.getName().length())
                .collect(Collectors.toList());
        nameLengths.forEach(System.out::println);
    }
}


