package p03collection;
import java.util.TreeSet;

public class P7TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        // 1. add() - Adds an element to the set
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(15);

        // 2. remove() - Removes a specific element
        treeSet.remove(15);

        // 3. first() - Retrieves the first (smallest) element in the set
        System.out.println("First element: " + treeSet.first());

        // 4. last() - Retrieves the last (largest) element in the set
        System.out.println("Last element: " + treeSet.last());

        // 5. size() - Returns the size of the set
        System.out.println("Size of TreeSet: " + treeSet.size());

        // Printing the final TreeSet
        System.out.println("Final TreeSet: " + treeSet);
    }
}
