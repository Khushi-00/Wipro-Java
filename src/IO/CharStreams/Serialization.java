package IO.CharStreams;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) throws Exception {
        Student s = new Student(101, "Khushi");
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("C:\\Users\\Khushi\\student.ser"));
        out.writeObject(s);
        out.close();
        System.out.println("Serialized successfully");
    }
}
