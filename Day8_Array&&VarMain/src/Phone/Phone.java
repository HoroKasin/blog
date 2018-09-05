package Phone;

public class Phone {
	
	String color;
	String model;
	int price;
	
	Phone() {
		color = "Cobalt Blue";
		model = "Galaxy S9";
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
	
	void call() {
		System.out.println(model + "Call.");
	}
	
	void info() {
		System.out.println("------information on cell phones------");
		System.out.println("color: " + color);
		System.out.println("model: " + model);
		System.out.println("price: " + price);
	}
}







