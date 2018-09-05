package Casting;

public class CastingOperator {

	public static void main(String[] args) {
		/*
		 * When performing calculations of different data types
		 * Small data type is large
		 * Auto-forms, matches the type, and computes the operation.
		 */
		char c ='B';
		System.out.println("Before Automatic Type Conversion:>" + c);
		int i = 2;
		System.out.println("Before Automatic Type Conversion:>" + i);
		char c1 = (char) (c + i);
		System.out.println("After automatic type conversion:>" + c1);
	
		System.out.println("----------------------");
		
		int j = 10;
		System.out.println("Before Automatic Type Conversion:>" + j);
		double k = j / 4.0;
		System.out.println("After automatic type conversion:>" + k);
		
		System.out.println("----------------------");
		
		byte b1 = 100;
		System.out.println("Before Automatic Type Conversion:>" + b1);
		byte b2 = 70;
		System.out.println("Before Automatic Type Conversion:>" + b2);
		byte b3 = (byte) (b1 + b2);
		System.out.println("After automatic type conversion:>" + b3);
	}

}
