package While_.Basic;

import java.util.Scanner;

public class WhileExample2 {

	public static void main(String[] args) {

		//���� �ϳ��� �Է¹޾Ƽ� �ش� ������ �Ҽ������� ���θ� �Ǵ��ϴ� ���
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�Ҽ��� �Ǻ��� ������ �Է�:>");
		//���� n�� �Ҽ��� �Ǻ��� �������� ������ ��������
		int n = scan.nextInt();
		
		//���� i�� �Ҽ��Ǻ��� ���� �Է��� ������ ������ �������� ������ ��������
		int i = 2;
		
		while(n % i != 0) {
			i++;   //�Է¹��� ������ i�� ���� 0�� �ƴҶ� ��� �ݺ�
		}
		
		if( n == i) { 
			System.out.println(n + "��(��) �Ҽ��Դϴ�.");
		}else {
			System.out.println(n + "��(��) �Ҽ��� �ƴմϴ�.");
		}
		
		scan.close();
	}

}
