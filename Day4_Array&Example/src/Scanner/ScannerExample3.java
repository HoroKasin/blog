package Scanner;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("�������� �Է�:");
		System.out.print(">");
		
		int kor = scan.nextInt();
		
		System.out.println("�������� �Է�:");
		System.out.print(">");
		
		int math = scan.nextInt();	
		
		System.out.println("�������� �Է�:");
		System.out.print(">");
		
		int eng = scan.nextInt();

		System.out.println("�������� �Է�:");
		System.out.print(">");
		
		int sc = scan.nextInt();
		
		int sum = (kor + math + eng + sc) / 4;
		
		System.out.println("����� ����� ������:>" + sum +"�Դϴ�." );
		
		scan.close();
	}

}
