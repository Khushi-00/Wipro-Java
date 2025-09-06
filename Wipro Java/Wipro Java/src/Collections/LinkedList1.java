package Collections;

import java.util.LinkedList;

public class LinkedList1 {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        // Add elements
        ll.add("Alan");
        ll.add("Blair");
        ll.add("Chuck");
        ll.add("Danial");
        ll.add("Elenor");
        ll.add(null);

        System.out.println(ll);

        System.out.println(ll.get(2));

        System.out.println(ll.indexOf("Blair"));

        System.out.println(ll.isEmpty());

        System.out.println(ll.remove(4));
        System.out.println(ll);

        System.out.println(ll.set(4, "Nate"));

        System.out.println(ll);

        System.out.println(ll.size());
    }
}
