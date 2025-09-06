package Today23;

//Superclass
public class Animal {
	public void makeSound() {
		System.out.println("Animal makes a sound");
	}

	public static void main(String[] args) {
		Cat myCat = new Cat();
		myCat.makeSound(); // Calls the overridden method
	}
}

//Subclass
class Cat extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Cat meows");
	}
}

