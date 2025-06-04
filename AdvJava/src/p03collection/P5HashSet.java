package p03collection;
import java.util.HashSet;
import java.util.Set;

public class P5HashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // 1. add() - Adds an element to the set
        set.add("Red");
        set.add("Blue");
        set.add("Green");

        // 2. add() - Does not allow duplicate elements
        set.add("Blue");  // Duplicate will be ignored

        // 3. remove() - Removes an element from the set
        set.remove("Green");

        // 4. contains() - Checks if the set contains a specific element
        System.out.println("Set contains 'Blue': " + set.contains("Blue"));

        // 5. size() - Returns the size of the set
        System.out.println("Size of set: " + set.size());

        // Printing the final set
        System.out.println("Final Set: " + set);
    }
}
