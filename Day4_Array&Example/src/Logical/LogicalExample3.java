package Logical;

public class LogicalExample3 {

	public static void main(String[] args) {

		int c = 10, d = 20;
		
		if((c != 10 ) || (++d == 21)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println("c:>" + c + ", d:>" + d );
	}

}
