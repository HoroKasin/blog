package exception.throws_;

public class ThrowsExample1 {
	
	static String[] greetings = {"hello", "¾È³ç", "NIHAO"};

	public static void main(String[] args) {
		
		/*
		 * When invoking a method that is attached to the arrows,
		 * Exception processing must be performed by invoking the block inside.
		 * This should be done instead.
		 */
		try {
			greet(1);
			greet(4);
		} catch (Exception e) {
			System.out.println("Out of range reference in array.");
		}

	}
	/*
	 * If the cause of the exception is in the method calls 
	 * The exception is passed on to the call book. 
	 * This is called throws.
	 */
	public static void greet(int index) throws Exception {
		
		System.out.println(greetings[index]);
		
	}

}








