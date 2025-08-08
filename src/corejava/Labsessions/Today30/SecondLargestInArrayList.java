package corejava.Labsessions.Today30;

import java.util.ArrayList;
import java.util.Collections;

public class SecondLargestInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(14);
        numbers.add(27);
        numbers.add(33);
        numbers.add(19);
        numbers.add(27); 
        numbers.add(8);

        System.out.println("Original List: " + numbers);
        
        ArrayList<Integer> uniqueList = new ArrayList<>(new java.util.HashSet<>(numbers));

        if (uniqueList.size() < 2) {
            System.out.println("Second largest element not found. Not enough unique elements.");
        } else {
           
            Collections.sort(uniqueList);
            int secondLargest = uniqueList.get(uniqueList.size() - 2);
            System.out.println("Second Largest Element: " + secondLargest);
        }
    }
}
