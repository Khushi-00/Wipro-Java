package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapEg {

	public static void main(String[] args) {
		Map<Integer, String>map= new HashMap<>();
		
		map.put(1, "Rahul");
		map.put(2, "Anjali");
		map.put(3, "Teena");
		map.put(2, "Duplicate-Anjali"); // A map cannot contain duplicate keys
		
		Map<Integer, String> sortedMap = new TreeMap<>(map);
		
		sortedMap.put(4, "Teena"); // Values can be duplicated
		
		//sortedMap.put(null, "NullKey"); // Only one null as key is allowed
		Map<String, String> mapWithNull = new HashMap<>();
        mapWithNull.put(null, "FirstNull");      
        mapWithNull.put(null, "SecondNull");  
        
        mapWithNull.put("A", null);
        mapWithNull.put("B", null);
        mapWithNull.put("C", null); // Multiple null values are allowed
		
		// converting the map to the set
		
		Set set = map.entrySet();
			
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Entry entry = (Map.Entry)itr.next();
			
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
