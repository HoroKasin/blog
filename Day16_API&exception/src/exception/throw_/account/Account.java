package exception.throw_.account;

public class Account {
	
	private long balance;
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	/*
	 * Throw keyword forces exceptions to code
	 * As soon as code meets row, it stops running immediately
	 * Forced to go to the catch phrase.
	 * Class of exceptions that want to occur behind the slow keyword
	 * Create an object.
	 */
	
	public void withDraw(int money) throws BalanceInsufficientException {
		
		if(balance < money) {
			throw new BalanceInsufficientException("잔고 부족: " + (money-balance) + "원 모자람.");
		}
		
		balance -= money;
	}
}








