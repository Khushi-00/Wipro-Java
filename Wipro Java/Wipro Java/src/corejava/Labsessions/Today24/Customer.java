package corejava.Labsessions.Today24;

public class Customer {
	
	//  Declare protected data members
    protected String customerName;
    protected int customerId;
    protected String customerDepartment;

    //Create a constructor to initialize the customer details
    public Customer(String name, int id, String department) {
        this.customerName = name;
        this.customerId = id;
        this.customerDepartment = department;
    }
    
    // Create a protected method to display customer details
    protected void displayCustomerInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Department: " + customerDepartment);
    }
}