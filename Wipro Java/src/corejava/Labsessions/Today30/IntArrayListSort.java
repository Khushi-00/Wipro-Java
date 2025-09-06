package corejava.Labsessions.Today30;

import java.util.ArrayList;
import java.util.Collections;

public class IntArrayListSort {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
        numbers.add(23);
        numbers.add(5);
        numbers.add(89);
        numbers.add(12);
        numbers.add(34);

        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println("Ascending: " + numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending: " + numbers);
    }
}