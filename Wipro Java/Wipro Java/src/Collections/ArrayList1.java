package Collections;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Alan");
		al.add("Blair");
		al.add("Chuck");
		al.add("Danial");
		al.add("Elenor");
		al.add(null);
		
		System.out.println(al);
		
		System.out.println(al.get(2));
		
		System.out.println(al.indexOf("Blair"));
		
		System.out.println(al.isEmpty());
		System.out.println(al.remove(4));
		System.out.println(al);
		
		System.out.println(al.set(4,"Nate"));
		
		System.out.println(al);
		
		System.out.println(al.size());
		
	}

}
