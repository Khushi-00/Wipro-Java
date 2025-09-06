package corejava.Labsessions.Today24;

public class Employee {
	
	// Declare public data members
    public String employeeName;
    public int employeeId;
    public String employeeDepartment;

    //  Public constructor to initialize employee details
    public Employee(String name, int id, String department) {
        this.employeeName = name;
        this.employeeId = id;
        this.employeeDepartment = department;
    }

    //  Public method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + employeeDepartment);
    }

	public static void main(String[] args) {
		// Create an object of Employee class
        Employee emp = new Employee("Simon Minj", 1001, "Finance");

        // Access public members and method
        emp.displayEmployeeDetails();
    }

}
