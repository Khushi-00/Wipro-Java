package IO.ByteStreams;

import java.io.FileInputStream;

public class ByteArrayInputStream {

	public static void main(String[] args) {
		
		byte[] array = {1,2,3,4};
		
		try {
			
			ByteArrayInputStream output = new ByteArrayInputStream();
				
				int data;
				while ((data= input.read()) != -1 {
					System.out.println(data);
				}
			}
			
			input.close();
			
		}catch (Exception e) {
			
			System.out.println(e);
		}

	}

}
