package Casting;

public class CastingExample2 {

	public static void main(String[] args) {
		
		/*
		 * 크기가 큰 데이터 타입을 작은 데이터 타입으로
		 * 변환하려면 반드시 캐스트 연산자(type)를 사용하여
		 * 명시적으로 형 변환을 해야 한다.
		 */

		int i = 72;
		System.out.println("형 변환전:>" + i);
		char c = (char)i;
		System.out.println("형 변환후:>" + c);
		
		System.out.println("------------------------");
		
		//double -> int 강제 형 변환시 데이터의 손실이 발생한다.
		double d = 3.73213;
		System.out.println("형 변환전:>" + d);
		int j = (int)d;
		System.out.println("강제 형 변환후:>" + j);
		
		System.out.println("------------------------");
		
		/*
		 * 강제 타입 변환을 사용할 때는 주의할 점이 있다.
		 * 데이터의 타입이 받아들일 수 없는 범위의 값이 들어오면
		 * 임의의 쓰레기 데이터를 저장합니다.
		 * (overflow, underflow)
		 */
		int k = 4400;
		System.out.println("형 변환전:>" + k);
		byte b = (byte)k;
		System.out.println("강제 형 변환후:>" + b);
	}

}
