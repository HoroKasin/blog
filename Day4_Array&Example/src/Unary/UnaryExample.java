package Unary;

public class UnaryExample {

	public static void main(String[] args) {

		int i = 1;
		int j = i++;
		
		System.out.println("postfix operators");
		System.out.println("The value of i is:>" + i);
		System.out.println("The value of j is:>" + j);
		
		System.out.println("=================");
		
		int x = 1;
		int y = ++x;
		System.out.println("Potential operator");
		System.out.println("The value of x is:>" + x);
		System.out.println("The price of y is:>" + y);
		
	}

}
