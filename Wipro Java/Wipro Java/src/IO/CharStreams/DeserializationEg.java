package IO.CharStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEg {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C://Users//Khushi//untitled.txt"));
		
		Student s = (Student)in.readObject();
		
		System.out.println(s.id + " " + s.name);
		
		in.close();

	}

}
