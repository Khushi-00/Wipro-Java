package corejava;

public class Circle1 implements Shape1{
	private double radius;

    // Constructor
    public void Circle(double radius) {
        this.radius = radius;
    }

    // Implement getArea method
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
  
	}
}
