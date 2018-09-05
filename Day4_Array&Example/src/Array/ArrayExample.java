package Array;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {

		// 1. Declaration of Array
		char[] letters;
		
		//create an array
		// specify the size at creation time, once set size cannot be changed
		letters = new char[4];
		
		// 3. Initialize Array
		// access each index and store data.
		letters[0] = 'A';
		letters[1] = 'B';
		letters[2] = 'C';
		letters[3] = 78;
		
		// 4. Refer to values in array (using)
		System.out.println("Value of the third data in the array:>" + letters[2]);
		
		System.out.println("=============================");
		
		/*
		 * Data contained within an array is presented in a string format.
		 * To check, use the output statement println(). 
		 * Use Array.toString.
		 */
		System.out.println(Arrays.toString(letters));
		
		System.out.println("=============================");
		
		//How to declare, generate and initialize an array at the same time.
		byte[] bArr = new byte[5];
		int[] iArr = new int[] {4, 6, 8, 10};
		
		String[] sArr = {"hello", "my", "name", "is"};
		
		System.out.println(Arrays.toString(bArr));
		System.out.println(Arrays.toString(iArr));
		System.out.println(Arrays.toString(sArr));
	
	}
	

}
