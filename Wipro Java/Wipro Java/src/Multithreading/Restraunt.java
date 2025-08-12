package Multithreading;

public class Restraunt {

	public static void main(String[] args) {
		Thread t1 = new CookingTask("Pasta");
		Thread t2 = new CookingTask("Dal Makhni");
		Thread t3 = new CookingTask("Rice");
		Thread t4 = new CookingTask("Salad");
		Thread t5 = new CookingTask("Dessert");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
