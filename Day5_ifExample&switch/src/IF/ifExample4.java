package IF;

import java.util.Scanner;

public class ifExample4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a score.");
		int point = scan.nextInt();

		if(point >= 90) {
			if(point > 100) {
				System.out.println("The test score is up to 100 points.");
			}else if(point >= 95) {
				System.out.println("A++!!!!");
			}else {
				System.out.println("A!!");
			}
		}else if(point >= 80) {
			System.out.println("B!!");
		}else if(point >= 70) {
			System.out.println("C!!");
		}else if(point >= 60) {
			System.out.println("D!!");
		}else {
			System.out.println("F....");
			System.out.println("Please study.!!");
		}
	
	scan.close();
	}

}
