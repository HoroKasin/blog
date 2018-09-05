package Logical;

public class LogicalExample1 {

	public static void main(String[] args) {

		// list variables of the same type comma(,)
		int x = 10, y = 20;
		
		//perform code inside if conditional expression is true
		//execute the code inside the else block on the false face
		
		if((x != 10) & (++y ==21)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println("x:>" + x + ", y:>" + y);
	}

}
