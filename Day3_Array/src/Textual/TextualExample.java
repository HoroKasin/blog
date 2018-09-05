package Textual;

public class TextualExample {

	public static void main(String[] args) {
	
		//use characters to store single characters
		char c1 = 'A';
		char c2 = '\uAC00'; 
		char c3 = 66; 
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//String that can store text
		String s1 = "my name is 000";
		String s2 = "computer hanashi desu";
		
		System.out.println(s1 + s2);
		
		//operate data type different from text
		System.out.println("-----------------");
		System.out.println(100 + 200);
		System.out.println(100 + "200");
		System.out.println(10 + 20 + "hello");
		System.out.println("hello" + 10 + 20);
		System.out.println('A' + 10);
	
	}

}
