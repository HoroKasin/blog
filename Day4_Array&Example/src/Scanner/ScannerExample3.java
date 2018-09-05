package Scanner;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Korean score:");
		System.out.print(">");
		
		int kor = scan.nextInt();
		
		System.out.println("Enter math score:");
		System.out.print(">");
		
		int math = scan.nextInt();	
		
		System.out.println("Enter English score:");
		System.out.print(">");
		
		int eng = scan.nextInt();

		System.out.println("Enter science score:");
		System.out.print(">");
		
		int sc = scan.nextInt();
		
		int sum = (kor + math + eng + sc) / 4;
		
		System.out.println("Your average score is:>" + sum +"It is.." );
		
		scan.close();
	}

}
