package Var;

public class VariableExample {

	public static void main(String[] args) {
		
		/*
		 * 변수의 선언 방법.
		 * [데이터 타입] [변수 이름];
		 * 변수는 동일한 이름으로 중복 선언할 수 없습니다.
		 * int는 정수를 저장하는 대표적인 데이터 타입입니다.
		 */
		int number1;
		
		//변수의 초기화
		number1 = 10;
		System.out.println("number1에 저장된 데이터: " + number1);
		
		//변수의 선언과 초기화를 동시에 해도됩니다.
		int number2 = 20;
		
		//변수에는 변수의참조값을 이용해서 저장할 수 있습니다.
		int result = number1 + number2;
		System.out.println("result: " + result);
		
		//변수는 동일이름으로 중복선언할 수 없습니다.
//		int number2 = 30;
		
		number2 = 50;
		System.out.println("number2: " + number2);
		
		result = number1 + number2;
		System.out.println(result);
	}

}








