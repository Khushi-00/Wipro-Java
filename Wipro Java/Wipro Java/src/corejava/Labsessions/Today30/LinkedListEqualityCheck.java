package corejava.Labsessions.Today30;

import java.util.LinkedList;

public class LinkedListEqualityCheck {

    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Java");
        list1.add("Python");
        list1.add("C++");
        list1.add("Ruby");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Java");
        list2.add("Python");
        list2.add("C++");

        boolean areEqual = list1.equals(list2);

        if (areEqual) {
            System.out.println("The LinkedLists are equal.");
        } else {
            System.out.println("The LinkedLists are not equal.");
        }
    }
}
