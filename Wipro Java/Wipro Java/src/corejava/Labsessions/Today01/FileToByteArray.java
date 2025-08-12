package corejava.Labsessions.Today01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileToByteArray {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Khushi\\untitled.txt"); 

        try {
            byte[] fileData = new byte[(int) file.length()];

            FileInputStream fis = new FileInputStream(file);
            fis.read(fileData);
            fis.close();

            System.out.println("File content in bytes:");
            for (byte b : fileData) {
                System.out.print((char) b);
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

	}

}
