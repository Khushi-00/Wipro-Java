package IO.ByteStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;

public class FilterInputStreamEg {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FilterInputStream filterinput = null;
		
		try {
			
			fis = new FileInputStream("C:\\Users\\Khushi\\untitled1.txt");
			
			filterinput = new BufferedInputStream(fis);
			
			int data;
			while((data = filterinput.read()) !=-1) {
				System.out.print((char)data);
			}
			
			fis.close();

		}catch (Exception e){
			
			System.out.println(e);
		}

	}

}
