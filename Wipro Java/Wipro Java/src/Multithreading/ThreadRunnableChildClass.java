package Multithreading;

public class ThreadRunnableChildClass {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i<n; i++) {
			
			Thread object = new Thread (new ThreadUsingRunnableInterface());
			
			object.start();
		}

	}

}
