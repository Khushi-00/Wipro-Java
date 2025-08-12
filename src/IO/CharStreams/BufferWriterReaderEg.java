package IO.CharStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class BufferWriterReaderEg {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Khushi\\untitled.txt"));
		
		bw.write("This is a Buffered file writer");
		
		bw.close();
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Khushi\\untitled.txt"));
		
		String line;
		
		while ((line = br.readLine()) != null) {
			
			System.out.println(line);
		}
		
		br.close();

	}

}
