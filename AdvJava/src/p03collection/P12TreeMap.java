package p03collection;
import java.util.TreeMap;

public class P12TreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // 1. put() - Adds key-value pairs to the map
        treeMap.put("Apple", 50);
        treeMap.put("Banana", 30);
        treeMap.put("Orange", 20);

        // 2. get() - Retrieves the value associated with a specific key
        System.out.println("Price of Banana: " + treeMap.get("Banana"));

        // 3. remove() - Removes a specific key-value pair
        treeMap.remove("Orange");

        // 4. firstKey() - Retrieves the first (lowest) key
        System.out.println("First key: " + treeMap.firstKey());

        // 5. lastKey() - Retrieves the last (highest) key
        System.out.println("Last key: " + treeMap.lastKey());

        // Printing the final TreeMap
        System.out.println("Final TreeMap: " + treeMap);
    }
}
