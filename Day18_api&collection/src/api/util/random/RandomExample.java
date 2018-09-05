package api.util.random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		//return error random value of 1.0 or less
		double d = r.nextDouble();
		System.out.println("double random value: " + d);
		
		boolean b = r.nextBoolean();
		System.out.println("boolean random value: " + b);
		
		//Random number in any range that can be expressed by integer int.
		int i = r.nextInt();
		System.out.println("integer random value: " + i);
		
		i = r.nextInt(10);
		System.out.println("Integer (less than 0 and less than 10) "
				+ "random values: " + i);
		
		i = r.nextInt(10) + 1;
		System.out.println("Integer (at least 10) random value: " + i);

	}

}







