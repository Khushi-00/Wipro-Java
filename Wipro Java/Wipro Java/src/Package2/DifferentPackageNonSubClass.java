package Package2;

import Package1.ClassOne;

public class DifferentPackageNonSubClass {
	
	public void Print() {
		
		System.out.println("Printing the data");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassOne obj = new ClassOne();
		
		DifferentPackageNonSubClass obj1 = new DifferentPackageNonSubClass();
		
		obj.displayMessage();
		obj1.Print();

	}

}
