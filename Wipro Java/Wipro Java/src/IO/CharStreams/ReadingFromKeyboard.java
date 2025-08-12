package IO.CharStreams;

import java.util.Scanner;

public class ReadingFromKeyboard {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the first number");
		
		int a = scn.nextInt();
		System.out.println("Enter the second number");
		
		int b = scn.nextInt();
		System.out.println("Sum is "+" " +(a+b));
		
		scn.close();

	}

}
