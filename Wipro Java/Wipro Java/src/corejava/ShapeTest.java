package corejava;

public class ShapeTest {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10, 5);
        System.out.println("Area of Rectangle: " + rect.getArea());

        Circle1 circle1 = new Circle1();
        System.out.println("Area of Circle: " + circle1.getArea());

        Triangle triangle = new Triangle(6, 8);
        System.out.println("Area of Triangle: " + triangle.getArea());
	}

}
