package Phone;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone p = new Phone();
		p.call();
		p.info();
		
		System.out.println("----------------");
		
		Phone anycall = new Phone("red", "anycall");
		anycall.call();
		anycall.info();
		
		System.out.println("----------------");
		Phone iphone = new Phone("black", "Iphone", 1250000);
		iphone.call();
		iphone.info();

	}

}




