package static_.init;

public class Television {
	
	public static String company = "Samsung";
	public static String model = "4K UHD TV";
	public static String info;
	public int channel;
	
	static {
		System.out.println("���� �ʱ�ȭ�� ȣ��!");
		info = company + "-" + model;
	}
	
	public Television() {
		System.out.println("TV������ ȣ��!");
		channel = 10;
	}
}








