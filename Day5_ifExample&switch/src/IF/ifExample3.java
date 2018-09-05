package IF;

import java.util.Scanner;

public class ifExample3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int point = scan.nextInt();
		
		if(point >= 90) {
			System.out.println("Your grade is A.!!");
		}else if(point >= 80){
			System.out.println("Your grade is B.!!");
		}else if(point >= 70) {
			System.out.println("Your grade is C.!!");
		}else if(point >= 60) {
			System.out.println("Your grade is D.!!");
		}else {
			System.out.println("Your grade is F.");
			System.out.println("You are subject to retake.");
		}
		scan.close();
	}

}
