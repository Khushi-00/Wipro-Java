package corejava.Labsessions.Today31;

public class PrintNumbers {
	
	 public static void printNumbers(int num) {
	        if (num <= 100) {
	            System.out.println(num);
	            printNumbers(num + 1);  
	        }
	    }

	public static void main(String[] args) {
		  printNumbers(1);  

	}

}
