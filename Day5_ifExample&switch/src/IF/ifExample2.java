package IF;

import java.util.Scanner;

public class ifExample2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ű�� ���̸� �Է��� �Ͻʽÿ�.");
		System.out.print("Ű:>");
		double height = scan.nextDouble();
		
		System.out.println("����:>");
		int age = scan.nextInt();
		
		System.out.println("===============");
		
		//Ű�� 140�̰�, ���̰� 8�� �̻��� ��츸 ���̱ⱸ ž��
		if((height >= 180) && (age >= 8 )) {
			System.out.println("���̱ⱸ�� ž���� �����մϴ�.");
		}else {
			System.out.println("���̱ⱸ ž���� �Ұ����մϴ�.");
		}
		System.out.println("��ſ� �Ϸ� ��������.~");
		scan.close();
	}

}
