package Conditional;

public class ConditionalExample {

	public static void main(String[] args) {

		//method random ()
		//Random () method &lt;0.0 or 1.0
		double d = Math.random() * 10; // 0 ~ 10
		System.out.println(d);
		System.out.println("==================");
		
		//create any number below 10
		int i = (int)d + 1; //[0+1] = 1 ~ 10
		System.out.println(i);
		System.out.println("==================");
		
		// make an integer random number from -4 to 5
		int j = 5 - (int)(Math.random() * 10); // 1 - 5 = -4 : 10 - 5 = 5
		System.out.println("랜던값!!!:>" + j);
		System.out.println("==================");
		
		////3 condition operator (조건식 ? 연산식1 : 연산식2)
		int abc = (i >= 0) ? i : -i;
		System.out.println(i + "Absolute value:>" + abc);
		
	}

}
