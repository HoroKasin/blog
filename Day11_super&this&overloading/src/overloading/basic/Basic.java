package overloading.basic;

public class Basic {
	
	void inputMessage(int a) {
		System.out.println("one integer entered.");
	}
	
	//inputMessage(String)
	void inputMessage(String str) {
		System.out.println("String entered.");
	}
	
	//inputMessage(int, int)
	void inputMessage(int a, int b) {
		System.out.println("Two integer entered.");
	}
	
	//inputMessage(String, double)
	void inputMessage(String str, double d) {
		System.out.println("String and double entered.");
	}
	
	//inputMessage(double, String)
	void inputMessage(double d, String str) {
		System.out.println("double and string entered.");
	}
	
	void inputMessage(int a, float b, char c) {
		System.out.println("Number, double and character entered.");
	}
}

