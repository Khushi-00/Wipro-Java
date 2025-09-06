package Collections;

import java.util.*;

public class Student implements Comparable<Student>{
	
	int rollNumber;
	String name;
	
	public Student(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}
	
		public int compareTo(Student s) {
			//return this.rollNumber - s.rollNumber; 
			return this.name.compareTo(s.name);
	}
		public String toString() {
			return rollNumber +". " + name;
		}

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student (132, "Bliar"));
		students.add(new Student (108, "Abrahms"));
		students.add(new Student (103, "Candece"));
		
		Collections.sort(students);
		
		for(Student s : students) {
			
			System.out.println(s);
		}
	}
}
