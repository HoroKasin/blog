package IF;

import java.util.Scanner;

public class ifQuiz {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� �Ѱ��� �Է� �ϼ���.");
		int num = scan.nextInt();
	
		if((num >= 0 ) && (num % 2 ==0)){
			if(num == 0) {
				System.out.println("�Է��� ������ 0�Դϴ�.");
			}else {
				System.out.println(num + "��(��) ¦���Դϴ�.");
			}
		}else if(num >= 0 && (num  % 2 == 1)) {
			System.out.println(num + "��(��) Ȧ���Դϴ�.");
		}else {
			System.out.println(num + "��(��) ���� ���� �Դϴ�.");
		}
		scan.close();
	}

}
