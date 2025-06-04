package p03collection;
import java.util.ArrayList;
import java.util.List;

public class P1ArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // 1. add() - Adds an element at the end of the list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // 2. add(index, element) - Adds an element at a specific index
        list.add(1, "Mango");

        // 3. get() - Retrieves an element by index
        System.out.println("Element at index 2: " + list.get(2));

        // 4. remove() - Removes the element at a specific index
        list.remove(1);  // Removes "Mango"

        // 5. contains() - Checks if the list contains a specific element
        System.out.println("List contains 'Banana': " + list.contains("Banana"));

        // Printing the final list
        System.out.println("Final List: " + list);
    }
}
