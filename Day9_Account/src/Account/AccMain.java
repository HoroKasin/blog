package Account;

public class AccMain {

	public static void main(String[] args) {
		
		Account acc = new Account("ȫ�浿", "1234", 10000);
		
		acc.saveMoney(700);
		acc.withDrawMoney(1900);
		int bal = acc.getBalance();
		
		System.out.println(acc.name + "���� ���� �ܾ���: " + bal + "���Դϴ�.");
	}
}




