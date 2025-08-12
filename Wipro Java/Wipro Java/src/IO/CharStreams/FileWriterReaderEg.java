package IO.CharStreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderEg {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\Khushi\\untitled.txt");
		
		fw.write("It's Friday today");
		
		fw.close();
		
		FileReader fr = new FileReader("C:\\Users\\Khushi\\untitled.txt");
		
		int i;
		
		while((i = fr.read()) != -1) {
			System.out.print((char)i );
		}
		fr.close();
	}

}
