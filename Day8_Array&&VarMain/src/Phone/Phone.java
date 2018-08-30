package Phone;

public class Phone {
	
	String color;
	String model;
	int price;
	
	Phone() {
		color = "코발트블루";
		model = "갤럭시 S9 노트";
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
	
	//메서드 선언
	void call() {
		System.out.println(model + "로 전화를 겁니다.");
	}
	
	void info() {
		System.out.println("------핸드폰의 정보------");
		System.out.println("색상: " + color);
		System.out.println("모델: " + model);
		System.out.println("가격: " + price);
		
	}
}







