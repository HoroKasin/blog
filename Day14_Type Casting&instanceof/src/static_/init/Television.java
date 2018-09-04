package static_.init;

public class Television {
	
	public static String company = "Samsung";
	public static String model = "4K UHD TV";
	public static String info;
	public int channel;
	
	static {
		System.out.println("정적 초기화자 호출!");
		info = company + "-" + model;
	}
	
	public Television() {
		System.out.println("TV생성자 호출!");
		channel = 10;
	}
}








