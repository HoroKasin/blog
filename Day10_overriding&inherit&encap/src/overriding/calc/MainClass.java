package overriding.calc;

public class MainClass {

	public static void main(String[] args) {
		
		double r = 15;
		
		Calculator cal = new Calculator();
		System.out.println("����� ���� ���� ���");
		System.out.println(cal.areaCircle(r));
		System.out.println("----------------");
		
		Computer com = new Computer();
		System.out.println("��ǻ�ͷ� ���� ���� ���");
		System.out.println(com.areaCircle(r));

	}

}





