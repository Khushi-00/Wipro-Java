package corejava.Labsessions.Today01;

import java.io.*;
import java.util.*;

public class StudentList {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Khushi"));
        students.add(new Student(102, "Sakshi"));
        students.add(new Student(103, "Raj"));

        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("C:\\Users\\Khushi\\students.ser"))) {
            out.writeObject(students);
            System.out.println("Student list written to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e);
        }

	}

}
