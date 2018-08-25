package Assignment;

public class AssignmentExample {

	public static void main(String[] args) {

		int a = 5, b = 5;
		
		a += 3; // a = a + 3
		b =+ 3; // b = +3
		System.out.println("a += 3:>" + a);
		System.out.println("b =+ 3:>" + b);
		
		a -= 4;
		System.out.println("a -= 4:>" + a);

		a *= 6;
		System.out.println("a *= 6:>" + a);
		
		a /= 5;
		System.out.println("a /= 5:>" + a);
		
		a %= 3;
		System.out.println("a %= 3;:>" + a);
	}

}
