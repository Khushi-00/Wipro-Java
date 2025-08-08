package corejava.Labsessions.Today01;

import java.io.Serializable;

public class Student implements Serializable{
	
	int id;
	
	String name;
	
	Student(int id, String name){
		
		this.id = id;
		
		this.name = name;
		
	}
	
	public String toString() {
        return "Student ID: " + id + ", Name: " + name;
	}

}
