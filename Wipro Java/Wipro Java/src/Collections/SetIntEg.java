package Collections;

import java.util.Set;
import java.util.TreeSet;

public class SetIntEg {

    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<Integer>();

        numbers.add(42);
        numbers.add(17);
        numbers.add(29);
        numbers.add(5);
        numbers.add(99);

        System.out.println(numbers); // TreeSet sorts the integers in ascending order

        System.out.println(numbers.isEmpty()); // false
        System.out.println(numbers.remove(17)); // true
        System.out.println(numbers); // [5, 29, 42, 99]

        System.out.println(numbers.add(63)); // true

        System.out.println(numbers); // [5, 29, 42, 63, 99]

        System.out.println(numbers.size()); // 5
    }
}
