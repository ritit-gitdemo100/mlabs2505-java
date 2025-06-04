package p03collection;
import java.util.Stack;

public class P4Stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // 1. push() - Pushes an element onto the stack
        stack.push("One");
        stack.push("Two");
        stack.push("Three");

        // 2. pop() - Removes and returns the top element of the stack
        System.out.println("Popped: " + stack.pop());  // Removes "Three"

        // 3. peek() - Returns, but does not remove, the top element of the stack
        System.out.println("Peeked: " + stack.peek());  // Peeks at "Two"

        // 4. search() - Returns the 1-based position of the element from the top of the stack
        System.out.println("Position of 'One': " + stack.search("One"));

        // 5. empty() - Checks if the stack is empty
        System.out.println("Is the stack empty? " + stack.empty());

        // Printing the final stack
        System.out.println("Final Stack: " + stack);
    }
}
