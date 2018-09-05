package Array;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		
		// 1. Declaration of Array
		char[] letters; 
		
		//create an array
		letters = new char[4];
		
		// 3. Initialize Array
		// access each index and store data.
		letters[0] = 'A';
		letters[1] = 'B';
		letters[2] = 'C';
		letters[3] = 68;
		
		// 4. See values in array (using )
		System.out.println("Value of the third data in the array:>" + letters[2] );

		/*
		 * Data contained within an array is presented in a string format.
		 * To check, use the output statement println(). 
		 * Use Array.toString.
		 */
		System.out.println("View internal data in string form:>" + Arrays.toString(letters));
	}

}
