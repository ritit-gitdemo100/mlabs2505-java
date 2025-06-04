package p03collection;
import java.util.ArrayDeque;
import java.util.Deque;

public class P9ArrayDeque {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // 1. addFirst() - Adds an element to the front of the deque
        deque.addFirst("One");

        // 2. addLast() - Adds an element to the end of the deque
        deque.addLast("Two");

        // 3. removeFirst() - Removes and returns the first element
        System.out.println("Removed from front: " + deque.removeFirst());

        // 4. removeLast() - Removes and returns the last element
        deque.addLast("Three");
        System.out.println("Removed from end: " + deque.removeLast());

        // 5. peekFirst() - Retrieves, but does not remove, the first element
        deque.addFirst("Four");
        System.out.println("First element: " + deque.peekFirst());

        // Printing the final deque
        System.out.println("Final Deque: " + deque);
    }
}
