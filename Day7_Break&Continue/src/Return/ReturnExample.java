package Return;

public class ReturnExample {

	public static void main(String[] args) {
		
		method1();
		
		System.out.println("\n--------------------");
		
		int data = method2(3, 5);
		System.out.println("3 + 5 = " + data);
		
	}
	
	static void method1() {
		for(int i=0; i<10; i++) {
			if(i==5) {
				return;
			}
			System.out.print(i +" ");
		}
		System.out.println("return을 만나면 메서드가 강제로 종료됨.");
	}
	
	static int method2(int n1, int n2) {
		int result = n1 + n2;
		return result;

	}

}
