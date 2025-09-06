package Package2;

//Step 1: Import the class from another package
import Package1.ClassOne;

public class ClassTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Step 2: Create object of ClassOne
        ClassOne obj = new ClassOne();
        
        // Step 3: Access data and method from ClassOne
        System.out.println("Accessing data from ClassOne: " + obj.message);
        obj.displayMessage();
    }
}

