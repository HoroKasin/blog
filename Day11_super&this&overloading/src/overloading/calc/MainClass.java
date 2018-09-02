package overloading.calc;

public class MainClass {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		System.out.println("Square Width: " + calc.areaRect(10));
		System.out.println("Rectangular Width: " + calc.areaRect(14, 15));

	}

}
