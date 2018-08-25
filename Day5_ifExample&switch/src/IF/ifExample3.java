package IF;

import java.util.Scanner;

public class ifExample3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int point = scan.nextInt();
		
		if(point >= 90) {
			System.out.println("A!!");
		}else if(point >= 80){
			System.out.println("B!!");
		}else if(point >= 70) {
			System.out.println("C!!");
		}else if(point >= 60) {
			System.out.println("D!!");
		}else {
			System.out.println("F..........");
			System.out.println("공부좀 하세요!!");
		}
		scan.close();
	}

}
