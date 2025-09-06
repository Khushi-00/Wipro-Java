package Package2;

import Package1.ClassOne;

public class DifferentPackageSubClass extends ClassOne{
	
	public void create() {
		
		System.out.println("Creating in sub class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DifferentPackageSubClass obj = new DifferentPackageSubClass();
		
		obj.create();
		obj.displayMessage();

	}

}
