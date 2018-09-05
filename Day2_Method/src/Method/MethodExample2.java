package Method;

public class MethodExample2 {
	
	static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	static int sub(int n1, int n2, int n3) {
		return n1 - n2 - n3;
	}
	
	static int multi(int n1, int n2, int n3) {
		return n1 * n2 * n3;
	}
	static int devide(int n1, int n2) {
		return n1 / n2;
	}
	
	static int calculateBirthYear(int age) {
		return 2018 - age + 1;
	}

	public static void main(String[] args) {
		
		/*
		int n1 = 10;
		int n2 = 20;
		
		int result = n1 + n2;
		System.out.println(result);
		
		n1 = 40;
		n2 = 50;
		result = n1 + n2;
		System.out.println(result);
		*/
		int addData = add(15, 12);
		System.out.println("the sum of two: " + addData);
		System.out.println("a three-digit subtraction: " + sub(20, 7, 11));
		
		/*
		 * 1. Multiply the results by three integers 
		 * Declare and call the return method.
		 * multi()
		 * 2.
		 * Declare and call a method.
		 * devide()
		 * 3.The multiply operator is * and the division operator is / .     
		 */
		System.out.println("10 X 5 X 3 = " + multi(10,5,3));
		System.out.println("560 / 280 = " + devide(560, 280));
		
		/*
		 * 1.
		 * Declares and invokes a method to calculate the year
		 * Implement logic.
		 * 2. Calculate your age as Korean-style.
		 * 3. Method name is calculateBirtYear()   
		 */
		int birthYear = calculateBirthYear(24);
		System.out.println("Your " 
					+ birthYear + "Was born..");		

	}

}




