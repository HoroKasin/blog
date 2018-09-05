package Casting;

public class CastingExample2 {

	public static void main(String[] args) {
		
		/*
		 * Large data types are small
		 * To convert, you must use the cast operator (type)
		 * Form conversion should be made explicitly.
		 */
		int i = 72;
		System.out.println("before the conversion:>" + i);
		char c = (char)i;
		System.out.println("After shape conversion:>" + c);
		
		System.out.println("------------------------");
		
		double d = 3.73213;
		System.out.println("before the conversion:>" + d);
		int j = (int)d;
		System.out.println("After forced conversion:>" + j);
		
		System.out.println("------------------------");
		
		/*
		 * There are precautions when using forced type conversion.
		 * If the data type has an unacceptable range value
		 * Store random waste data.
		 * (overflow, underflow)
		 */
		int k = 4400;
		System.out.println("before the conversion:>" + k);
		byte b = (byte)k;
		System.out.println("After forced conversion:>" + b);
	}

}
