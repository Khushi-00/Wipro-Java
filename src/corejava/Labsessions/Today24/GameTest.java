package corejava.Labsessions.Today24;

public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Game g = new Game("Football", 101, "Outdoor");

	        // Call the default method using the object
	        g.displayGameInfo(); // This works because Game and GameTest are in the same package
	    }

}
