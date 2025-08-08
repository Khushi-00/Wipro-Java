package corejava;

public class Rectangle implements Shape1{
	private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

}
