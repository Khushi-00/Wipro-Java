package Collections;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListUsingDeque {

    public static void main(String[] args) {
        // Create a Deque of Strings
        Deque<String> deque = new LinkedList<>();

        // Add elements to both ends
        deque.addFirst("Alpha");
        deque.addLast("Beta");
        deque.addLast("Gamma");
        deque.addFirst("Delta");

        // Print the deque
        System.out.println("Deque after additions: " + deque);  
        // Peek at first and last
        System.out.println("First Element: " + deque.peekFirst()); 
        System.out.println("Last Element: " + deque.peekLast());    

        // Poll (remove) from both ends
        System.out.println("Removed First: " + deque.pollFirst());  
        System.out.println("Removed Last: " + deque.pollLast());    

        // Final state of deque
        System.out.println("Deque after polling: " + deque);  
        
        // Check size
        System.out.println("Size of deque: " + deque.size());

        // Check if empty
        System.out.println("Is deque empty? " + deque.isEmpty());
    }
}
