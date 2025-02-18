package dev.inesh.Ecommerce_App;

import java.util.*;

public class Inventory <T extends Item> {
    private final Map<Integer, T> items = new HashMap<>();

    public Inventory() {}

    public void addItem(T item) {
        items.put(item.getId(), item);
    }

    public void removeItem(int id) {
        items.remove(id);
    }

    public T getItem(int id) {
        return items.get(id);
    }

    public List<T> getAllItems() {
        return new ArrayList<>(items.values());
    }
}
