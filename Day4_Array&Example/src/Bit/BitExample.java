package Bit;

public class BitExample {

	public static void main(String[] args) {

		byte a = 5; //0000 0101
		byte b = 3; //0000 0011
		
		//&  0000 0001
		System.out.println(a & b);
		System.out.println("=============");
		
		//| 0000 0111
		System.out.println(a | b);
		System.out.println("=============");
		
		//^ 0000 0110
		System.out.println(a ^ b);
		System.out.println("=============");
		
		//<< , >>
		int i = 192;
		System.out.println(i << 3);
		System.out.println(i >> 2);
		
	}

}
