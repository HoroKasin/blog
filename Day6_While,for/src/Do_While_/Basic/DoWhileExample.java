package Do_While_.Basic;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {

		//������ �Է¹޾Ƽ� 1���� �ش� ���ڱ����� �����հ踦 ���ϴ� ���
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.print("������ �Է��Ͻʽÿ�.");
		 int target = scan.nextInt();
		 
		 int num = 1;
		 int sum = 0;
		 					
		 do {
			 sum += num;
			 num++;
		 }while(num <= target);
		 System.out.println("1����" + target + "������ �����հ�:>" + sum);
		 
		 scan.close();
		
	}

}
