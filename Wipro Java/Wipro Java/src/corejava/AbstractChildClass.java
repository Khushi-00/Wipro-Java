package corejava;

public class AbstractChildClass extends AbstractClass{
	
	@Override
	void makesound() {
		System.out.println("Animal makes sound");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractChildClass obj = new AbstractChildClass();
		obj.eat();
		obj.makesound();
		System.out.println(animalName);

	}

}
