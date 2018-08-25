package Scanner;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("당신의 나이를 입력하시오.");
		System.out.print(">");
		
		int age = scan.nextInt();
		
		System.out.println("당신의 나이는:>" + age);
		
		scan.close();
	}

}
