package corejava;

final class FinalExample {
	void showType() {
        System.out.println("This is a final vehicle class.");
    }
}

// Parent class with final method and final variable
class Vehicle {
	final int wheels = 4; 

    final void engineType() { 
        System.out.println("This vehicle uses a diesel engine.");
    }
}

// Child class trying to inherit Vehicle
class Car extends Vehicle {
    
    void display() {
        System.out.println("Car has " + wheels + " wheels.");
    }
}

public class FinalVehicle {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.engineType();   
        myCar.display();      
        FinalExample obj = new FinalExample();
        obj.showType();       
    }
}