package Collections;

import java.util.Queue;
import java.util.LinkedList;

public class LinkedListQueue {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Alpha");
        queue.add("Beta");
        queue.add("Gamma");
        queue.add("Delta");

        // Print the entire queue
        System.out.println("Initial Queue: " + queue);

        // Peek 
        System.out.println("Peek: " + queue.peek());  // Alpha

        // Poll 
        System.out.println("Polled: " + queue.poll()); // Alpha
        System.out.println("Queue after poll: " + queue); // [Beta, Gamma, Delta]

        // Remove specific element
        boolean removed = queue.remove("Charlie");
        System.out.println("Removed 'Charlie': " + removed);
        System.out.println("Queue after removal: " + queue); // [Beta, Delta]

        // Check if empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Size of queue
        System.out.println("Queue size: " + queue.size());
    }
}
