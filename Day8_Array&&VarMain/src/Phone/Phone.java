package Phone;

public class Phone {
	
	String color;
	String model;
	int price;
	
	Phone() {
		color = "�ڹ�Ʈ���";
		model = "������ S9 ��Ʈ";
		price = 1300000;
	}
	
	Phone(String pColor, String pModel) {
		color = pColor;
		model = pModel;
		price = 500000;
	}
	
	Phone(String pColor, String pModel, int pPrice) {
		color = pColor;
		model = pModel;
		price = pPrice;
	}
	
	//�޼��� ����
	void call() {
		System.out.println(model + "�� ��ȭ�� �̴ϴ�.");
	}
	
	void info() {
		System.out.println("------�ڵ����� ����------");
		System.out.println("����: " + color);
		System.out.println("��: " + model);
		System.out.println("����: " + price);
		
	}
}







