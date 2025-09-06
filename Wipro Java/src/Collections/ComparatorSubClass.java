package Collections;

import java.util.ArrayList;
import java.util.Collections; 
import java.util.Comparator; 
import java.util.List;
import java.util.*;

public class ComparatorSubClass implements Comparator<Employee> {
	
		public int compare (Employee e1, Employee e2){
			//return e1.name.compareTo(e2.name);
		
			return Double.compare(e2.salary, e1.salary);
		}
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee (101, "Priyal", 76000));
		employees.add(new Employee (109, "Naina", 54000));
		employees.add(new Employee (201, "Suneha", 67000));
		employees.add(new Employee (101, "Priyal",76000));
		employees.add(new Employee (106, "Annirudh",87000));
		
		Collections.sort(employees, new ComparatorSubClass());
		for (Employee e: employees) {
			System.out.println(e);
		}

	}

}
