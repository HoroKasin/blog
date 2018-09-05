package exception.throw_.account;

/*
 * To create a custom exception class, click the Exception class or
 * Inherit the RuntimeException class.
 */

public class BalanceInsufficientException extends Exception {
	
	/*
	 * Typically, when creating custom exception classes
	 * Basic constructor and the generator receiving the error cause message as a medium
	 * A total of two declarations are common. 
	 */
	
	public BalanceInsufficientException() {}
	
	public BalanceInsufficientException(String message) {
		super(message);
	}
}






