package Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {

    public static void main(String[] args) {

        // no duplicates are allowed
        // insertion order is preserved
        // only one null is allowed
        // not synchronized
        // slightly slower than hash set (order maintained)

        Set<String> ls = new LinkedHashSet<>();

        ls.add("Morning");
        ls.add("Afternoon");
        ls.add("Evening");
        ls.add("Night");
        ls.add(null); 
        ls.add("Morning"); 
        
        System.out.println(ls);
        ls.remove("Afternoon");
        System.out.println(ls);
        System.out.println(ls.contains("Night"));
        System.out.println(ls.isEmpty());
        System.out.println(ls.size());
    }
}
