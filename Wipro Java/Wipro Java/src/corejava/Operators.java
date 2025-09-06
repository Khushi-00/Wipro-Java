package corejava;

public class Operators {

	public static void main(String[] args) {
		// unary
		
		int i = 10;
		
		i++;
		
		System.out.println(i);
		
		i--;
		
		System.out.println(i);
		
		++i;
		
		System.out.println(i);
		
		--i;
		
		System.out.println(i);
		
		//arithmetic operators
		
		int a = 10;
		int b = 12;
		int c = a+b;
		System.out.println(c);
		int d = a -b;
		System.out.println(d);
		int e = a/b;
		System.out.println(e);
		int f  = a * b;
		System.out.println(f);
		
		// shift operators 
		
		// left shift <<
		
		System.out.println(10<<2);   // 10 * 2^2 = 40
		
		System.out.println(10<<3);
		
		// right shift >> 
		
		System.out.println(10>>2);   // 10 / 2 ^ 2 = 2
		
		System.out.println(20>>2);   // 10 / 2 ^ 2 = 5
        
		
		// Relational Operator 
		
		System.out.println(10==2);    //Checks if two values are equal
		
		System.out.println(10!=2);    //Checks if two values are not equal
		
		System.out.println(10>2);     // If left operand is greater than the right operand
		
		System.out.println(10<2);     // If left operand is smaller than the right operand
		
		System.out.println(10>=2);    // If the left operand is greater than or equal to the right operand
		
		System.out.println(10<=2);    // If the left operand is smaller than or equal to the right operand

		
		// bitwise operator 
		
		int p = 5;    // 0101
		int q = 3;    // 0011
		
		int r = p & q;   // 0001
		
		System.out.println(r);
		
		int m = 8;
		int n = 2;
		
		int o = m & n;
		
		System.out.println(o);
		
	}

}
