package corejava.Labsessions.Today24;

public class Game {
	
	//  Declare default access variables (no access modifier)
    String gameName;
    int gameId;
    String gameType;

    //  Constructor to initialize the game details
    Game(String name, int id, String type) {
        gameName = name;
        gameId = id;
        gameType = type;
    }

    // Default method to display the game details
    void displayGameInfo() {
        System.out.println("Game Name: " + gameName);
        System.out.println("Game ID: " + gameId);
        System.out.println("Game Type: " + gameType);
    }
}
