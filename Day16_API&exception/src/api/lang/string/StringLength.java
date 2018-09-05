package api.lang.string;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the your ID");
			System.out.print("> ");
			String id = scan.next();
			
			if(id.length() < 5) {
				System.out.println("Write your ID more than 5 ");
			}else {
				System.out.println(id + "Registered"); break;
			}
			scan.close();
		}
	}
}
