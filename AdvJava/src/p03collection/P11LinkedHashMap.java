package p03collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class P11LinkedHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        // 1. put() - Adds key-value pair to the map
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");

        // 2. get() - Retrieves the value associated with a specific key
        System.out.println("Value for key '2': " + map.get("2"));

        // 3. remove() - Removes the key-value pair associated with a specific key
        map.remove("3");

        // 4. keySet() - Returns a set view of the keys in the map
        System.out.println("Keys: " + map.keySet());

        // 5. values() - Returns a collection view of the values in the map
        System.out.println("Values: " + map.values());

        // Printing the final map
        System.out.println("Final LinkedHashMap: " + map);
    }
}
