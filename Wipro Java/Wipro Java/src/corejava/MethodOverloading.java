package corejava;

public class MethodOverloading {
	// Method 1: Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add three integers (overloaded version)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Add two double values (overloaded version)
    public double add(double a, double b) {
        return a + b;
    }
    
    // Method 4: Overloaded method to add two float values
    public float add(float a, float b) {
        return a + b; // returns sum of float values
    }
    
    // Method 5: Overloaded method to add one int and one double
    public double add(int a, double b) {
        return a + b; // returns sum (widening conversion to double)
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading calc = new MethodOverloading();  // Create object of Addition class
		
		   // Call different overloaded methods
        System.out.println("Sum of 10 and 20 (int): " + calc.add(10, 20));               // Calls method with 2 ints
        System.out.println("Sum of 5, 15 and 25 (int): " + calc.add(5, 15, 25));         // Calls method with 3 ints
        System.out.println("Sum of 12.5 and 8.3 (double): " + calc.add(12.5, 8.3));      // Calls method with 2 doubles
        System.out.println("Sum of 2.2f and 3.3f (float): " + calc.add(2.2f, 3.3f));
        System.out.println("Sum of 10 (int) and 6.5 (double): " + calc.add(10, 6.5));
    }

}
