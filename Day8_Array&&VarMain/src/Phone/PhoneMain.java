package Phone;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone p = new Phone();
		p.call();
		p.info();
		
		System.out.println("----------------");
		
		Phone anycall = new Phone("��� ����", "�ִ���");
		anycall.call();
		anycall.info();
		
		System.out.println("----------------");
		Phone iphone = new Phone("������", "������X", 1250000);
		iphone.call();
		iphone.info();

	}

}




