package corejava;

abstract class AbstractClass {
	
	// abstract methods - no body
	
	abstract void makesound();
	
	//concrete methods
	
	public void eat() {
		System.out.println("The animal eats food");
	}
	
	AbstractClass(){
		System.out.println("Creating constructor in abstract class");
	}
	//instance variables
	
	public static String animalName = "Lion";
	
	//final variable
	
	private final String animalBehaviour = "Roars";
	
}
