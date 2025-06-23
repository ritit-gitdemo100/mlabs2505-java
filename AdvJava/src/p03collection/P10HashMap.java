package p03collection;
import java.util.HashMap;
import java.util.Map;

public class P10HashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // 1. put() - Adds key-value pair to the map
        map.put("Apple", 50);
        map.put("Banana", 30);
        map.put("Orange", 20);

        // 2. get() - Retrieves the value associated with a specific key
        System.out.println("Price of Banana: " + map.get("Banana"));

        // 3. remove() - Removes the key-value pair associated with a specific key
        map.remove("Orange");

        // 4. containsKey() - Checks if the map contains a specific key
        System.out.println("Map contains key 'Apple': " + map.containsKey("Apple"));

        // 5. size() - Returns the number of key-value pairs in the map
        System.out.println("Size of map: " + map.size());

        // Printing the final map
        System.out.println("Final Map: " + map);
        
        
    }
}
