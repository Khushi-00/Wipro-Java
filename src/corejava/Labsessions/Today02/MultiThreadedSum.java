package corejava.Labsessions.Today02;

public class MultiThreadedSum {

	    static int sum = 0;

	    // Check if a number is prime
	    static boolean isPrime(int n) {
	        if (n <= 1) return false;
	        for (int i = 2; i <= Math.sqrt(n); i++)
	            if (n % i == 0) return false;
	        return true;
	    }

	    static class PrimeThread extends Thread {
	        int start, end;

	        PrimeThread(int start, int end) {
	            this.start = start;
	            this.end = end;
	        }

	        public void run() {
	            int localSum = 0;
	            for (int i = start; i <= end; i++) {
	                if (isPrime(i)) {
	                    localSum += i;
	                }
	            }
	            synchronized (MultiThreadedSum.class) {
	                sum += localSum;
	            }
	        }
	    }

	    public static void main(String[] args) throws InterruptedException {
	        PrimeThread t1 = new PrimeThread(1, 50);
	        PrimeThread t2 = new PrimeThread(51, 100);

	        t1.start();
	        t2.start();

	        t1.join();
	        t2.join();

	        System.out.println("Sum of prime numbers from 1 to 100: " + sum);
	    }
	}
