package Multithreading;

public class ThreadUsingRunnableInterface implements Runnable{
	
	public void run() {
		System.out.println("Thread is running");
		System.out.println("Thread" + Thread.currentThread().getId() + "is running");
	}

}
