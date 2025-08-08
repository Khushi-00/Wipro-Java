package corejava;

public class SingleInChildClass extends SingleInSuperClass{
	String model =  "Mustang";

	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Brand is" +  brand);
		System.out.println("Model is" +  model);
	}
	
	public static void main(String[] args) {
		SingleInChildClass obj = new SingleInChildClass();
		obj.start();
		obj.display();
	}
}
