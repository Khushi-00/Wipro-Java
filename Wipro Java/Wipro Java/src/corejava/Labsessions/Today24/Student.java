package corejava.Labsessions.Today24;

public class Student {
	
	//Declare private data members
    private String studentName;
    private int studentId;
    private String studentDepartment;

    //Constructor to initialize private fields
    public Student(String name, int id, String department) {
        this.studentName = name;
        this.studentId = id;
        this.studentDepartment = department;
    }
    
 //Public method to access studentName
    public String getStudentName() {
        return studentName;
    }

    //  Public method to access studentId
    public int getStudentId() {
        return studentId;
    }

    // Public method to access studentDepartment
    public String getStudentDepartment() {
        return studentDepartment;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a new Student object
        Student stu = new Student("Leo", 101, "Computer Science");

        // Access private members using public getter methods
        System.out.println("Student Name: " + stu.getStudentName());
        System.out.println("Student ID: " + stu.getStudentId());
        System.out.println("Department: " + stu.getStudentDepartment());
    }

}
