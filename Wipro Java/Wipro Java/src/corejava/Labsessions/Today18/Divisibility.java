package corejava.Labsessions.Today18;

public class Divisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 55; // You can change this value to test other numbers

        if (number % 5 == 0 && number % 11 == 0) {
            System.out.println(number + " is divisible by both 5 and 11.");
        } else {
            System.out.println(number + " is NOT divisible by both 5 and 11.");
        }

	}

}
