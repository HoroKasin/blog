package Account;

import java.util.Scanner;

public class AccountManager {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("* ���¸� ����մϴ�.");
		
		System.out.print("- �̸�: ");
		String name = scan.next();
		
		System.out.print("- ��й�ȣ: ");
		String pwd = scan.next();
		
		System.out.print("- �Աݾ�: ");
		int bal = scan.nextInt();
		
		Account acc = new Account(name, pwd, bal);
		
		System.out.println(name + "���� ���°� �����Ǿ����ϴ�!");
		
		while(true) {
			
			System.out.println("\n�޴��� �Է��ϼ���.");
			System.out.println("[ 1. ���� | 2. ��� | 3. �ܾ���ȸ | 4. ���� ]");
			System.out.print("> ");
			int menu = scan.nextInt();
			
			if(menu == 1) {
				System.out.println("���� ��й�ȣ�� �Է��ϼ���.");
				System.out.print("> ");
				String pw = scan.next();
				
				if(pw.equals(acc.pwd)) {
					System.out.println("�Աݾ��� �Է��ϼ���.");
					System.out.print("> ");
					int money = scan.nextInt();
					
					acc.saveMoney(money);
					
					System.out.println("[���¹�ȣ: " + acc.accNum + "]");
					System.out.println(money + "�� �Ա� �Ϸ�!");
				}else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}				
			}else if(menu == 2) {
				System.out.println("���� ��й�ȣ�� �Է��ϼ���.");
				System.out.print("> ");
				String pw = scan.next();
				
				if(pw.equals(acc.pwd)) {
					System.out.println("��ݾ��� �Է��ϼ���.");
					System.out.print("> ");
					int money = scan.nextInt();
					
					//��ݾ��� �ܾ��� �ʰ��ϸ� ��� �Ұ�
					if(money > acc.balance) {
						System.out.println("�ܾ��� �����մϴ�.");
					}else {
						acc.withDrawMoney(money);
						System.out.println("[���¹�ȣ: " + acc.accNum + "]");
						System.out.println(money + "�� ��� �Ϸ�!");
					}					
				}else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
				
			}else if(menu == 3) {
				System.out.println(acc.name + "���� ���� �ܾ��� " 
							+ acc.getBalance() + "���Դϴ�.");
			}else if(menu == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}//end while

	}//end main

}//end class





