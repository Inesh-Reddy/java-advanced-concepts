import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Item4 {
    private int id;
    private String name;
    private int price;
    private int quantity;

    public Item4(int id, String name, int price, int quantity) {
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
        return "Item{id=" + id + ", name='" + name + "', price=" + price + ", quantity=" + quantity + "}";
    }
}

public class Stream4 {
    public static void main(String[] args) {
        List<Item4> inventory = Arrays.asList(
                new Item4(101, "Laptop", 1500, 5),
                new Item4(102, "Keyboard", 500, 10),
                new Item4(103, "Mouse", 300, 0),
                new Item4(104, "Monitor", 2000, 3),
                new Item4(105, "Headphones", 1200, 7)
        );


        int totalQuantity = inventory.stream()
                .map(Item4::getQuantity)
                .reduce(0, Integer::sum);
        System.out.println("Total Quantity: " + totalQuantity);


        Optional<Item4> mostExpensiveItem = inventory.stream()
                .reduce((item1, item2) -> item1.getPrice() > item2.getPrice() ? item1 : item2);
        mostExpensiveItem.ifPresent(item -> System.out.println("Most Expensive Item: " + item));


        String allItemNames = inventory.stream()
                .map(Item4::getName)
                .reduce((name1, name2) -> name1 + ", " + name2)
                .orElse("No Items");
        System.out.println("Item Names: " + allItemNames);
    }
}

