package corejava.Labsessions.Today23;

//Superclass
class Vehicle {
	public void drive() {
		System.out.println("Driving a vehicle");
	}

	public static void main(String[] args) {
		Car myCar = new Car();  // Create object of subclass
		myCar.drive();          // Calls the overridden method
	}
}

//Subclass
class Car extends Vehicle {
	@Override
	public void drive() {
		System.out.println("Repairing a car");
	}
}

