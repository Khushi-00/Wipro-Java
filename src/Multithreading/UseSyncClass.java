package Multithreading;
public class UseSyncClass {

	public static void main(String[] args) throws InterruptedException {
		ThreadSync cnt = new ThreadSync();	
		Thread t1 = new Thread(() -> {
			for (int i = 0; i <1000; i++) {
				
				cnt.inc();
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i <1000; i++) {
				
				cnt.inc();
			}
		});
		t1.start();
		t2.start();
	
		t1.join();
		t2.join();
		
		System.out.println("Counter" + cnt.get());

	}

}
