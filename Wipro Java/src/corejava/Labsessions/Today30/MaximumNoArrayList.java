package corejava.Labsessions.Today30;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumNoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(45);
        numbers.add(12);
        numbers.add(67);
        numbers.add(89);
        numbers.add(23);

        int max = Collections.max(numbers);

        System.out.println(numbers);
        System.out.println(max);
    }
}



