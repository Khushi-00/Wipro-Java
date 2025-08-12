package corejava;

public class Employee {
	
	    private String name;
	    private int id;
	    private double salary;
	    
	    public Employee(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	    public void setSalary(double salary) {
	        if (salary > 0) {
	            this.salary = salary;
	        } else {
	            System.out.println("Invalid salary for " + name + ". Salary must be positive.");
	            this.salary = 0; // Default to 0 if invalid
	        }
	    }
	    public double getSalary() {
	        return salary;
	    }

	    public void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Employee ID: " + id);
	        System.out.println("Salary: " + salary);
	        System.out.println("-------------------------");
	    }
	    
	public static void main(String[] args) {
		Employee emp1 = new Employee("Malisa", 101);
        emp1.setSalary(50000);
        emp1.displayDetails();

        Employee emp2 = new Employee("Nathenial", 102);
        emp2.setSalary(-20000); // Invalid salary
        emp2.displayDetails();

        Employee emp3 = new Employee("Alexendria", 103);
        emp3.setSalary(60000);
        emp3.displayDetails();

	}

}
