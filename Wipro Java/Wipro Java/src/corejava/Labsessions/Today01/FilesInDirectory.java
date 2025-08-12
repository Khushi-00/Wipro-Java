package corejava.Labsessions.Today01;

import java.io.File;

public class FilesInDirectory {

	public static void main(String[] args) {
		String path = "C:\\Users\\Khushi";  
		
        File directory = new File(path);

        if (directory.isDirectory()) {
            String[] contents = directory.list(); 

            System.out.println("Contents of directory: " + path);
            if (contents != null && contents.length > 0) {
                for (String name : contents) {
                    System.out.println(name);
                }
            } else {
                System.out.println("The directory is empty.");
            }

        } else {
            System.out.println("The specified path is not a directory.");
        }
	}

}
