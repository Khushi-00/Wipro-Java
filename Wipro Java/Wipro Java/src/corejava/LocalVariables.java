package corejava;

public class LocalVariables {
	
	public void add () {
		int a = 10;
		int b = 20;
		int c = a+b;
		
		//static String s1 = "something";
		System.out.println(c);
	}
	
	//public void add1 () {
		//System.out.println(c);
	//}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalVariables lv = new LocalVariables();
		lv.add();

	}

}
