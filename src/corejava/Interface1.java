package corejava;

public interface Interface1 {
	
	//abstract methods
	abstract void display();
	
	static void write() {
		
		System.out.println("Writing in interface");
	}
	
	default void show() {
		System.out.println("Showing");
	}
	public static final String employeename = "Nishtha";
	
	int employeeId = 5678;
}
