package corejava.Labsessions.Today24;

//Abstract class Vehicle
abstract class Vehicle {
 
 // Abstract method move to be implemented by all subclasses
 abstract void move();
}

//Subclass Car extends Vehicle
class Car extends Vehicle {
 
 // Overriding the abstract method
 @Override
 void move() {
	 System.out.println("Car is moving on four wheels.");
 }
}

//Subclass Bike extends Vehicle
class Bike extends Vehicle {
 
 // Overriding the abstract method
 @Override
 void move() {
     System.out.println("Bike is moving on two wheels.");
 }
}
//Subclass Bus extends Vehicle
class Bus extends Vehicle {
 
 // Overriding the abstract method
 @Override
 void move() {
     System.out.println("Bus is moving on six wheels.");
 }
}

//Main class to test the Vehicle behavior
public class VehicleTest {
 public static void main(String[] args) {
	// Creating object of Car and calling move()
     Vehicle myCar = new Car();
     myCar.move();

     // Creating object of Bike and calling move()
     Vehicle myBike = new Bike();
     myBike.move();

     // Creating object of Bus and calling move()
     Vehicle myBus = new Bus();
     myBus.move();

	}

}
