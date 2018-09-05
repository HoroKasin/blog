package Scanner;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your age.");
		System.out.print(">");
		
		int age = scan.nextInt();
		
		System.out.println(" your age.:>" + age);
		
		scan.close();
	}

}
