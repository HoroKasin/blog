package Bit;

public class BitNotExample {

	public static void main(String[] args) {

		//비트반전 연산자(~)
		//정수의 값을 2진수로 표현하여 각 자리수의 값을 반전시킨다.
		//	0 -> 1,      1 -> 0
		
		byte b = 8; //0000 1000
		System.out.println(~b);//1111 0111
		System.out.println("=============");
		
		//논리반전 연산자(!)
		// true -> false,    false -> true
		boolean bool = false;
		System.out.println(!bool);
		System.out.println("=============");
		
		//수치 연산
		int i = 7 / 3;
		int k = 7 % 3;
		System.out.println("7에서 3을 나눈 몫은:>" + i);
		System.out.println("7에서 3을 나눈 나머지는:>" + k);
		System.out.println("=============");
		
		//비교연산
		System.out.println(i == k);
		System.out.println(k < i);
	}

}
