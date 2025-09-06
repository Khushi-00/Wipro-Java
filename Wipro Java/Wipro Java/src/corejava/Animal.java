package corejava;

class An{
	public void eat() {
		System .out.println("Animals eat food");
	}
}
class Dog extends An{
	public void bark() {
		System.out.println("Dog barks");
	}
}
class cat extends An{
	public void meows() {
		System.out.println("Cat meows");
    }
}
class cow extends An{
	public void moo() {
		System.out.println("Cow moos");
    }
}

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog1 d = new Dog1();
		
		d.eat();
		d.bark();
		
		cat c = new cat();
		
		c.eat();
		c.meows();
		
		cow cw = new cow();
		
		cw.eat();
		cw.moo();
	}
}
		

	
	