package IO.CharStreams;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringWriterReader {

	public static void main(String[] args) throws IOException {
		
		StringWriter sw = new StringWriter();
		
		sw.write("It's Saturday tomorrow");
		
		sw.close();
		
		StringReader sr = new StringReader("C:\\Users\\Khushi\\untitled.txt");
		
		int i;
		
		while((i = sr.read()) != -1) {
			System.out.print((char)i );
		}
		sr.close();
	}

}
