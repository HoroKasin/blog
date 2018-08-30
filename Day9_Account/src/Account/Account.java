package Account;

public class Account {
	
	String name;
	String accNum;
	String pwd;
	int balance;
	
	Account(String name1, String pwd1, int balance1) {
		
		name = name1;
		accNum = "111-222-333333";
		pwd = pwd1;
		balance = balance1;
	}
	
	void saveMoney(int money) {
		balance += money;
	}
	
	void withDrawMoney(int money) {
		balance -= money;//balance = balance - money;
	}
	
	int getBalance() {
		return balance;
	}
}










