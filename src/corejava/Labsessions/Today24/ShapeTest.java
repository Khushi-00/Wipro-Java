package corejava.Labsessions.Today24;

abstract class Shape{
	
	abstract double calculateArea();
}

class Circle extends Shape{
	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	double calculateArea() {
		return Math.PI * radius * radius;
	}
}

class Rectangle extends Shape{
	double length, width;
	
	Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	@Override
    double calculateArea() {
        return length * width; // Area = length × width
    }
}
public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(5.0);
        System.out.println("Area of Circle: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

	}

}
