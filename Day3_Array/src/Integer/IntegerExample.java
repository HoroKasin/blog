package Integer;

public class IntegerExample {

	public static void main(String[] args) {

		byte a = -127;
		short b = 32767;
		int c = 2147483647;
		long d = 2147483648L;
		
		System.out.println(d);
		
		//When storing binary digits, attach 0b to the front of the integer.
		int bin = 0b1010;
		
		//When storing octal numbers, attach only zeros to the front of the integer.
		int octa = 064;
		
		//When saving hexadecimal numbers, place 0x in front of the integer.
		int hexa = 0xa4b;
		
		System.out.println("Binary 1010>" + bin);
		System.out.println("octal 64>" + octa);
		System.out.println("Hex 3a4b>" + hexa);
	}

}
