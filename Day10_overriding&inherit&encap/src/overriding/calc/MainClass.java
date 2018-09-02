package overriding.calc;

public class MainClass {

	public static void main(String[] args) {
		
		double r = 15;
		
		Calculator cal = new Calculator();
		System.out.println("계산기로 원의 넓이 계산");
		System.out.println(cal.areaCircle(r));
		System.out.println("----------------");
		
		Computer com = new Computer();
		System.out.println("컴퓨터로 원의 넓이 계산");
		System.out.println(com.areaCircle(r));

	}

}





