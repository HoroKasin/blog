package Integer;

public class IntegerExample {

	public static void main(String[] args) {

		byte a = -127;
		short b = 32767;
		int c = 2147483647;
		long d = 2147483648L;
		
		System.out.println(d);
		
		//2진수를 저장할 때는 정수앞에 0b를 붙인다.
		int bin = 0b1010;
		
		//8진수를 저장할 때는 정수앞에 0만 붙인다.
		int octa = 064;
		
		//16진수를 저장할 때는 정수 앞에 0x를 붙인다.
		int hexa = 0xa4b;
		
		System.out.println("2진수 1010>" + bin);
		System.out.println("8진수 64>" + octa);
		System.out.println("16진수 3a4b>" + hexa);
	}

}
