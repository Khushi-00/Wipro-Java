package corejava;

public class ParameterizedMethods {
	
	public void add(int a, int b) {
		
		int c = a+b;
		
		System.out.println(c);
	}
	
public void sub(int a, int b) {
		
		int c = a-b;
		
		System.out.println(c);
	}

	public void div(int a, int b) {
		int c = a/b;
		
		System.out.println(c);
	}
	
	public void mul(int a, int b) {
		int c = a*b;
		
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParameterizedMethods p1 = new ParameterizedMethods();
		
		p1.add(5, 30);
		p1.sub(30, 10);
		p1.mul(5, 30);
		p1.div(30, 30);

	}

}
