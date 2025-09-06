package corejava.Labsessions.Today01;

import java.util.Scanner;

public class ReadInputFromConsole {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Course: ");
        String name = scanner.nextLine();

        System.out.print("Enter your passing year: ");
        int age = scanner.nextInt();

        System.out.println("I'm a student of " + name + ", I've completed my graduation in  " + age);

        scanner.close();

	}

}
