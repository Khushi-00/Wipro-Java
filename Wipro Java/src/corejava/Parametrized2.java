package corejava;

public class Parametrized2 {
	
	public void displayInfo(String name) {
        System.out.println("Name: " + name);
    }

    public void displayInfo(int age, String city) {
        System.out.println("Age: " + age + ", City: " + city);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parametrized2 obj = new Parametrized2();

        obj.displayInfo("Achilles");

        obj.displayInfo(30, "Greek");


	}

}
