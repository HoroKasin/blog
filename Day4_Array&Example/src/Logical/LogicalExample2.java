package Logical;

public class LogicalExample2 {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		
		if((1 != 10) && (++b == 21)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println("a:>" + a + ", b:>" + b);
		
	}
}
