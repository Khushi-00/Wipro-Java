package corejava.Labsessions.Today18;

public class SwapVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
        int b = 10;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swapping using a third variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
	
}

