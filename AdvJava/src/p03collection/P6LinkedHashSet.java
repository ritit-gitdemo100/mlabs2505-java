package p03collection;
import java.util.LinkedHashSet;

public class P6LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // 1. add() - Adds an element to the set
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");

        // 2. add() - Does not allow duplicate elements
        linkedHashSet.add("Banana");  // Duplicate will be ignored

        // 3. remove() - Removes a specific element
        linkedHashSet.remove("Orange");

        // 4. contains() - Checks if the set contains a specific element
        System.out.println("Set contains 'Apple': " + linkedHashSet.contains("Apple"));

        // 5. size() - Returns the size of the set
        System.out.println("Size of set: " + linkedHashSet.size());

        // Printing the final set
        System.out.println("Final LinkedHashSet: " + linkedHashSet);
    }
}
