package Scanner;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		//1. Creating scanner objects
		Scanner scan = new Scanner(System.in);
		
		//2. Receive data using input message that scanner class has
		System.out.println("Enter the name");
		System.out.print(">");
		
		String name  = scan.next();
		System.out.println("Your name?:>" + name);
		
		scan.close();
		
	}

}
