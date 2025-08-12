package Collections;

public class Employee {
	
	int id;
	
	String name;
	
	double salary;
	
	Employee (int id, String name) {
		
	this.id = id;
	this.name = name;
	this.salary = salary;
	}

	public String toString() {
	return id + ". " + name + "_ Rs." + salary;

	}

}
