package Collections;

import java.util.Vector;
import java.util.Iterator;

public class VectorSet {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("French");
        vector.add("German");
        vector.add("Japanese");
        vector.add("Sanskrit");

        // addElement()
        vector.addElement("Elderberry");

        // get()
        System.out.println("Element at index 2: " + vector.get(2));  

        // remove() 
        vector.remove("German");
        System.out.println("After removing 'German': " + vector);

        // size()
        System.out.println("Size of vector: " + vector.size());

        // contains() 
        System.out.println("Contains 'French'? " + vector.contains("French"));

        // iterator() 
        System.out.println("Iterating using Iterator:");
        Iterator<String> it = vector.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
