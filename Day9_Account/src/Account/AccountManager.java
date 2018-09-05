package Account;

import java.util.Scanner;

public class AccountManager {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("* Register account number.");
		
		System.out.print("- name: ");
		String name = scan.next();
		
		System.out.print("- pwd: ");
		String pwd = scan.next();
		
		System.out.print("- Input amount: ");
		int bal = scan.nextInt();
		
		Account acc = new Account(name, pwd, bal);
		
		System.out.println(name + "님의 Account opened!");
		
		while(true) {
			
			System.out.println("\nPlease enter a menu.");
			System.out.println("[ 1. Deposit | 2. Withdrawal | 3. Balance check | 4. Termination ]");
			System.out.print("> ");
			int menu = scan.nextInt();
			
			if(menu == 1) {
				System.out.println("Please enter your account password.");
				System.out.print("> ");
				String pw = scan.next();
				
				if(pw.equals(acc.pwd)) {
					System.out.println("Enter deposit amount.");
					System.out.print("> ");
					int money = scan.nextInt();
					
					acc.saveMoney(money);
					
					System.out.println("[bank account number: " + acc.accNum + "]");
					System.out.println(money + "Deposit completed!");
				}else {
					System.out.println("The password is incorrect..");
				}				
			}else if(menu == 2) {
				System.out.println("Please enter your account password.");
				System.out.print("> ");
				String pw = scan.next();
				
				if(pw.equals(acc.pwd)) {
					System.out.println("Please enter the withdrawal amount.");
					System.out.print("> ");
					int money = scan.nextInt();
					
					//not drain if the amount exceeds the balance
					if(money > acc.balance) {
						System.out.println("Insufficient balance.");
					}else {
						acc.withDrawMoney(money);
						System.out.println("[bank account number: " + acc.accNum + "]");
						System.out.println(money + "Finished withdrawals!");
					}					
				}else {
					System.out.println("The password is incorrect.");
				}
				
			}else if(menu == 3) {
				System.out.println(acc.name + "the balance of an account " 
							+ acc.getBalance() + "$");
			}else if(menu == 4) {
				System.out.println("Exit the program.");
				break;
			}
		}//end while

	}//end main

}//end class





