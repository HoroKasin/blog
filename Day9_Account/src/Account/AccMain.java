package Account;

public class AccMain {

	public static void main(String[] args) {
		
		Account acc = new Account("È«±æµ¿", "1234", 10000);
		
		acc.saveMoney(700);
		acc.withDrawMoney(1900);
		int bal = acc.getBalance();
		
		System.out.println(acc.name + "´ÔÀÇ °èÁÂ ÀÜ¾×Àº: " + bal + "¿øÀÔ´Ï´Ù.");
	}
}




