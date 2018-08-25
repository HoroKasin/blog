package Casting;

public class CastingOperator {

	public static void main(String[] args) {
		
		/*
		 * 크기가 다른 데이터 타입의 연산을 진핼할 때는
		 * 크키가 작은 데이터 타입이 큰 데이터타입으로
		 * 자동 형변환(Promotion)되어 타입을 맞춘 후 연산을 합니다.
		 */
		
		char c ='B';
		System.out.println("자동 형변환 전:>" + c);
		int i = 2;
		System.out.println("자동 형변환 전:>" + i);
		char c1 = (char) (c + i);
		System.out.println("자동 형변환 후:>" + c1);
	
		System.out.println("----------------------");
		
		int j = 10;
		System.out.println("자동 형변환 전:>" + j);
		double k = j / 4.0;
		System.out.println("자동 형변환 후:>" + k);
		
		System.out.println("----------------------");
		
		byte b1 = 100;
		System.out.println("자동 형변환 전:>" + b1);
		byte b2 = 70;
		System.out.println("자동 형변환 전:>" + b2);
		byte b3 = (byte) (b1 + b2);
		System.out.println("자동 형변환 후:>" + b3);
	}

}
