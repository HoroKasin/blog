package Break;

import java.util.Scanner;

public class BreakExample2 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("----------");
			System.out.print("14 x 3 = ");
			int answer = scan.nextInt();
			
			if(answer == 42) {
				break;
			}
			System.out.println("xxxxxx");
		}
		System.out.println("정답입니다!!!");
		scan.close();

	}

}
