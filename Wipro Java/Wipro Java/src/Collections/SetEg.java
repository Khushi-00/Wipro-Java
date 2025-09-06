package Collections;

import java.util.Set;
import java.util.TreeSet;

public class SetEg {

	public static void main(String[] args) {
		Set<String> st = new TreeSet<String>();
		
		st.add("Summers");
		
		st.add("Winters");
		
		st.add("Monsoon");
		
		st.add("Autumn");
		
		st.add("null");
		
		System.out.println(st);
		
		System.out.println(st.isEmpty());
		System.out.println(st.remove("Summers"));
		System.out.println(st);
		
		System.out.println(st.add("Season"));
		
		System.out.println(st);
		
		System.out.println(st.size());

	}

}
