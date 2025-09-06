package corejava;

public class Circle implements CircleShape{
	
	// method coming from ChildShape
	public void radius() {
		System.out.println("Radius is 5 units");
	}
	
	// method coming from interface Shape
	public void draw () {
		System.out.println("Drawing Circle");
	}

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		c.radius();

	}

}
