package corejava;

public class Triangle implements Shape1{
	private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implement getArea method
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

}
