package corejava;

public class Encapsulation {
	
	//private field - hidden for outsiders
	
	private String name;
	private int age;
	
	public String getname() {
		return name;
	}

	//public setter method for name
	public void setname(String name) {
		this.name = name;
	}
	
	//public getter method for age
	public int getAge() {
		return age;
	}
	
	//public setter method for name
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setAge(22);
		obj.setname("Demian");
		System.out.println();

	}

}
