package corejava;

public class RepeatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Core Java";
		String s2 = "Selenium";

		// Repeat each string 5 times
		for (int i = 1; i <= 5; i++) {
			System.out.println("Repetition " + i + ": " + s1);
		}

		for (int i = 1; i <= 5; i++) {
			System.out.println("Repetition " + i + ": " + s2);
		}

	}

}
