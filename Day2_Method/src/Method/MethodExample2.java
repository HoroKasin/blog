package Method;

public class MethodExample2 {
	
	static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	static int sub(int n1, int n2, int n3) {
		return n1 - n2 - n3;
	}
	
	static int multi(int n1, int n2, int n3) {
		return n1 * n2 * n3;
	}
	static int devide(int n1, int n2) {
		return n1 / n2;
	}
	
	static int calculateBirthYear(int age) {
		return 2018 - age + 1;
	}

	public static void main(String[] args) {
		
		/*
		int n1 = 10;
		int n2 = 20;
		
		int result = n1 + n2;
		System.out.println(result);
		
		n1 = 40;
		n2 = 50;
		result = n1 + n2;
		System.out.println(result);
		*/
		int addData = add(15, 12);
		System.out.println("두 수의 합은: " + addData);
		System.out.println("세 수의 차는: " + sub(20, 7, 11));
		
		/*
		 * 1. 3가지 정수를 곱해서 결과를 
		 *    돌려주는 메서드를 선언하고 호출하세요.
		 *    multi()
		 * 2. 2개의 정수의 나눗셈의 결과를 돌려주는
		 *    메서드를 선언하고 호출하세요.
		 *    devide()
		 * 3. 곱하기 연산자는 *이고, 나눗셈 연산자는 / 입니다.     
		 */
		System.out.println("10 X 5 X 3 = " + multi(10,5,3));
		System.out.println("560 / 280 = " + devide(560, 280));
		
		/*
		 * 1. 나이를 매개값으로 받아서 출생년도를 반환하는
		 *    메서드를 선언하고 호출하여 몇년생인지 계산하는
		 *    로직을 구현하세요.
		 * 2. 나이는 한국식 나이로 계산하세요.
		 * 3. 메서드이름은 calculateBirthYear()   
		 */
		int birthYear = calculateBirthYear(24);
		System.out.println("당신은 " 
					+ birthYear + "년생입니다.");		

	}

}




