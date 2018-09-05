package exception.throws_;

public class ThrowsExample2 {

	public ThrowsExample2() {
		System.out.println("Call constructor!");
		ccc();
	}

	public void aaa(int i) throws Exception {
		System.out.println("aaa Call !");
		int result = 10 / i;
		System.out.println(result);
		System.out.println("aaa End Call!");
	}

	public void bbb() {
		System.out.println("bbb Call!");
		try {
			aaa(0);
		}catch(Exception e) {
			/*
			 * printStackTrace() will send a message that tracks the exception path
			 * Outputs. When finding the cause of exception code in development process
			 * Often used.
			 */			

			/*
			 * GetMessage() is a
			 * Returns the exception cause message to String type.
			 * Various exception classes provided by Java standard APIs
			 * Each exception cause message is saved by default
			 */
			System.out.println(e.getMessage());

		}
		System.out.println("bbb End Call!");
	}

	public void ccc() {
		System.out.println("ccc Call!");
		bbb();
		System.out.println("ccc End Call!");
	}
}









