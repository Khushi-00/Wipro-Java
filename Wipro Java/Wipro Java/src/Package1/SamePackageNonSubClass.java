package Package1;

public class SamePackageNonSubClass {
	
	public void write() {
		
		System.out.println("Writing in the sub class");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassOne obj = new ClassOne();
		
		SamePackageNonSubClass obj1 = new SamePackageNonSubClass();
		
		obj1.write(); //own method
		
		obj.displayMessage();  // inherited
	}

}
