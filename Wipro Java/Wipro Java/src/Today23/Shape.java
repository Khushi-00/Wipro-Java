package Today23;

class Shape {
	public double getArea() {
		System.out.println("Calculating area of a shape...");
		return 0;
	}

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(5, 10); // width = 5, height = 10
		System.out.println("Area of rectangle: " + rect.getArea());
	}
}

// Subclass
class Rectangle extends Shape {
	private double width;
	private double height;

	// Constructor
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// Overriding getArea() method
	@Override
	public double getArea() {
		return width * height;
	}
}

