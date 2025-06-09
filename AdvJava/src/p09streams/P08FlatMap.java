package p09streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Item {
    private String name;
    
    public Item(String name) { 
    	this.name = name; 
    }
    public String getName() { 
    	return name; 
    }
}

class Order {
    private List<Item> items;
    
    public Order(List<Item> items) { 
    	this.items = items; 
    }
    public List<Item> getItems() { 
    	return items; 
    }
}

public class P08FlatMap {
    public static void main(String[] args) {
    	
        List<Order> orders = Arrays.asList(
            new Order(Arrays.asList(new Item("Apple"), new Item("Banana"))),
            new Order(Arrays.asList(new Item("Orange"), new Item("Banana"), new Item("Mango"))),
            new Order(Arrays.asList(new Item("Apple")))
        );

        orders.stream()
            .flatMap(order -> order.getItems().stream())   
            .map(Item::getName)
            .distinct()
            .forEach(System.out::println);
    }
}
