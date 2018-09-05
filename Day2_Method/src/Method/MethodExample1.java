package Method;

public class MethodExample1 {
	
	/*
	 * 1. Methods include reporting procedures and recall processes.
	 * 2.
	 * The input data required to run the feature details and methods are as follows:
	 * Declares parameters that can be processed and the type of data to output.
	 * Specify externalities and create internal logic.
	 * 3. The call process
	 * Passes required parameters (input values) to the method.
	 * Results processed in input value (output value) are returned.
	 * 4. Declare not allowed by method.
	 * External air gun
	 * 5. Only method calls are allowed within the method.        
	 */

	public static void main(String[] args) {
		
		//Call Method
		greeting();
		luckyNumber(57);
		
		//A method with return type (return type) is
		//You must save the result to a variable before you can use it.
		String addr = getAddress();
		System.out.println("Myaddres: " + addr);
		
		String info = petsInfo("mr.kim", "het");
		System.out.println(info);
		
	}
	
	//1. Method declaration with neither input nor output
	static void greeting() {
		System.out.println("hello?");
		System.out.println("me to.");
	}
	
	//2. Method with input and no output
	static void luckyNumber(int number) {
		System.out.println("LuckNumber: " + number);
	}
	
	//3. Method with no input and with output
	static String getAddress() {
		String address = "seoul";
		/*
		 * A method with output must have a return
		 * Keywords must be used to return (deliver) values.
		 * A method with a return value is used when a return is encountered
		 * Ends and moves to the callout.
		 * So we cannot write code below return.
		 */
		return address;
	}
	
	//4. Method that input and output exist simultaneously
	static String petsInfo(String pet1, String pet2) {
		String petInfo = pet1 + "end " + pet2;
		return petInfo;
	}
}









