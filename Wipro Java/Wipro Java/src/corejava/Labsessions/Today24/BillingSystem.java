package corejava.Labsessions.Today24;

abstract class Bill {
    
    // Abstract method to be implemented by all subclasses
    abstract void generateBill();
}

// ElectricityBill class extending Bill
class ElectricityBill extends Bill {
    
    // Sample fields
    private int unitsConsumed;
    private double ratePerUnit;
 // Constructor
    public ElectricityBill(int unitsConsumed, double ratePerUnit) {
        this.unitsConsumed = unitsConsumed;
        this.ratePerUnit = ratePerUnit;
    }

    // Implementing abstract method
    @Override
    void generateBill() {
        double total = unitsConsumed * ratePerUnit;
        System.out.println("Electricity Bill:");
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Rate per Unit: ₹" + ratePerUnit);
        System.out.println("Total Bill: ₹" + total);
    }
}
//WaterBill class extending Bill
class WaterBill extends Bill {

 // Sample fields
 private int litersUsed;
 private double ratePerLiter;

 // Constructor
 public WaterBill(int litersUsed, double ratePerLiter) {
     this.litersUsed = litersUsed;
     this.ratePerLiter = ratePerLiter;
 }

 // Implementing abstract method
 @Override
 void generateBill() {
	 double total = litersUsed * ratePerLiter;
     System.out.println("\nWater Bill:");
     System.out.println("Liters Used: " + litersUsed);
     System.out.println("Rate per Liter: ₹" + ratePerLiter);
     System.out.println("Total Bill: ₹" + total);
 }
}

//Main class to test the billing system
public class BillingSystem {
 public static void main(String[] args) {
     
     // Create ElectricityBill object and call generateBill()
     Bill electric = new ElectricityBill(250, 6.5);
     electric.generateBill();
  // Create WaterBill object and call generateBill()
     Bill water = new WaterBill(1200, 0.75);
     water.generateBill();

	}

}
