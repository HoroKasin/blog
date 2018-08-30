package Phone;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone p = new Phone();
		p.call();
		p.info();
		
		System.out.println("----------------");
		
		Phone anycall = new Phone("루비 레드", "애니콜");
		anycall.call();
		anycall.info();
		
		System.out.println("----------------");
		Phone iphone = new Phone("검정색", "아이폰X", 1250000);
		iphone.call();
		iphone.info();

	}

}




