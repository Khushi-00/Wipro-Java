package corejava;

public class Area {
	
	public void calculateArea(double radius) {
        if (radius < 0) {
            System.out.println("Error: Radius cannot be negative.");
            return;
        }
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area calculator = new Area();
		
		calculator.calculateArea(5.10);   


	}

}
