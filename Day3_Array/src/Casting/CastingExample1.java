package Casting;

public class CastingExample1 {

	public static void main(String[] args) {
/*
		 * Small data type variables to large data types 
		 * When converting, Java Virtual Machine (JVM is used to 
		 * Convert automatically. [Protection / Upcast]
		 */
		
		byte b = 10;
		System.out.println("Before Transformation: >" + b);
		int i = b; 
		System.out.println("AfterTransformation >"+ i);

		System.out.println("----------------------");
				
		char c = '가';
		System.out.println("Before Transformation: >" + c);
		int j = c; 
		System.out.println("AfterTransformation: >"+ j);
		
		System.out.println("----------------------");
		
		int k = 500;
		System.out.println("Before Transformation: >" + k);
		double  d = k; 
		System.out.println("AfterTransformation: >"+ d);
	}

}
