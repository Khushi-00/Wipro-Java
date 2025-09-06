package IO.ByteStreams;

import java.io.FileOutputStream;

public class FinalOutputStreams {

	public static void main(String[] args) {
		
		String data = "I'm attending the java training class";
		
		try {
			
			FileOutputStream output = new FileOutputStream("C:\\Users\\Khushi\\untitled1.txt");
					
			byte[] array = data.getBytes();
			
			// write the byte to the file
			
			output.write(array);;
			
			output.close();
			
		}catch (Exception e) {
			
			System.out.println(e);
		}

	}

}
