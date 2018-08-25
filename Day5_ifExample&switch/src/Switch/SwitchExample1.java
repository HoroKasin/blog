package Switch;

import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수 입력:");
		int point = scan.nextInt();
		
		switch(point / 10) {
		
		case 1:
			System.out.println("A!!"); break;
			
		case 2:
			System.out.println("B!!"); break;
			
		case 3:
			System.out.println("C!!"); break;
		
		case 4:
			System.out.println("D!!"); break;
			
		default:
			System.out.println("F...");
			System.out.println("제발 공부좀...하세요."); 
		}
		scan.close();
	}

}
