package WrapperClass;

public class AutoboxingEg {

	public static void main(String[] args) {
		int a = 78;
		
		//Integer i = Integer value of a;
		
		Integer i = a;
		
		System.out.println(i);
		
		//Unboxing
		
		Integer a1 = new Integer(3);
		
		int i1 = a1.intValue();
		int j = a1;
		System.out.println(i1);
		System.out.println(j);

	}

}
