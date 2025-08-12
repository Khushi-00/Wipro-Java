package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetEg {

    public static void main(String[] args) {

        // no duplicate elements allowed
        // no guaranteed order
        // nulls are allowed
        // not synchronized
        // operations are faster than the lists interface

        Set<String> items = new HashSet<>();

        items.add("Summers");
        items.add("Winters");
        items.add("Autumn");
        items.add("Monsoon");
        items.add(null); 
        items.add("Monsoon"); 

        System.out.println(items);
        System.out.println(items.contains("Autumn"));
        System.out.println(items.size());
        items.remove("Summers");
        System.out.println(items);
        System.out.println(items.isEmpty());
        System.out.println(items.size());
    }
}
