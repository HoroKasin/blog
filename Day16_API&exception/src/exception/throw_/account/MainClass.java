package exception.throw_.account;

public class MainClass {

	public static void main(String[] args) {
		
		Account acc = new Account();
		
		acc.deposit(10000);
		System.out.println("balance after deposit: " 
		+ acc.getBalance() + "$");
		
		
		try {
			acc.withDraw(35000);
		} catch (BalanceInsufficientException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("the present balance: " 
		+ acc.getBalance() + "$");

	}

}


