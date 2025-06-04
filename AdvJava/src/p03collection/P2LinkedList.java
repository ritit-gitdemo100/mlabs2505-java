package p03collection;
import java.util.LinkedList;

public class P2LinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // 1. add() - Adds an element to the end of the list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // 2. addFirst() - Adds an element to the front of the list
        linkedList.addFirst("Grapes");

        // 3. addLast() - Adds an element to the end of the list
        linkedList.addLast("Pineapple");

        // 4. removeFirst() - Removes the first element of the list
        System.out.println("Removed first: " + linkedList.removeFirst());

        // 5. removeLast() - Removes the last element of the list
        System.out.println("Removed last: " + linkedList.removeLast());


        // Printing the final list
        System.out.println("Final LinkedList: " + linkedList);
    }
}
