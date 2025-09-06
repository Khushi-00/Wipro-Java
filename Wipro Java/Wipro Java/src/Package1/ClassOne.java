package Package1;

public class ClassOne {
	
	private static String employeeSalary = "45000";
	
	private void fetchsalary() {
		System.out.println("The employee salary is" + employeeSalary);	
	}
	
	public void display() {
		System.out.println("Displaying the data in parent class");
	}
	
	//default variable	
	int employeeId = 123345;
	
	//default method 
	
	void fetchemployeeId() {
		System.out.println("The employee Id is" +employeeId);
		
	}
	
	 // Protected variable
    protected String employeeDepartment = "IT";

    // Protected method
    protected void fetchDepartment() {
        System.out.println("Employee works in the " + employeeDepartment + " department.");
    }
    
    public String message = "Hello from ClassOne in packageone!";
    public void displayMessage() {
    	System.out.println("Message: " + message);
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassOne obj = new ClassOne();
		
		obj.display();  
		obj.fetchsalary();
		obj.fetchemployeeId();
		obj.fetchDepartment();
        obj.displayMessage();
	}
}
