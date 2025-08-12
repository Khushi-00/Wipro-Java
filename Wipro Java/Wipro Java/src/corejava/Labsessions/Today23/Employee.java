package corejava.Labsessions.Today23;
//Superclass
class Employee {
	public void work() {
		System.out.println("Employee is working");
	}

	public double getSalary() {
		return 50000; // base salary
	}

	public static void main(String[] args) {
		HRManager hr = new HRManager();
		hr.work();            // overridden method
		System.out.println("Salary: " + hr.getSalary()); // inherited method
		hr.addEmployee();     // new method in subclass
	}
}

//Subclass
class HRManager extends Employee {
	@Override
	public void work() {
		System.out.println("HR Manager is managing employee work");
	}

	public void addEmployee() {
		System.out.println("HR Manager added a new employee.");
	}
}

