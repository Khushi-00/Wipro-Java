package corejava.Labsessions.Today25;

public class Dog1 implements Animal1{
	
	@Override
    public void bark() {
        System.out.println("Dog is barking");
    }

	public static void main(String[] args) {
		Dog1 obj = new Dog1();
		obj.bark();

	}

}
