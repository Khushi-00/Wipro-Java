package Collections;

import java.util.Map;
import java.util.TreeMap;

public class MapEg1 {
	
	 public static void main(String[] args) {
	        Map<Integer, String> map = new TreeMap<>();
	        
	        map.put(1, "Apple");
	        map.put(2, "Banana");
	        map.put(3, "Cherry");
	        map.put(2, "Blueberry"); // Each key can map to at most one value
	        map.put(4, "Apple"); // Values can be duplicated
	        map.put(5, null);
	        map.put(6, null); // Multiple null values are allowed	        
	      
	        System.out.println();
	        for (Map.Entry<Integer, String> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + "." + entry.getValue());
	        }
	    }
}
