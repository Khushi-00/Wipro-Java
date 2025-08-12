package IO.ByteStreams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStreamEg {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		
		FilterOutputStream filterOut = null;
		
		try {
			
			fos = new FileOutputStream("C:\\Users\\Khushi\\untitled.txt");
			
			filterOut = new BufferedOutputStream(fos);
			
			String text = "What day is it today?";
			
			filterOut.write(text.getBytes());

		}catch (Exception e){
			
			System.out.println(e);
		}finally {
			filterOut.close();
			fos.close();
		}

	}

}
