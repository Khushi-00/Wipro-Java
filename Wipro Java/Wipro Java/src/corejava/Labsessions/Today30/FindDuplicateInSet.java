package corejava.Labsessions.Today30;

import java.util.*;

public class FindDuplicateInSet {

	    public static void main(String[] args) {
	        
	        List<String> names = Arrays.asList(
	            "Morning", "Noon", "Night", "Morning", "Afternoon", "Evening", "Noon"
	        );

	        Set<String> uniqueNames = new HashSet<>();
	        Set<String> duplicateNames = new HashSet<>();

	        for (String name : names) {
	            if (!uniqueNames.add(name)) {
	                duplicateNames.add(name);
	            }
	        }

	        System.out.println("Original List: " + names);
	        System.out.println("Duplicate Elements: " + duplicateNames);
	    }
	}
