package Package1;

public class SamePackageSubClass extends ClassOne{
	
public void read() {
		
		System.out.println("Reading in the sub class");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamePackageSubClass obj = new SamePackageSubClass();
		
		obj.displayMessage(); //inherited
		
		obj.read();  // own method

	}

}
