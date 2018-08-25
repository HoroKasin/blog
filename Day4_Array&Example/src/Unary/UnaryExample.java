package Unary;

public class UnaryExample {

	public static void main(String[] args) {

		int i = 1;
		int j = i++;
		
		System.out.println("후위 연산자");
		System.out.println("i의 값은:>" + i);
		System.out.println("j의 값은:>" + j);
		
		System.out.println("=================");
		
		int x = 1;
		int y = ++x;
		System.out.println("전위 연산자");
		System.out.println("x의 값은:>" + x);
		System.out.println("y의 값은:>" + y);
		
	}

}
