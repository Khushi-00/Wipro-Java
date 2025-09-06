package corejava;

public class PrimeNumberCheck {
	
	public static int checkPrime(int number) {
        // 0 and 1 are not prime numbers
        if (number <= 1) {
            return -1; // Not a prime
        }

        // Check for factors
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return -1; // Not a prime
            }
        }

        return number; // It's a prime number
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 16; // You can change this number to test different values

        int result = checkPrime(num);

        if (result != -1) {
            System.out.println(result + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");

	}

}}
