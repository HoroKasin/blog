package Scanner;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		//1. ��ĳ�� ��ü ����
		Scanner scan = new Scanner(System.in);
		
		//2. ��ĳ�� Ŭ������ ������ �ִ� �Է¸޼��带 ����Ͽ� �����͸� �Է¹ޱ�
		System.out.println("�̸��� �Է��Ͻÿ�.");
		System.out.print(">");
		
		String name  = scan.next();
		System.out.println("����� �̸���:>" + name);
		
		scan.close();
		
	}

}
