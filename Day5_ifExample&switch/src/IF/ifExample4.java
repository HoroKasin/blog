package IF;

import java.util.Scanner;

public class ifExample4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		int point = scan.nextInt();

		if(point >= 90) {
			if(point > 100) {
				System.out.println("시험이 100까지만 있는데???...");
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
			System.out.println("제발좀 공부좀 하세요!!");
		}
	
	scan.close();
	}

}
