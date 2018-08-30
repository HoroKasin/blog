package Account;

import java.util.Scanner;

public class AccountManager {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("* 계좌를 등록합니다.");
		
		System.out.print("- 이름: ");
		String name = scan.next();
		
		System.out.print("- 비밀번호: ");
		String pwd = scan.next();
		
		System.out.print("- 입금액: ");
		int bal = scan.nextInt();
		
		Account acc = new Account(name, pwd, bal);
		
		System.out.println(name + "님의 계좌가 개설되었습니다!");
		
		while(true) {
			
			System.out.println("\n메뉴를 입력하세요.");
			System.out.println("[ 1. 예금 | 2. 출금 | 3. 잔액조회 | 4. 종료 ]");
			System.out.print("> ");
			int menu = scan.nextInt();
			
			if(menu == 1) {
				System.out.println("계좌 비밀번호를 입력하세요.");
				System.out.print("> ");
				String pw = scan.next();
				
				if(pw.equals(acc.pwd)) {
					System.out.println("입금액을 입력하세요.");
					System.out.print("> ");
					int money = scan.nextInt();
					
					acc.saveMoney(money);
					
					System.out.println("[계좌번호: " + acc.accNum + "]");
					System.out.println(money + "원 입금 완료!");
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}				
			}else if(menu == 2) {
				System.out.println("계좌 비밀번호를 입력하세요.");
				System.out.print("> ");
				String pw = scan.next();
				
				if(pw.equals(acc.pwd)) {
					System.out.println("출금액을 입력하세요.");
					System.out.print("> ");
					int money = scan.nextInt();
					
					//출금액이 잔액을 초과하면 출금 불가
					if(money > acc.balance) {
						System.out.println("잔액이 부족합니다.");
					}else {
						acc.withDrawMoney(money);
						System.out.println("[계좌번호: " + acc.accNum + "]");
						System.out.println(money + "원 출금 완료!");
					}					
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
				
			}else if(menu == 3) {
				System.out.println(acc.name + "님의 계좌 잔액은 " 
							+ acc.getBalance() + "원입니다.");
			}else if(menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}//end while

	}//end main

}//end class





