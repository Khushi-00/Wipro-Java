package corejava.Labsessions.Today24;

public class CustomerDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create an object of the Customer class
        Customer cust = new Customer("Nityanjana Das", 202, "Sales");

        // Access protected members using the object
        cust.displayCustomerInfo();  // Allowed because it's in the same package
    }
}
