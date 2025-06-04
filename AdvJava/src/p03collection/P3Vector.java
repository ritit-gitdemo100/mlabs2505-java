package p03collection;
import java.util.Vector;

public class P3Vector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        // 1. add() - Adds an element to the end of the vector
        vector.add("Red");
        vector.add("Green");
        vector.add("Blue");

        // 2. insertElementAt() - Adds an element at a specific position
        vector.insertElementAt("Yellow", 1);  // Inserts "Yellow" at index 1

        // 3. remove() - Removes the element at a specific index
        vector.remove(2);  // Removes "Blue" from index 2

        // 4. elementAt() - Retrieves the element at a specific index
        System.out.println("Element at index 1: " + vector.elementAt(1));

        // 5. contains() - Checks if a specific element exists in the vector
        System.out.println("Vector contains 'Red': " + vector.contains("Red"));

        // Printing the final vector
        System.out.println("Final Vector: " + vector);
    }
}
