package static_.method;

public class MainClass {

	public static void main(String[] args) {
		
		Count.b = 5;
		
		int num = Count.method2();
		System.out.println(num);
		
		System.out.println(Count.method2());
		System.out.println(Count.method2());
		System.out.println(Count.method2());
		System.out.println(Count.method2());
		
		Math.random();
		System.out.println(Math.PI);
	}

}




