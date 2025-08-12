package corejava.Labsessions.Today24;

//Abstract class representing a generic Student
abstract class Students {
 // Common fields for all students
 String name;
 int rollNo;

 // Constructor to initialize fields
 public Students(String name, int rollNo) {
     this.name = name;
     this.rollNo = rollNo;
 }

 // Abstract method to be implemented by all subclasses
 abstract String getGrade();

 // Method to display basic student information
 public void displayDetails() {
     System.out.println("Name: " + name);
     System.out.println("Roll Number: " + rollNo);
 }
}

//Subclass for Engineering Students
class EngineeringStudent extends Students {
 int marks;

 // Constructor for EngineeringStudent
 public EngineeringStudent(String name, int rollNo, int marks) {
     super(name, rollNo); // Call to parent constructor
     this.marks = marks;
 }

 // Overriding getGrade method to calculate grade based on Engineering criteria
 @Override
 String getGrade() {
     if (marks >= 85) return "A";
     else if (marks >= 70) return "B";
     else if (marks >= 50) return "C";
     else return "Fail";
 }
}

//Subclass for Medical Students
class MedicalStudent extends Students {
 int marks;

 // Constructor for MedicalStudent
 public MedicalStudent(String name, int rollNo, int marks) {
     super(name, rollNo); // Call to parent constructor
     this.marks = marks;
 }

 // Overriding getGrade method to calculate grade based on Medical criteria
 @Override
 String getGrade() {
     if (marks >= 80) return "A";
     else if (marks >= 60) return "B";
     else if (marks >= 40) return "C";
     else return "Fail";
 }
}

//Main class to run the program
public class CollegeAdmissionSystem {
 public static void main(String[] args) {
     // Creating an EngineeringStudent object
     EngineeringStudent eng = new EngineeringStudent("Sandara", 1001, 75);
     eng.displayDetails();
     System.out.println("Engineering Grade: " + eng.getGrade());

     System.out.println();

     // Creating a MedicalStudent object
     MedicalStudent med = new MedicalStudent("Blair", 2002, 65);
     med.displayDetails();
     System.out.println("Medical Grade: " + med.getGrade());
	}

}
