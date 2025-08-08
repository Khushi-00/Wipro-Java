package corejava.Labsessions;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 82; 

		if (marks >= 90 && marks <= 100)
			System.out.println("Grade: A");
		else if (marks >= 75 && marks < 90)
			System.out.println("Grade: B");
		else if (marks >= 60 && marks < 75)
			System.out.println("Grade: C");
		else if (marks >= 40 && marks < 60)
			System.out.println("Grade: D");
		else if (marks >= 0 && marks < 40)
			System.out.println("Grade: Fail");
		else
			System.out.println("Invalid marks. Please enter a value between 0 and 100.");
	}

}
