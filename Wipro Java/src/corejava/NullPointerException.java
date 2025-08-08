package corejava;

public class NullPointerException {

	public static void main(String[] args) {
		try {
			
			String S1 = null;
			
			System.out.println(S1.length());
			
		}catch (Exception e) {
			
			System.out.println(e);
		}
	}

}
