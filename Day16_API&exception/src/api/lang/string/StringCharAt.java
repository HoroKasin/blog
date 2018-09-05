package api.lang.string;

import java.util.Scanner;

public class StringCharAt {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your resident "
				+ "registration number");
		System.out.println("ex) korean = xxxxxx-xxxxxxx");
		System.out.print("> ");
		
		String ssn = scan.next();
		System.out.println(ssn);
		
		switch(ssn.charAt(7)) {
		
		case '1':
		case '3':
			System.out.println("Man"); break;
			
		case '2':
		case '4':
			System.out.println("Woman"); break;
		}
		
		scan.close();
	}

}
