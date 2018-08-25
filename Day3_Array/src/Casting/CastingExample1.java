package Casting;

public class CastingExample1 {

	public static void main(String[] args) {

		/*
		 * 크기가 작은 데이터 타입 변수를 큰 데이터타입으로 
		 * 변환할 때는 자바 가상 머신(JVM0이 데이터 타입을 
		 * 자동으로 변환한다. [Promotion / Upcasting]
		 */
		
		byte b = 10;
		System.out.println("형 변환전: >" + b);
		int i = b; // byte - > int 자동 형 변환 
		System.out.println("형 변환후: >"+ i);

		System.out.println("----------------------");
				
		char c = '가';
		System.out.println("형 변환전: >" + c);
		int j = c; //char -> int 자동 형 변환
		System.out.println("형 변환후: >"+ j);
		
		System.out.println("----------------------");
		
		int k = 500;
		System.out.println("형 변환전: >" + k);
		double  d = k; // int -> double 자동 형 변환
		System.out.println("형 변환후: >"+ d);
	}

}
