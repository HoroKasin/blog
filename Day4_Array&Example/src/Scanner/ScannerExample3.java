package Scanner;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어점수 입력:");
		System.out.print(">");
		
		int kor = scan.nextInt();
		
		System.out.println("수학점수 입력:");
		System.out.print(">");
		
		int math = scan.nextInt();	
		
		System.out.println("영어점수 입력:");
		System.out.print(">");
		
		int eng = scan.nextInt();

		System.out.println("과학점수 입력:");
		System.out.print(">");
		
		int sc = scan.nextInt();
		
		int sum = (kor + math + eng + sc) / 4;
		
		System.out.println("당신의 평균은 점수는:>" + sum +"입니다." );
		
		scan.close();
	}

}
