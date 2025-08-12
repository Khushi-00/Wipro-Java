package corejava.Labsessions.Today18;

public class MaxThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 25;
        int b = 42;
        int c = 17;

        int max;

        // Comparing the numbers
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        System.out.println("The maximum number is: " + max);

	}

}
