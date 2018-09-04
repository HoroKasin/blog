package static_.calc;

public class MainClass {

	public static void main(String[] args) {
		
		int result = Calculator.plus(10, 4);
		System.out.println("10 + 4 = " + result);
		
		double d = 4 * 4 * Calculator.pi;
		System.out.println("the width of a circle with a radius of four: " + d);
		
		Calculator redCalc = new Calculator();
		redCalc.paint("red");
		
		Calculator blueCalc = new Calculator();
		blueCalc.paint("blue");
		
		
	}

}




