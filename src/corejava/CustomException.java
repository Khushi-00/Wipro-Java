package corejava;

public class CustomException {

	public static void checkage(int age) throws Exception{
		if (age <18) {
			
			System.out.println("Create a new exception");
			
			// using throw keyword
			
			throw new Exception ("Age must be 18 or older to vote");
			
		}else {
			
			System.out.println("Person isn't eligible for voting");
		}

	}

}
