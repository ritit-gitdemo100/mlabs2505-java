package p03collection;
import java.util.PriorityQueue;
import java.util.Queue;

public class P8PriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        // 1. add() - Adds an element to the queue
        queue.add(10);
        queue.add(30);
        queue.add(20);

        // 2. peek() - Retrieves, but does not remove, the head of the queue
        System.out.println("Head of the queue: " + queue.peek());

        // 3. poll() - Retrieves and removes the head of the queue
        System.out.println("Polled element: " + queue.poll());

        // 4. offer() - Adds an element to the queue (returns false if full)
        queue.offer(5);

        // 5. size() - Returns the number of elements in the queue
        System.out.println("Size of the queue: " + queue.size());

        // Printing the final queue
        System.out.println("Final Queue: " + queue);
    }
}
